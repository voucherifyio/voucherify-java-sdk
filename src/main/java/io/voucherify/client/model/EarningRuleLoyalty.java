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
import io.voucherify.client.model.EarningRuleLoyaltyCustomEvent;
import io.voucherify.client.model.EarningRuleLoyaltyCustomer;
import io.voucherify.client.model.EarningRuleLoyaltyOrder;
import io.voucherify.client.model.EarningRuleLoyaltyOrderItems;
import java.io.IOException;
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
 * EarningRuleLoyalty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EarningRuleLoyalty {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PROPORTIONAL("PROPORTIONAL"),
    
    FIXED("FIXED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Gets or Sets calculationType
   */
  @JsonAdapter(CalculationTypeEnum.Adapter.class)
  public enum CalculationTypeEnum {
    ORDER_AMOUNT("ORDER_AMOUNT"),
    
    ORDER_TOTAL_AMOUNT("ORDER_TOTAL_AMOUNT"),
    
    ORDER_METADATA("ORDER_METADATA"),
    
    ORDER_ITEMS_QUANTITY("ORDER_ITEMS_QUANTITY"),
    
    ORDER_ITEMS_AMOUNT("ORDER_ITEMS_AMOUNT"),
    
    ORDER_ITEMS_SUBTOTAL_AMOUNT("ORDER_ITEMS_SUBTOTAL_AMOUNT"),
    
    CUSTOMER_METADATA("CUSTOMER_METADATA"),
    
    CUSTOM_EVENT_METADATA("CUSTOM_EVENT_METADATA");

    private String value;

    CalculationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CalculationTypeEnum fromValue(String value) {
      for (CalculationTypeEnum b : CalculationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<CalculationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CalculationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CalculationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CalculationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CALCULATION_TYPE = "calculation_type";
  @SerializedName(SERIALIZED_NAME_CALCULATION_TYPE)
  private CalculationTypeEnum calculationType;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private EarningRuleLoyaltyOrder order;

  public static final String SERIALIZED_NAME_ORDER_ITEMS = "order_items";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEMS)
  private EarningRuleLoyaltyOrderItems orderItems;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private EarningRuleLoyaltyCustomer customer;

  public static final String SERIALIZED_NAME_CUSTOM_EVENT = "custom_event";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT)
  private EarningRuleLoyaltyCustomEvent customEvent;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public EarningRuleLoyalty() {
  }

  public EarningRuleLoyalty type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public EarningRuleLoyalty calculationType(CalculationTypeEnum calculationType) {
    
    this.calculationType = calculationType;
    return this;
  }

   /**
   * Get calculationType
   * @return calculationType
  **/
  @javax.annotation.Nullable
  public CalculationTypeEnum getCalculationType() {
    return calculationType;
  }


  public void setCalculationType(CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
  }


  public EarningRuleLoyalty order(EarningRuleLoyaltyOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public EarningRuleLoyaltyOrder getOrder() {
    return order;
  }


  public void setOrder(EarningRuleLoyaltyOrder order) {
    this.order = order;
  }


  public EarningRuleLoyalty orderItems(EarningRuleLoyaltyOrderItems orderItems) {
    
    this.orderItems = orderItems;
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @javax.annotation.Nullable
  public EarningRuleLoyaltyOrderItems getOrderItems() {
    return orderItems;
  }


  public void setOrderItems(EarningRuleLoyaltyOrderItems orderItems) {
    this.orderItems = orderItems;
  }


  public EarningRuleLoyalty customer(EarningRuleLoyaltyCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public EarningRuleLoyaltyCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(EarningRuleLoyaltyCustomer customer) {
    this.customer = customer;
  }


  public EarningRuleLoyalty customEvent(EarningRuleLoyaltyCustomEvent customEvent) {
    
    this.customEvent = customEvent;
    return this;
  }

   /**
   * Get customEvent
   * @return customEvent
  **/
  @javax.annotation.Nullable
  public EarningRuleLoyaltyCustomEvent getCustomEvent() {
    return customEvent;
  }


  public void setCustomEvent(EarningRuleLoyaltyCustomEvent customEvent) {
    this.customEvent = customEvent;
  }


  public EarningRuleLoyalty points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Defines how the points will be added to the loyalty card. FIXED adds a fixed number of points.
   * @return points
  **/
  @javax.annotation.Nullable
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
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
   * @return the EarningRuleLoyalty instance itself
   */
  public EarningRuleLoyalty putAdditionalProperty(String key, Object value) {
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
    EarningRuleLoyalty earningRuleLoyalty = (EarningRuleLoyalty) o;
    return Objects.equals(this.type, earningRuleLoyalty.type) &&
        Objects.equals(this.calculationType, earningRuleLoyalty.calculationType) &&
        Objects.equals(this.order, earningRuleLoyalty.order) &&
        Objects.equals(this.orderItems, earningRuleLoyalty.orderItems) &&
        Objects.equals(this.customer, earningRuleLoyalty.customer) &&
        Objects.equals(this.customEvent, earningRuleLoyalty.customEvent) &&
        Objects.equals(this.points, earningRuleLoyalty.points)&&
        Objects.equals(this.additionalProperties, earningRuleLoyalty.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, calculationType, order, orderItems, customer, customEvent, points, additionalProperties);
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
    sb.append("class EarningRuleLoyalty {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customEvent: ").append(toIndentedString(customEvent)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("calculation_type");
    openapiFields.add("order");
    openapiFields.add("order_items");
    openapiFields.add("customer");
    openapiFields.add("custom_event");
    openapiFields.add("points");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EarningRuleLoyalty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EarningRuleLoyalty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EarningRuleLoyalty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleLoyalty.class));

       return (TypeAdapter<T>) new TypeAdapter<EarningRuleLoyalty>() {
           @Override
           public void write(JsonWriter out, EarningRuleLoyalty value) throws IOException {
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
           public EarningRuleLoyalty read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EarningRuleLoyalty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EarningRuleLoyalty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EarningRuleLoyalty
  * @throws IOException if the JSON string is invalid with respect to EarningRuleLoyalty
  */
  public static EarningRuleLoyalty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EarningRuleLoyalty.class);
  }

 /**
  * Convert an instance of EarningRuleLoyalty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
