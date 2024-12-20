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
import io.voucherify.client.model.LoyaltiesEarningRulesCreateRequestBodyItemCustomEvent;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateRequestBodyItemLoyalty;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyTier;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateRequestBodyItemSegment;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateRequestBodyItemSource;
import io.voucherify.client.model.ValidityHours;
import io.voucherify.client.model.ValidityTimeframe;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * LoyaltiesEarningRulesCreateRequestBodyItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesEarningRulesCreateRequestBodyItem {
  public static final String SERIALIZED_NAME_VALIDATION_RULE_ID = "validation_rule_id";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULE_ID)
  private String validationRuleId;

  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private LoyaltiesEarningRulesCreateRequestBodyItemLoyalty loyalty;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private LoyaltiesEarningRulesCreateRequestBodyItemSource source;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private ValidityTimeframe validityTimeframe;

  /**
   * Gets or Sets validityDayOfWeek
   */
  @JsonAdapter(ValidityDayOfWeekEnum.Adapter.class)
  public enum ValidityDayOfWeekEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    ValidityDayOfWeekEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidityDayOfWeekEnum fromValue(Integer value) {
      for (ValidityDayOfWeekEnum b : ValidityDayOfWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ValidityDayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidityDayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidityDayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ValidityDayOfWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<ValidityDayOfWeekEnum> validityDayOfWeek;

  public static final String SERIALIZED_NAME_VALIDITY_HOURS = "validity_hours";
  @SerializedName(SERIALIZED_NAME_VALIDITY_HOURS)
  private ValidityHours validityHours;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_SEGMENT = "segment";
  @SerializedName(SERIALIZED_NAME_SEGMENT)
  private LoyaltiesEarningRulesCreateRequestBodyItemSegment segment;

  public static final String SERIALIZED_NAME_CUSTOM_EVENT = "custom_event";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT)
  private LoyaltiesEarningRulesCreateRequestBodyItemCustomEvent customEvent;

  public static final String SERIALIZED_NAME_LOYALTY_TIER = "loyalty_tier";
  @SerializedName(SERIALIZED_NAME_LOYALTY_TIER)
  private LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyTier loyaltyTier;

  public LoyaltiesEarningRulesCreateRequestBodyItem() {
  }

  public LoyaltiesEarningRulesCreateRequestBodyItem validationRuleId(String validationRuleId) {
    
    this.validationRuleId = validationRuleId;
    return this;
  }

   /**
   * A unique validation rule identifier assigned by the Voucherify API. The validation rule is verified before points are added to the balance.
   * @return validationRuleId
  **/
  @javax.annotation.Nullable
  public String getValidationRuleId() {
    return validationRuleId;
  }


  public void setValidationRuleId(String validationRuleId) {
    this.validationRuleId = validationRuleId;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem loyalty(LoyaltiesEarningRulesCreateRequestBodyItemLoyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nullable
  public LoyaltiesEarningRulesCreateRequestBodyItemLoyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(LoyaltiesEarningRulesCreateRequestBodyItemLoyalty loyalty) {
    this.loyalty = loyalty;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    this.event = event;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem source(LoyaltiesEarningRulesCreateRequestBodyItemSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public LoyaltiesEarningRulesCreateRequestBodyItemSource getSource() {
    return source;
  }


  public void setSource(LoyaltiesEarningRulesCreateRequestBodyItemSource source) {
    this.source = source;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag to toggle the earning rule on or off. You can disable an earning rule even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60; of the campaign or the earning rule&#39;s own &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* earning rule - &#x60;false&#x60; indicates an *inactive* earning rule
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date defines when the earning rule starts to be active. Activation timestamp is presented in the ISO 8601 format. Earning rule is *inactive before* this date. If you don&#39;t define the start date for an earning rule, it&#39;ll inherit the campaign start date by default. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date defines when the earning rule expires. Expiration timestamp is presented in the ISO 8601 format.  Earning rule is *inactive after* this date.If you don&#39;t define the expiration date for an earning rule, it&#39;ll inherit the campaign expiration date by default.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem validityTimeframe(ValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public ValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(ValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem validityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public LoyaltiesEarningRulesCreateRequestBodyItem addValidityDayOfWeekItem(ValidityDayOfWeekEnum validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<ValidityDayOfWeekEnum> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem validityHours(ValidityHours validityHours) {
    
    this.validityHours = validityHours;
    return this;
  }

   /**
   * Get validityHours
   * @return validityHours
  **/
  @javax.annotation.Nullable
  public ValidityHours getValidityHours() {
    return validityHours;
  }


  public void setValidityHours(ValidityHours validityHours) {
    this.validityHours = validityHours;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the earning rule. A set of key/value pairs that you can attach to an earning rule object. It can be useful for storing additional information about the earning rule in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem segment(LoyaltiesEarningRulesCreateRequestBodyItemSegment segment) {
    
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @javax.annotation.Nullable
  public LoyaltiesEarningRulesCreateRequestBodyItemSegment getSegment() {
    return segment;
  }


  public void setSegment(LoyaltiesEarningRulesCreateRequestBodyItemSegment segment) {
    this.segment = segment;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem customEvent(LoyaltiesEarningRulesCreateRequestBodyItemCustomEvent customEvent) {
    
    this.customEvent = customEvent;
    return this;
  }

   /**
   * Get customEvent
   * @return customEvent
  **/
  @javax.annotation.Nullable
  public LoyaltiesEarningRulesCreateRequestBodyItemCustomEvent getCustomEvent() {
    return customEvent;
  }


  public void setCustomEvent(LoyaltiesEarningRulesCreateRequestBodyItemCustomEvent customEvent) {
    this.customEvent = customEvent;
  }


  public LoyaltiesEarningRulesCreateRequestBodyItem loyaltyTier(LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyTier loyaltyTier) {
    
    this.loyaltyTier = loyaltyTier;
    return this;
  }

   /**
   * Get loyaltyTier
   * @return loyaltyTier
  **/
  @javax.annotation.Nullable
  public LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyTier getLoyaltyTier() {
    return loyaltyTier;
  }


  public void setLoyaltyTier(LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyTier loyaltyTier) {
    this.loyaltyTier = loyaltyTier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesEarningRulesCreateRequestBodyItem loyaltiesEarningRulesCreateRequestBodyItem = (LoyaltiesEarningRulesCreateRequestBodyItem) o;
    return Objects.equals(this.validationRuleId, loyaltiesEarningRulesCreateRequestBodyItem.validationRuleId) &&
        Objects.equals(this.loyalty, loyaltiesEarningRulesCreateRequestBodyItem.loyalty) &&
        Objects.equals(this.event, loyaltiesEarningRulesCreateRequestBodyItem.event) &&
        Objects.equals(this.source, loyaltiesEarningRulesCreateRequestBodyItem.source) &&
        Objects.equals(this.active, loyaltiesEarningRulesCreateRequestBodyItem.active) &&
        Objects.equals(this.startDate, loyaltiesEarningRulesCreateRequestBodyItem.startDate) &&
        Objects.equals(this.expirationDate, loyaltiesEarningRulesCreateRequestBodyItem.expirationDate) &&
        Objects.equals(this.validityTimeframe, loyaltiesEarningRulesCreateRequestBodyItem.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, loyaltiesEarningRulesCreateRequestBodyItem.validityDayOfWeek) &&
        Objects.equals(this.validityHours, loyaltiesEarningRulesCreateRequestBodyItem.validityHours) &&
        Objects.equals(this.metadata, loyaltiesEarningRulesCreateRequestBodyItem.metadata) &&
        Objects.equals(this.segment, loyaltiesEarningRulesCreateRequestBodyItem.segment) &&
        Objects.equals(this.customEvent, loyaltiesEarningRulesCreateRequestBodyItem.customEvent) &&
        Objects.equals(this.loyaltyTier, loyaltiesEarningRulesCreateRequestBodyItem.loyaltyTier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationRuleId, loyalty, event, source, active, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours, metadata, segment, customEvent, loyaltyTier);
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
    sb.append("class LoyaltiesEarningRulesCreateRequestBodyItem {\n");
    sb.append("    validationRuleId: ").append(toIndentedString(validationRuleId)).append("\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    validityHours: ").append(toIndentedString(validityHours)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    customEvent: ").append(toIndentedString(customEvent)).append("\n");
    sb.append("    loyaltyTier: ").append(toIndentedString(loyaltyTier)).append("\n");
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
    openapiFields.add("validation_rule_id");
    openapiFields.add("loyalty");
    openapiFields.add("event");
    openapiFields.add("source");
    openapiFields.add("active");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("validity_hours");
    openapiFields.add("metadata");
    openapiFields.add("segment");
    openapiFields.add("custom_event");
    openapiFields.add("loyalty_tier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesEarningRulesCreateRequestBodyItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesEarningRulesCreateRequestBodyItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesEarningRulesCreateRequestBodyItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesCreateRequestBodyItem.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesEarningRulesCreateRequestBodyItem>() {
           @Override
           public void write(JsonWriter out, LoyaltiesEarningRulesCreateRequestBodyItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesEarningRulesCreateRequestBodyItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesEarningRulesCreateRequestBodyItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesEarningRulesCreateRequestBodyItem
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesEarningRulesCreateRequestBodyItem
  */
  public static LoyaltiesEarningRulesCreateRequestBodyItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesEarningRulesCreateRequestBodyItem.class);
  }

 /**
  * Convert an instance of LoyaltiesEarningRulesCreateRequestBodyItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

