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
import java.math.BigDecimal;
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
 * Custom definition name. This is also shown in **Project Settings** &gt; **Metadata Schema** in the Voucherify Dashboard.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectsMetadataSchemaDefinition {
  /**
   * Indicates the type of metadata. Note that &#x60;\&quot;geopoint\&quot;&#x60; type is a paid feature.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("string"),
    
    NUMBER("number"),
    
    OBJECT("object"),
    
    DATE("date"),
    
    DATETIME("datetime"),
    
    GEOPOINT("geopoint"),
    
    BOOLEAN("boolean"),
    
    IMAGE_URL("image_url");

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

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_ARRAY = "array";
  @SerializedName(SERIALIZED_NAME_ARRAY)
  private Boolean array;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "min_length";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private Integer minLength;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "max_length";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private Integer maxLength;

  public static final String SERIALIZED_NAME_EXACT_LENGTH = "exact_length";
  @SerializedName(SERIALIZED_NAME_EXACT_LENGTH)
  private Integer exactLength;

  public static final String SERIALIZED_NAME_EQ = "eq";
  @SerializedName(SERIALIZED_NAME_EQ)
  private List<Object> eq;

  public static final String SERIALIZED_NAME_NE = "ne";
  @SerializedName(SERIALIZED_NAME_NE)
  private List<BigDecimal> ne;

  public static final String SERIALIZED_NAME_LT = "lt";
  @SerializedName(SERIALIZED_NAME_LT)
  private BigDecimal lt;

  public static final String SERIALIZED_NAME_LTE = "lte";
  @SerializedName(SERIALIZED_NAME_LTE)
  private BigDecimal lte;

  public static final String SERIALIZED_NAME_GT = "gt";
  @SerializedName(SERIALIZED_NAME_GT)
  private BigDecimal gt;

  public static final String SERIALIZED_NAME_GTE = "gte";
  @SerializedName(SERIALIZED_NAME_GTE)
  private BigDecimal gte;

  public ManagementProjectsMetadataSchemaDefinition() {
  }

  public ManagementProjectsMetadataSchemaDefinition type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of metadata. Note that &#x60;\&quot;geopoint\&quot;&#x60; type is a paid feature.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ManagementProjectsMetadataSchemaDefinition optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Indicates if this definition is optional or not for the resource.
   * @return optional
  **/
  @javax.annotation.Nullable
  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public ManagementProjectsMetadataSchemaDefinition array(Boolean array) {
    
    this.array = array;
    return this;
  }

   /**
   * Indicates if the definition is an array.
   * @return array
  **/
  @javax.annotation.Nullable
  public Boolean getArray() {
    return array;
  }


  public void setArray(Boolean array) {
    this.array = array;
  }


  public ManagementProjectsMetadataSchemaDefinition deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Indicates if the definition has been deleted from the schema.
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public ManagementProjectsMetadataSchemaDefinition objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * The name of the custom resource (i.e. a nested object) if the resource has been previously defined. Otherwise, it is &#x60;null&#x60; for other types.
   * @return objectType
  **/
  @javax.annotation.Nullable
  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public ManagementProjectsMetadataSchemaDefinition minLength(Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

   /**
   * Value indicating the minimum length. Available only for the &#x60;string&#x60; type.
   * @return minLength
  **/
  @javax.annotation.Nullable
  public Integer getMinLength() {
    return minLength;
  }


  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public ManagementProjectsMetadataSchemaDefinition maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Value indicating the maximum length. Available only for the &#x60;string&#x60; type.
   * @return maxLength
  **/
  @javax.annotation.Nullable
  public Integer getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public ManagementProjectsMetadataSchemaDefinition exactLength(Integer exactLength) {
    
    this.exactLength = exactLength;
    return this;
  }

   /**
   * Value indicating the exact length. Available only for the &#x60;string&#x60; type.
   * @return exactLength
  **/
  @javax.annotation.Nullable
  public Integer getExactLength() {
    return exactLength;
  }


  public void setExactLength(Integer exactLength) {
    this.exactLength = exactLength;
  }


  public ManagementProjectsMetadataSchemaDefinition eq(List<Object> eq) {
    
    this.eq = eq;
    return this;
  }

  public ManagementProjectsMetadataSchemaDefinition addEqItem(Object eqItem) {
    if (this.eq == null) {
      this.eq = new ArrayList<>();
    }
    this.eq.add(eqItem);
    return this;
  }

   /**
   * Get eq
   * @return eq
  **/
  @javax.annotation.Nullable
  public List<Object> getEq() {
    return eq;
  }


  public void setEq(List<Object> eq) {
    this.eq = eq;
  }


  public ManagementProjectsMetadataSchemaDefinition ne(List<BigDecimal> ne) {
    
    this.ne = ne;
    return this;
  }

  public ManagementProjectsMetadataSchemaDefinition addNeItem(BigDecimal neItem) {
    if (this.ne == null) {
      this.ne = new ArrayList<>();
    }
    this.ne.add(neItem);
    return this;
  }

   /**
   * Array of values that are not allowed. Available only for the &#x60;number&#x60; type.
   * @return ne
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getNe() {
    return ne;
  }


  public void setNe(List<BigDecimal> ne) {
    this.ne = ne;
  }


  public ManagementProjectsMetadataSchemaDefinition lt(BigDecimal lt) {
    
    this.lt = lt;
    return this;
  }

   /**
   * A property of the &#x60;number&#x60; type must have &#x60;less than&#x60; this value. The value should be up to two decimal places.
   * @return lt
  **/
  @javax.annotation.Nullable
  public BigDecimal getLt() {
    return lt;
  }


  public void setLt(BigDecimal lt) {
    this.lt = lt;
  }


  public ManagementProjectsMetadataSchemaDefinition lte(BigDecimal lte) {
    
    this.lte = lte;
    return this;
  }

   /**
   * A property of the &#x60;number&#x60; type must be &#x60;less than or equal&#x60; to this value. The value should be up to two decimal places.
   * @return lte
  **/
  @javax.annotation.Nullable
  public BigDecimal getLte() {
    return lte;
  }


  public void setLte(BigDecimal lte) {
    this.lte = lte;
  }


  public ManagementProjectsMetadataSchemaDefinition gt(BigDecimal gt) {
    
    this.gt = gt;
    return this;
  }

   /**
   * A property of &#x60;number&#x60; type must be &#x60;greater than&#x60; this value. The value should be up to two decimal places.
   * @return gt
  **/
  @javax.annotation.Nullable
  public BigDecimal getGt() {
    return gt;
  }


  public void setGt(BigDecimal gt) {
    this.gt = gt;
  }


  public ManagementProjectsMetadataSchemaDefinition gte(BigDecimal gte) {
    
    this.gte = gte;
    return this;
  }

   /**
   * A property of &#x60;number&#x60; type must be &#x60;greater than or equal&#x60; to this value. The value should be up to two decimal places.
   * @return gte
  **/
  @javax.annotation.Nullable
  public BigDecimal getGte() {
    return gte;
  }


  public void setGte(BigDecimal gte) {
    this.gte = gte;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementProjectsMetadataSchemaDefinition managementProjectsMetadataSchemaDefinition = (ManagementProjectsMetadataSchemaDefinition) o;
    return Objects.equals(this.type, managementProjectsMetadataSchemaDefinition.type) &&
        Objects.equals(this.optional, managementProjectsMetadataSchemaDefinition.optional) &&
        Objects.equals(this.array, managementProjectsMetadataSchemaDefinition.array) &&
        Objects.equals(this.deleted, managementProjectsMetadataSchemaDefinition.deleted) &&
        Objects.equals(this.objectType, managementProjectsMetadataSchemaDefinition.objectType) &&
        Objects.equals(this.minLength, managementProjectsMetadataSchemaDefinition.minLength) &&
        Objects.equals(this.maxLength, managementProjectsMetadataSchemaDefinition.maxLength) &&
        Objects.equals(this.exactLength, managementProjectsMetadataSchemaDefinition.exactLength) &&
        Objects.equals(this.eq, managementProjectsMetadataSchemaDefinition.eq) &&
        Objects.equals(this.ne, managementProjectsMetadataSchemaDefinition.ne) &&
        Objects.equals(this.lt, managementProjectsMetadataSchemaDefinition.lt) &&
        Objects.equals(this.lte, managementProjectsMetadataSchemaDefinition.lte) &&
        Objects.equals(this.gt, managementProjectsMetadataSchemaDefinition.gt) &&
        Objects.equals(this.gte, managementProjectsMetadataSchemaDefinition.gte);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, optional, array, deleted, objectType, minLength, maxLength, exactLength, eq, ne, lt, lte, gt, gte);
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
    sb.append("class ManagementProjectsMetadataSchemaDefinition {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    exactLength: ").append(toIndentedString(exactLength)).append("\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    ne: ").append(toIndentedString(ne)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
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
    openapiFields.add("optional");
    openapiFields.add("array");
    openapiFields.add("deleted");
    openapiFields.add("object_type");
    openapiFields.add("min_length");
    openapiFields.add("max_length");
    openapiFields.add("exact_length");
    openapiFields.add("eq");
    openapiFields.add("ne");
    openapiFields.add("lt");
    openapiFields.add("lte");
    openapiFields.add("gt");
    openapiFields.add("gte");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectsMetadataSchemaDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectsMetadataSchemaDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectsMetadataSchemaDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectsMetadataSchemaDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectsMetadataSchemaDefinition>() {
           @Override
           public void write(JsonWriter out, ManagementProjectsMetadataSchemaDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectsMetadataSchemaDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectsMetadataSchemaDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectsMetadataSchemaDefinition
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectsMetadataSchemaDefinition
  */
  public static ManagementProjectsMetadataSchemaDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectsMetadataSchemaDefinition.class);
  }

 /**
  * Convert an instance of ManagementProjectsMetadataSchemaDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
