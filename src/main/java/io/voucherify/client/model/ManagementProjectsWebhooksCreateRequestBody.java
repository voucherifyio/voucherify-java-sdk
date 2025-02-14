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
 * Request body schema for **POST** &#x60;/management/v1/projects/{projectId}/webhooks/{webhookId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectsWebhooksCreateRequestBody {
  public static final String SERIALIZED_NAME_TARGET_URL = "target_url";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private String targetUrl;

  /**
   * Gets or Sets events
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    REDEMPTION_SUCCEEDED("redemption.succeeded"),
    
    REDEMPTION_FAILED("redemption.failed"),
    
    REDEMPTION_ROLLBACK_SUCCEEDED("redemption.rollback.succeeded"),
    
    REDEMPTION_ROLLBACK_FAILED("redemption.rollback.failed"),
    
    PUBLICATION_SUCCEEDED("publication.succeeded"),
    
    VOUCHER_PUBLISHED("voucher.published"),
    
    VOUCHER_UPDATED("voucher.updated"),
    
    VOUCHER_DELETED("voucher.deleted"),
    
    VOUCHER_CREATED("voucher.created"),
    
    VOUCHER_ENABLED("voucher.enabled"),
    
    VOUCHER_DISABLED("voucher.disabled"),
    
    VOUCHER_LOYALTY_CARD_POINTS_ADDED("voucher.loyalty_card.points_added"),
    
    VOUCHER_GIFT_BALANCE_ADDED("voucher.gift.balance_added"),
    
    CAMPAIGN_ENABLED("campaign.enabled"),
    
    CAMPAIGN_DELETED("campaign.deleted"),
    
    CAMPAIGN_CREATED("campaign.created"),
    
    CAMPAIGN_UPDATED("campaign.updated"),
    
    CAMPAIGN_DISABLED("campaign.disabled"),
    
    CAMPAIGN_VOUCHERS_GENERATION_COMPLETED("campaign.vouchers.generation.completed"),
    
    BUSINESS_VALIDATION_RULE_ASSIGNMENT_CREATED("business_validation_rule.assignment.created"),
    
    BUSINESS_VALIDATION_RULE_ASSIGNMENT_DELETED("business_validation_rule.assignment.deleted"),
    
    BUSINESS_VALIDATION_RULE_CREATED("business_validation_rule.created"),
    
    BUSINESS_VALIDATION_RULE_DELETED("business_validation_rule.deleted"),
    
    BUSINESS_VALIDATION_RULE_UPDATED("business_validation_rule.updated"),
    
    CUSTOMER_CREATED("customer.created"),
    
    CUSTOMER_DELETED("customer.deleted"),
    
    CUSTOMER_REWARDED("customer.rewarded"),
    
    CUSTOMER_REWARDED_LOYALTY_POINTS("customer.rewarded.loyalty_points");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EventsEnum> events;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public ManagementProjectsWebhooksCreateRequestBody() {
  }

  public ManagementProjectsWebhooksCreateRequestBody targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * URL address that receives webhooks.
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  public String getTargetUrl() {
    return targetUrl;
  }


  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public ManagementProjectsWebhooksCreateRequestBody events(List<EventsEnum> events) {
    
    this.events = events;
    return this;
  }

  public ManagementProjectsWebhooksCreateRequestBody addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Lists the events that trigger webhook sendout.
   * @return events
  **/
  @javax.annotation.Nullable
  public List<EventsEnum> getEvents() {
    return events;
  }


  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }


  public ManagementProjectsWebhooksCreateRequestBody active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Determines if the webhook configuration is active.
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementProjectsWebhooksCreateRequestBody managementProjectsWebhooksCreateRequestBody = (ManagementProjectsWebhooksCreateRequestBody) o;
    return Objects.equals(this.targetUrl, managementProjectsWebhooksCreateRequestBody.targetUrl) &&
        Objects.equals(this.events, managementProjectsWebhooksCreateRequestBody.events) &&
        Objects.equals(this.active, managementProjectsWebhooksCreateRequestBody.active);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetUrl, events, active);
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
    sb.append("class ManagementProjectsWebhooksCreateRequestBody {\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
    openapiFields.add("target_url");
    openapiFields.add("events");
    openapiFields.add("active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectsWebhooksCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectsWebhooksCreateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectsWebhooksCreateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectsWebhooksCreateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectsWebhooksCreateRequestBody>() {
           @Override
           public void write(JsonWriter out, ManagementProjectsWebhooksCreateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectsWebhooksCreateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectsWebhooksCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectsWebhooksCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectsWebhooksCreateRequestBody
  */
  public static ManagementProjectsWebhooksCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectsWebhooksCreateRequestBody.class);
  }

 /**
  * Convert an instance of ManagementProjectsWebhooksCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

