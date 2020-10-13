package io.voucherify.client;

import lombok.Getter;

@Getter
public enum ApiVersion {
  V_2018_08_01("v2018-08-01");

  private final String value;

  ApiVersion(String value) {
    this.value = value;
  }
}
