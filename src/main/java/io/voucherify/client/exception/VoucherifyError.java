package io.voucherify.client.exception;

import lombok.Getter;
import lombok.ToString;
import retrofit.RetrofitError;

@Getter
@ToString
public class VoucherifyError extends RuntimeException {

  private String message;
  private String details;
  private int code;
  private String key;
  private RetrofitError.Kind kind;
  private String url;

  VoucherifyError(RetrofitError error) {
    super(error);
    this.message = error.getMessage();
    this.details = error.getResponse().getReason();
    this.code = error.getResponse().getStatus();
    this.kind = error.getKind();
    this.url = error.getUrl();
  }

}
