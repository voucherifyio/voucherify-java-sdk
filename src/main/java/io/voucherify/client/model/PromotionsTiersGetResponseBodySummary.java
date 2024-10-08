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
import io.voucherify.client.model.PromotionsTiersGetResponseBodySummaryOrders;
import io.voucherify.client.model.PromotionsTiersGetResponseBodySummaryRedemptions;
import java.io.IOException;
import java.util.Arrays;
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
 * Contains statistics about promotion tier redemptions and orders.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PromotionsTiersGetResponseBodySummary {
  public static final String SERIALIZED_NAME_REDEMPTIONS = "redemptions";
  @SerializedName(SERIALIZED_NAME_REDEMPTIONS)
  private PromotionsTiersGetResponseBodySummaryRedemptions redemptions;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private PromotionsTiersGetResponseBodySummaryOrders orders;

  public PromotionsTiersGetResponseBodySummary() {
  }

  public PromotionsTiersGetResponseBodySummary redemptions(PromotionsTiersGetResponseBodySummaryRedemptions redemptions) {
    
    this.redemptions = redemptions;
    return this;
  }

   /**
   * Get redemptions
   * @return redemptions
  **/
  @javax.annotation.Nullable
  public PromotionsTiersGetResponseBodySummaryRedemptions getRedemptions() {
    return redemptions;
  }


  public void setRedemptions(PromotionsTiersGetResponseBodySummaryRedemptions redemptions) {
    this.redemptions = redemptions;
  }


  public PromotionsTiersGetResponseBodySummary orders(PromotionsTiersGetResponseBodySummaryOrders orders) {
    
    this.orders = orders;
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @javax.annotation.Nullable
  public PromotionsTiersGetResponseBodySummaryOrders getOrders() {
    return orders;
  }


  public void setOrders(PromotionsTiersGetResponseBodySummaryOrders orders) {
    this.orders = orders;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionsTiersGetResponseBodySummary promotionsTiersGetResponseBodySummary = (PromotionsTiersGetResponseBodySummary) o;
    return Objects.equals(this.redemptions, promotionsTiersGetResponseBodySummary.redemptions) &&
        Objects.equals(this.orders, promotionsTiersGetResponseBodySummary.orders);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(redemptions, orders);
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
    sb.append("class PromotionsTiersGetResponseBodySummary {\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
    openapiFields.add("redemptions");
    openapiFields.add("orders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionsTiersGetResponseBodySummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionsTiersGetResponseBodySummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionsTiersGetResponseBodySummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionsTiersGetResponseBodySummary.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionsTiersGetResponseBodySummary>() {
           @Override
           public void write(JsonWriter out, PromotionsTiersGetResponseBodySummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionsTiersGetResponseBodySummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionsTiersGetResponseBodySummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionsTiersGetResponseBodySummary
  * @throws IOException if the JSON string is invalid with respect to PromotionsTiersGetResponseBodySummary
  */
  public static PromotionsTiersGetResponseBodySummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionsTiersGetResponseBodySummary.class);
  }

 /**
  * Convert an instance of PromotionsTiersGetResponseBodySummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

