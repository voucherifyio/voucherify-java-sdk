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
import io.voucherify.client.model.VouchersBalanceUpdateResponseBodyRelatedObject;
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
 * Response body schema for &#x60;vouchers/{code}/balance.&#x60;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VouchersBalanceUpdateResponseBody {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  /**
   * The type of voucher being modified.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GIFT_VOUCHER("gift_voucher"),
    
    LOYALTY_CARD("loyalty_card");

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

  /**
   * The type of the operation being performed.
   */
  @JsonAdapter(OperationTypeEnum.Adapter.class)
  public enum OperationTypeEnum {
    MANUAL("MANUAL");

    private String value;

    OperationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationTypeEnum fromValue(String value) {
      for (OperationTypeEnum b : OperationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<OperationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private OperationTypeEnum operationType = OperationTypeEnum.MANUAL;

  /**
   * The type of the object represented by JSON. Default is &#x60;balance&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    BALANCE("balance");

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
  private ObjectEnum _object = ObjectEnum.BALANCE;

  public static final String SERIALIZED_NAME_RELATED_OBJECT = "related_object";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT)
  private VouchersBalanceUpdateResponseBodyRelatedObject relatedObject;

  public VouchersBalanceUpdateResponseBody() {
  }

  public VouchersBalanceUpdateResponseBody amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The incremental amount added (positive integer) or subtracted (negative integer) to the current balance on the gift card or loyalty card. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000.
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public VouchersBalanceUpdateResponseBody total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total income incurred over the lifespan of the gift card or loyalty card.
   * @return total
  **/
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public VouchersBalanceUpdateResponseBody balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The balance after adding or subtracting a specified amount. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000.
   * @return balance
  **/
  @javax.annotation.Nullable
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public VouchersBalanceUpdateResponseBody type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of voucher being modified.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public VouchersBalanceUpdateResponseBody operationType(OperationTypeEnum operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * The type of the operation being performed.
   * @return operationType
  **/
  @javax.annotation.Nullable
  public OperationTypeEnum getOperationType() {
    return operationType;
  }


  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }


  public VouchersBalanceUpdateResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. Default is &#x60;balance&#x60;.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public VouchersBalanceUpdateResponseBody relatedObject(VouchersBalanceUpdateResponseBodyRelatedObject relatedObject) {
    
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * Get relatedObject
   * @return relatedObject
  **/
  @javax.annotation.Nullable
  public VouchersBalanceUpdateResponseBodyRelatedObject getRelatedObject() {
    return relatedObject;
  }


  public void setRelatedObject(VouchersBalanceUpdateResponseBodyRelatedObject relatedObject) {
    this.relatedObject = relatedObject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VouchersBalanceUpdateResponseBody vouchersBalanceUpdateResponseBody = (VouchersBalanceUpdateResponseBody) o;
    return Objects.equals(this.amount, vouchersBalanceUpdateResponseBody.amount) &&
        Objects.equals(this.total, vouchersBalanceUpdateResponseBody.total) &&
        Objects.equals(this.balance, vouchersBalanceUpdateResponseBody.balance) &&
        Objects.equals(this.type, vouchersBalanceUpdateResponseBody.type) &&
        Objects.equals(this.operationType, vouchersBalanceUpdateResponseBody.operationType) &&
        Objects.equals(this._object, vouchersBalanceUpdateResponseBody._object) &&
        Objects.equals(this.relatedObject, vouchersBalanceUpdateResponseBody.relatedObject);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, total, balance, type, operationType, _object, relatedObject);
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
    sb.append("class VouchersBalanceUpdateResponseBody {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("total");
    openapiFields.add("balance");
    openapiFields.add("type");
    openapiFields.add("operation_type");
    openapiFields.add("object");
    openapiFields.add("related_object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VouchersBalanceUpdateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VouchersBalanceUpdateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VouchersBalanceUpdateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VouchersBalanceUpdateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<VouchersBalanceUpdateResponseBody>() {
           @Override
           public void write(JsonWriter out, VouchersBalanceUpdateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VouchersBalanceUpdateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VouchersBalanceUpdateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VouchersBalanceUpdateResponseBody
  * @throws IOException if the JSON string is invalid with respect to VouchersBalanceUpdateResponseBody
  */
  public static VouchersBalanceUpdateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VouchersBalanceUpdateResponseBody.class);
  }

 /**
  * Convert an instance of VouchersBalanceUpdateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

