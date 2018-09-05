package io.voucherify.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.error.VoucherifyErrorHandler;
import io.voucherify.client.json.deserializer.CampaignsResponseDeserializer;
import io.voucherify.client.json.deserializer.DateDeserializer;
import io.voucherify.client.json.deserializer.VouchersResponseDeserializer;
import io.voucherify.client.json.serializer.DateSerializer;
import io.voucherify.client.model.campaign.response.CampaignsResponse;
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
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class VoucherifyClient {

  private final String httpScheme;
  private final OrdersModule ordersModule;
  private final EventsModule eventsModule;
  private final VoucherModule voucherModule;
  private final ValidationsModule validationsModule;
  private final CustomersModule customersModule;
  private final CampaignsModule campaignsModule;
  private final RedemptionsModule redemptionsModule;
  private final DistributionsModule distributionsModule;
  private final ProductsModule productsModule;
  private final SegmentsModule segmentsModule;
  private final ValidationRulesModule validationRulesModule;
  private final PromotionsModule promotionsModule;
  private final RewardsModule rewardsModule;
  private final LoyaltiesModule loyaltiesModule;

  private VoucherifyApi voucherifyApi;

  private Executor executor;

  private VoucherifyErrorHandler errorHandler;

  private VoucherifyClient(Builder builder) {
    if (builder.clientSecretKey == null) {
      throw new IllegalArgumentException("App token must be defined.");
    }

    if (builder.appId == null) {
      throw new IllegalArgumentException("App ID must be defined.");
    }

    this.httpScheme = createHttpScheme(builder);
    this.executor = createCallbackExecutor();
    this.errorHandler = new VoucherifyErrorHandler();

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

  private JacksonConverterFactory createConverter(Builder builder) {
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

    SimpleModule jsonParsingModule = new SimpleModule();
    jsonParsingModule.addSerializer(Date.class, new DateSerializer(Constants.ENDPOINT_DATE_FORMAT));
    jsonParsingModule.addDeserializer(
        Date.class,
        new DateDeserializer(
            Constants.ENDPOINT_DATE_FORMAT, Constants.ENDPOINT_SECONDARY_DATE_FORMAT));
    jsonParsingModule.addDeserializer(
        CampaignsResponse.class,
        new CampaignsResponseDeserializer(
            ObjectUtils.firstNonNull(builder.apiVersion, ApiVersion.V_2018_08_01)));

    jsonParsingModule.addDeserializer(
        VouchersResponse.class,
        new VouchersResponseDeserializer(
            ObjectUtils.firstNonNull(builder.apiVersion, ApiVersion.V_2018_08_01)));

    mapper.registerModule(jsonParsingModule);

    return JacksonConverterFactory.create(mapper);
  }

  private String createHttpScheme(Builder builder) {
    if (builder.secure) {
      return Constants.SCHEME_HTTPS;
    } else {
      return Constants.SCHEME_HTTP;
    }
  }

  private VoucherifyApi createRetrofitService(Builder builder) {
    Retrofit.Builder restBuilder =
        new Retrofit.Builder()
            .addConverterFactory(createConverter(builder))
            .baseUrl(getBaseUrl(builder))
            .client(createClient(builder));

    return restBuilder.build().create(VoucherifyApi.class);
  }

  private OkHttpClient createClient(Builder builder) {
    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    httpClient
        .addInterceptor(
            chain -> {
              Request original = chain.request();

              Request request =
                  original
                      .newBuilder()
                      .header(
                          Constants.HTTP_HEADER_VOUCHERIFY_CHANNEL,
                          Constants.VOUCHERIFY_CHANNEL_NAME)
                      .header(Constants.HTTP_HEADER_APP_ID, builder.appId)
                      .header(Constants.HTTP_HEADER_APP_TOKEN, builder.clientSecretKey)
                      .header(
                          Constants.HTTP_HEADER_VOUCHERIFY_API_VERSION,
                          ObjectUtils.firstNonNull(builder.apiVersion, ApiVersion.V_2018_08_01)
                              .getValue())
                      .method(original.method(), original.body())
                      .build();

              return chain.proceed(request);
            })
        .addInterceptor(
            chain -> {
              Request request = chain.request();
              Response response = chain.proceed(request);

              if (!response.isSuccessful()) {
                throw errorHandler.from(response);
              }

              return response;
            });

    httpClient.connectTimeout(
        ObjectUtils.firstNonNull(builder.connectionTimeout, Constants.CONNECTION_TIMEOUT),
        TimeUnit.SECONDS);
    httpClient.readTimeout(
        ObjectUtils.firstNonNull(builder.readTimeout, Constants.CONNECTION_TIMEOUT),
        TimeUnit.SECONDS);
    httpClient.writeTimeout(
        ObjectUtils.firstNonNull(builder.writeTimeout, Constants.CONNECTION_TIMEOUT),
        TimeUnit.SECONDS);

    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
    httpLoggingInterceptor.level(
        ObjectUtils.firstNonNull(builder.logLevel, LogLevel.NONE).getValue());
    httpClient.addInterceptor(httpLoggingInterceptor);

    return httpClient.build();
  }

  private String getBaseUrl(Builder builder) {
    String endpoint = ObjectUtils.firstNonNull(builder.endpoint, Constants.ENDPOINT_VOUCHERIFY);
    boolean trailingSlash = StringUtils.endsWith(endpoint, "/");
    return String.format("%s://%s%sv1/", httpScheme, endpoint, trailingSlash ? "" : "/");
  }

  public static class Builder {

    String clientSecretKey;

    String appId;

    String endpoint;

    boolean secure;

    ApiVersion apiVersion;

    Integer connectionTimeout;

    Integer readTimeout;

    Integer writeTimeout;

    LogLevel logLevel;

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

    public Builder setConnectTimeout(Integer timeout) {
      this.connectionTimeout = timeout;
      return this;
    }

    public Builder setReadTimeout(Integer timeout) {
      this.readTimeout = timeout;
      return this;
    }

    public Builder setWriteTimeout(Integer timeout) {
      this.writeTimeout = timeout;
      return this;
    }

    public Builder setEndpoint(String remoteUrl) {
      if (remoteUrl == null) {
        throw new IllegalArgumentException("Cannot call setEndpoint() with null.");
      }

      this.endpoint = remoteUrl;
      return this;
    }

    public Builder setLogLevel(LogLevel logLevel) {
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
      if (version == null) {
        throw new IllegalArgumentException("Cannot call apiVersion() with null.");
      }

      this.apiVersion = version;
      return this;
    }

    public VoucherifyClient build() {
      return new VoucherifyClient(this);
    }
  }
}
