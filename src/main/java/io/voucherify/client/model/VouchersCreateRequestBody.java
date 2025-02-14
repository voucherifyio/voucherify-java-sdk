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
import io.voucherify.client.model.CodeConfig;
import io.voucherify.client.model.Discount;
import io.voucherify.client.model.Gift;
import io.voucherify.client.model.SimpleLoyaltyCard;
import io.voucherify.client.model.ValidityHours;
import io.voucherify.client.model.ValidityTimeframe;
import io.voucherify.client.model.VouchersCreateRequestBodyRedemption;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * VouchersCreateRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VouchersCreateRequestBody {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private String campaign;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private ValidityTimeframe validityTimeframe;

  /**
   * Gets or Sets validityDayOfWeek
   */
  @JsonAdapter(ValidityDayOfWeekEnum.Adapter.class)
  public enum ValidityDayOfWeekEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    ValidityDayOfWeekEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidityDayOfWeekEnum fromValue(Integer value) {
      for (ValidityDayOfWeekEnum b : ValidityDayOfWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ValidityDayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidityDayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidityDayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ValidityDayOfWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<ValidityDayOfWeekEnum> validityDayOfWeek;

  public static final String SERIALIZED_NAME_VALIDITY_HOURS = "validity_hours";
  @SerializedName(SERIALIZED_NAME_VALIDITY_HOURS)
  private ValidityHours validityHours;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_VALIDATION_RULES = "validation_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES)
  private List<String> validationRules;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private VouchersCreateRequestBodyRedemption redemption;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LOYALTY_CARD("LOYALTY_CARD"),
    
    GIFT_VOUCHER("GIFT_VOUCHER"),
    
    DISCOUNT_VOUCHER("DISCOUNT_VOUCHER");

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

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private SimpleLoyaltyCard loyaltyCard;

  public static final String SERIALIZED_NAME_CODE_CONFIG = "code_config";
  @SerializedName(SERIALIZED_NAME_CODE_CONFIG)
  private CodeConfig codeConfig;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private Gift gift;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Discount discount;

  public VouchersCreateRequestBody() {
  }

  public VouchersCreateRequestBody code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code that identifies a voucher. The pattern can use all the letters of the English alphabet, Arabic numerals, and special characters. Pass this attribute in the request body to create a distinct code. Otherwise, either use the &#x60;code_config&#x60; object to set the rules that the Voucherify API will use to create a random code, or don&#39;t pass any code and Voucherify will generate a random code.
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public VouchersCreateRequestBody campaign(String campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Identifies the voucher&#39;s parent campaign using a unique campaign name.
   * @return campaign
  **/
  @javax.annotation.Nullable
  public String getCampaign() {
    return campaign;
  }


  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }


  public VouchersCreateRequestBody campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Identifies the voucher&#39;s parent campaign using a unique campaign ID assigned by the Voucherify API.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public VouchersCreateRequestBody category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The name of the category that this voucher belongs to. Useful when listing vouchers with the [List Vouchers](ref:list-vouchers) endpoint.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public VouchersCreateRequestBody categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Unique identifier assigned by Voucherify to the name of the category that this voucher belongs to. Useful when listing vouchers with the [List Vouchers](ref:list-vouchers) endpoint.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public VouchersCreateRequestBody startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date defines when the code starts to be active. Activation timestamp is presented in the ISO 8601 format. Voucher is *inactive before* this date.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public VouchersCreateRequestBody expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date defines when the code expires. Expiration timestamp is presented in the ISO 8601 format.  Voucher is *inactive after* this date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public VouchersCreateRequestBody validityTimeframe(ValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public ValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(ValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public VouchersCreateRequestBody validityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public VouchersCreateRequestBody addValidityDayOfWeekItem(ValidityDayOfWeekEnum validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<ValidityDayOfWeekEnum> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public VouchersCreateRequestBody validityHours(ValidityHours validityHours) {
    
    this.validityHours = validityHours;
    return this;
  }

   /**
   * Get validityHours
   * @return validityHours
  **/
  @javax.annotation.Nullable
  public ValidityHours getValidityHours() {
    return validityHours;
  }


  public void setValidityHours(ValidityHours validityHours) {
    this.validityHours = validityHours;
  }


  public VouchersCreateRequestBody active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public VouchersCreateRequestBody additionalInfo(String additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * An optional field to keep any extra textual information about the code such as a code description and details.
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public VouchersCreateRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the code. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public VouchersCreateRequestBody validationRules(List<String> validationRules) {
    
    this.validationRules = validationRules;
    return this;
  }

  public VouchersCreateRequestBody addValidationRulesItem(String validationRulesItem) {
    if (this.validationRules == null) {
      this.validationRules = new ArrayList<>();
    }
    this.validationRules.add(validationRulesItem);
    return this;
  }

   /**
   * Array containing the ID of the validation rule associated with the voucher.
   * @return validationRules
  **/
  @javax.annotation.Nullable
  public List<String> getValidationRules() {
    return validationRules;
  }


  public void setValidationRules(List<String> validationRules) {
    this.validationRules = validationRules;
  }


  public VouchersCreateRequestBody redemption(VouchersCreateRequestBodyRedemption redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public VouchersCreateRequestBodyRedemption getRedemption() {
    return redemption;
  }


  public void setRedemption(VouchersCreateRequestBodyRedemption redemption) {
    this.redemption = redemption;
  }


  public VouchersCreateRequestBody type(TypeEnum type) {
    
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


  public VouchersCreateRequestBody loyaltyCard(SimpleLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public SimpleLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(SimpleLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }


  public VouchersCreateRequestBody codeConfig(CodeConfig codeConfig) {
    
    this.codeConfig = codeConfig;
    return this;
  }

   /**
   * Get codeConfig
   * @return codeConfig
  **/
  @javax.annotation.Nullable
  public CodeConfig getCodeConfig() {
    return codeConfig;
  }


  public void setCodeConfig(CodeConfig codeConfig) {
    this.codeConfig = codeConfig;
  }


  public VouchersCreateRequestBody gift(Gift gift) {
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nullable
  public Gift getGift() {
    return gift;
  }


  public void setGift(Gift gift) {
    this.gift = gift;
  }


  public VouchersCreateRequestBody discount(Discount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  public Discount getDiscount() {
    return discount;
  }


  public void setDiscount(Discount discount) {
    this.discount = discount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VouchersCreateRequestBody vouchersCreateRequestBody = (VouchersCreateRequestBody) o;
    return Objects.equals(this.code, vouchersCreateRequestBody.code) &&
        Objects.equals(this.campaign, vouchersCreateRequestBody.campaign) &&
        Objects.equals(this.campaignId, vouchersCreateRequestBody.campaignId) &&
        Objects.equals(this.category, vouchersCreateRequestBody.category) &&
        Objects.equals(this.categoryId, vouchersCreateRequestBody.categoryId) &&
        Objects.equals(this.startDate, vouchersCreateRequestBody.startDate) &&
        Objects.equals(this.expirationDate, vouchersCreateRequestBody.expirationDate) &&
        Objects.equals(this.validityTimeframe, vouchersCreateRequestBody.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, vouchersCreateRequestBody.validityDayOfWeek) &&
        Objects.equals(this.validityHours, vouchersCreateRequestBody.validityHours) &&
        Objects.equals(this.active, vouchersCreateRequestBody.active) &&
        Objects.equals(this.additionalInfo, vouchersCreateRequestBody.additionalInfo) &&
        Objects.equals(this.metadata, vouchersCreateRequestBody.metadata) &&
        Objects.equals(this.validationRules, vouchersCreateRequestBody.validationRules) &&
        Objects.equals(this.redemption, vouchersCreateRequestBody.redemption) &&
        Objects.equals(this.type, vouchersCreateRequestBody.type) &&
        Objects.equals(this.loyaltyCard, vouchersCreateRequestBody.loyaltyCard) &&
        Objects.equals(this.codeConfig, vouchersCreateRequestBody.codeConfig) &&
        Objects.equals(this.gift, vouchersCreateRequestBody.gift) &&
        Objects.equals(this.discount, vouchersCreateRequestBody.discount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, campaign, campaignId, category, categoryId, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours, active, additionalInfo, metadata, validationRules, redemption, type, loyaltyCard, codeConfig, gift, discount);
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
    sb.append("class VouchersCreateRequestBody {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    validityHours: ").append(toIndentedString(validityHours)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    validationRules: ").append(toIndentedString(validationRules)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
    sb.append("    codeConfig: ").append(toIndentedString(codeConfig)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("campaign");
    openapiFields.add("campaign_id");
    openapiFields.add("category");
    openapiFields.add("category_id");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("validity_hours");
    openapiFields.add("active");
    openapiFields.add("additional_info");
    openapiFields.add("metadata");
    openapiFields.add("validation_rules");
    openapiFields.add("redemption");
    openapiFields.add("type");
    openapiFields.add("loyalty_card");
    openapiFields.add("code_config");
    openapiFields.add("gift");
    openapiFields.add("discount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VouchersCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VouchersCreateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VouchersCreateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VouchersCreateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<VouchersCreateRequestBody>() {
           @Override
           public void write(JsonWriter out, VouchersCreateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VouchersCreateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VouchersCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VouchersCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to VouchersCreateRequestBody
  */
  public static VouchersCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VouchersCreateRequestBody.class);
  }

 /**
  * Convert an instance of VouchersCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

