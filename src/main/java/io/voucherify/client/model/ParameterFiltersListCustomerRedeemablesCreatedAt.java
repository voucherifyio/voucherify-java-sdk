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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.voucherify.client.model.FilterConditionsDateTime;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.voucherify.client.JSON;

/**
 * Timestamp representing the date and time when the customer redeemable was created. The value is shown in the ISO 8601 format.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParameterFiltersListCustomerRedeemablesCreatedAt {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private FilterConditionsDateTime conditions;

  public ParameterFiltersListCustomerRedeemablesCreatedAt() {
  }

  public ParameterFiltersListCustomerRedeemablesCreatedAt conditions(FilterConditionsDateTime conditions) {
    
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nullable
  public FilterConditionsDateTime getConditions() {
    return conditions;
  }


  public void setConditions(FilterConditionsDateTime conditions) {
    this.conditions = conditions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterFiltersListCustomerRedeemablesCreatedAt parameterFiltersListCustomerRedeemablesCreatedAt = (ParameterFiltersListCustomerRedeemablesCreatedAt) o;
    return Objects.equals(this.conditions, parameterFiltersListCustomerRedeemablesCreatedAt.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterFiltersListCustomerRedeemablesCreatedAt {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("conditions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterFiltersListCustomerRedeemablesCreatedAt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterFiltersListCustomerRedeemablesCreatedAt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterFiltersListCustomerRedeemablesCreatedAt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterFiltersListCustomerRedeemablesCreatedAt.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterFiltersListCustomerRedeemablesCreatedAt>() {
           @Override
           public void write(JsonWriter out, ParameterFiltersListCustomerRedeemablesCreatedAt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterFiltersListCustomerRedeemablesCreatedAt read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterFiltersListCustomerRedeemablesCreatedAt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterFiltersListCustomerRedeemablesCreatedAt
  * @throws IOException if the JSON string is invalid with respect to ParameterFiltersListCustomerRedeemablesCreatedAt
  */
  public static ParameterFiltersListCustomerRedeemablesCreatedAt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterFiltersListCustomerRedeemablesCreatedAt.class);
  }

 /**
  * Convert an instance of ParameterFiltersListCustomerRedeemablesCreatedAt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

