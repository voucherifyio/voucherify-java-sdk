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
 * Contains the tier configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PromotionsStacksUpdateRequestBodyTiers {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<String> ids;

  /**
   * Category hierarchy.
   */
  @JsonAdapter(HierarchyModeEnum.Adapter.class)
  public enum HierarchyModeEnum {
    MANUAL("MANUAL");

    private String value;

    HierarchyModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HierarchyModeEnum fromValue(String value) {
      for (HierarchyModeEnum b : HierarchyModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<HierarchyModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HierarchyModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HierarchyModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HierarchyModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HIERARCHY_MODE = "hierarchy_mode";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_MODE)
  private HierarchyModeEnum hierarchyMode = HierarchyModeEnum.MANUAL;

  public PromotionsStacksUpdateRequestBodyTiers() {
  }

  public PromotionsStacksUpdateRequestBodyTiers ids(List<String> ids) {
    
    this.ids = ids;
    return this;
  }

  public PromotionsStacksUpdateRequestBodyTiers addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Contains the list of tiers in a pre-defined sequence.
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<String> getIds() {
    return ids;
  }


  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public PromotionsStacksUpdateRequestBodyTiers hierarchyMode(HierarchyModeEnum hierarchyMode) {
    
    this.hierarchyMode = hierarchyMode;
    return this;
  }

   /**
   * Category hierarchy.
   * @return hierarchyMode
  **/
  @javax.annotation.Nullable
  public HierarchyModeEnum getHierarchyMode() {
    return hierarchyMode;
  }


  public void setHierarchyMode(HierarchyModeEnum hierarchyMode) {
    this.hierarchyMode = hierarchyMode;
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
   * @return the PromotionsStacksUpdateRequestBodyTiers instance itself
   */
  public PromotionsStacksUpdateRequestBodyTiers putAdditionalProperty(String key, Object value) {
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
    PromotionsStacksUpdateRequestBodyTiers promotionsStacksUpdateRequestBodyTiers = (PromotionsStacksUpdateRequestBodyTiers) o;
    return Objects.equals(this.ids, promotionsStacksUpdateRequestBodyTiers.ids) &&
        Objects.equals(this.hierarchyMode, promotionsStacksUpdateRequestBodyTiers.hierarchyMode)&&
        Objects.equals(this.additionalProperties, promotionsStacksUpdateRequestBodyTiers.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, hierarchyMode, additionalProperties);
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
    sb.append("class PromotionsStacksUpdateRequestBodyTiers {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    hierarchyMode: ").append(toIndentedString(hierarchyMode)).append("\n");
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
    openapiFields.add("ids");
    openapiFields.add("hierarchy_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionsStacksUpdateRequestBodyTiers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionsStacksUpdateRequestBodyTiers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionsStacksUpdateRequestBodyTiers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionsStacksUpdateRequestBodyTiers.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionsStacksUpdateRequestBodyTiers>() {
           @Override
           public void write(JsonWriter out, PromotionsStacksUpdateRequestBodyTiers value) throws IOException {
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
           public PromotionsStacksUpdateRequestBodyTiers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PromotionsStacksUpdateRequestBodyTiers instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PromotionsStacksUpdateRequestBodyTiers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionsStacksUpdateRequestBodyTiers
  * @throws IOException if the JSON string is invalid with respect to PromotionsStacksUpdateRequestBodyTiers
  */
  public static PromotionsStacksUpdateRequestBodyTiers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionsStacksUpdateRequestBodyTiers.class);
  }

 /**
  * Convert an instance of PromotionsStacksUpdateRequestBodyTiers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

