package io.voucherify.client.model.qualifications;

public enum Expand {

  REDEEMABLE("redeemable"),
  CATEGORY("category");

  private final String value;

  Expand(String value) {
    this.value = value;
  }
}
