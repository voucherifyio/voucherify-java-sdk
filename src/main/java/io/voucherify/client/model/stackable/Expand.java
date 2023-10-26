package io.voucherify.client.model.stackable;

public enum Expand {

  ORDER("order"),
  REDEMPTION("redemption"),
  REDEEMABLE("redeemable"),
  CATEGORY("category");

  private final String value;

  Expand(String value) {
    this.value = value;
  }
}
