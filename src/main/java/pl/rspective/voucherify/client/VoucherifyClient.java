package pl.rspective.voucherify.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.concurrent.Executor;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.json.DateDeserializer;
import pl.rspective.voucherify.client.json.DateSerializer;
import pl.rspective.voucherify.client.module.VoucherModule;
import pl.rspective.voucherify.client.module.CustomerModule;
import pl.rspective.voucherify.client.utils.Platform;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.converter.GsonConverter;

/**
 * It's entrypoint to use voucherify java client
 */
public class VoucherifyClient {

    /**
     * Endpoint http schema
     */
    private final String httpScheme;

    /**
     * Gson to serialize and deserialize data
     */
    private Gson gson;

    /**
     * It's manage communication with Voucherify/Voucher endpoint
     */
    private VoucherModule voucherModule;

    /**
     * It's manage communication with Voucherify/Customer endpoint
     */
    private CustomerModule customerModule;

    /**
     * Describes client's REST API
     */
    private VoucherifyApi voucherifyApi;

    /**
     * System thread executor
     */
    private Executor executor;

    /**
     *
     * @param builder used to create VoucherifyClient
     */
    private VoucherifyClient(Builder builder) {
        if (builder.appToken == null) {
            throw new IllegalArgumentException("App token must be defined.");
        }

        if (builder.appId == null) {
            throw new IllegalArgumentException("App ID must be defined.");
        }

        this.httpScheme = createHttpScheme(builder);
        this.executor = createCallbackExecutor();

        this.gson = createGson();
        this.voucherifyApi = createRetrofitService(builder);

        this.voucherModule = new VoucherModule(voucherifyApi, executor);
        this.customerModule = new CustomerModule(voucherifyApi, executor);
    }

    /**
     * Returns the Vouchers module.
     */
    public VoucherModule vouchers() {
        return voucherModule;
    }


    /**
     * Returns the Customers module.
     */
    public CustomerModule customers() {
        return customerModule;
    }

    /**
     *
     * @return system thread executor
     */
    private Executor createCallbackExecutor() {
        return Platform.get().callbackExecutor();
    }

    /**
     *
     * @return
     */
    private Gson createGson() {
        return new GsonBuilder()
                .registerTypeAdapter(Date.class, new DateSerializer(Constants.ENDPOINT_DATE_FORMAT))
                .registerTypeAdapter(Date.class, new DateDeserializer(Constants.ENDPOINT_DATE_FORMAT, Constants.ENDPOINT_SECONDARY_DATE_FORMAT))
                .create();
    }

    /**
     *
     * @param builder
     * @return
     */
    private String createHttpScheme(Builder builder) {
        if (builder.secure) {
            return Constants.SCHEME_HTTPS;
        } else {
            return Constants.SCHEME_HTTP;
        }
    }

    /**
     *
     * @param builder
     * @return
     */
    private VoucherifyApi createRetrofitService(Builder builder) {
        RestAdapter.Builder restBuilder =
                new RestAdapter.Builder()
                        .setConverter(new GsonConverter(gson))
                        .setRequestInterceptor(createInterceptor(builder.appId, builder.appToken));

        setEndPoint(builder, restBuilder);
        setClientProvider(builder, restBuilder);
        setLogLevel(builder, restBuilder);

        return restBuilder.build().create(VoucherifyApi.class);
    }

    /**
     *
     * @param appId
     * @param appToken
     * @return
     */
    private RequestInterceptor createInterceptor(final String appId, final String appToken) {
        return new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                request.addHeader(Constants.HTTP_HEADER_VOUCHERIFY_CHANNEL, Constants.VOUCHERIFY_CHANNEL_NAME);
                request.addHeader(Constants.HTTP_HEADER_APP_ID, appId);
                request.addHeader(Constants.HTTP_HEADER_APP_TOKEN, appToken);
            }
        };
    }

    /**
     *
     * @param builder
     * @param restBuilder
     */
    private void setLogLevel(Builder builder, RestAdapter.Builder restBuilder) {
        if (builder.logLevel != null) {
            restBuilder.setLogLevel(builder.logLevel);
        }
    }

    /**
     *
     * @param builder
     * @param restBuilder
     */
    private void setClientProvider(Builder builder, RestAdapter.Builder restBuilder) {
        if (builder.clientProvider != null) {
            restBuilder.setClient(builder.clientProvider);
        }
    }

    /**
     *
     * @param builder
     * @param restBuilder
     */
    private void setEndPoint(Builder builder, RestAdapter.Builder restBuilder) {
        String endpoint;

        if (builder.endpoint == null) {
            endpoint = Constants.ENDPOINT_VOUCHERIFY;
        } else {
            endpoint = builder.endpoint;
        }

        restBuilder.setEndpoint(String.format("%s://%s", httpScheme, endpoint));
    }

    /**
     *
     */
    public static class Builder {
        /**
         *
         */
        String appToken;

        /**
         *
         */
        String appId;

        /**
         *
         */
        String endpoint;

        /**
         *
         */
        boolean secure;

        /**
         *
         */
        RestAdapter.LogLevel logLevel;

        /**
         *
         */
        Client.Provider clientProvider;

        /**
         *
         */
        public Builder() {
            this.secure = true;
        }

        /**
         *
         * @param appToken
         * @return
         */
        public Builder setAppToken(String appToken) {
            if (appToken == null) {
                throw new IllegalArgumentException("Cannot call setAppToken() with null.");
            }

            this.appToken = appToken;
            return this;
        }

        /**
         *
         * @param appId
         * @return
         */
        public Builder setAppId(String appId) {
            if (appId == null) {
                throw new IllegalArgumentException("Cannot call setAppId() with null.");
            }

            this.appId = appId;
            return this;
        }

        /**
         * Sets a custom client to be used for making HTTP requests.
         *
         * @param client {@link retrofit.client.Client} instance
         * @return this {@code Builder} instance
         */
        public Builder setClient(final Client client) {
            if (client == null) {
                throw new IllegalArgumentException("Cannot call setClient() with null.");
            }

            return setClientProvider(new Client.Provider() {
                @Override
                public Client get() {
                    return client;
                }
            });
        }

        /**
         * Overrides the default remote address.
         *
         * @param remoteUrl String representing the remote address
         * @return this {@link VoucherifyClient.Builder} instance
         */
        public Builder setEndpoint(String remoteUrl) {
            if (remoteUrl == null) {
                throw new IllegalArgumentException("Cannot call setEndpoint() with null.");
            }
            this.endpoint = remoteUrl;
            return this;
        }

        /**
         * Sets a provider of clients to be used for making HTTP requests.
         *
         * @param clientProvider {@link retrofit.client.Client.Provider} instance
         * @return this {@code Builder} instance
         */
        public Builder setClientProvider(Client.Provider clientProvider) {
            if (clientProvider == null) {
                throw new IllegalArgumentException("Cannot call setClientProvider() with null.");
            }

            this.clientProvider = clientProvider;
            return this;
        }

        /**
         * Change the log level.
         *
         * @param logLevel {@link retrofit.RestAdapter.LogLevel} value
         * @return this {@code Builder} instance
         */
        public Builder setLogLevel(RestAdapter.LogLevel logLevel) {
            if (logLevel == null) {
                throw new IllegalArgumentException("Cannot call setLogLevel() with null.");
            }

            this.logLevel = logLevel;
            return this;
        }

        /**
         * Makes the client execute all requests via HTTPS (enabled by default)
         *
         * @return this {@code Builder} instance
         */
        public Builder withSSL() {
            this.secure = true;
            return this;
        }
        
        /**
         * Makes the client execute all requests via HTTP instead of HTTPS
         *
         * @return this {@code Builder} instance
         */
        public Builder withoutSSL() {
            this.secure = false;
            return this;
        }

        /**
         *
         * @return
         */
        public VoucherifyClient build() {
            return new VoucherifyClient(this);
        }

    }
}
