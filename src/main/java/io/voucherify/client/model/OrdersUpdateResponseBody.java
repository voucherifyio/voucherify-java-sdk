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
import io.voucherify.client.model.CustomerId;
import io.voucherify.client.model.OrderCalculatedItem;
import io.voucherify.client.model.OrderRedemptionsEntry;
import io.voucherify.client.model.ReferrerId;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Response body schema for **PUT** &#x60;v1/orders/{orderId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrdersUpdateResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  /**
   * The order status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    
    PAID("PAID"),
    
    CANCELED("CANCELED"),
    
    FULFILLED("FULFILLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_INITIAL_AMOUNT = "initial_amount";
  @SerializedName(SERIALIZED_NAME_INITIAL_AMOUNT)
  private Integer initialAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Integer discountAmount;

  public static final String SERIALIZED_NAME_ITEMS_DISCOUNT_AMOUNT = "items_discount_amount";
  @SerializedName(SERIALIZED_NAME_ITEMS_DISCOUNT_AMOUNT)
  private Integer itemsDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT = "total_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT)
  private Integer totalDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Integer totalAmount;

  public static final String SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT = "applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT)
  private Integer appliedDiscountAmount;

  public static final String SERIALIZED_NAME_ITEMS_APPLIED_DISCOUNT_AMOUNT = "items_applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_ITEMS_APPLIED_DISCOUNT_AMOUNT)
  private Integer itemsAppliedDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_APPLIED_DISCOUNT_AMOUNT = "total_applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_APPLIED_DISCOUNT_AMOUNT)
  private Integer totalAppliedDiscountAmount;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  /**
   * The type of the object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    ORDER("order");

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
  private ObjectEnum _object = ObjectEnum.ORDER;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_REFERRER_ID = "referrer_id";
  @SerializedName(SERIALIZED_NAME_REFERRER_ID)
  private String referrerId;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerId customer;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private ReferrerId referrer;

  public static final String SERIALIZED_NAME_REDEMPTIONS = "redemptions";
  @SerializedName(SERIALIZED_NAME_REDEMPTIONS)
  private Map<String, OrderRedemptionsEntry> redemptions;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderCalculatedItem> items;

  public OrdersUpdateResponseBody() {
  }

  public OrdersUpdateResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID assigned by Voucherify of an existing order that will be linked to the redemption of this request.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OrdersUpdateResponseBody sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Unique source ID of an existing order that will be linked to the redemption of this request.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public OrdersUpdateResponseBody status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The order status.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public OrdersUpdateResponseBody amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * This is the sum of the order items&#39; amounts. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public OrdersUpdateResponseBody initialAmount(Integer initialAmount) {
    
    this.initialAmount = initialAmount;
    return this;
  }

   /**
   * This is the sum of the order items&#39; amounts before any discount or other effect (e.g. add missing units) is applied. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).
   * @return initialAmount
  **/
  @javax.annotation.Nullable
  public Integer getInitialAmount() {
    return initialAmount;
  }


  public void setInitialAmount(Integer initialAmount) {
    this.initialAmount = initialAmount;
  }


  public OrdersUpdateResponseBody discountAmount(Integer discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Sum of all order-level discounts applied to the order. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  public Integer getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Integer discountAmount) {
    this.discountAmount = discountAmount;
  }


  public OrdersUpdateResponseBody itemsDiscountAmount(Integer itemsDiscountAmount) {
    
    this.itemsDiscountAmount = itemsDiscountAmount;
    return this;
  }

   /**
   * Sum of all product-specific discounts applied to the order. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).
   * @return itemsDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getItemsDiscountAmount() {
    return itemsDiscountAmount;
  }


  public void setItemsDiscountAmount(Integer itemsDiscountAmount) {
    this.itemsDiscountAmount = itemsDiscountAmount;
  }


  public OrdersUpdateResponseBody totalDiscountAmount(Integer totalDiscountAmount) {
    
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * Sum of all order-level AND all product-specific discounts applied to the order. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).
   * @return totalDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalDiscountAmount() {
    return totalDiscountAmount;
  }


  public void setTotalDiscountAmount(Integer totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }


  public OrdersUpdateResponseBody totalAmount(Integer totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Order amount after undoing all the discounts through the rollback redemption. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }


  public OrdersUpdateResponseBody appliedDiscountAmount(Integer appliedDiscountAmount) {
    
    this.appliedDiscountAmount = appliedDiscountAmount;
    return this;
  }

   /**
   * This field shows the order-level discount applied. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).
   * @return appliedDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getAppliedDiscountAmount() {
    return appliedDiscountAmount;
  }


  public void setAppliedDiscountAmount(Integer appliedDiscountAmount) {
    this.appliedDiscountAmount = appliedDiscountAmount;
  }


  public OrdersUpdateResponseBody itemsAppliedDiscountAmount(Integer itemsAppliedDiscountAmount) {
    
    this.itemsAppliedDiscountAmount = itemsAppliedDiscountAmount;
    return this;
  }

   /**
   * Sum of all product-specific discounts applied in a particular request. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).   &#x60;sum(items, i &#x3D;&gt; i.applied_discount_amount)&#x60;
   * @return itemsAppliedDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getItemsAppliedDiscountAmount() {
    return itemsAppliedDiscountAmount;
  }


  public void setItemsAppliedDiscountAmount(Integer itemsAppliedDiscountAmount) {
    this.itemsAppliedDiscountAmount = itemsAppliedDiscountAmount;
  }


  public OrdersUpdateResponseBody totalAppliedDiscountAmount(Integer totalAppliedDiscountAmount) {
    
    this.totalAppliedDiscountAmount = totalAppliedDiscountAmount;
    return this;
  }

   /**
   * Sum of all order-level AND all product-specific discounts applied in a particular request. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).   &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60;
   * @return totalAppliedDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalAppliedDiscountAmount() {
    return totalAppliedDiscountAmount;
  }


  public void setTotalAppliedDiscountAmount(Integer totalAppliedDiscountAmount) {
    this.totalAppliedDiscountAmount = totalAppliedDiscountAmount;
  }


  public OrdersUpdateResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of custom key/value pairs that you can attach to an order. It can be useful for storing additional information about the order in a structured format. It can be used to define business validation rules or discount formulas.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public OrdersUpdateResponseBody _object(ObjectEnum _object) {
    
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


  public OrdersUpdateResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the order was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public OrdersUpdateResponseBody updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the order was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public OrdersUpdateResponseBody customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer identifier of the customer making the purchase. The ID is assigned by Voucherify.
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public OrdersUpdateResponseBody referrerId(String referrerId) {
    
    this.referrerId = referrerId;
    return this;
  }

   /**
   * Unique referrer ID.
   * @return referrerId
  **/
  @javax.annotation.Nullable
  public String getReferrerId() {
    return referrerId;
  }


  public void setReferrerId(String referrerId) {
    this.referrerId = referrerId;
  }


  public OrdersUpdateResponseBody customer(CustomerId customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public CustomerId getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerId customer) {
    this.customer = customer;
  }


  public OrdersUpdateResponseBody referrer(ReferrerId referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @javax.annotation.Nullable
  public ReferrerId getReferrer() {
    return referrer;
  }


  public void setReferrer(ReferrerId referrer) {
    this.referrer = referrer;
  }


  public OrdersUpdateResponseBody redemptions(Map<String, OrderRedemptionsEntry> redemptions) {
    
    this.redemptions = redemptions;
    return this;
  }

  public OrdersUpdateResponseBody putRedemptionsItem(String key, OrderRedemptionsEntry redemptionsItem) {
    if (this.redemptions == null) {
      this.redemptions = new HashMap<>();
    }
    this.redemptions.put(key, redemptionsItem);
    return this;
  }

   /**
   * Get redemptions
   * @return redemptions
  **/
  @javax.annotation.Nullable
  public Map<String, OrderRedemptionsEntry> getRedemptions() {
    return redemptions;
  }


  public void setRedemptions(Map<String, OrderRedemptionsEntry> redemptions) {
    this.redemptions = redemptions;
  }


  public OrdersUpdateResponseBody items(List<OrderCalculatedItem> items) {
    
    this.items = items;
    return this;
  }

  public OrdersUpdateResponseBody addItemsItem(OrderCalculatedItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of items applied to the order. It can include up to 500 items.
   * @return items
  **/
  @javax.annotation.Nullable
  public List<OrderCalculatedItem> getItems() {
    return items;
  }


  public void setItems(List<OrderCalculatedItem> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersUpdateResponseBody ordersUpdateResponseBody = (OrdersUpdateResponseBody) o;
    return Objects.equals(this.id, ordersUpdateResponseBody.id) &&
        Objects.equals(this.sourceId, ordersUpdateResponseBody.sourceId) &&
        Objects.equals(this.status, ordersUpdateResponseBody.status) &&
        Objects.equals(this.amount, ordersUpdateResponseBody.amount) &&
        Objects.equals(this.initialAmount, ordersUpdateResponseBody.initialAmount) &&
        Objects.equals(this.discountAmount, ordersUpdateResponseBody.discountAmount) &&
        Objects.equals(this.itemsDiscountAmount, ordersUpdateResponseBody.itemsDiscountAmount) &&
        Objects.equals(this.totalDiscountAmount, ordersUpdateResponseBody.totalDiscountAmount) &&
        Objects.equals(this.totalAmount, ordersUpdateResponseBody.totalAmount) &&
        Objects.equals(this.appliedDiscountAmount, ordersUpdateResponseBody.appliedDiscountAmount) &&
        Objects.equals(this.itemsAppliedDiscountAmount, ordersUpdateResponseBody.itemsAppliedDiscountAmount) &&
        Objects.equals(this.totalAppliedDiscountAmount, ordersUpdateResponseBody.totalAppliedDiscountAmount) &&
        Objects.equals(this.metadata, ordersUpdateResponseBody.metadata) &&
        Objects.equals(this._object, ordersUpdateResponseBody._object) &&
        Objects.equals(this.createdAt, ordersUpdateResponseBody.createdAt) &&
        Objects.equals(this.updatedAt, ordersUpdateResponseBody.updatedAt) &&
        Objects.equals(this.customerId, ordersUpdateResponseBody.customerId) &&
        Objects.equals(this.referrerId, ordersUpdateResponseBody.referrerId) &&
        Objects.equals(this.customer, ordersUpdateResponseBody.customer) &&
        Objects.equals(this.referrer, ordersUpdateResponseBody.referrer) &&
        Objects.equals(this.redemptions, ordersUpdateResponseBody.redemptions) &&
        Objects.equals(this.items, ordersUpdateResponseBody.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceId, status, amount, initialAmount, discountAmount, itemsDiscountAmount, totalDiscountAmount, totalAmount, appliedDiscountAmount, itemsAppliedDiscountAmount, totalAppliedDiscountAmount, metadata, _object, createdAt, updatedAt, customerId, referrerId, customer, referrer, redemptions, items);
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
    sb.append("class OrdersUpdateResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    itemsDiscountAmount: ").append(toIndentedString(itemsDiscountAmount)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    appliedDiscountAmount: ").append(toIndentedString(appliedDiscountAmount)).append("\n");
    sb.append("    itemsAppliedDiscountAmount: ").append(toIndentedString(itemsAppliedDiscountAmount)).append("\n");
    sb.append("    totalAppliedDiscountAmount: ").append(toIndentedString(totalAppliedDiscountAmount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    referrerId: ").append(toIndentedString(referrerId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("source_id");
    openapiFields.add("status");
    openapiFields.add("amount");
    openapiFields.add("initial_amount");
    openapiFields.add("discount_amount");
    openapiFields.add("items_discount_amount");
    openapiFields.add("total_discount_amount");
    openapiFields.add("total_amount");
    openapiFields.add("applied_discount_amount");
    openapiFields.add("items_applied_discount_amount");
    openapiFields.add("total_applied_discount_amount");
    openapiFields.add("metadata");
    openapiFields.add("object");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("customer_id");
    openapiFields.add("referrer_id");
    openapiFields.add("customer");
    openapiFields.add("referrer");
    openapiFields.add("redemptions");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrdersUpdateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrdersUpdateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrdersUpdateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrdersUpdateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<OrdersUpdateResponseBody>() {
           @Override
           public void write(JsonWriter out, OrdersUpdateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrdersUpdateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrdersUpdateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrdersUpdateResponseBody
  * @throws IOException if the JSON string is invalid with respect to OrdersUpdateResponseBody
  */
  public static OrdersUpdateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrdersUpdateResponseBody.class);
  }

 /**
  * Convert an instance of OrdersUpdateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

