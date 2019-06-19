package io.voucherify.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.error.VoucherifyErrorHandler;
import io.voucherify.client.json.converter.JsonConverter;
import io.voucherify.client.json.deserializer.CampaignsResponseDeserializer;
import io.voucherify.client.json.deserializer.DateDeserializer;
import io.voucherify.client.json.deserializer.VouchersResponseDeserializer;
import io.voucherify.client.json.serializer.DateSerializer;
import io.voucherify.client.model.campaign.response.CampaignsResponse;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.voucher.response.VouchersResponse;
import io.voucherify.client.module.CampaignsModule;
import io.voucherify.client.module.CustomersModule;
import io.voucherify.client.module.DistributionsModule;
import io.voucherify.client.module.EventsModule;
import io.voucherify.client.module.LoyaltiesModule;
import io.voucherify.client.module.OrdersModule;
import io.voucherify.client.module.ProductsModule;
import io.voucherify.client.module.PromotionsModule;
import io.voucherify.client.module.RedemptionsModule;
import io.voucherify.client.module.RewardsModule;
import io.voucherify.client.module.SegmentsModule;
import io.voucherify.client.module.ValidationRulesModule;
import io.voucherify.client.module.ValidationsModule;
import io.voucherify.client.module.VoucherModule;
import io.voucherify.client.utils.Platform;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.Client;

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

  private PromotionsModule promotionsModule;

  private final OrdersModule ordersModule;

  private final EventsModule eventsModule;

  private final RewardsModule rewardsModule;

  private final LoyaltiesModule loyaltiesModule;

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
    this.promotionsModule = new PromotionsModule(voucherifyApi, executor);
    this.ordersModule = new OrdersModule(voucherifyApi, executor);
    this.eventsModule = new EventsModule(voucherifyApi, executor);
    this.rewardsModule = new RewardsModule(voucherifyApi, executor);
    this.loyaltiesModule = new LoyaltiesModule(voucherifyApi, executor);
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

  public PromotionsModule promotions() {
    return promotionsModule;
  }

  public OrdersModule orders() {
    return ordersModule;
  }

  public EventsModule events() {
    return eventsModule;
  }

  public RewardsModule rewards() {
    return rewardsModule;
  }

  public LoyaltiesModule loyalties() {
    return loyaltiesModule;
  }

  private Executor createCallbackExecutor() {
    return Platform.get().callbackExecutor();
  }

  private JsonConverter createConverter(Builder builder) {
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

    SimpleModule jsonParsingModule = new SimpleModule();
    jsonParsingModule.addSerializer(Date.class, new DateSerializer(Constants.ENDPOINT_DATE_FORMAT));
    jsonParsingModule.addDeserializer(Date.class, new DateDeserializer(Constants.ENDPOINT_DATE_FORMAT, Constants.ENDPOINT_SECONDARY_DATE_FORMAT));
    jsonParsingModule.addDeserializer(CampaignsResponse.class, new CampaignsResponseDeserializer(builder.apiVersion));
    jsonParsingModule.addDeserializer(VouchersResponse.class, new VouchersResponseDeserializer(builder.apiVersion));
    mapper.registerModule(jsonParsingModule);
    return new JsonConverter(mapper);
  }

  private String createHttpScheme(Builder builder) {
    if (builder.secure) {
      return Constants.SCHEME_HTTPS;
    } else {
      return Constants.SCHEME_HTTP;
    }
  }

  private VoucherifyApi createRetrofitService(Builder builder) {
    RestAdapter.Builder restBuilder = new RestAdapter.Builder()
        .setConverter(createConverter(builder))
        .setRequestInterceptor(createInterceptor(builder));

    setEndpoint(builder, restBuilder);
    setClientProvider(builder, restBuilder);
    setLogLevel(builder, restBuilder);
    setErrorHandler(restBuilder);

    return restBuilder.build().create(VoucherifyApi.class);
  }

  private RequestInterceptor createInterceptor(final Builder builder) {
    return new RequestInterceptor() {

      @Override
      public void intercept(RequestFacade request) {
        request.addHeader(Constants.HTTP_HEADER_VOUCHERIFY_CHANNEL, Constants.VOUCHERIFY_CHANNEL_NAME);
        request.addHeader(Constants.HTTP_HEADER_APP_ID, builder.appId);
        request.addHeader(Constants.HTTP_HEADER_APP_TOKEN, builder.clientSecretKey);

        if (builder.apiVersion != null) {
          request.addHeader(Constants.HTTP_HEADER_VOUCHERIFY_API_VERSION, builder.apiVersion.getValue());
        } else {
          request.addHeader(Constants.HTTP_HEADER_VOUCHERIFY_API_VERSION, ApiVersion.V_2018_08_01.getValue());
        }
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

  private void setEndpoint(Builder builder, RestAdapter.Builder restBuilder) {
    String endpoint;

    if (builder.endpoint == null) {
      endpoint = Constants.ENDPOINT_VOUCHERIFY;
    } else {
      endpoint = builder.endpoint;
    }

    restBuilder.setEndpoint(String.format("%s://%s/v1/", httpScheme, endpoint));
  }

  private void setErrorHandler(RestAdapter.Builder restBuilder) {
    restBuilder.setErrorHandler(new VoucherifyErrorHandler());
  }

  public static class Builder {

    String clientSecretKey;

    String appId;

    String endpoint;

    boolean secure;

    RestAdapter.LogLevel logLevel;

    Client.Provider clientProvider;

    ApiVersion apiVersion;

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

    public Builder apiVersion(ApiVersion version) {
      this.apiVersion = version;
      return this;
    }

    public VoucherifyClient build() {
      return new VoucherifyClient(this);
    }

  }
}
