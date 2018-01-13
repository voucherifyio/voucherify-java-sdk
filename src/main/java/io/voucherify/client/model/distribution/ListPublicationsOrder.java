package io.voucherify.client.model.distribution;

import lombok.Getter;

@Getter
public enum ListPublicationsOrder {

  ID("id"), VOUCHER_CODE("voucher_code"), TRACKING_ID("tracking_id"), CUSTOMER_ID("customer_id"), CREATED_AT("created_at"), CHANNEL("channel");

  private final String value;

  ListPublicationsOrder(String value) {
    this.value = value;
  }
}
