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
import io.voucherify.client.model.ApplicableToResultList;
import io.voucherify.client.model.Category;
import io.voucherify.client.model.InapplicableToResultList;
import io.voucherify.client.model.OrderCalculated;
import io.voucherify.client.model.ValidationsValidateResponseBodyRedeemablesItemResult;
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
 * ValidationsValidateResponseBodyRedeemablesItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValidationsValidateResponseBodyRedeemablesItem {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPLICABLE("APPLICABLE"),
    
    INAPPLICABLE("INAPPLICABLE"),
    
    SKIPPED("SKIPPED");

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Redeemable&#39;s object type.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    VOUCHER("voucher"),
    
    PROMOTION_TIER("promotion_tier");

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
  private ObjectEnum _object;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_APPLICABLE_TO = "applicable_to";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_TO)
  private ApplicableToResultList applicableTo;

  public static final String SERIALIZED_NAME_INAPPLICABLE_TO = "inapplicable_to";
  @SerializedName(SERIALIZED_NAME_INAPPLICABLE_TO)
  private InapplicableToResultList inapplicableTo;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ValidationsValidateResponseBodyRedeemablesItemResult result;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories;

  public ValidationsValidateResponseBodyRedeemablesItem() {
  }

  public ValidationsValidateResponseBodyRedeemablesItem status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ValidationsValidateResponseBodyRedeemablesItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Redeemable ID, i.e. the voucher code.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ValidationsValidateResponseBodyRedeemablesItem _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Redeemable&#39;s object type.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public ValidationsValidateResponseBodyRedeemablesItem order(OrderCalculated order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderCalculated getOrder() {
    return order;
  }


  public void setOrder(OrderCalculated order) {
    this.order = order;
  }


  public ValidationsValidateResponseBodyRedeemablesItem applicableTo(ApplicableToResultList applicableTo) {
    
    this.applicableTo = applicableTo;
    return this;
  }

   /**
   * Get applicableTo
   * @return applicableTo
  **/
  @javax.annotation.Nullable
  public ApplicableToResultList getApplicableTo() {
    return applicableTo;
  }


  public void setApplicableTo(ApplicableToResultList applicableTo) {
    this.applicableTo = applicableTo;
  }


  public ValidationsValidateResponseBodyRedeemablesItem inapplicableTo(InapplicableToResultList inapplicableTo) {
    
    this.inapplicableTo = inapplicableTo;
    return this;
  }

   /**
   * Get inapplicableTo
   * @return inapplicableTo
  **/
  @javax.annotation.Nullable
  public InapplicableToResultList getInapplicableTo() {
    return inapplicableTo;
  }


  public void setInapplicableTo(InapplicableToResultList inapplicableTo) {
    this.inapplicableTo = inapplicableTo;
  }


  public ValidationsValidateResponseBodyRedeemablesItem result(ValidationsValidateResponseBodyRedeemablesItemResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public ValidationsValidateResponseBodyRedeemablesItemResult getResult() {
    return result;
  }


  public void setResult(ValidationsValidateResponseBodyRedeemablesItemResult result) {
    this.result = result;
  }


  public ValidationsValidateResponseBodyRedeemablesItem metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public ValidationsValidateResponseBodyRedeemablesItem categories(List<Category> categories) {
    
    this.categories = categories;
    return this;
  }

  public ValidationsValidateResponseBodyRedeemablesItem addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    this.categories = categories;
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
   * @return the ValidationsValidateResponseBodyRedeemablesItem instance itself
   */
  public ValidationsValidateResponseBodyRedeemablesItem putAdditionalProperty(String key, Object value) {
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
    ValidationsValidateResponseBodyRedeemablesItem validationsValidateResponseBodyRedeemablesItem = (ValidationsValidateResponseBodyRedeemablesItem) o;
    return Objects.equals(this.status, validationsValidateResponseBodyRedeemablesItem.status) &&
        Objects.equals(this.id, validationsValidateResponseBodyRedeemablesItem.id) &&
        Objects.equals(this._object, validationsValidateResponseBodyRedeemablesItem._object) &&
        Objects.equals(this.order, validationsValidateResponseBodyRedeemablesItem.order) &&
        Objects.equals(this.applicableTo, validationsValidateResponseBodyRedeemablesItem.applicableTo) &&
        Objects.equals(this.inapplicableTo, validationsValidateResponseBodyRedeemablesItem.inapplicableTo) &&
        Objects.equals(this.result, validationsValidateResponseBodyRedeemablesItem.result) &&
        Objects.equals(this.metadata, validationsValidateResponseBodyRedeemablesItem.metadata) &&
        Objects.equals(this.categories, validationsValidateResponseBodyRedeemablesItem.categories)&&
        Objects.equals(this.additionalProperties, validationsValidateResponseBodyRedeemablesItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, id, _object, order, applicableTo, inapplicableTo, result, metadata, categories, additionalProperties);
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
    sb.append("class ValidationsValidateResponseBodyRedeemablesItem {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    applicableTo: ").append(toIndentedString(applicableTo)).append("\n");
    sb.append("    inapplicableTo: ").append(toIndentedString(inapplicableTo)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("order");
    openapiFields.add("applicable_to");
    openapiFields.add("inapplicable_to");
    openapiFields.add("result");
    openapiFields.add("metadata");
    openapiFields.add("categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidationsValidateResponseBodyRedeemablesItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidationsValidateResponseBodyRedeemablesItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidationsValidateResponseBodyRedeemablesItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidationsValidateResponseBodyRedeemablesItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidationsValidateResponseBodyRedeemablesItem>() {
           @Override
           public void write(JsonWriter out, ValidationsValidateResponseBodyRedeemablesItem value) throws IOException {
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
           public ValidationsValidateResponseBodyRedeemablesItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ValidationsValidateResponseBodyRedeemablesItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ValidationsValidateResponseBodyRedeemablesItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationsValidateResponseBodyRedeemablesItem
  * @throws IOException if the JSON string is invalid with respect to ValidationsValidateResponseBodyRedeemablesItem
  */
  public static ValidationsValidateResponseBodyRedeemablesItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationsValidateResponseBodyRedeemablesItem.class);
  }

 /**
  * Convert an instance of ValidationsValidateResponseBodyRedeemablesItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
