package io.voucherify.client.callback;

import io.voucherify.client.error.VoucherifyError;

public abstract class VoucherifyCallback<T> {

  private boolean cancelled;

  public abstract void onSuccess(T result);

  public void onFailure(VoucherifyError error) {}

  public synchronized void cancel() {
    this.cancelled = true;
  }

  public synchronized boolean isCancelled() {
    return cancelled;
  }

}
