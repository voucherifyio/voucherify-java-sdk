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
import io.voucherify.client.model.LoyaltiesRewardsCreateAssignmentItemRequestBodyParameters;
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
 * LoyaltiesRewardsCreateAssignmentItemRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesRewardsCreateAssignmentItemRequestBody {
  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private String reward;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private LoyaltiesRewardsCreateAssignmentItemRequestBodyParameters parameters;

  public static final String SERIALIZED_NAME_VALIDATION_RULES = "validation_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES)
  private List<String> validationRules;

  public LoyaltiesRewardsCreateAssignmentItemRequestBody() {
  }

  public LoyaltiesRewardsCreateAssignmentItemRequestBody reward(String reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * The ID of the reward that will be assigned to the campaign.
   * @return reward
  **/
  @javax.annotation.Nullable
  public String getReward() {
    return reward;
  }


  public void setReward(String reward) {
    this.reward = reward;
  }


  public LoyaltiesRewardsCreateAssignmentItemRequestBody parameters(LoyaltiesRewardsCreateAssignmentItemRequestBodyParameters parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public LoyaltiesRewardsCreateAssignmentItemRequestBodyParameters getParameters() {
    return parameters;
  }


  public void setParameters(LoyaltiesRewardsCreateAssignmentItemRequestBodyParameters parameters) {
    this.parameters = parameters;
  }


  public LoyaltiesRewardsCreateAssignmentItemRequestBody validationRules(List<String> validationRules) {
    
    this.validationRules = validationRules;
    return this;
  }

  public LoyaltiesRewardsCreateAssignmentItemRequestBody addValidationRulesItem(String validationRulesItem) {
    if (this.validationRules == null) {
      this.validationRules = new ArrayList<>();
    }
    this.validationRules.add(validationRulesItem);
    return this;
  }

   /**
   * Get validationRules
   * @return validationRules
  **/
  @javax.annotation.Nullable
  public List<String> getValidationRules() {
    return validationRules;
  }


  public void setValidationRules(List<String> validationRules) {
    this.validationRules = validationRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesRewardsCreateAssignmentItemRequestBody loyaltiesRewardsCreateAssignmentItemRequestBody = (LoyaltiesRewardsCreateAssignmentItemRequestBody) o;
    return Objects.equals(this.reward, loyaltiesRewardsCreateAssignmentItemRequestBody.reward) &&
        Objects.equals(this.parameters, loyaltiesRewardsCreateAssignmentItemRequestBody.parameters) &&
        Objects.equals(this.validationRules, loyaltiesRewardsCreateAssignmentItemRequestBody.validationRules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reward, parameters, validationRules);
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
    sb.append("class LoyaltiesRewardsCreateAssignmentItemRequestBody {\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    validationRules: ").append(toIndentedString(validationRules)).append("\n");
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
    openapiFields.add("reward");
    openapiFields.add("parameters");
    openapiFields.add("validation_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesRewardsCreateAssignmentItemRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesRewardsCreateAssignmentItemRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesRewardsCreateAssignmentItemRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesRewardsCreateAssignmentItemRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesRewardsCreateAssignmentItemRequestBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesRewardsCreateAssignmentItemRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesRewardsCreateAssignmentItemRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesRewardsCreateAssignmentItemRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesRewardsCreateAssignmentItemRequestBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesRewardsCreateAssignmentItemRequestBody
  */
  public static LoyaltiesRewardsCreateAssignmentItemRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesRewardsCreateAssignmentItemRequestBody.class);
  }

 /**
  * Convert an instance of LoyaltiesRewardsCreateAssignmentItemRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

