package io.voucherify.client.model.common;

import lombok.Getter;

@Getter
public enum SortingOrder {

  ASC(""), DESC("-");

  private final String sorting;

  SortingOrder(String sorting) {
    this.sorting = sorting;
  }
}
