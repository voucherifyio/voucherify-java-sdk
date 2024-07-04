package io.voucherify.client.model.stackable;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Expand {

  ORDER("order"),
  REDEMPTION("redemption"),
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
