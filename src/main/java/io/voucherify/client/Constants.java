package io.voucherify.client;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Constants {

  // HTTP constants
  public static final String SCHEME_HTTP = "http";
  public static final String SCHEME_HTTPS = "https";
  public static final String HTTP_HEADER_APP_ID = "X-App-Id";
  public static final String HTTP_HEADER_APP_TOKEN = "X-App-Token";
  public static final String HTTP_HEADER_VOUCHERIFY_CHANNEL = "X-Voucherify-Channel";
  public static final String VOUCHERIFY_CHANNEL_NAME = "Java-SDK";
  public static final String HTTP_HEADER_VOUCHERIFY_API_VERSION = "X-Voucherify-API-Version";

  // Configuration
  public static final String ENDPOINT_VOUCHERIFY = "api.voucherify.io";
  public static final String ENDPOINT_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssXXX";
  public static final String ENDPOINT_SECONDARY_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

}
