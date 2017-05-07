package io.voucherify.client.error;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import retrofit.RetrofitError;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherifyError extends RuntimeException {

  private Integer code;

  private String details;

  private String key;

  private VoucherifyError(String message) {
    super(message);
  }

  private VoucherifyError(WrappedError wrapped, Throwable throwable) {
    super(wrapped.getMessage(), throwable);
    this.code = wrapped.getCode();
    this.details = wrapped.getDetails();
    this.key = wrapped.getKey();
  }

  private VoucherifyError(Throwable throwable) {
    super(throwable);
  }

  public static VoucherifyError from(Throwable throwable) {
    if (throwable instanceof RetrofitError) {
      WrappedError wrapped = (WrappedError) ((RetrofitError) throwable).getBodyAs(WrappedError.class);
      return new VoucherifyError(wrapped, throwable);
    }

    return new VoucherifyError(throwable);
  }

  public static VoucherifyError from(String message) {
    return new VoucherifyError(message);
  }

}
