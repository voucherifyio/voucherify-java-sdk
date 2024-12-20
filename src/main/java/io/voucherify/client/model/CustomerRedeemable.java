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
import io.voucherify.client.model.CustomerRedeemableRedeemable;
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
 * Single customer&#39;s redeemable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomerRedeemable {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_REDEEMABLE_ID = "redeemable_id";
  @SerializedName(SERIALIZED_NAME_REDEEMABLE_ID)
  private String redeemableId;

  public static final String SERIALIZED_NAME_REDEEMABLE_OBJECT = "redeemable_object";
  @SerializedName(SERIALIZED_NAME_REDEEMABLE_OBJECT)
  private String redeemableObject;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  /**
   * Role of the holder.
   */
  @JsonAdapter(HolderRoleEnum.Adapter.class)
  public enum HolderRoleEnum {
    OWNER("OWNER"),
    
    REFERRER("REFERRER"),
    
    REFEREE("REFEREE");

    private String value;

    HolderRoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HolderRoleEnum fromValue(String value) {
      for (HolderRoleEnum b : HolderRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<HolderRoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HolderRoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HolderRoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HolderRoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HOLDER_ROLE = "holder_role";
  @SerializedName(SERIALIZED_NAME_HOLDER_ROLE)
  private HolderRoleEnum holderRole = HolderRoleEnum.OWNER;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  /**
   * Defines the type of the campaign.
   */
  @JsonAdapter(CampaignTypeEnum.Adapter.class)
  public enum CampaignTypeEnum {
    LOYALTY_PROGRAM("LOYALTY_PROGRAM"),
    
    GIFT_VOUCHERS("GIFT_VOUCHERS"),
    
    DISCOUNT_COUPONS("DISCOUNT_COUPONS"),
    
    PROMOTION("PROMOTION"),
    
    REFERRAL_PROGRAM("REFERRAL_PROGRAM");

    private String value;

    CampaignTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignTypeEnum fromValue(String value) {
      for (CampaignTypeEnum b : CampaignTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<CampaignTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private CampaignTypeEnum campaignType = CampaignTypeEnum.DISCOUNT_COUPONS;

  /**
   * Defines the type of the voucher.
   */
  @JsonAdapter(VoucherTypeEnum.Adapter.class)
  public enum VoucherTypeEnum {
    GIFT_VOUCHER("GIFT_VOUCHER"),
    
    DISCOUNT_VOUCHER("DISCOUNT_VOUCHER"),
    
    LOYALTY_CARD("LOYALTY_CARD");

    private String value;

    VoucherTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoucherTypeEnum fromValue(String value) {
      for (VoucherTypeEnum b : VoucherTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<VoucherTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoucherTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoucherTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VoucherTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private VoucherTypeEnum voucherType = VoucherTypeEnum.DISCOUNT_VOUCHER;

  public static final String SERIALIZED_NAME_REDEEMABLE = "redeemable";
  @SerializedName(SERIALIZED_NAME_REDEEMABLE)
  private CustomerRedeemableRedeemable redeemable;

  public CustomerRedeemable() {
  }

  public CustomerRedeemable id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique redeemable holder identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomerRedeemable createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the redeemable was assigned. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CustomerRedeemable redeemableId(String redeemableId) {
    
    this.redeemableId = redeemableId;
    return this;
  }

   /**
   * Identifier of the redeemable item.
   * @return redeemableId
  **/
  @javax.annotation.Nullable
  public String getRedeemableId() {
    return redeemableId;
  }


  public void setRedeemableId(String redeemableId) {
    this.redeemableId = redeemableId;
  }


  public CustomerRedeemable redeemableObject(String redeemableObject) {
    
    this.redeemableObject = redeemableObject;
    return this;
  }

   /**
   * Type of the redeemable.
   * @return redeemableObject
  **/
  @javax.annotation.Nullable
  public String getRedeemableObject() {
    return redeemableObject;
  }


  public void setRedeemableObject(String redeemableObject) {
    this.redeemableObject = redeemableObject;
  }


  public CustomerRedeemable customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Identifier of the customer.
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public CustomerRedeemable holderRole(HolderRoleEnum holderRole) {
    
    this.holderRole = holderRole;
    return this;
  }

   /**
   * Role of the holder.
   * @return holderRole
  **/
  @javax.annotation.Nullable
  public HolderRoleEnum getHolderRole() {
    return holderRole;
  }


  public void setHolderRole(HolderRoleEnum holderRole) {
    this.holderRole = holderRole;
  }


  public CustomerRedeemable campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Unique campaign identifier, assigned by Voucherify.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public CustomerRedeemable campaignType(CampaignTypeEnum campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Defines the type of the campaign.
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public CampaignTypeEnum getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(CampaignTypeEnum campaignType) {
    this.campaignType = campaignType;
  }


  public CustomerRedeemable voucherType(VoucherTypeEnum voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * Defines the type of the voucher.
   * @return voucherType
  **/
  @javax.annotation.Nullable
  public VoucherTypeEnum getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(VoucherTypeEnum voucherType) {
    this.voucherType = voucherType;
  }


  public CustomerRedeemable redeemable(CustomerRedeemableRedeemable redeemable) {
    
    this.redeemable = redeemable;
    return this;
  }

   /**
   * Get redeemable
   * @return redeemable
  **/
  @javax.annotation.Nullable
  public CustomerRedeemableRedeemable getRedeemable() {
    return redeemable;
  }


  public void setRedeemable(CustomerRedeemableRedeemable redeemable) {
    this.redeemable = redeemable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRedeemable customerRedeemable = (CustomerRedeemable) o;
    return Objects.equals(this.id, customerRedeemable.id) &&
        Objects.equals(this.createdAt, customerRedeemable.createdAt) &&
        Objects.equals(this.redeemableId, customerRedeemable.redeemableId) &&
        Objects.equals(this.redeemableObject, customerRedeemable.redeemableObject) &&
        Objects.equals(this.customerId, customerRedeemable.customerId) &&
        Objects.equals(this.holderRole, customerRedeemable.holderRole) &&
        Objects.equals(this.campaignId, customerRedeemable.campaignId) &&
        Objects.equals(this.campaignType, customerRedeemable.campaignType) &&
        Objects.equals(this.voucherType, customerRedeemable.voucherType) &&
        Objects.equals(this.redeemable, customerRedeemable.redeemable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, redeemableId, redeemableObject, customerId, holderRole, campaignId, campaignType, voucherType, redeemable);
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
    sb.append("class CustomerRedeemable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    redeemableId: ").append(toIndentedString(redeemableId)).append("\n");
    sb.append("    redeemableObject: ").append(toIndentedString(redeemableObject)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    holderRole: ").append(toIndentedString(holderRole)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    redeemable: ").append(toIndentedString(redeemable)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("redeemable_id");
    openapiFields.add("redeemable_object");
    openapiFields.add("customer_id");
    openapiFields.add("holder_role");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_type");
    openapiFields.add("voucher_type");
    openapiFields.add("redeemable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerRedeemable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerRedeemable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerRedeemable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerRedeemable.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerRedeemable>() {
           @Override
           public void write(JsonWriter out, CustomerRedeemable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerRedeemable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerRedeemable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerRedeemable
  * @throws IOException if the JSON string is invalid with respect to CustomerRedeemable
  */
  public static CustomerRedeemable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerRedeemable.class);
  }

 /**
  * Convert an instance of CustomerRedeemable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

