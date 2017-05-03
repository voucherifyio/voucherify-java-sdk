package pl.rspective.voucherify.client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.json.DateDeserializer;
import pl.rspective.voucherify.client.json.DateSerializer;
import pl.rspective.voucherify.client.module.CampaignsModule;
import pl.rspective.voucherify.client.module.CustomersModule;
import pl.rspective.voucherify.client.module.DistributionsModule;
import pl.rspective.voucherify.client.module.ProductsModule;
import pl.rspective.voucherify.client.module.RedemptionsModule;
import pl.rspective.voucherify.client.module.SegmentsModule;
import pl.rspective.voucherify.client.module.ValidationRulesModule;
import pl.rspective.voucherify.client.module.ValidationsModule;
import pl.rspective.voucherify.client.module.VoucherModule;
import pl.rspective.voucherify.client.utils.Platform;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.converter.JacksonConverter;

import java.util.Date;
import java.util.concurrent.Executor;

public class VoucherifyClient {

  private final String httpScheme;

  private VoucherModule voucherModule;

  private ValidationsModule validationsModule;

  private CustomersModule customersModule;

  private CampaignsModule campaignsModule;

  private RedemptionsModule redemptionsModule;

  private DistributionsModule distributionsModule;

  private ProductsModule productsModule;

  private SegmentsModule segmentsModule;

  private ValidationRulesModule validationRulesModule;

  private VoucherifyApi voucherifyApi;

  private Executor executor;

  private VoucherifyClient(Builder builder) {
    if (builder.clientSecretKey == null) {
      throw new IllegalArgumentException("App token must be defined.");
    }

    if (builder.appId == null) {
      throw new IllegalArgumentException("App ID must be defined.");
    }

    this.httpScheme = createHttpScheme(builder);
    this.executor = createCallbackExecutor();

    this.voucherifyApi = createRetrofitService(builder);

    this.voucherModule = new VoucherModule(voucherifyApi, executor);
    this.validationsModule = new ValidationsModule(voucherifyApi, executor);
    this.customersModule = new CustomersModule(voucherifyApi, executor);
    this.campaignsModule = new CampaignsModule(voucherifyApi, executor);
    this.redemptionsModule = new RedemptionsModule(voucherifyApi, executor);
    this.distributionsModule = new DistributionsModule(voucherifyApi, executor);
    this.productsModule = new ProductsModule(voucherifyApi, executor);
    this.segmentsModule = new SegmentsModule(voucherifyApi, executor);
    this.validationRulesModule = new ValidationRulesModule(voucherifyApi, executor);
  }

  public VoucherModule vouchers() {
    return voucherModule;
  }

  public ValidationsModule validations() {
    return validationsModule;
  }

  public CustomersModule customers() {
    return customersModule;
  }

  public CampaignsModule campaigns() {
    return campaignsModule;
  }

  public RedemptionsModule redemptions() {
    return redemptionsModule;
  }

  public DistributionsModule distributions() {
    return distributionsModule;
  }

  public ProductsModule products() {
    return productsModule;
  }

  public SegmentsModule segments() {
    return segmentsModule;
  }

  public ValidationRulesModule validationRules() {
    return validationRulesModule;
  }

  private Executor createCallbackExecutor() {
    return Platform.get().callbackExecutor();
  }

  private JacksonConverter createJacksonConverter() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


    SimpleModule dateModule = new SimpleModule();
    dateModule.addSerializer(Date.class, new DateSerializer(Constants.ENDPOINT_DATE_FORMAT));
    dateModule.addDeserializer(Date.class, new DateDeserializer(Constants.ENDPOINT_DATE_FORMAT, Constants.ENDPOINT_SECONDARY_DATE_FORMAT));
    mapper.registerModule(dateModule);
    return new JacksonConverter(mapper);
  }

  private String createHttpScheme(Builder builder) {
    if (builder.secure) {
      return Constants.SCHEME_HTTPS;
    } else {
      return Constants.SCHEME_HTTP;
    }
  }

  private VoucherifyApi createRetrofitService(Builder builder) {
    RestAdapter.Builder restBuilder =
            new RestAdapter.Builder()
                    .setConverter(createJacksonConverter())
                    .setRequestInterceptor(createInterceptor(builder.appId, builder.clientSecretKey));

    setEndPoint(builder, restBuilder);
    setClientProvider(builder, restBuilder);
    setLogLevel(builder, restBuilder);

    return restBuilder.build().create(VoucherifyApi.class);
  }

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

  private void setLogLevel(Builder builder, RestAdapter.Builder restBuilder) {
    if (builder.logLevel != null) {
      restBuilder.setLogLevel(builder.logLevel);
    }
  }

  private void setClientProvider(Builder builder, RestAdapter.Builder restBuilder) {
    if (builder.clientProvider != null) {
      restBuilder.setClient(builder.clientProvider);
    }
  }

  private void setEndPoint(Builder builder, RestAdapter.Builder restBuilder) {
    String endpoint;

    if (builder.endpoint == null) {
      endpoint = Constants.ENDPOINT_VOUCHERIFY;
    } else {
      endpoint = builder.endpoint;
    }

    restBuilder.setEndpoint(String.format("%s://%s", httpScheme, endpoint));
  }

  public static class Builder {

    String clientSecretKey;

    String appId;

    String endpoint;

    boolean secure;

    RestAdapter.LogLevel logLevel;

    Client.Provider clientProvider;

    public Builder() {
      this.secure = true;
    }

    public Builder setClientSecretKey(String clientSecretKey) {
      if (clientSecretKey == null) {
        throw new IllegalArgumentException("Cannot call setClientSecretKey() with null.");
      }

      this.clientSecretKey = clientSecretKey;
      return this;
    }

    public Builder setAppId(String appId) {
      if (appId == null) {
        throw new IllegalArgumentException("Cannot call setAppId() with null.");
      }

      this.appId = appId;
      return this;
    }

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

    public Builder setEndpoint(String remoteUrl) {
      if (remoteUrl == null) {
        throw new IllegalArgumentException("Cannot call setEndpoint() with null.");
      }

      this.endpoint = remoteUrl;
      System.out.println(remoteUrl);
      return this;
    }

    public Builder setClientProvider(Client.Provider clientProvider) {
      if (clientProvider == null) {
        throw new IllegalArgumentException("Cannot call setClientProvider() with null.");
      }

      this.clientProvider = clientProvider;
      return this;
    }

    public Builder setLogLevel(RestAdapter.LogLevel logLevel) {
      if (logLevel == null) {
        throw new IllegalArgumentException("Cannot call setLogLevel() with null.");
      }

      this.logLevel = logLevel;
      return this;
    }

    public Builder withSSL() {
      this.secure = true;
      return this;
    }

    public Builder withoutSSL() {
      this.secure = false;
      return this;
    }

    public VoucherifyClient build() {
      return new VoucherifyClient(this);
    }

  }
}
