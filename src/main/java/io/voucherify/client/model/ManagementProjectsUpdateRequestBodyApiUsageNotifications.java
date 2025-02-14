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
import io.voucherify.client.model.UsageNotifications;
import java.io.IOException;
import java.util.Arrays;

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
 * Determines the notification settings.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectsUpdateRequestBodyApiUsageNotifications {
  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private UsageNotifications messages;

  public static final String SERIALIZED_NAME_API_CALLS = "api_calls";
  @SerializedName(SERIALIZED_NAME_API_CALLS)
  private UsageNotifications apiCalls;

  public static final String SERIALIZED_NAME_BULK_API_CALLS = "bulk_api_calls";
  @SerializedName(SERIALIZED_NAME_BULK_API_CALLS)
  private UsageNotifications bulkApiCalls;

  public static final String SERIALIZED_NAME_WEBHOOK_CALLS = "webhook_calls";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CALLS)
  private UsageNotifications webhookCalls;

  public static final String SERIALIZED_NAME_CYCLE_CALLS = "cycle_calls";
  @SerializedName(SERIALIZED_NAME_CYCLE_CALLS)
  private UsageNotifications cycleCalls;

  public ManagementProjectsUpdateRequestBodyApiUsageNotifications() {
  }

  public ManagementProjectsUpdateRequestBodyApiUsageNotifications messages(UsageNotifications messages) {
    
    this.messages = messages;
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  public UsageNotifications getMessages() {
    return messages;
  }


  public void setMessages(UsageNotifications messages) {
    this.messages = messages;
  }


  public ManagementProjectsUpdateRequestBodyApiUsageNotifications apiCalls(UsageNotifications apiCalls) {
    
    this.apiCalls = apiCalls;
    return this;
  }

   /**
   * Get apiCalls
   * @return apiCalls
  **/
  @javax.annotation.Nullable
  public UsageNotifications getApiCalls() {
    return apiCalls;
  }


  public void setApiCalls(UsageNotifications apiCalls) {
    this.apiCalls = apiCalls;
  }


  public ManagementProjectsUpdateRequestBodyApiUsageNotifications bulkApiCalls(UsageNotifications bulkApiCalls) {
    
    this.bulkApiCalls = bulkApiCalls;
    return this;
  }

   /**
   * Get bulkApiCalls
   * @return bulkApiCalls
  **/
  @javax.annotation.Nullable
  public UsageNotifications getBulkApiCalls() {
    return bulkApiCalls;
  }


  public void setBulkApiCalls(UsageNotifications bulkApiCalls) {
    this.bulkApiCalls = bulkApiCalls;
  }


  public ManagementProjectsUpdateRequestBodyApiUsageNotifications webhookCalls(UsageNotifications webhookCalls) {
    
    this.webhookCalls = webhookCalls;
    return this;
  }

   /**
   * Get webhookCalls
   * @return webhookCalls
  **/
  @javax.annotation.Nullable
  public UsageNotifications getWebhookCalls() {
    return webhookCalls;
  }


  public void setWebhookCalls(UsageNotifications webhookCalls) {
    this.webhookCalls = webhookCalls;
  }


  public ManagementProjectsUpdateRequestBodyApiUsageNotifications cycleCalls(UsageNotifications cycleCalls) {
    
    this.cycleCalls = cycleCalls;
    return this;
  }

   /**
   * Get cycleCalls
   * @return cycleCalls
  **/
  @javax.annotation.Nullable
  public UsageNotifications getCycleCalls() {
    return cycleCalls;
  }


  public void setCycleCalls(UsageNotifications cycleCalls) {
    this.cycleCalls = cycleCalls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementProjectsUpdateRequestBodyApiUsageNotifications managementProjectsUpdateRequestBodyApiUsageNotifications = (ManagementProjectsUpdateRequestBodyApiUsageNotifications) o;
    return Objects.equals(this.messages, managementProjectsUpdateRequestBodyApiUsageNotifications.messages) &&
        Objects.equals(this.apiCalls, managementProjectsUpdateRequestBodyApiUsageNotifications.apiCalls) &&
        Objects.equals(this.bulkApiCalls, managementProjectsUpdateRequestBodyApiUsageNotifications.bulkApiCalls) &&
        Objects.equals(this.webhookCalls, managementProjectsUpdateRequestBodyApiUsageNotifications.webhookCalls) &&
        Objects.equals(this.cycleCalls, managementProjectsUpdateRequestBodyApiUsageNotifications.cycleCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, apiCalls, bulkApiCalls, webhookCalls, cycleCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementProjectsUpdateRequestBodyApiUsageNotifications {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    apiCalls: ").append(toIndentedString(apiCalls)).append("\n");
    sb.append("    bulkApiCalls: ").append(toIndentedString(bulkApiCalls)).append("\n");
    sb.append("    webhookCalls: ").append(toIndentedString(webhookCalls)).append("\n");
    sb.append("    cycleCalls: ").append(toIndentedString(cycleCalls)).append("\n");
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
    openapiFields.add("messages");
    openapiFields.add("api_calls");
    openapiFields.add("bulk_api_calls");
    openapiFields.add("webhook_calls");
    openapiFields.add("cycle_calls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectsUpdateRequestBodyApiUsageNotifications.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectsUpdateRequestBodyApiUsageNotifications' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectsUpdateRequestBodyApiUsageNotifications> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectsUpdateRequestBodyApiUsageNotifications.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectsUpdateRequestBodyApiUsageNotifications>() {
           @Override
           public void write(JsonWriter out, ManagementProjectsUpdateRequestBodyApiUsageNotifications value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectsUpdateRequestBodyApiUsageNotifications read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectsUpdateRequestBodyApiUsageNotifications given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectsUpdateRequestBodyApiUsageNotifications
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectsUpdateRequestBodyApiUsageNotifications
  */
  public static ManagementProjectsUpdateRequestBodyApiUsageNotifications fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectsUpdateRequestBodyApiUsageNotifications.class);
  }

 /**
  * Convert an instance of ManagementProjectsUpdateRequestBodyApiUsageNotifications to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

