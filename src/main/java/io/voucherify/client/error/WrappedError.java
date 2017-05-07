package io.voucherify.client.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
class WrappedError {

  private Integer code;

  private String details;

  private String key;

  private String message;
}

