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
import io.voucherify.client.model.ManagementProjectsMetadataSchemaDefinition;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
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
 * Response body schema for **PUT** &#x60;management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectsMetadataSchemasUpdateResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RELATED_OBJECT = "related_object";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT)
  private String relatedObject;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, ManagementProjectsMetadataSchemaDefinition> properties;

  public static final String SERIALIZED_NAME_ALLOW_DEFINED_ONLY = "allow_defined_only";
  @SerializedName(SERIALIZED_NAME_ALLOW_DEFINED_ONLY)
  private Boolean allowDefinedOnly;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "metadata_schema";

  public ManagementProjectsMetadataSchemasUpdateResponseBody() {
  }

  public ManagementProjectsMetadataSchemasUpdateResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the metadata schema.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ManagementProjectsMetadataSchemasUpdateResponseBody relatedObject(String relatedObject) {
    
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * The resource type. You can define custom metadata schemas, which have a custom &#x60;\&quot;related_object\&quot;&#x60; resource type. The standard metadata schemas are: &#x60;\&quot;campaign\&quot;&#x60;, &#x60;\&quot;customer\&quot;&#x60;, &#x60;\&quot;earning_rule\&quot;&#x60;, &#x60;\&quot;loyalty_tier\&quot;&#x60;, &#x60;\&quot;order\&quot;&#x60;, &#x60;\&quot;order_item\&quot;&#x60;, &#x60;\&quot;product\&quot;&#x60;, &#x60;\&quot;promotion_tier\&quot;&#x60;, &#x60;\&quot;publication\&quot;&#x60;, &#x60;\&quot;redemption\&quot;&#x60;, &#x60;\&quot;reward\&quot;&#x60;, &#x60;\&quot;voucher\&quot;&#x60;.
   * @return relatedObject
  **/
  @javax.annotation.Nullable
  public String getRelatedObject() {
    return relatedObject;
  }


  public void setRelatedObject(String relatedObject) {
    this.relatedObject = relatedObject;
  }


  public ManagementProjectsMetadataSchemasUpdateResponseBody properties(Map<String, ManagementProjectsMetadataSchemaDefinition> properties) {
    
    this.properties = properties;
    return this;
  }

  public ManagementProjectsMetadataSchemasUpdateResponseBody putPropertiesItem(String key, ManagementProjectsMetadataSchemaDefinition propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Contains metadata definitions.
   * @return properties
  **/
  @javax.annotation.Nullable
  public Map<String, ManagementProjectsMetadataSchemaDefinition> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, ManagementProjectsMetadataSchemaDefinition> properties) {
    this.properties = properties;
  }


  public ManagementProjectsMetadataSchemasUpdateResponseBody allowDefinedOnly(Boolean allowDefinedOnly) {
    
    this.allowDefinedOnly = allowDefinedOnly;
    return this;
  }

   /**
   * Restricts the creation of metadata fields when set to &#x60;true&#x60;. It indicates whether or not you can create new metadata definitions, e.g. in the campaign or publication manager. If set to &#x60;true&#x60;, then only the defined fields are available for assigning values.
   * @return allowDefinedOnly
  **/
  @javax.annotation.Nullable
  public Boolean getAllowDefinedOnly() {
    return allowDefinedOnly;
  }


  public void setAllowDefinedOnly(Boolean allowDefinedOnly) {
    this.allowDefinedOnly = allowDefinedOnly;
  }


  public ManagementProjectsMetadataSchemasUpdateResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the metadata schema was created. The value for this parameter is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ManagementProjectsMetadataSchemasUpdateResponseBody updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the metadata schema was updated. The value for this parameter is shown in the ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ManagementProjectsMetadataSchemasUpdateResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by the JSON. This object stores information about the metadata schema.
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
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
    ManagementProjectsMetadataSchemasUpdateResponseBody managementProjectsMetadataSchemasUpdateResponseBody = (ManagementProjectsMetadataSchemasUpdateResponseBody) o;
    return Objects.equals(this.id, managementProjectsMetadataSchemasUpdateResponseBody.id) &&
        Objects.equals(this.relatedObject, managementProjectsMetadataSchemasUpdateResponseBody.relatedObject) &&
        Objects.equals(this.properties, managementProjectsMetadataSchemasUpdateResponseBody.properties) &&
        Objects.equals(this.allowDefinedOnly, managementProjectsMetadataSchemasUpdateResponseBody.allowDefinedOnly) &&
        Objects.equals(this.createdAt, managementProjectsMetadataSchemasUpdateResponseBody.createdAt) &&
        Objects.equals(this.updatedAt, managementProjectsMetadataSchemasUpdateResponseBody.updatedAt) &&
        Objects.equals(this._object, managementProjectsMetadataSchemasUpdateResponseBody._object);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relatedObject, properties, allowDefinedOnly, createdAt, updatedAt, _object);
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
    sb.append("class ManagementProjectsMetadataSchemasUpdateResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    allowDefinedOnly: ").append(toIndentedString(allowDefinedOnly)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("related_object");
    openapiFields.add("properties");
    openapiFields.add("allow_defined_only");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectsMetadataSchemasUpdateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectsMetadataSchemasUpdateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectsMetadataSchemasUpdateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectsMetadataSchemasUpdateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectsMetadataSchemasUpdateResponseBody>() {
           @Override
           public void write(JsonWriter out, ManagementProjectsMetadataSchemasUpdateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectsMetadataSchemasUpdateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectsMetadataSchemasUpdateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectsMetadataSchemasUpdateResponseBody
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectsMetadataSchemasUpdateResponseBody
  */
  public static ManagementProjectsMetadataSchemasUpdateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectsMetadataSchemasUpdateResponseBody.class);
  }

 /**
  * Convert an instance of ManagementProjectsMetadataSchemasUpdateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
