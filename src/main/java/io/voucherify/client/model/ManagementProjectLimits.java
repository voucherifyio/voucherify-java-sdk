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
import io.voucherify.client.model.ManagementProjectLimitsApiCallsItem;
import io.voucherify.client.model.ManagementProjectLimitsBulkApiCallsItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Determines additional limits set on a given project, e.g. the Sandbox project. If no limits are returned, the limits set for the whole organization apply.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectLimits {
  public static final String SERIALIZED_NAME_API_CALLS = "api_calls";
  @SerializedName(SERIALIZED_NAME_API_CALLS)
  private List<ManagementProjectLimitsApiCallsItem> apiCalls;

  public static final String SERIALIZED_NAME_BULK_API_CALLS = "bulk_api_calls";
  @SerializedName(SERIALIZED_NAME_BULK_API_CALLS)
  private List<ManagementProjectLimitsBulkApiCallsItem> bulkApiCalls;

  public ManagementProjectLimits() {
  }

  public ManagementProjectLimits apiCalls(List<ManagementProjectLimitsApiCallsItem> apiCalls) {
    
    this.apiCalls = apiCalls;
    return this;
  }

  public ManagementProjectLimits addApiCallsItem(ManagementProjectLimitsApiCallsItem apiCallsItem) {
    if (this.apiCalls == null) {
      this.apiCalls = new ArrayList<>();
    }
    this.apiCalls.add(apiCallsItem);
    return this;
  }

   /**
   * Get apiCalls
   * @return apiCalls
  **/
  @javax.annotation.Nullable
  public List<ManagementProjectLimitsApiCallsItem> getApiCalls() {
    return apiCalls;
  }


  public void setApiCalls(List<ManagementProjectLimitsApiCallsItem> apiCalls) {
    this.apiCalls = apiCalls;
  }


  public ManagementProjectLimits bulkApiCalls(List<ManagementProjectLimitsBulkApiCallsItem> bulkApiCalls) {
    
    this.bulkApiCalls = bulkApiCalls;
    return this;
  }

  public ManagementProjectLimits addBulkApiCallsItem(ManagementProjectLimitsBulkApiCallsItem bulkApiCallsItem) {
    if (this.bulkApiCalls == null) {
      this.bulkApiCalls = new ArrayList<>();
    }
    this.bulkApiCalls.add(bulkApiCallsItem);
    return this;
  }

   /**
   * Get bulkApiCalls
   * @return bulkApiCalls
  **/
  @javax.annotation.Nullable
  public List<ManagementProjectLimitsBulkApiCallsItem> getBulkApiCalls() {
    return bulkApiCalls;
  }


  public void setBulkApiCalls(List<ManagementProjectLimitsBulkApiCallsItem> bulkApiCalls) {
    this.bulkApiCalls = bulkApiCalls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementProjectLimits managementProjectLimits = (ManagementProjectLimits) o;
    return Objects.equals(this.apiCalls, managementProjectLimits.apiCalls) &&
        Objects.equals(this.bulkApiCalls, managementProjectLimits.bulkApiCalls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiCalls, bulkApiCalls);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementProjectLimits {\n");
    sb.append("    apiCalls: ").append(toIndentedString(apiCalls)).append("\n");
    sb.append("    bulkApiCalls: ").append(toIndentedString(bulkApiCalls)).append("\n");
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
    openapiFields.add("api_calls");
    openapiFields.add("bulk_api_calls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectLimits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectLimits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectLimits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectLimits.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectLimits>() {
           @Override
           public void write(JsonWriter out, ManagementProjectLimits value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectLimits read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectLimits given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectLimits
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectLimits
  */
  public static ManagementProjectLimits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectLimits.class);
  }

 /**
  * Convert an instance of ManagementProjectLimits to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
