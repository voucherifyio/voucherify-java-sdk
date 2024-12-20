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
 * Custom definition name. This is also shown in **Project Settings** &gt; **Metadata Schema** in the Voucherify Dashboard.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetadataSchemaDefinitionDeprecated {
  /**
   * Gets or Sets type
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

  public static final String SERIALIZED_NAME_ARRAY = "array";
  @SerializedName(SERIALIZED_NAME_ARRAY)
  private Boolean array;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_EQ = "eq";
  @SerializedName(SERIALIZED_NAME_EQ)
  private List<Object> eq;

  public static final String SERIALIZED_NAME_NE = "ne";
  @SerializedName(SERIALIZED_NAME_NE)
  private List<Object> ne;

  public static final String SERIALIZED_NAME_LT = "lt";
  @SerializedName(SERIALIZED_NAME_LT)
  private Integer lt;

  public static final String SERIALIZED_NAME_LTE = "lte";
  @SerializedName(SERIALIZED_NAME_LTE)
  private Integer lte;

  public static final String SERIALIZED_NAME_GT = "gt";
  @SerializedName(SERIALIZED_NAME_GT)
  private Integer gt;

  public static final String SERIALIZED_NAME_GTE = "gte";
  @SerializedName(SERIALIZED_NAME_GTE)
  private Integer gte;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private Integer maxLength;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private Integer minLength;

  public static final String SERIALIZED_NAME_EXACT_LENGTH = "exactLength";
  @SerializedName(SERIALIZED_NAME_EXACT_LENGTH)
  private Integer exactLength;

  public MetadataSchemaDefinitionDeprecated() {
  }

  public MetadataSchemaDefinitionDeprecated type(TypeEnum type) {
    
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


  public MetadataSchemaDefinitionDeprecated array(Boolean array) {
    
    this.array = array;
    return this;
  }

   /**
   * Indicates whether the definition is an array.
   * @return array
  **/
  @javax.annotation.Nullable
  public Boolean getArray() {
    return array;
  }


  public void setArray(Boolean array) {
    this.array = array;
  }


  public MetadataSchemaDefinitionDeprecated optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Indicates whether this definition is optional or not optional for the resource.
   * @return optional
  **/
  @javax.annotation.Nullable
  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public MetadataSchemaDefinitionDeprecated objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Returns the name of the custom resource if the resource was previously defined in the Dashboard as a custom (non-standard) Nested object.
   * @return objectType
  **/
  @javax.annotation.Nullable
  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public MetadataSchemaDefinitionDeprecated eq(List<Object> eq) {
    
    this.eq = eq;
    return this;
  }

  public MetadataSchemaDefinitionDeprecated addEqItem(Object eqItem) {
    if (this.eq == null) {
      this.eq = new ArrayList<>();
    }
    this.eq.add(eqItem);
    return this;
  }

   /**
   * Array of possible values when the setting for &#x60;is equal to any of&#x60; in the Dashboard is defined explicitly.
   * @return eq
  **/
  @javax.annotation.Nullable
  public List<Object> getEq() {
    return eq;
  }


  public void setEq(List<Object> eq) {
    this.eq = eq;
  }


  public MetadataSchemaDefinitionDeprecated ne(List<Object> ne) {
    
    this.ne = ne;
    return this;
  }

  public MetadataSchemaDefinitionDeprecated addNeItem(Object neItem) {
    if (this.ne == null) {
      this.ne = new ArrayList<>();
    }
    this.ne.add(neItem);
    return this;
  }

   /**
   * Array of values that are not allowed when the setting for &#x60;is not equal to any of&#x60; in the Dashboard is defined explicitly.
   * @return ne
  **/
  @javax.annotation.Nullable
  public List<Object> getNe() {
    return ne;
  }


  public void setNe(List<Object> ne) {
    this.ne = ne;
  }


  public MetadataSchemaDefinitionDeprecated lt(Integer lt) {
    
    this.lt = lt;
    return this;
  }

   /**
   * A property of &#x60;number&#x60; type must have &#x60;less than&#x60; this value.
   * @return lt
  **/
  @javax.annotation.Nullable
  public Integer getLt() {
    return lt;
  }


  public void setLt(Integer lt) {
    this.lt = lt;
  }


  public MetadataSchemaDefinitionDeprecated lte(Integer lte) {
    
    this.lte = lte;
    return this;
  }

   /**
   * A property of &#x60;number&#x60; type must be &#x60;less than or equal&#x60; to this value.
   * @return lte
  **/
  @javax.annotation.Nullable
  public Integer getLte() {
    return lte;
  }


  public void setLte(Integer lte) {
    this.lte = lte;
  }


  public MetadataSchemaDefinitionDeprecated gt(Integer gt) {
    
    this.gt = gt;
    return this;
  }

   /**
   * A property of &#x60;number&#x60; type must be &#x60;greater than&#x60; this value.
   * @return gt
  **/
  @javax.annotation.Nullable
  public Integer getGt() {
    return gt;
  }


  public void setGt(Integer gt) {
    this.gt = gt;
  }


  public MetadataSchemaDefinitionDeprecated gte(Integer gte) {
    
    this.gte = gte;
    return this;
  }

   /**
   * A property of &#x60;number&#x60; type must be &#x60;greater than or equal&#x60; to this value.
   * @return gte
  **/
  @javax.annotation.Nullable
  public Integer getGte() {
    return gte;
  }


  public void setGte(Integer gte) {
    this.gte = gte;
  }


  public MetadataSchemaDefinitionDeprecated deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Indicates whether the definition was deleted from the schema.
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public MetadataSchemaDefinitionDeprecated maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Value for maximum length when the setting for &#x60;has maximum length of&#x60; in the Dashboard is defined explicitly.
   * @return maxLength
  **/
  @javax.annotation.Nullable
  public Integer getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public MetadataSchemaDefinitionDeprecated minLength(Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

   /**
   * Value indicating minimum length when the setting for &#x60;has minimum length of&#x60; in the Dashboard is defined explicitly.
   * @return minLength
  **/
  @javax.annotation.Nullable
  public Integer getMinLength() {
    return minLength;
  }


  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public MetadataSchemaDefinitionDeprecated exactLength(Integer exactLength) {
    
    this.exactLength = exactLength;
    return this;
  }

   /**
   * Value indicating exact length when the setting for &#x60;has exact length of&#x60; in the Dashboard is defined explicitly.
   * @return exactLength
  **/
  @javax.annotation.Nullable
  public Integer getExactLength() {
    return exactLength;
  }


  public void setExactLength(Integer exactLength) {
    this.exactLength = exactLength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataSchemaDefinitionDeprecated metadataSchemaDefinitionDeprecated = (MetadataSchemaDefinitionDeprecated) o;
    return Objects.equals(this.type, metadataSchemaDefinitionDeprecated.type) &&
        Objects.equals(this.array, metadataSchemaDefinitionDeprecated.array) &&
        Objects.equals(this.optional, metadataSchemaDefinitionDeprecated.optional) &&
        Objects.equals(this.objectType, metadataSchemaDefinitionDeprecated.objectType) &&
        Objects.equals(this.eq, metadataSchemaDefinitionDeprecated.eq) &&
        Objects.equals(this.ne, metadataSchemaDefinitionDeprecated.ne) &&
        Objects.equals(this.lt, metadataSchemaDefinitionDeprecated.lt) &&
        Objects.equals(this.lte, metadataSchemaDefinitionDeprecated.lte) &&
        Objects.equals(this.gt, metadataSchemaDefinitionDeprecated.gt) &&
        Objects.equals(this.gte, metadataSchemaDefinitionDeprecated.gte) &&
        Objects.equals(this.deleted, metadataSchemaDefinitionDeprecated.deleted) &&
        Objects.equals(this.maxLength, metadataSchemaDefinitionDeprecated.maxLength) &&
        Objects.equals(this.minLength, metadataSchemaDefinitionDeprecated.minLength) &&
        Objects.equals(this.exactLength, metadataSchemaDefinitionDeprecated.exactLength);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, array, optional, objectType, eq, ne, lt, lte, gt, gte, deleted, maxLength, minLength, exactLength);
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
    sb.append("class MetadataSchemaDefinitionDeprecated {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    ne: ").append(toIndentedString(ne)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    exactLength: ").append(toIndentedString(exactLength)).append("\n");
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
    openapiFields.add("array");
    openapiFields.add("optional");
    openapiFields.add("objectType");
    openapiFields.add("eq");
    openapiFields.add("ne");
    openapiFields.add("lt");
    openapiFields.add("lte");
    openapiFields.add("gt");
    openapiFields.add("gte");
    openapiFields.add("deleted");
    openapiFields.add("maxLength");
    openapiFields.add("minLength");
    openapiFields.add("exactLength");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetadataSchemaDefinitionDeprecated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetadataSchemaDefinitionDeprecated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetadataSchemaDefinitionDeprecated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetadataSchemaDefinitionDeprecated.class));

       return (TypeAdapter<T>) new TypeAdapter<MetadataSchemaDefinitionDeprecated>() {
           @Override
           public void write(JsonWriter out, MetadataSchemaDefinitionDeprecated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetadataSchemaDefinitionDeprecated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetadataSchemaDefinitionDeprecated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetadataSchemaDefinitionDeprecated
  * @throws IOException if the JSON string is invalid with respect to MetadataSchemaDefinitionDeprecated
  */
  public static MetadataSchemaDefinitionDeprecated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetadataSchemaDefinitionDeprecated.class);
  }

 /**
  * Convert an instance of MetadataSchemaDefinitionDeprecated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

