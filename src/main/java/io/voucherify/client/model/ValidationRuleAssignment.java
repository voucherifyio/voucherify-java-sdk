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
 * This is an object representing a validation rule assignment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValidationRuleAssignment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private String relatedObjectId;

  /**
   * The type of resource to which the validation rule was assigned.
   */
  @JsonAdapter(RelatedObjectTypeEnum.Adapter.class)
  public enum RelatedObjectTypeEnum {
    VOUCHER("voucher"),
    
    CAMPAIGN("campaign"),
    
    EARNING_RULE("earning_rule"),
    
    REWARD_ASSIGNMENT("reward_assignment"),
    
    PROMOTION_TIER("promotion_tier"),
    
    DISTRIBUTION("distribution");

    private String value;

    RelatedObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelatedObjectTypeEnum fromValue(String value) {
      for (RelatedObjectTypeEnum b : RelatedObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<RelatedObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelatedObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelatedObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RelatedObjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "related_object_type";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  private RelatedObjectTypeEnum relatedObjectType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * The type of the object represented by the ID.
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

  public ValidationRuleAssignment() {
  }

  public ValidationRuleAssignment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Validation rule assignment ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ValidationRuleAssignment ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Validation rule ID.
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public ValidationRuleAssignment relatedObjectId(String relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * The resource ID to which the validation rule was assigned.
   * @return relatedObjectId
  **/
  @javax.annotation.Nullable
  public String getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public ValidationRuleAssignment relatedObjectType(RelatedObjectTypeEnum relatedObjectType) {
    
    this.relatedObjectType = relatedObjectType;
    return this;
  }

   /**
   * The type of resource to which the validation rule was assigned.
   * @return relatedObjectType
  **/
  @javax.annotation.Nullable
  public RelatedObjectTypeEnum getRelatedObjectType() {
    return relatedObjectType;
  }


  public void setRelatedObjectType(RelatedObjectTypeEnum relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public ValidationRuleAssignment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the validation rule assignment was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ValidationRuleAssignment _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by the ID.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationRuleAssignment validationRuleAssignment = (ValidationRuleAssignment) o;
    return Objects.equals(this.id, validationRuleAssignment.id) &&
        Objects.equals(this.ruleId, validationRuleAssignment.ruleId) &&
        Objects.equals(this.relatedObjectId, validationRuleAssignment.relatedObjectId) &&
        Objects.equals(this.relatedObjectType, validationRuleAssignment.relatedObjectType) &&
        Objects.equals(this.createdAt, validationRuleAssignment.createdAt) &&
        Objects.equals(this._object, validationRuleAssignment._object);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleId, relatedObjectId, relatedObjectType, createdAt, _object);
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
    sb.append("class ValidationRuleAssignment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidationRuleAssignment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidationRuleAssignment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidationRuleAssignment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidationRuleAssignment.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidationRuleAssignment>() {
           @Override
           public void write(JsonWriter out, ValidationRuleAssignment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidationRuleAssignment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidationRuleAssignment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationRuleAssignment
  * @throws IOException if the JSON string is invalid with respect to ValidationRuleAssignment
  */
  public static ValidationRuleAssignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationRuleAssignment.class);
  }

 /**
  * Convert an instance of ValidationRuleAssignment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

