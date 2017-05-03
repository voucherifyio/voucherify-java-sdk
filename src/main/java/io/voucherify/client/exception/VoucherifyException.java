package io.voucherify.client.exception;

import retrofit.RetrofitError;

/**
 * General exception which can occurred during HTTP communication
 */
public class VoucherifyException extends Exception {

    /**
     * Identifies the event kind which triggered a {@link RetrofitError}.
     */
    private RetrofitError.Kind kind;

    /**
     * The full url to which the request was sent
     */
    private String url;

    /**
     *
     * @param kind type which triggered a {@link RetrofitError}
     * @param url of the request
     */
    public VoucherifyException(RetrofitError.Kind kind, String url) {
        this.kind = kind;
        this.url = url;
    }

    /**
     *
     * @param message of the error
     */
    public VoucherifyException(String message) {
        super(message);
    }

    /**
     *
     * @param message of the error
     * @param cause of the error
     */
    public VoucherifyException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     *
     * @param cause of the error
     */
    public VoucherifyException(Throwable cause) {
        super(cause);
    }

    /**
     *
     * @param message of the error
     * @param cause of the exception
     * @param enableSuppression
     * @param writableStackTrace
     */
    public VoucherifyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
