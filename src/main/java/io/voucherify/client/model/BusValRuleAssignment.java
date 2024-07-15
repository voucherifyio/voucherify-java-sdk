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
 * Assignments of business validation rule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BusValRuleAssignment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private String relatedObjectId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "related_object_type";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  private String relatedObjectType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * The type of the object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    VALIDATION_RULES_ASSIGNMENT("validation_rules_assignment");

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
  private ObjectEnum _object = ObjectEnum.VALIDATION_RULES_ASSIGNMENT;

  /**
   * The validation status of the assignment
   */
  @JsonAdapter(ValidationStatusEnum.Adapter.class)
  public enum ValidationStatusEnum {
    VALID("VALID"),
    
    PARTIALLY_VALID("PARTIALLY_VALID"),
    
    INVALID("INVALID");

    private String value;

    ValidationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidationStatusEnum fromValue(String value) {
      for (ValidationStatusEnum b : ValidationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ValidationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValidationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validation_status";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private ValidationStatusEnum validationStatus;

  public static final String SERIALIZED_NAME_VALIDATION_OMITTED_RULES = "validation_omitted_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_OMITTED_RULES)
  private List<String> validationOmittedRules;

  public BusValRuleAssignment() {
  }

  public BusValRuleAssignment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a assignment
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BusValRuleAssignment ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * The unique identifier for a rule
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public BusValRuleAssignment relatedObjectId(String relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * The unique identifier for a related object
   * @return relatedObjectId
  **/
  @javax.annotation.Nullable
  public String getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public BusValRuleAssignment relatedObjectType(String relatedObjectType) {
    
    this.relatedObjectType = relatedObjectType;
    return this;
  }

   /**
   * The type of related object
   * @return relatedObjectType
  **/
  @javax.annotation.Nullable
  public String getRelatedObjectType() {
    return relatedObjectType;
  }


  public void setRelatedObjectType(String relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public BusValRuleAssignment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public BusValRuleAssignment updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the object was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public BusValRuleAssignment _object(ObjectEnum _object) {
    
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


  public BusValRuleAssignment validationStatus(ValidationStatusEnum validationStatus) {
    
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * The validation status of the assignment
   * @return validationStatus
  **/
  @javax.annotation.Nullable
  public ValidationStatusEnum getValidationStatus() {
    return validationStatus;
  }


  public void setValidationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
  }


  public BusValRuleAssignment validationOmittedRules(List<String> validationOmittedRules) {
    
    this.validationOmittedRules = validationOmittedRules;
    return this;
  }

  public BusValRuleAssignment addValidationOmittedRulesItem(String validationOmittedRulesItem) {
    if (this.validationOmittedRules == null) {
      this.validationOmittedRules = new ArrayList<>();
    }
    this.validationOmittedRules.add(validationOmittedRulesItem);
    return this;
  }

   /**
   * The list of omitted rules
   * @return validationOmittedRules
  **/
  @javax.annotation.Nullable
  public List<String> getValidationOmittedRules() {
    return validationOmittedRules;
  }


  public void setValidationOmittedRules(List<String> validationOmittedRules) {
    this.validationOmittedRules = validationOmittedRules;
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
   * @return the BusValRuleAssignment instance itself
   */
  public BusValRuleAssignment putAdditionalProperty(String key, Object value) {
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
    BusValRuleAssignment busValRuleAssignment = (BusValRuleAssignment) o;
    return Objects.equals(this.id, busValRuleAssignment.id) &&
        Objects.equals(this.ruleId, busValRuleAssignment.ruleId) &&
        Objects.equals(this.relatedObjectId, busValRuleAssignment.relatedObjectId) &&
        Objects.equals(this.relatedObjectType, busValRuleAssignment.relatedObjectType) &&
        Objects.equals(this.createdAt, busValRuleAssignment.createdAt) &&
        Objects.equals(this.updatedAt, busValRuleAssignment.updatedAt) &&
        Objects.equals(this._object, busValRuleAssignment._object) &&
        Objects.equals(this.validationStatus, busValRuleAssignment.validationStatus) &&
        Objects.equals(this.validationOmittedRules, busValRuleAssignment.validationOmittedRules)&&
        Objects.equals(this.additionalProperties, busValRuleAssignment.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleId, relatedObjectId, relatedObjectType, createdAt, updatedAt, _object, validationStatus, validationOmittedRules, additionalProperties);
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
    sb.append("class BusValRuleAssignment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    validationOmittedRules: ").append(toIndentedString(validationOmittedRules)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("rule_id");
    openapiFields.add("related_object_id");
    openapiFields.add("related_object_type");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("object");
    openapiFields.add("validation_status");
    openapiFields.add("validation_omitted_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusValRuleAssignment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusValRuleAssignment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusValRuleAssignment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusValRuleAssignment.class));

       return (TypeAdapter<T>) new TypeAdapter<BusValRuleAssignment>() {
           @Override
           public void write(JsonWriter out, BusValRuleAssignment value) throws IOException {
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
           public BusValRuleAssignment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusValRuleAssignment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BusValRuleAssignment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusValRuleAssignment
  * @throws IOException if the JSON string is invalid with respect to BusValRuleAssignment
  */
  public static BusValRuleAssignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusValRuleAssignment.class);
  }

 /**
  * Convert an instance of BusValRuleAssignment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
