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
import io.voucherify.client.model.LoyaltiesMembersTransactionsExportCreateResponseBodyParameters;
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
 * Response body schema for **POST** &#x60;v1/loyalties/members/{memberId}/transactions/export&#x60; and for **POST** &#x60;v1/loyalties/{campaignId}/members/{memberId}/transactions/export&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesMembersTransactionsExportCreateResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of object being represented. This object stores information about the export.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    EXPORT("export");

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
  private ObjectEnum _object = ObjectEnum.EXPORT;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * Status of the export. Informs you whether the export has already been completed, i.e. indicates whether the file containing the exported data has been generated.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SCHEDULED("SCHEDULED");

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
  private StatusEnum status = StatusEnum.SCHEDULED;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  /**
   * The type of object to be exported.
   */
  @JsonAdapter(ExportedObjectEnum.Adapter.class)
  public enum ExportedObjectEnum {
    VOUCHER_TRANSACTIONS("voucher_transactions");

    private String value;

    ExportedObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExportedObjectEnum fromValue(String value) {
      for (ExportedObjectEnum b : ExportedObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ExportedObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExportedObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExportedObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExportedObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXPORTED_OBJECT = "exported_object";
  @SerializedName(SERIALIZED_NAME_EXPORTED_OBJECT)
  private ExportedObjectEnum exportedObject = ExportedObjectEnum.VOUCHER_TRANSACTIONS;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private LoyaltiesMembersTransactionsExportCreateResponseBodyParameters parameters;

  public LoyaltiesMembersTransactionsExportCreateResponseBody() {
  }

  public LoyaltiesMembersTransactionsExportCreateResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique export ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LoyaltiesMembersTransactionsExportCreateResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object being represented. This object stores information about the export.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public LoyaltiesMembersTransactionsExportCreateResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the export was scheduled in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LoyaltiesMembersTransactionsExportCreateResponseBody status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the export. Informs you whether the export has already been completed, i.e. indicates whether the file containing the exported data has been generated.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public LoyaltiesMembersTransactionsExportCreateResponseBody channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The channel through which the export was triggered.
   * @return channel
  **/
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public LoyaltiesMembersTransactionsExportCreateResponseBody result(Object result) {
    
    this.result = result;
    return this;
  }

   /**
   * Contains the URL of the CSV file.
   * @return result
  **/
  @javax.annotation.Nullable
  public Object getResult() {
    return result;
  }


  public void setResult(Object result) {
    this.result = result;
  }


  public LoyaltiesMembersTransactionsExportCreateResponseBody userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Identifies the specific user who initiated the export through the Voucherify Dashboard; returned when the channel value is WEBSITE.
   * @return userId
  **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public LoyaltiesMembersTransactionsExportCreateResponseBody exportedObject(ExportedObjectEnum exportedObject) {
    
    this.exportedObject = exportedObject;
    return this;
  }

   /**
   * The type of object to be exported.
   * @return exportedObject
  **/
  @javax.annotation.Nullable
  public ExportedObjectEnum getExportedObject() {
    return exportedObject;
  }


  public void setExportedObject(ExportedObjectEnum exportedObject) {
    this.exportedObject = exportedObject;
  }


  public LoyaltiesMembersTransactionsExportCreateResponseBody parameters(LoyaltiesMembersTransactionsExportCreateResponseBodyParameters parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public LoyaltiesMembersTransactionsExportCreateResponseBodyParameters getParameters() {
    return parameters;
  }


  public void setParameters(LoyaltiesMembersTransactionsExportCreateResponseBodyParameters parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesMembersTransactionsExportCreateResponseBody loyaltiesMembersTransactionsExportCreateResponseBody = (LoyaltiesMembersTransactionsExportCreateResponseBody) o;
    return Objects.equals(this.id, loyaltiesMembersTransactionsExportCreateResponseBody.id) &&
        Objects.equals(this._object, loyaltiesMembersTransactionsExportCreateResponseBody._object) &&
        Objects.equals(this.createdAt, loyaltiesMembersTransactionsExportCreateResponseBody.createdAt) &&
        Objects.equals(this.status, loyaltiesMembersTransactionsExportCreateResponseBody.status) &&
        Objects.equals(this.channel, loyaltiesMembersTransactionsExportCreateResponseBody.channel) &&
        Objects.equals(this.result, loyaltiesMembersTransactionsExportCreateResponseBody.result) &&
        Objects.equals(this.userId, loyaltiesMembersTransactionsExportCreateResponseBody.userId) &&
        Objects.equals(this.exportedObject, loyaltiesMembersTransactionsExportCreateResponseBody.exportedObject) &&
        Objects.equals(this.parameters, loyaltiesMembersTransactionsExportCreateResponseBody.parameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, status, channel, result, userId, exportedObject, parameters);
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
    sb.append("class LoyaltiesMembersTransactionsExportCreateResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    exportedObject: ").append(toIndentedString(exportedObject)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("created_at");
    openapiFields.add("status");
    openapiFields.add("channel");
    openapiFields.add("result");
    openapiFields.add("user_id");
    openapiFields.add("exported_object");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesMembersTransactionsExportCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesMembersTransactionsExportCreateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesMembersTransactionsExportCreateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesMembersTransactionsExportCreateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesMembersTransactionsExportCreateResponseBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesMembersTransactionsExportCreateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesMembersTransactionsExportCreateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesMembersTransactionsExportCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesMembersTransactionsExportCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesMembersTransactionsExportCreateResponseBody
  */
  public static LoyaltiesMembersTransactionsExportCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesMembersTransactionsExportCreateResponseBody.class);
  }

 /**
  * Convert an instance of LoyaltiesMembersTransactionsExportCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

