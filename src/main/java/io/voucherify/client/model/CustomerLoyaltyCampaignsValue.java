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
 * Contains details about the point balances left on loyalty cards and the number of referred customers in each campaign.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomerLoyaltyCampaignsValue {
  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_LOYALTY_TIER = "loyalty_tier";
  @SerializedName(SERIALIZED_NAME_LOYALTY_TIER)
  private String loyaltyTier;

  public static final String SERIALIZED_NAME_REFERRED_CUSTOMERS = "referred_customers";
  @SerializedName(SERIALIZED_NAME_REFERRED_CUSTOMERS)
  private Integer referredCustomers;

  public CustomerLoyaltyCampaignsValue() {
  }

  public CustomerLoyaltyCampaignsValue points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Remaining point balance in campaign.
   * @return points
  **/
  @javax.annotation.Nullable
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public CustomerLoyaltyCampaignsValue loyaltyTier(String loyaltyTier) {
    
    this.loyaltyTier = loyaltyTier;
    return this;
  }

   /**
   * Customer&#39;s loyalty tier within the campaign.
   * @return loyaltyTier
  **/
  @javax.annotation.Nullable
  public String getLoyaltyTier() {
    return loyaltyTier;
  }


  public void setLoyaltyTier(String loyaltyTier) {
    this.loyaltyTier = loyaltyTier;
  }


  public CustomerLoyaltyCampaignsValue referredCustomers(Integer referredCustomers) {
    
    this.referredCustomers = referredCustomers;
    return this;
  }

   /**
   * Number of customers referred by the customer in campaign.
   * @return referredCustomers
  **/
  @javax.annotation.Nullable
  public Integer getReferredCustomers() {
    return referredCustomers;
  }


  public void setReferredCustomers(Integer referredCustomers) {
    this.referredCustomers = referredCustomers;
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
   * @return the CustomerLoyaltyCampaignsValue instance itself
   */
  public CustomerLoyaltyCampaignsValue putAdditionalProperty(String key, Object value) {
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
    CustomerLoyaltyCampaignsValue customerLoyaltyCampaignsValue = (CustomerLoyaltyCampaignsValue) o;
    return Objects.equals(this.points, customerLoyaltyCampaignsValue.points) &&
        Objects.equals(this.loyaltyTier, customerLoyaltyCampaignsValue.loyaltyTier) &&
        Objects.equals(this.referredCustomers, customerLoyaltyCampaignsValue.referredCustomers)&&
        Objects.equals(this.additionalProperties, customerLoyaltyCampaignsValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, loyaltyTier, referredCustomers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLoyaltyCampaignsValue {\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    loyaltyTier: ").append(toIndentedString(loyaltyTier)).append("\n");
    sb.append("    referredCustomers: ").append(toIndentedString(referredCustomers)).append("\n");
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
    openapiFields.add("points");
    openapiFields.add("loyalty_tier");
    openapiFields.add("referred_customers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerLoyaltyCampaignsValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerLoyaltyCampaignsValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerLoyaltyCampaignsValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerLoyaltyCampaignsValue.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerLoyaltyCampaignsValue>() {
           @Override
           public void write(JsonWriter out, CustomerLoyaltyCampaignsValue value) throws IOException {
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
           public CustomerLoyaltyCampaignsValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CustomerLoyaltyCampaignsValue instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomerLoyaltyCampaignsValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerLoyaltyCampaignsValue
  * @throws IOException if the JSON string is invalid with respect to CustomerLoyaltyCampaignsValue
  */
  public static CustomerLoyaltyCampaignsValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerLoyaltyCampaignsValue.class);
  }

 /**
  * Convert an instance of CustomerLoyaltyCampaignsValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
