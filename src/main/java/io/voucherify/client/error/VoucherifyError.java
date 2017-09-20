package io.voucherify.client.error;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import retrofit.RetrofitError;

import static retrofit.RetrofitError.*;

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
    super(wrapped != null ? wrapped.getMessage() : "unknown", throwable);
    this.code = wrapped != null ? wrapped.getCode() : null;
    this.details = wrapped != null ? wrapped.getDetails() : throwable.getMessage();
    this.key = wrapped != null ? wrapped.getKey() : null;
  }

  private VoucherifyError(Throwable throwable) {
    super(throwable);
  }

  public static VoucherifyError from(Throwable throwable) {
    if (throwable instanceof RetrofitError) {
      RetrofitError retrofitError = (RetrofitError) throwable;
      Kind kind = retrofitError.getKind();

      if (kind == Kind.NETWORK || kind == Kind.UNEXPECTED || kind == Kind.CONVERSION) {
        return new VoucherifyError(retrofitError.getMessage());
      }

      WrappedError wrapped = (WrappedError) retrofitError.getBodyAs(WrappedError.class);
      return new VoucherifyError(wrapped, throwable);
    }

    return new VoucherifyError(throwable);
  }

  public static VoucherifyError from(String message) {
    return new VoucherifyError(message);
  }

}
