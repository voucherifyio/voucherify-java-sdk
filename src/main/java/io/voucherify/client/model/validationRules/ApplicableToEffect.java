package io.voucherify.client.model.validationRules;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum ApplicableToEffect {
  EVERY("APPLY_TO_EVERY"),
  CHEAPEST("APPLY_TO_CHEAPEST"),
  MOST_EXPENSIVE("APPLY_TO_MOST_EXPENSIVE");

  private final String value;

  ApplicableToEffect(String value) {
    this.value = value;
  }

  @JsonValue
    public String getValue() {
      return value;
  }
}
