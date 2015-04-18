package com.rspective.voucherify.client.callback;

import retrofit.RetrofitError;

/**
 * Callback to use with any of the asynchronous client methods.
 *
 * Implement the {@link #onSuccess} method for cases where the request is successful, the result
 * object should be delivered as a parameter.
 *
 * @param <T> the type of object to be expected as a result
 */
public abstract class VoucherifyCallback<T> {
    private boolean cancelled;

    /**
     * Callback to be invoked in case the request was successful.
     *
     * @param result result object
     */
    public abstract void onSuccess(T result);

    /**
     * Callback to be invoked in case the request was unsuccessful.
     *
     * @param retrofitError {@link retrofit.RetrofitError} instance
     */
    public void onFailure(RetrofitError retrofitError) {
    }

    /**
     * Cancels this callback. This will prevent any future calls to {@link #onSuccess(Object)} and
     * {@link #onFailure(RetrofitError)} methods. This action cannot be reversed.
     */
    public synchronized void cancel() {
        this.cancelled = true;
    }

    /**
     * Returns true in case this callback instance was previously cancelled.
     */
    public synchronized boolean isCancelled() {
        return cancelled;
    }

}
