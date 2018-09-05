package io.voucherify.client;

import lombok.Getter;

@Getter
public enum ApiVersion {
  V_2017_04_05("v2017-04-05"),
  V_2017_04_20("v2017-04-20"),
  V_2018_08_01("v2018-08-01");

  private final String value;

  ApiVersion(String value) {
    this.value = value;
  }
}
