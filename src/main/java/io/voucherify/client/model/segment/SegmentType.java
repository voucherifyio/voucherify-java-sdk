package io.voucherify.client.model.segment;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SegmentType {

  STATIC("static"), AUTO_UPDATE("auto-update");

  private final String value;

  SegmentType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }
}
