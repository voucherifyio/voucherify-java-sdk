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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Defines the reccuring period(s) when the resource will be active.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValidityHoursDailyInner {
  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  /**
   * Gets or Sets daysOfWeek
   */
  @JsonAdapter(DaysOfWeekEnum.Adapter.class)
  public enum DaysOfWeekEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    DaysOfWeekEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DaysOfWeekEnum fromValue(Integer value) {
      for (DaysOfWeekEnum b : DaysOfWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<DaysOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DaysOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DaysOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DaysOfWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DAYS_OF_WEEK = "days_of_week";
  @SerializedName(SERIALIZED_NAME_DAYS_OF_WEEK)
  private List<DaysOfWeekEnum> daysOfWeek;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expiration_time";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private String expirationTime;

  public ValidityHoursDailyInner() {
  }

  public ValidityHoursDailyInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Defines the starting hour of validity in the HH:mm format. The resource is *inactive before* this time.
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ValidityHoursDailyInner daysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public ValidityHoursDailyInner addDaysOfWeekItem(DaysOfWeekEnum daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the resource is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60;  Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return daysOfWeek
  **/
  @javax.annotation.Nullable
  public List<DaysOfWeekEnum> getDaysOfWeek() {
    return daysOfWeek;
  }


  public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }


  public ValidityHoursDailyInner expirationTime(String expirationTime) {
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Defines the ending hour of validity in the HH:mm format. The resource is *inactive after* this time.
   * @return expirationTime
  **/
  @javax.annotation.Nullable
  public String getExpirationTime() {
    return expirationTime;
  }


  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ValidityHoursDailyInner instance itself
   */
  public ValidityHoursDailyInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidityHoursDailyInner validityHoursDailyInner = (ValidityHoursDailyInner) o;
    return Objects.equals(this.startTime, validityHoursDailyInner.startTime) &&
        Objects.equals(this.daysOfWeek, validityHoursDailyInner.daysOfWeek) &&
        Objects.equals(this.expirationTime, validityHoursDailyInner.expirationTime)&&
        Objects.equals(this.additionalProperties, validityHoursDailyInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, daysOfWeek, expirationTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidityHoursDailyInner {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("start_time");
    openapiFields.add("days_of_week");
    openapiFields.add("expiration_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidityHoursDailyInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidityHoursDailyInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidityHoursDailyInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidityHoursDailyInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidityHoursDailyInner>() {
           @Override
           public void write(JsonWriter out, ValidityHoursDailyInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidityHoursDailyInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ValidityHoursDailyInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     return null;
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidityHoursDailyInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidityHoursDailyInner
  * @throws IOException if the JSON string is invalid with respect to ValidityHoursDailyInner
  */
  public static ValidityHoursDailyInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidityHoursDailyInner.class);
  }

 /**
  * Convert an instance of ValidityHoursDailyInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
