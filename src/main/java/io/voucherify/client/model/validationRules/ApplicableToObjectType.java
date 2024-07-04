package io.voucherify.client.model.validationRules;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum ApplicableToObjectType {
  PRODUCT("product"),
  SKU("sku"),
  PRODUCTS_COLLECTION("products_collection");

  private final String value;

  ApplicableToObjectType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }
}
