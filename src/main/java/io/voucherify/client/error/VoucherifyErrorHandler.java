package io.voucherify.client.error;

import retrofit.RetrofitError;

public class VoucherifyErrorHandler implements retrofit.ErrorHandler {

  @Override
  public Throwable handleError(RetrofitError cause) {
    return VoucherifyError.from(cause);
  }
}
