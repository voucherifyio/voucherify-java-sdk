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
import io.voucherify.client.model.BusValRuleAssignment;
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
 * List of Validation Rules Assignments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValidationRulesAssignmentsList {
  /**
   * The type of the object represented by JSON. This object stores information about validation rules assignments.
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

  /**
   * Identifies the name of the attribute that contains the array of validation rules assignments.
   */
  @JsonAdapter(DataRefEnum.Adapter.class)
  public enum DataRefEnum {
    DATA("data");

    private String value;

    DataRefEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataRefEnum fromValue(String value) {
      for (DataRefEnum b : DataRefEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<DataRefEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataRefEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataRefEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataRefEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_REF = "data_ref";
  @SerializedName(SERIALIZED_NAME_DATA_REF)
  private DataRefEnum dataRef = DataRefEnum.DATA;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<BusValRuleAssignment> data;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public ValidationRulesAssignmentsList() {
  }

  public ValidationRulesAssignmentsList _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. This object stores information about validation rules assignments.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public ValidationRulesAssignmentsList dataRef(DataRefEnum dataRef) {
    
    this.dataRef = dataRef;
    return this;
  }

   /**
   * Identifies the name of the attribute that contains the array of validation rules assignments.
   * @return dataRef
  **/
  @javax.annotation.Nullable
  public DataRefEnum getDataRef() {
    return dataRef;
  }


  public void setDataRef(DataRefEnum dataRef) {
    this.dataRef = dataRef;
  }


  public ValidationRulesAssignmentsList data(List<BusValRuleAssignment> data) {
    
    this.data = data;
    return this;
  }

  public ValidationRulesAssignmentsList addDataItem(BusValRuleAssignment dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Contains array of validation rules assignments.
   * @return data
  **/
  @javax.annotation.Nullable
  public List<BusValRuleAssignment> getData() {
    return data;
  }


  public void setData(List<BusValRuleAssignment> data) {
    this.data = data;
  }


  public ValidationRulesAssignmentsList total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of validation rules assignments.
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationRulesAssignmentsList validationRulesAssignmentsList = (ValidationRulesAssignmentsList) o;
    return Objects.equals(this._object, validationRulesAssignmentsList._object) &&
        Objects.equals(this.dataRef, validationRulesAssignmentsList.dataRef) &&
        Objects.equals(this.data, validationRulesAssignmentsList.data) &&
        Objects.equals(this.total, validationRulesAssignmentsList.total);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, dataRef, data, total);
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
    sb.append("class ValidationRulesAssignmentsList {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    dataRef: ").append(toIndentedString(dataRef)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("data_ref");
    openapiFields.add("data");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidationRulesAssignmentsList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidationRulesAssignmentsList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidationRulesAssignmentsList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidationRulesAssignmentsList.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidationRulesAssignmentsList>() {
           @Override
           public void write(JsonWriter out, ValidationRulesAssignmentsList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidationRulesAssignmentsList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidationRulesAssignmentsList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationRulesAssignmentsList
  * @throws IOException if the JSON string is invalid with respect to ValidationRulesAssignmentsList
  */
  public static ValidationRulesAssignmentsList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationRulesAssignmentsList.class);
  }

 /**
  * Convert an instance of ValidationRulesAssignmentsList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

