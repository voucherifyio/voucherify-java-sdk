/*
 * Voucherify API
 * Voucherify promotion engine REST API. Please see https://docs.voucherify.io/docs for more details.
 *
 * The version of the OpenAPI document: v2018-08-01
 * Contact: support@voucherify.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.voucherify.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ParameterOrderVouchers
 */
@JsonAdapter(ParameterOrderVouchers.Adapter.class)
public enum ParameterOrderVouchers {
  
  CREATED_AT("created_at"),
  
  _CREATED_AT("-created_at"),
  
  UPDATED_AT("updated_at"),
  
  _UPDATED_AT("-updated_at"),
  
  CODE("code"),
  
  _CODE("-code");

  private String value;

  ParameterOrderVouchers(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ParameterOrderVouchers fromValue(String value) {
    for (ParameterOrderVouchers b : ParameterOrderVouchers.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ParameterOrderVouchers> {
    @Override
    public void write(final JsonWriter jsonWriter, final ParameterOrderVouchers enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ParameterOrderVouchers read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ParameterOrderVouchers.fromValue(value);
    }
  }
}

