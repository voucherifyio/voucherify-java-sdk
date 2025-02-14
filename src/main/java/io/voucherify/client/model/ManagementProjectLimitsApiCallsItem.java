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
 * Determines the limit of API calls per given unit time.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectLimitsApiCallsItem {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public ManagementProjectLimitsApiCallsItem() {
  }

  public ManagementProjectLimitsApiCallsItem value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * Determines the maximum number of API calls per time set in &#x60;\&quot;duration\&quot;&#x60;.
   * @return value
  **/
  @javax.annotation.Nullable
  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
  }


  public ManagementProjectLimitsApiCallsItem duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Determines the amount of time during which the calls up to the number specified in the &#x60;value&#x60; can be made. The duration is presented in the ISO 8601 format, e.g. &#x60;PT1H&#x60; means one hour.
   * @return duration
  **/
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementProjectLimitsApiCallsItem managementProjectLimitsApiCallsItem = (ManagementProjectLimitsApiCallsItem) o;
    return Objects.equals(this.value, managementProjectLimitsApiCallsItem.value) &&
        Objects.equals(this.duration, managementProjectLimitsApiCallsItem.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementProjectLimitsApiCallsItem {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectLimitsApiCallsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectLimitsApiCallsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectLimitsApiCallsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectLimitsApiCallsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectLimitsApiCallsItem>() {
           @Override
           public void write(JsonWriter out, ManagementProjectLimitsApiCallsItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectLimitsApiCallsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectLimitsApiCallsItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectLimitsApiCallsItem
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectLimitsApiCallsItem
  */
  public static ManagementProjectLimitsApiCallsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectLimitsApiCallsItem.class);
  }

 /**
  * Convert an instance of ManagementProjectLimitsApiCallsItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

