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
import io.voucherify.client.model.LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderAmount;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderMetadata;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderTotalAmount;
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
 * LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderAmount amount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderTotalAmount totalAmount;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderMetadata metadata;

  public LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder() {
  }

  public LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder amount(LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  public LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderAmount getAmount() {
    return amount;
  }


  public void setAmount(LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderAmount amount) {
    this.amount = amount;
  }


  public LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder totalAmount(LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderTotalAmount totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderTotalAmount getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderTotalAmount totalAmount) {
    this.totalAmount = totalAmount;
  }


  public LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder metadata(LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderMetadata metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder loyaltiesEarningRulesCreateResponseBodyLoyaltyOrder = (LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder) o;
    return Objects.equals(this.amount, loyaltiesEarningRulesCreateResponseBodyLoyaltyOrder.amount) &&
        Objects.equals(this.totalAmount, loyaltiesEarningRulesCreateResponseBodyLoyaltyOrder.totalAmount) &&
        Objects.equals(this.metadata, loyaltiesEarningRulesCreateResponseBodyLoyaltyOrder.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, totalAmount, metadata);
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
    sb.append("class LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("total_amount");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder>() {
           @Override
           public void write(JsonWriter out, LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder
  */
  public static LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder.class);
  }

 /**
  * Convert an instance of LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

