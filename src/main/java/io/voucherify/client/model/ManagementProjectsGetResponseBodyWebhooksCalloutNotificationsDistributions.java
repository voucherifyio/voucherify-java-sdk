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
 * Determines the notification settings for webhooks sent through Distributions.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Boolean email;

  public static final String SERIALIZED_NAME_IN_APP = "in_app";
  @SerializedName(SERIALIZED_NAME_IN_APP)
  private Boolean inApp;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails;

  public ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions() {
  }

  public ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions email(Boolean email) {
    
    this.email = email;
    return this;
  }

   /**
   * Enables the notification through an email.
   * @return email
  **/
  @javax.annotation.Nullable
  public Boolean getEmail() {
    return email;
  }


  public void setEmail(Boolean email) {
    this.email = email;
  }


  public ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions inApp(Boolean inApp) {
    
    this.inApp = inApp;
    return this;
  }

   /**
   * Enables the notification through an email.
   * @return inApp
  **/
  @javax.annotation.Nullable
  public Boolean getInApp() {
    return inApp;
  }


  public void setInApp(Boolean inApp) {
    this.inApp = inApp;
  }


  public ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * An array of email addresses which will receive the notification.
   * @return emails
  **/
  @javax.annotation.Nullable
  public List<String> getEmails() {
    return emails;
  }


  public void setEmails(List<String> emails) {
    this.emails = emails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions managementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions = (ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions) o;
    return Objects.equals(this.email, managementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions.email) &&
        Objects.equals(this.inApp, managementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions.inApp) &&
        Objects.equals(this.emails, managementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions.emails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, inApp, emails);
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
    sb.append("class ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    inApp: ").append(toIndentedString(inApp)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("in_app");
    openapiFields.add("emails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions>() {
           @Override
           public void write(JsonWriter out, ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions
  */
  public static ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions.class);
  }

 /**
  * Convert an instance of ManagementProjectsGetResponseBodyWebhooksCalloutNotificationsDistributions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

