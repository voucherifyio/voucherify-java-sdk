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
 * Response body schema for **GET** &#x60;/management/v1/projects/{projectId}/webhooks/{webhookId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectsWebhooksGetResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of the object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    WEBHOOK("webhook");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.WEBHOOK;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

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

  public ManagementProjectsWebhooksGetResponseBody() {
  }

  public ManagementProjectsWebhooksGetResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the webhook.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ManagementProjectsWebhooksGetResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public ManagementProjectsWebhooksGetResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the webhook configuration was created. The value for this parameter is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ManagementProjectsWebhooksGetResponseBody targetUrl(String targetUrl) {
    
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


  public ManagementProjectsWebhooksGetResponseBody events(List<EventsEnum> events) {
    
    this.events = events;
    return this;
  }

  public ManagementProjectsWebhooksGetResponseBody addEventsItem(EventsEnum eventsItem) {
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


  public ManagementProjectsWebhooksGetResponseBody active(Boolean active) {
    
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
    ManagementProjectsWebhooksGetResponseBody managementProjectsWebhooksGetResponseBody = (ManagementProjectsWebhooksGetResponseBody) o;
    return Objects.equals(this.id, managementProjectsWebhooksGetResponseBody.id) &&
        Objects.equals(this._object, managementProjectsWebhooksGetResponseBody._object) &&
        Objects.equals(this.createdAt, managementProjectsWebhooksGetResponseBody.createdAt) &&
        Objects.equals(this.targetUrl, managementProjectsWebhooksGetResponseBody.targetUrl) &&
        Objects.equals(this.events, managementProjectsWebhooksGetResponseBody.events) &&
        Objects.equals(this.active, managementProjectsWebhooksGetResponseBody.active);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, targetUrl, events, active);
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
    sb.append("class ManagementProjectsWebhooksGetResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("created_at");
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
       if (!ManagementProjectsWebhooksGetResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectsWebhooksGetResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectsWebhooksGetResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectsWebhooksGetResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectsWebhooksGetResponseBody>() {
           @Override
           public void write(JsonWriter out, ManagementProjectsWebhooksGetResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectsWebhooksGetResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectsWebhooksGetResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectsWebhooksGetResponseBody
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectsWebhooksGetResponseBody
  */
  public static ManagementProjectsWebhooksGetResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectsWebhooksGetResponseBody.class);
  }

 /**
  * Convert an instance of ManagementProjectsWebhooksGetResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
