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
import java.time.OffsetDateTime;
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
 * Data filters used to narrow down the data records to be returned in the result.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FilterConditionsDateTime {
  public static final String SERIALIZED_NAME_$_AFTER = "$after";
  @SerializedName(SERIALIZED_NAME_$_AFTER)
  private OffsetDateTime $after;

  public static final String SERIALIZED_NAME_$_BEFORE = "$before";
  @SerializedName(SERIALIZED_NAME_$_BEFORE)
  private OffsetDateTime $before;

  public static final String SERIALIZED_NAME_$_HAS_VALUE = "$has_value";
  @SerializedName(SERIALIZED_NAME_$_HAS_VALUE)
  private String $hasValue;

  public static final String SERIALIZED_NAME_$_IS_UNKNOWN = "$is_unknown";
  @SerializedName(SERIALIZED_NAME_$_IS_UNKNOWN)
  private String $isUnknown;

  public static final String SERIALIZED_NAME_MORE_THAN = "more_than";
  @SerializedName(SERIALIZED_NAME_MORE_THAN)
  private Integer moreThan;

  public static final String SERIALIZED_NAME_LESS_THAN = "less_than";
  @SerializedName(SERIALIZED_NAME_LESS_THAN)
  private Integer lessThan;

  public FilterConditionsDateTime() {
  }

  public FilterConditionsDateTime $after(OffsetDateTime $after) {
    
    this.$after = $after;
    return this;
  }

   /**
   * Value is after this date. The value for this parameter is shown in the ISO 8601 format.
   * @return $after
  **/
  @javax.annotation.Nullable
  public OffsetDateTime get$After() {
    return $after;
  }


  public void set$After(OffsetDateTime $after) {
    this.$after = $after;
  }


  public FilterConditionsDateTime $before(OffsetDateTime $before) {
    
    this.$before = $before;
    return this;
  }

   /**
   * Value is before this date. The value for this parameter is shown in the ISO 8601 format.
   * @return $before
  **/
  @javax.annotation.Nullable
  public OffsetDateTime get$Before() {
    return $before;
  }


  public void set$Before(OffsetDateTime $before) {
    this.$before = $before;
  }


  public FilterConditionsDateTime $hasValue(String $hasValue) {
    
    this.$hasValue = $hasValue;
    return this;
  }

   /**
   * Value is NOT null. The value for this parameter is an empty string.
   * @return $hasValue
  **/
  @javax.annotation.Nullable
  public String get$HasValue() {
    return $hasValue;
  }


  public void set$HasValue(String $hasValue) {
    this.$hasValue = $hasValue;
  }


  public FilterConditionsDateTime $isUnknown(String $isUnknown) {
    
    this.$isUnknown = $isUnknown;
    return this;
  }

   /**
   * Value is null. The value for this parameter is an empty string.
   * @return $isUnknown
  **/
  @javax.annotation.Nullable
  public String get$IsUnknown() {
    return $isUnknown;
  }


  public void set$IsUnknown(String $isUnknown) {
    this.$isUnknown = $isUnknown;
  }


  public FilterConditionsDateTime moreThan(Integer moreThan) {
    
    this.moreThan = moreThan;
    return this;
  }

   /**
   * Value is more days ago before the current date and time, e.g. more than &#x60;10&#x60; days ago.
   * @return moreThan
  **/
  @javax.annotation.Nullable
  public Integer getMoreThan() {
    return moreThan;
  }


  public void setMoreThan(Integer moreThan) {
    this.moreThan = moreThan;
  }


  public FilterConditionsDateTime lessThan(Integer lessThan) {
    
    this.lessThan = lessThan;
    return this;
  }

   /**
   * Value is less days before the current date and time, e.g. less than &#x60;10&#x60; days ago.
   * @return lessThan
  **/
  @javax.annotation.Nullable
  public Integer getLessThan() {
    return lessThan;
  }


  public void setLessThan(Integer lessThan) {
    this.lessThan = lessThan;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterConditionsDateTime filterConditionsDateTime = (FilterConditionsDateTime) o;
    return Objects.equals(this.$after, filterConditionsDateTime.$after) &&
        Objects.equals(this.$before, filterConditionsDateTime.$before) &&
        Objects.equals(this.$hasValue, filterConditionsDateTime.$hasValue) &&
        Objects.equals(this.$isUnknown, filterConditionsDateTime.$isUnknown) &&
        Objects.equals(this.moreThan, filterConditionsDateTime.moreThan) &&
        Objects.equals(this.lessThan, filterConditionsDateTime.lessThan);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash($after, $before, $hasValue, $isUnknown, moreThan, lessThan);
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
    sb.append("class FilterConditionsDateTime {\n");
    sb.append("    $after: ").append(toIndentedString($after)).append("\n");
    sb.append("    $before: ").append(toIndentedString($before)).append("\n");
    sb.append("    $hasValue: ").append(toIndentedString($hasValue)).append("\n");
    sb.append("    $isUnknown: ").append(toIndentedString($isUnknown)).append("\n");
    sb.append("    moreThan: ").append(toIndentedString(moreThan)).append("\n");
    sb.append("    lessThan: ").append(toIndentedString(lessThan)).append("\n");
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
    openapiFields.add("$after");
    openapiFields.add("$before");
    openapiFields.add("$has_value");
    openapiFields.add("$is_unknown");
    openapiFields.add("more_than");
    openapiFields.add("less_than");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterConditionsDateTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterConditionsDateTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterConditionsDateTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterConditionsDateTime.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterConditionsDateTime>() {
           @Override
           public void write(JsonWriter out, FilterConditionsDateTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterConditionsDateTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilterConditionsDateTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilterConditionsDateTime
  * @throws IOException if the JSON string is invalid with respect to FilterConditionsDateTime
  */
  public static FilterConditionsDateTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterConditionsDateTime.class);
  }

 /**
  * Convert an instance of FilterConditionsDateTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
