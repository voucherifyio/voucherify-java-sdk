package io.voucherify.client;

import lombok.Getter;

@Getter
public enum ApiVersion {

  V_2017_04_05("v2017-04-05");

  private final String value;

  ApiVersion(String value) {
    this.value = value;
  }
}
