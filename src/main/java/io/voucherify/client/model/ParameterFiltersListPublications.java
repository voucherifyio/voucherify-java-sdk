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
import io.voucherify.client.model.ParameterFiltersListPublicationsCampaignName;
import io.voucherify.client.model.ParameterFiltersListPublicationsCustomerId;
import io.voucherify.client.model.ParameterFiltersListPublicationsFailureCode;
import io.voucherify.client.model.ParameterFiltersListPublicationsIsReferralCode;
import io.voucherify.client.model.ParameterFiltersListPublicationsParentObjectId;
import io.voucherify.client.model.ParameterFiltersListPublicationsRelatedObjectId;
import io.voucherify.client.model.ParameterFiltersListPublicationsResult;
import io.voucherify.client.model.ParameterFiltersListPublicationsSourceId;
import io.voucherify.client.model.ParameterFiltersListPublicationsVoucherType;
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
 * ParameterFiltersListPublications
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParameterFiltersListPublications {
  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private ParameterFiltersListPublicationsFailureCode failureCode;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ParameterFiltersListPublicationsResult result;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private ParameterFiltersListPublicationsCustomerId customerId;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private ParameterFiltersListPublicationsCampaignName campaignName;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private ParameterFiltersListPublicationsVoucherType voucherType;

  public static final String SERIALIZED_NAME_IS_REFERRAL_CODE = "is_referral_code";
  @SerializedName(SERIALIZED_NAME_IS_REFERRAL_CODE)
  private ParameterFiltersListPublicationsIsReferralCode isReferralCode;

  public static final String SERIALIZED_NAME_PARENT_OBJECT_ID = "parent_object_id";
  @SerializedName(SERIALIZED_NAME_PARENT_OBJECT_ID)
  private ParameterFiltersListPublicationsParentObjectId parentObjectId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private ParameterFiltersListPublicationsRelatedObjectId relatedObjectId;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private ParameterFiltersListPublicationsSourceId sourceId;

  public ParameterFiltersListPublications() {
  }

  public ParameterFiltersListPublications junction(Junction junction) {
    
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


  public ParameterFiltersListPublications failureCode(ParameterFiltersListPublicationsFailureCode failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Get failureCode
   * @return failureCode
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsFailureCode getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(ParameterFiltersListPublicationsFailureCode failureCode) {
    this.failureCode = failureCode;
  }


  public ParameterFiltersListPublications result(ParameterFiltersListPublicationsResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsResult getResult() {
    return result;
  }


  public void setResult(ParameterFiltersListPublicationsResult result) {
    this.result = result;
  }


  public ParameterFiltersListPublications customerId(ParameterFiltersListPublicationsCustomerId customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsCustomerId getCustomerId() {
    return customerId;
  }


  public void setCustomerId(ParameterFiltersListPublicationsCustomerId customerId) {
    this.customerId = customerId;
  }


  public ParameterFiltersListPublications campaignName(ParameterFiltersListPublicationsCampaignName campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsCampaignName getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(ParameterFiltersListPublicationsCampaignName campaignName) {
    this.campaignName = campaignName;
  }


  public ParameterFiltersListPublications voucherType(ParameterFiltersListPublicationsVoucherType voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * Get voucherType
   * @return voucherType
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsVoucherType getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(ParameterFiltersListPublicationsVoucherType voucherType) {
    this.voucherType = voucherType;
  }


  public ParameterFiltersListPublications isReferralCode(ParameterFiltersListPublicationsIsReferralCode isReferralCode) {
    
    this.isReferralCode = isReferralCode;
    return this;
  }

   /**
   * Get isReferralCode
   * @return isReferralCode
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsIsReferralCode getIsReferralCode() {
    return isReferralCode;
  }


  public void setIsReferralCode(ParameterFiltersListPublicationsIsReferralCode isReferralCode) {
    this.isReferralCode = isReferralCode;
  }


  public ParameterFiltersListPublications parentObjectId(ParameterFiltersListPublicationsParentObjectId parentObjectId) {
    
    this.parentObjectId = parentObjectId;
    return this;
  }

   /**
   * Get parentObjectId
   * @return parentObjectId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsParentObjectId getParentObjectId() {
    return parentObjectId;
  }


  public void setParentObjectId(ParameterFiltersListPublicationsParentObjectId parentObjectId) {
    this.parentObjectId = parentObjectId;
  }


  public ParameterFiltersListPublications relatedObjectId(ParameterFiltersListPublicationsRelatedObjectId relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * Get relatedObjectId
   * @return relatedObjectId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsRelatedObjectId getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(ParameterFiltersListPublicationsRelatedObjectId relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public ParameterFiltersListPublications sourceId(ParameterFiltersListPublicationsSourceId sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListPublicationsSourceId getSourceId() {
    return sourceId;
  }


  public void setSourceId(ParameterFiltersListPublicationsSourceId sourceId) {
    this.sourceId = sourceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterFiltersListPublications parameterFiltersListPublications = (ParameterFiltersListPublications) o;
    return Objects.equals(this.junction, parameterFiltersListPublications.junction) &&
        Objects.equals(this.failureCode, parameterFiltersListPublications.failureCode) &&
        Objects.equals(this.result, parameterFiltersListPublications.result) &&
        Objects.equals(this.customerId, parameterFiltersListPublications.customerId) &&
        Objects.equals(this.campaignName, parameterFiltersListPublications.campaignName) &&
        Objects.equals(this.voucherType, parameterFiltersListPublications.voucherType) &&
        Objects.equals(this.isReferralCode, parameterFiltersListPublications.isReferralCode) &&
        Objects.equals(this.parentObjectId, parameterFiltersListPublications.parentObjectId) &&
        Objects.equals(this.relatedObjectId, parameterFiltersListPublications.relatedObjectId) &&
        Objects.equals(this.sourceId, parameterFiltersListPublications.sourceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(junction, failureCode, result, customerId, campaignName, voucherType, isReferralCode, parentObjectId, relatedObjectId, sourceId);
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
    sb.append("class ParameterFiltersListPublications {\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    isReferralCode: ").append(toIndentedString(isReferralCode)).append("\n");
    sb.append("    parentObjectId: ").append(toIndentedString(parentObjectId)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
    openapiFields.add("failure_code");
    openapiFields.add("result");
    openapiFields.add("customer_id");
    openapiFields.add("campaign_name");
    openapiFields.add("voucher_type");
    openapiFields.add("is_referral_code");
    openapiFields.add("parent_object_id");
    openapiFields.add("related_object_id");
    openapiFields.add("source_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterFiltersListPublications.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterFiltersListPublications' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterFiltersListPublications> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterFiltersListPublications.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterFiltersListPublications>() {
           @Override
           public void write(JsonWriter out, ParameterFiltersListPublications value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterFiltersListPublications read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterFiltersListPublications given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterFiltersListPublications
  * @throws IOException if the JSON string is invalid with respect to ParameterFiltersListPublications
  */
  public static ParameterFiltersListPublications fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterFiltersListPublications.class);
  }

 /**
  * Convert an instance of ParameterFiltersListPublications to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

