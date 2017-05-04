package io.voucherify.client.exception;

import retrofit.RetrofitError;

public class VoucherifyErrorHandler implements retrofit.ErrorHandler {

  @Override
  public Throwable handleError(RetrofitError cause) {
    return new VoucherifyError(cause);
  }
}
