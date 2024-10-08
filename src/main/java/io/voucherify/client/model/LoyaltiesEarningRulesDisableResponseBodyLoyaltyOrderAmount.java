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
 * Defines the ratio based on the property defined in the calculation_type parameter. For every set of value (1, 10, etc) defined in the every parameter for the property defined in calculation_type, give the customer the number of points defined in the points parameter. In other words, for every calculation_type, give points.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount {
  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  private Integer every;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount() {
  }

  public LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount every(Integer every) {
    
    this.every = every;
    return this;
  }

   /**
   * Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 order amount is written as 1000.
   * @return every
  **/
  @javax.annotation.Nullable
  public Integer getEvery() {
    return every;
  }


  public void setEvery(Integer every) {
    this.every = every;
  }


  public LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Number of points to be awarded, i.e. how many points to be added to the loyalty card.
   * @return points
  **/
  @javax.annotation.Nullable
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount loyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount = (LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount) o;
    return Objects.equals(this.every, loyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount.every) &&
        Objects.equals(this.points, loyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount.points);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(every, points);
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
    sb.append("class LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount {\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
    openapiFields.add("every");
    openapiFields.add("points");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount>() {
           @Override
           public void write(JsonWriter out, LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount
  */
  public static LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount.class);
  }

 /**
  * Convert an instance of LoyaltiesEarningRulesDisableResponseBodyLoyaltyOrderAmount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

