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

    // Configuration
    public static final String ENDPOINT_VOUCHERIFY = "voucherify-bouncer.herokuapp.com/v1";
    public static final String ENDPOINT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";


    private Constants() {
        throw new UnsupportedOperationException();
    }

}
