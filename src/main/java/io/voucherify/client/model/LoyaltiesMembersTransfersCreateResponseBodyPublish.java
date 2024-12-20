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
 * This object stores a summary of publish events: an events counter and an endpoint which can be called to return details of each event. A publication is required for loyalty cards and referral codes. This object gets updated whenever a voucher has been published. Publication means assigning a code to a particular customer. Typically, a publication is made by distributing your codes to your customers, e.g. through Export to MailChimp or publish voucher API method.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesMembersTransfersCreateResponseBodyPublish {
  /**
   * The type of the object represented is by default list. To get this list, you need to make a call to the endpoint returned in the url attribute.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    LIST("list");

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
  private ObjectEnum _object = ObjectEnum.LIST;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<String> entries;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public LoyaltiesMembersTransfersCreateResponseBodyPublish() {
  }

  public LoyaltiesMembersTransfersCreateResponseBodyPublish _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented is by default list. To get this list, you need to make a call to the endpoint returned in the url attribute.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public LoyaltiesMembersTransfersCreateResponseBodyPublish count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Publication events counter.
   * @return count
  **/
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public LoyaltiesMembersTransfersCreateResponseBodyPublish entries(List<String> entries) {
    
    this.entries = entries;
    return this;
  }

  public LoyaltiesMembersTransfersCreateResponseBodyPublish addEntriesItem(String entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nullable
  public List<String> getEntries() {
    return entries;
  }


  public void setEntries(List<String> entries) {
    this.entries = entries;
  }


  public LoyaltiesMembersTransfersCreateResponseBodyPublish url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The endpoint where this list of publications can be accessed using a **GET** method. /v1/vouchers/{voucher_code}/publications
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesMembersTransfersCreateResponseBodyPublish loyaltiesMembersTransfersCreateResponseBodyPublish = (LoyaltiesMembersTransfersCreateResponseBodyPublish) o;
    return Objects.equals(this._object, loyaltiesMembersTransfersCreateResponseBodyPublish._object) &&
        Objects.equals(this.count, loyaltiesMembersTransfersCreateResponseBodyPublish.count) &&
        Objects.equals(this.entries, loyaltiesMembersTransfersCreateResponseBodyPublish.entries) &&
        Objects.equals(this.url, loyaltiesMembersTransfersCreateResponseBodyPublish.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, count, entries, url);
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
    sb.append("class LoyaltiesMembersTransfersCreateResponseBodyPublish {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("count");
    openapiFields.add("entries");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesMembersTransfersCreateResponseBodyPublish.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesMembersTransfersCreateResponseBodyPublish' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesMembersTransfersCreateResponseBodyPublish> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesMembersTransfersCreateResponseBodyPublish.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesMembersTransfersCreateResponseBodyPublish>() {
           @Override
           public void write(JsonWriter out, LoyaltiesMembersTransfersCreateResponseBodyPublish value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesMembersTransfersCreateResponseBodyPublish read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesMembersTransfersCreateResponseBodyPublish given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesMembersTransfersCreateResponseBodyPublish
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesMembersTransfersCreateResponseBodyPublish
  */
  public static LoyaltiesMembersTransfersCreateResponseBodyPublish fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesMembersTransfersCreateResponseBodyPublish.class);
  }

 /**
  * Convert an instance of LoyaltiesMembersTransfersCreateResponseBodyPublish to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

