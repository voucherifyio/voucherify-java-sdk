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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectsMetadataSchemasCreateRequestBody {
  public static final String SERIALIZED_NAME_RELATED_OBJECT = "related_object";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT)
  private String relatedObject;

  public static final String SERIALIZED_NAME_ALLOW_DEFINED_ONLY = "allow_defined_only";
  @SerializedName(SERIALIZED_NAME_ALLOW_DEFINED_ONLY)
  private Boolean allowDefinedOnly = false;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, ManagementProjectsMetadataSchemaDefinition> properties;

  public ManagementProjectsMetadataSchemasCreateRequestBody() {
  }

  public ManagementProjectsMetadataSchemasCreateRequestBody relatedObject(String relatedObject) {
    
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * The resource type. You can define custom metadata schemas, which have a custom &#x60;\&quot;related_object\&quot;&#x60; resource type, or you can use standard resource types: &#x60;\&quot;campaign\&quot;&#x60;, &#x60;\&quot;customer\&quot;&#x60;, &#x60;\&quot;earning_rule\&quot;&#x60;, &#x60;\&quot;loyalty_tier\&quot;&#x60;, &#x60;\&quot;order\&quot;&#x60;, &#x60;\&quot;order_item\&quot;&#x60;, &#x60;\&quot;product\&quot;&#x60;, &#x60;\&quot;promotion_tier\&quot;&#x60;, &#x60;\&quot;publication\&quot;&#x60;, &#x60;\&quot;redemption\&quot;&#x60;, &#x60;\&quot;reward\&quot;&#x60;, &#x60;\&quot;voucher\&quot;&#x60;.
   * @return relatedObject
  **/
  @javax.annotation.Nullable
  public String getRelatedObject() {
    return relatedObject;
  }


  public void setRelatedObject(String relatedObject) {
    this.relatedObject = relatedObject;
  }


  public ManagementProjectsMetadataSchemasCreateRequestBody allowDefinedOnly(Boolean allowDefinedOnly) {
    
    this.allowDefinedOnly = allowDefinedOnly;
    return this;
  }

   /**
   * Restricts the creation of metadata fields when set to &#x60;true&#x60;. In other words, it indicates whether or not you are allowed to create new metadata definitions; for example, in the campaign manager or publication manager. If it is set to true, then only the defined fields will be available for assigning values. 
   * @return allowDefinedOnly
  **/
  @javax.annotation.Nullable
  public Boolean getAllowDefinedOnly() {
    return allowDefinedOnly;
  }


  public void setAllowDefinedOnly(Boolean allowDefinedOnly) {
    this.allowDefinedOnly = allowDefinedOnly;
  }


  public ManagementProjectsMetadataSchemasCreateRequestBody properties(Map<String, ManagementProjectsMetadataSchemaDefinition> properties) {
    
    this.properties = properties;
    return this;
  }

  public ManagementProjectsMetadataSchemasCreateRequestBody putPropertiesItem(String key, ManagementProjectsMetadataSchemaDefinition propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Contains metadata definitions. There can be many properties within this object.  Only the properties sent in the request will be created.
   * @return properties
  **/
  @javax.annotation.Nullable
  public Map<String, ManagementProjectsMetadataSchemaDefinition> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, ManagementProjectsMetadataSchemaDefinition> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementProjectsMetadataSchemasCreateRequestBody managementProjectsMetadataSchemasCreateRequestBody = (ManagementProjectsMetadataSchemasCreateRequestBody) o;
    return Objects.equals(this.relatedObject, managementProjectsMetadataSchemasCreateRequestBody.relatedObject) &&
        Objects.equals(this.allowDefinedOnly, managementProjectsMetadataSchemasCreateRequestBody.allowDefinedOnly) &&
        Objects.equals(this.properties, managementProjectsMetadataSchemasCreateRequestBody.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedObject, allowDefinedOnly, properties);
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
    sb.append("class ManagementProjectsMetadataSchemasCreateRequestBody {\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
    sb.append("    allowDefinedOnly: ").append(toIndentedString(allowDefinedOnly)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("related_object");
    openapiFields.add("allow_defined_only");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectsMetadataSchemasCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectsMetadataSchemasCreateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectsMetadataSchemasCreateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectsMetadataSchemasCreateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectsMetadataSchemasCreateRequestBody>() {
           @Override
           public void write(JsonWriter out, ManagementProjectsMetadataSchemasCreateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectsMetadataSchemasCreateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectsMetadataSchemasCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectsMetadataSchemasCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectsMetadataSchemasCreateRequestBody
  */
  public static ManagementProjectsMetadataSchemasCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectsMetadataSchemasCreateRequestBody.class);
  }

 /**
  * Convert an instance of ManagementProjectsMetadataSchemasCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

