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
import io.voucherify.client.model.Customer;
import io.voucherify.client.model.Order;
import io.voucherify.client.model.RedemptionsRedeemRequestBodyOptions;
import io.voucherify.client.model.RedemptionsRedeemRequestBodyRedeemablesItem;
import io.voucherify.client.model.Session;
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
 * Response body schema for **POST** &#x60;v1/redemptions&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsRedeemRequestBody {
  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private RedemptionsRedeemRequestBodyOptions options;

  public static final String SERIALIZED_NAME_REDEEMABLES = "redeemables";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES)
  private List<RedemptionsRedeemRequestBodyRedeemablesItem> redeemables;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public RedemptionsRedeemRequestBody() {
  }

  public RedemptionsRedeemRequestBody options(RedemptionsRedeemRequestBodyOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public RedemptionsRedeemRequestBodyOptions getOptions() {
    return options;
  }


  public void setOptions(RedemptionsRedeemRequestBodyOptions options) {
    this.options = options;
  }


  public RedemptionsRedeemRequestBody redeemables(List<RedemptionsRedeemRequestBodyRedeemablesItem> redeemables) {
    
    this.redeemables = redeemables;
    return this;
  }

  public RedemptionsRedeemRequestBody addRedeemablesItem(RedemptionsRedeemRequestBodyRedeemablesItem redeemablesItem) {
    if (this.redeemables == null) {
      this.redeemables = new ArrayList<>();
    }
    this.redeemables.add(redeemablesItem);
    return this;
  }

   /**
   * Get redeemables
   * @return redeemables
  **/
  @javax.annotation.Nullable
  public List<RedemptionsRedeemRequestBodyRedeemablesItem> getRedeemables() {
    return redeemables;
  }


  public void setRedeemables(List<RedemptionsRedeemRequestBodyRedeemablesItem> redeemables) {
    this.redeemables = redeemables;
  }


  public RedemptionsRedeemRequestBody order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public RedemptionsRedeemRequestBody customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public RedemptionsRedeemRequestBody session(Session session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  public Session getSession() {
    return session;
  }


  public void setSession(Session session) {
    this.session = session;
  }


  public RedemptionsRedeemRequestBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Is correspondent to Customer&#39;s source_id
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public RedemptionsRedeemRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of key/value pairs that you can attach to a redemption object. It can be useful for storing additional information about the redemption in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionsRedeemRequestBody redemptionsRedeemRequestBody = (RedemptionsRedeemRequestBody) o;
    return Objects.equals(this.options, redemptionsRedeemRequestBody.options) &&
        Objects.equals(this.redeemables, redemptionsRedeemRequestBody.redeemables) &&
        Objects.equals(this.order, redemptionsRedeemRequestBody.order) &&
        Objects.equals(this.customer, redemptionsRedeemRequestBody.customer) &&
        Objects.equals(this.session, redemptionsRedeemRequestBody.session) &&
        Objects.equals(this.trackingId, redemptionsRedeemRequestBody.trackingId) &&
        Objects.equals(this.metadata, redemptionsRedeemRequestBody.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, redeemables, order, customer, session, trackingId, metadata);
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
    sb.append("class RedemptionsRedeemRequestBody {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    redeemables: ").append(toIndentedString(redeemables)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("options");
    openapiFields.add("redeemables");
    openapiFields.add("order");
    openapiFields.add("customer");
    openapiFields.add("session");
    openapiFields.add("tracking_id");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsRedeemRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsRedeemRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsRedeemRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsRedeemRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsRedeemRequestBody>() {
           @Override
           public void write(JsonWriter out, RedemptionsRedeemRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedemptionsRedeemRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedemptionsRedeemRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsRedeemRequestBody
  * @throws IOException if the JSON string is invalid with respect to RedemptionsRedeemRequestBody
  */
  public static RedemptionsRedeemRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsRedeemRequestBody.class);
  }

 /**
  * Convert an instance of RedemptionsRedeemRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

