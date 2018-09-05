package io.voucherify.client.error;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.ObjectUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherifyError extends RuntimeException {

  private Integer code;

  private String details;

  private String key;

  private VoucherifyError(WrappedError error) {
    super(error != null ? error.getMessage() : "unknown");
    this.code = error != null ? ObjectUtils.firstNonNull(error.getCode(), 500) : 500;
    this.details =
        error != null ? ObjectUtils.firstNonNull(error.getDetails(), "unknown") : "unknown";
    this.key = error != null ? ObjectUtils.firstNonNull(error.getKey(), "unknown") : "unknown";
  }

  private VoucherifyError(
      String message, Throwable throwable, Integer code, String details, String key) {
    super(message, throwable);
    this.code = ObjectUtils.firstNonNull(code, 500);
    this.details = ObjectUtils.firstNonNull(details, "Internal SDK error");
    this.key = ObjectUtils.firstNonNull(key, "internal-sdk-error");
  }

  public static VoucherifyError from(WrappedError error) {
    return new VoucherifyError(error);
  }

  public static VoucherifyError from(String text, Integer code, String details, String key) {
    return new VoucherifyError(text, null, code, details, key);
  }

  public static VoucherifyError from(String text) {
    return new VoucherifyError(text, null, null, null, null);
  }
}
