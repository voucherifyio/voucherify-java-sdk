package pl.rspective.voucherify.client;

/**
 * Holds all constants for voucherify java client
 */
public final class Constants {

    // HTTP constants
    public static final String SCHEME_HTTP = "http";
    public static final String SCHEME_HTTPS = "https";
    public static final String HTTP_HEADER_APP_ID = "X-App-Id";
    public static final String HTTP_HEADER_APP_TOKEN = "X-App-Token";
    public static final String HTTP_HEADER_VOUCHERIFY_CHANNEL = "X-Voucherify-Channel";
    public static final String VOUCHERIFY_CHANNEL_NAME = "Java-SDK";

    // Configuration
    public static final String ENDPOINT_VOUCHERIFY = "api.voucherify.io/v1";
    public static final String ENDPOINT_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSX";


    private Constants() {
        throw new UnsupportedOperationException();
    }

}
