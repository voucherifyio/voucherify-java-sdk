package io.voucherify.client.model.qualifications;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Expand {

  REDEEMABLE("redeemable"),
  CATEGORY("category");

  private final String value;

  Expand(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }
}
