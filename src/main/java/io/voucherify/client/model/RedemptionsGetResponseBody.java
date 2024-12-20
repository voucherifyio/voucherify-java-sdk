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
import io.voucherify.client.model.RedemptionRewardResult;
import io.voucherify.client.model.RedemptionsGetResponseBodyChannel;
import io.voucherify.client.model.RedemptionsGetResponseBodyCustomer;
import io.voucherify.client.model.RedemptionsGetResponseBodyGift;
import io.voucherify.client.model.RedemptionsGetResponseBodyLoyaltyCard;
import io.voucherify.client.model.RedemptionsGetResponseBodyOrder;
import io.voucherify.client.model.RedemptionsGetResponseBodyPromotionTier;
import io.voucherify.client.model.RedemptionsGetResponseBodyRelatedRedemptions;
import io.voucherify.client.model.RedemptionsGetResponseBodyVoucher;
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
 * RedemptionsGetResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsGetResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets _object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    REDEMPTION("redemption"),
    
    REDEMPTION_ROLLBACK("redemption_rollback");

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
  private ObjectEnum _object;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private String redemption;

  /**
   * Redemption result.
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED"),
    
    ROLLED_BACK("ROLLED_BACK");

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
  private StatusEnum status;

  public static final String SERIALIZED_NAME_RELATED_REDEMPTIONS = "related_redemptions";
  @SerializedName(SERIALIZED_NAME_RELATED_REDEMPTIONS)
  private RedemptionsGetResponseBodyRelatedRedemptions relatedRedemptions;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private RedemptionsGetResponseBodyOrder order;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private RedemptionsGetResponseBodyChannel channel;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private RedemptionsGetResponseBodyCustomer customer;

  /**
   * Defines the related object.
   */
  @JsonAdapter(RelatedObjectTypeEnum.Adapter.class)
  public enum RelatedObjectTypeEnum {
    VOUCHER("voucher"),
    
    PROMOTION_TIER("promotion_tier"),
    
    REDEMPTION("redemption");

    private String value;

    RelatedObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelatedObjectTypeEnum fromValue(String value) {
      for (RelatedObjectTypeEnum b : RelatedObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<RelatedObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelatedObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelatedObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RelatedObjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "related_object_type";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  private RelatedObjectTypeEnum relatedObjectType;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private String relatedObjectId;

  public static final String SERIALIZED_NAME_PROMOTION_TIER = "promotion_tier";
  @SerializedName(SERIALIZED_NAME_PROMOTION_TIER)
  private RedemptionsGetResponseBodyPromotionTier promotionTier;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private RedemptionRewardResult reward;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private RedemptionsGetResponseBodyGift gift;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private RedemptionsGetResponseBodyLoyaltyCard loyaltyCard;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private RedemptionsGetResponseBodyVoucher voucher;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public RedemptionsGetResponseBody() {
  }

  public RedemptionsGetResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RedemptionsGetResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public RedemptionsGetResponseBody date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format.
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public RedemptionsGetResponseBody customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer ID of the redeeming customer.
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public RedemptionsGetResponseBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Hashed customer source ID.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public RedemptionsGetResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the redemption.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public RedemptionsGetResponseBody amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. and For gift cards, this represents the number of the credits restored to the card in the rolledback redemption. The number is a negative integer in the smallest currency unit, e.g. -100 cents for $1.00 added back to the card. For loyalty cards, this represents the number of loyalty points restored to the card in the rolledback redemption. The number is a negative integer.
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public RedemptionsGetResponseBody redemption(String redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Unique redemption ID of the parent redemption.
   * @return redemption
  **/
  @javax.annotation.Nullable
  public String getRedemption() {
    return redemption;
  }


  public void setRedemption(String redemption) {
    this.redemption = redemption;
  }


  public RedemptionsGetResponseBody result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Redemption result.
   * @return result
  **/
  @javax.annotation.Nullable
  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public RedemptionsGetResponseBody status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RedemptionsGetResponseBody relatedRedemptions(RedemptionsGetResponseBodyRelatedRedemptions relatedRedemptions) {
    
    this.relatedRedemptions = relatedRedemptions;
    return this;
  }

   /**
   * Get relatedRedemptions
   * @return relatedRedemptions
  **/
  @javax.annotation.Nullable
  public RedemptionsGetResponseBodyRelatedRedemptions getRelatedRedemptions() {
    return relatedRedemptions;
  }


  public void setRelatedRedemptions(RedemptionsGetResponseBodyRelatedRedemptions relatedRedemptions) {
    this.relatedRedemptions = relatedRedemptions;
  }


  public RedemptionsGetResponseBody failureCode(String failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed.
   * @return failureCode
  **/
  @javax.annotation.Nullable
  public String getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public RedemptionsGetResponseBody failureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed.
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  public String getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public RedemptionsGetResponseBody order(RedemptionsGetResponseBodyOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public RedemptionsGetResponseBodyOrder getOrder() {
    return order;
  }


  public void setOrder(RedemptionsGetResponseBodyOrder order) {
    this.order = order;
  }


  public RedemptionsGetResponseBody channel(RedemptionsGetResponseBodyChannel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  public RedemptionsGetResponseBodyChannel getChannel() {
    return channel;
  }


  public void setChannel(RedemptionsGetResponseBodyChannel channel) {
    this.channel = channel;
  }


  public RedemptionsGetResponseBody customer(RedemptionsGetResponseBodyCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public RedemptionsGetResponseBodyCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(RedemptionsGetResponseBodyCustomer customer) {
    this.customer = customer;
  }


  public RedemptionsGetResponseBody relatedObjectType(RelatedObjectTypeEnum relatedObjectType) {
    
    this.relatedObjectType = relatedObjectType;
    return this;
  }

   /**
   * Defines the related object.
   * @return relatedObjectType
  **/
  @javax.annotation.Nullable
  public RelatedObjectTypeEnum getRelatedObjectType() {
    return relatedObjectType;
  }


  public void setRelatedObjectType(RelatedObjectTypeEnum relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public RedemptionsGetResponseBody relatedObjectId(String relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * Get relatedObjectId
   * @return relatedObjectId
  **/
  @javax.annotation.Nullable
  public String getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public RedemptionsGetResponseBody promotionTier(RedemptionsGetResponseBodyPromotionTier promotionTier) {
    
    this.promotionTier = promotionTier;
    return this;
  }

   /**
   * Get promotionTier
   * @return promotionTier
  **/
  @javax.annotation.Nullable
  public RedemptionsGetResponseBodyPromotionTier getPromotionTier() {
    return promotionTier;
  }


  public void setPromotionTier(RedemptionsGetResponseBodyPromotionTier promotionTier) {
    this.promotionTier = promotionTier;
  }


  public RedemptionsGetResponseBody reward(RedemptionRewardResult reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nullable
  public RedemptionRewardResult getReward() {
    return reward;
  }


  public void setReward(RedemptionRewardResult reward) {
    this.reward = reward;
  }


  public RedemptionsGetResponseBody gift(RedemptionsGetResponseBodyGift gift) {
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nullable
  public RedemptionsGetResponseBodyGift getGift() {
    return gift;
  }


  public void setGift(RedemptionsGetResponseBodyGift gift) {
    this.gift = gift;
  }


  public RedemptionsGetResponseBody loyaltyCard(RedemptionsGetResponseBodyLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public RedemptionsGetResponseBodyLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(RedemptionsGetResponseBodyLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }


  public RedemptionsGetResponseBody voucher(RedemptionsGetResponseBodyVoucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public RedemptionsGetResponseBodyVoucher getVoucher() {
    return voucher;
  }


  public void setVoucher(RedemptionsGetResponseBodyVoucher voucher) {
    this.voucher = voucher;
  }


  public RedemptionsGetResponseBody reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * System generated cause for the redemption being invalid in the context of the provided parameters.
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionsGetResponseBody redemptionsGetResponseBody = (RedemptionsGetResponseBody) o;
    return Objects.equals(this.id, redemptionsGetResponseBody.id) &&
        Objects.equals(this._object, redemptionsGetResponseBody._object) &&
        Objects.equals(this.date, redemptionsGetResponseBody.date) &&
        Objects.equals(this.customerId, redemptionsGetResponseBody.customerId) &&
        Objects.equals(this.trackingId, redemptionsGetResponseBody.trackingId) &&
        Objects.equals(this.metadata, redemptionsGetResponseBody.metadata) &&
        Objects.equals(this.amount, redemptionsGetResponseBody.amount) &&
        Objects.equals(this.redemption, redemptionsGetResponseBody.redemption) &&
        Objects.equals(this.result, redemptionsGetResponseBody.result) &&
        Objects.equals(this.status, redemptionsGetResponseBody.status) &&
        Objects.equals(this.relatedRedemptions, redemptionsGetResponseBody.relatedRedemptions) &&
        Objects.equals(this.failureCode, redemptionsGetResponseBody.failureCode) &&
        Objects.equals(this.failureMessage, redemptionsGetResponseBody.failureMessage) &&
        Objects.equals(this.order, redemptionsGetResponseBody.order) &&
        Objects.equals(this.channel, redemptionsGetResponseBody.channel) &&
        Objects.equals(this.customer, redemptionsGetResponseBody.customer) &&
        Objects.equals(this.relatedObjectType, redemptionsGetResponseBody.relatedObjectType) &&
        Objects.equals(this.relatedObjectId, redemptionsGetResponseBody.relatedObjectId) &&
        Objects.equals(this.promotionTier, redemptionsGetResponseBody.promotionTier) &&
        Objects.equals(this.reward, redemptionsGetResponseBody.reward) &&
        Objects.equals(this.gift, redemptionsGetResponseBody.gift) &&
        Objects.equals(this.loyaltyCard, redemptionsGetResponseBody.loyaltyCard) &&
        Objects.equals(this.voucher, redemptionsGetResponseBody.voucher) &&
        Objects.equals(this.reason, redemptionsGetResponseBody.reason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, date, customerId, trackingId, metadata, amount, redemption, result, status, relatedRedemptions, failureCode, failureMessage, order, channel, customer, relatedObjectType, relatedObjectId, promotionTier, reward, gift, loyaltyCard, voucher, reason);
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
    sb.append("class RedemptionsGetResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    relatedRedemptions: ").append(toIndentedString(relatedRedemptions)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    promotionTier: ").append(toIndentedString(promotionTier)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("customer_id");
    openapiFields.add("tracking_id");
    openapiFields.add("metadata");
    openapiFields.add("amount");
    openapiFields.add("redemption");
    openapiFields.add("result");
    openapiFields.add("status");
    openapiFields.add("related_redemptions");
    openapiFields.add("failure_code");
    openapiFields.add("failure_message");
    openapiFields.add("order");
    openapiFields.add("channel");
    openapiFields.add("customer");
    openapiFields.add("related_object_type");
    openapiFields.add("related_object_id");
    openapiFields.add("promotion_tier");
    openapiFields.add("reward");
    openapiFields.add("gift");
    openapiFields.add("loyalty_card");
    openapiFields.add("voucher");
    openapiFields.add("reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsGetResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsGetResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsGetResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsGetResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsGetResponseBody>() {
           @Override
           public void write(JsonWriter out, RedemptionsGetResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedemptionsGetResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedemptionsGetResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsGetResponseBody
  * @throws IOException if the JSON string is invalid with respect to RedemptionsGetResponseBody
  */
  public static RedemptionsGetResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsGetResponseBody.class);
  }

 /**
  * Convert an instance of RedemptionsGetResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

