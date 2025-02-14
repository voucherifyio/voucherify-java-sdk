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
import io.voucherify.client.model.Junction;
import io.voucherify.client.model.ParameterFiltersListBinId;
import io.voucherify.client.model.ParameterFiltersListBinResourceId;
import io.voucherify.client.model.ParameterFiltersListBinResourceName;
import io.voucherify.client.model.ParameterFiltersListBinResourceType;
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
 * ParameterFiltersListBin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParameterFiltersListBin {
  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ParameterFiltersListBinId id;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ParameterFiltersListBinResourceType resourceType;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resource_name";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private ParameterFiltersListBinResourceName resourceName;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private ParameterFiltersListBinResourceId resourceId;

  public ParameterFiltersListBin() {
  }

  public ParameterFiltersListBin junction(Junction junction) {
    
    this.junction = junction;
    return this;
  }

   /**
   * Get junction
   * @return junction
  **/
  @javax.annotation.Nullable
  public Junction getJunction() {
    return junction;
  }


  public void setJunction(Junction junction) {
    this.junction = junction;
  }


  public ParameterFiltersListBin id(ParameterFiltersListBinId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListBinId getId() {
    return id;
  }


  public void setId(ParameterFiltersListBinId id) {
    this.id = id;
  }


  public ParameterFiltersListBin resourceType(ParameterFiltersListBinResourceType resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListBinResourceType getResourceType() {
    return resourceType;
  }


  public void setResourceType(ParameterFiltersListBinResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public ParameterFiltersListBin resourceName(ParameterFiltersListBinResourceName resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListBinResourceName getResourceName() {
    return resourceName;
  }


  public void setResourceName(ParameterFiltersListBinResourceName resourceName) {
    this.resourceName = resourceName;
  }


  public ParameterFiltersListBin resourceId(ParameterFiltersListBinResourceId resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListBinResourceId getResourceId() {
    return resourceId;
  }


  public void setResourceId(ParameterFiltersListBinResourceId resourceId) {
    this.resourceId = resourceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterFiltersListBin parameterFiltersListBin = (ParameterFiltersListBin) o;
    return Objects.equals(this.junction, parameterFiltersListBin.junction) &&
        Objects.equals(this.id, parameterFiltersListBin.id) &&
        Objects.equals(this.resourceType, parameterFiltersListBin.resourceType) &&
        Objects.equals(this.resourceName, parameterFiltersListBin.resourceName) &&
        Objects.equals(this.resourceId, parameterFiltersListBin.resourceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(junction, id, resourceType, resourceName, resourceId);
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
    sb.append("class ParameterFiltersListBin {\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
    openapiFields.add("junction");
    openapiFields.add("id");
    openapiFields.add("resource_type");
    openapiFields.add("resource_name");
    openapiFields.add("resource_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterFiltersListBin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterFiltersListBin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterFiltersListBin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterFiltersListBin.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterFiltersListBin>() {
           @Override
           public void write(JsonWriter out, ParameterFiltersListBin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterFiltersListBin read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterFiltersListBin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterFiltersListBin
  * @throws IOException if the JSON string is invalid with respect to ParameterFiltersListBin
  */
  public static ParameterFiltersListBin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterFiltersListBin.class);
  }

 /**
  * Convert an instance of ParameterFiltersListBin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

