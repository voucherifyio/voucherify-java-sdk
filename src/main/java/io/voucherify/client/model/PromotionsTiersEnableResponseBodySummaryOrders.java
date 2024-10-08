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
 * Contains statistics about orders related to the promotion tier.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PromotionsTiersEnableResponseBodySummaryOrders {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Integer totalAmount;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT = "total_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT)
  private Integer totalDiscountAmount;

  public PromotionsTiersEnableResponseBodySummaryOrders() {
  }

  public PromotionsTiersEnableResponseBodySummaryOrders totalAmount(Integer totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Sum of order totals.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }


  public PromotionsTiersEnableResponseBodySummaryOrders totalDiscountAmount(Integer totalDiscountAmount) {
    
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * Sum of total discount applied using the promotion tier.
   * @return totalDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalDiscountAmount() {
    return totalDiscountAmount;
  }


  public void setTotalDiscountAmount(Integer totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionsTiersEnableResponseBodySummaryOrders promotionsTiersEnableResponseBodySummaryOrders = (PromotionsTiersEnableResponseBodySummaryOrders) o;
    return Objects.equals(this.totalAmount, promotionsTiersEnableResponseBodySummaryOrders.totalAmount) &&
        Objects.equals(this.totalDiscountAmount, promotionsTiersEnableResponseBodySummaryOrders.totalDiscountAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, totalDiscountAmount);
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
    sb.append("class PromotionsTiersEnableResponseBodySummaryOrders {\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
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
    openapiFields.add("total_amount");
    openapiFields.add("total_discount_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionsTiersEnableResponseBodySummaryOrders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionsTiersEnableResponseBodySummaryOrders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionsTiersEnableResponseBodySummaryOrders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionsTiersEnableResponseBodySummaryOrders.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionsTiersEnableResponseBodySummaryOrders>() {
           @Override
           public void write(JsonWriter out, PromotionsTiersEnableResponseBodySummaryOrders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionsTiersEnableResponseBodySummaryOrders read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionsTiersEnableResponseBodySummaryOrders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionsTiersEnableResponseBodySummaryOrders
  * @throws IOException if the JSON string is invalid with respect to PromotionsTiersEnableResponseBodySummaryOrders
  */
  public static PromotionsTiersEnableResponseBodySummaryOrders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionsTiersEnableResponseBodySummaryOrders.class);
  }

 /**
  * Convert an instance of PromotionsTiersEnableResponseBodySummaryOrders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

