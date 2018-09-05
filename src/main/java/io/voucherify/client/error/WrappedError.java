package io.voucherify.client.error;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
class WrappedError {

  @JsonCreator
  public WrappedError(
      @JsonProperty("code") Integer code,
      @JsonProperty("message") String message,
      @JsonProperty("details") String details,
      @JsonProperty("key") String key) {
    this.code = code;
    this.message = message;
    this.details = details;
    this.key = key;
  }

  private Integer code;

  private String details;

  private String key;

  private String message;
}
