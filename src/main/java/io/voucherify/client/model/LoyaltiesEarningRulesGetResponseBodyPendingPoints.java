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
 * Defines the configuration for pending points. Pending points can be used only with the &#x60;order.paid&#x60; event.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesEarningRulesGetResponseBodyPendingPoints {
  /**
   * Defines the type of the period during which the points are in the pending state. Currently, only &#x60;DAY&#x60; value is accepted.
   */
  @JsonAdapter(PeriodTypeEnum.Adapter.class)
  public enum PeriodTypeEnum {
    DAY("DAY");

    private String value;

    PeriodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodTypeEnum fromValue(String value) {
      for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<PeriodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PeriodTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "period_type";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private PeriodTypeEnum periodType = PeriodTypeEnum.DAY;

  public static final String SERIALIZED_NAME_PERIOD_VALUE = "period_value";
  @SerializedName(SERIALIZED_NAME_PERIOD_VALUE)
  private Integer periodValue;

  public LoyaltiesEarningRulesGetResponseBodyPendingPoints() {
  }

  public LoyaltiesEarningRulesGetResponseBodyPendingPoints periodType(PeriodTypeEnum periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * Defines the type of the period during which the points are in the pending state. Currently, only &#x60;DAY&#x60; value is accepted.
   * @return periodType
  **/
  @javax.annotation.Nullable
  public PeriodTypeEnum getPeriodType() {
    return periodType;
  }


  public void setPeriodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
  }


  public LoyaltiesEarningRulesGetResponseBodyPendingPoints periodValue(Integer periodValue) {
    
    this.periodValue = periodValue;
    return this;
  }

   /**
   * Defines for how long the points are in the pending state. The minimum value is 1, maximum is 90.
   * minimum: 1
   * maximum: 90
   * @return periodValue
  **/
  @javax.annotation.Nullable
  public Integer getPeriodValue() {
    return periodValue;
  }


  public void setPeriodValue(Integer periodValue) {
    this.periodValue = periodValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesEarningRulesGetResponseBodyPendingPoints loyaltiesEarningRulesGetResponseBodyPendingPoints = (LoyaltiesEarningRulesGetResponseBodyPendingPoints) o;
    return Objects.equals(this.periodType, loyaltiesEarningRulesGetResponseBodyPendingPoints.periodType) &&
        Objects.equals(this.periodValue, loyaltiesEarningRulesGetResponseBodyPendingPoints.periodValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodType, periodValue);
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
    sb.append("class LoyaltiesEarningRulesGetResponseBodyPendingPoints {\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    periodValue: ").append(toIndentedString(periodValue)).append("\n");
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
    openapiFields.add("period_type");
    openapiFields.add("period_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesEarningRulesGetResponseBodyPendingPoints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesEarningRulesGetResponseBodyPendingPoints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesEarningRulesGetResponseBodyPendingPoints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesGetResponseBodyPendingPoints.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesEarningRulesGetResponseBodyPendingPoints>() {
           @Override
           public void write(JsonWriter out, LoyaltiesEarningRulesGetResponseBodyPendingPoints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesEarningRulesGetResponseBodyPendingPoints read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesEarningRulesGetResponseBodyPendingPoints given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesEarningRulesGetResponseBodyPendingPoints
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesEarningRulesGetResponseBodyPendingPoints
  */
  public static LoyaltiesEarningRulesGetResponseBodyPendingPoints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesEarningRulesGetResponseBodyPendingPoints.class);
  }

 /**
  * Convert an instance of LoyaltiesEarningRulesGetResponseBodyPendingPoints to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

