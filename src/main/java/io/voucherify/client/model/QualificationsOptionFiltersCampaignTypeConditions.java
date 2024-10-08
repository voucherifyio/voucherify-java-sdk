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
import io.voucherify.client.model.ParameterCampaignType;
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
 * Data filters used to narrow down the data records to be returned in the result.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QualificationsOptionFiltersCampaignTypeConditions {
  public static final String SERIALIZED_NAME_$_IS = "$is";
  @SerializedName(SERIALIZED_NAME_$_IS)
  private List<ParameterCampaignType> $is;

  public static final String SERIALIZED_NAME_$_IS_NOT = "$is_not";
  @SerializedName(SERIALIZED_NAME_$_IS_NOT)
  private List<ParameterCampaignType> $isNot;

  public static final String SERIALIZED_NAME_$_IN = "$in";
  @SerializedName(SERIALIZED_NAME_$_IN)
  private List<ParameterCampaignType> $in;

  public static final String SERIALIZED_NAME_$_NOT_IN = "$not_in";
  @SerializedName(SERIALIZED_NAME_$_NOT_IN)
  private List<ParameterCampaignType> $notIn;

  public QualificationsOptionFiltersCampaignTypeConditions() {
  }

  public QualificationsOptionFiltersCampaignTypeConditions $is(List<ParameterCampaignType> $is) {
    
    this.$is = $is;
    return this;
  }

  public QualificationsOptionFiltersCampaignTypeConditions add$IsItem(ParameterCampaignType $isItem) {
    if (this.$is == null) {
      this.$is = new ArrayList<>();
    }
    this.$is.add($isItem);
    return this;
  }

   /**
   * Get $is
   * @return $is
  **/
  @javax.annotation.Nullable
  public List<ParameterCampaignType> get$Is() {
    return $is;
  }


  public void set$Is(List<ParameterCampaignType> $is) {
    this.$is = $is;
  }


  public QualificationsOptionFiltersCampaignTypeConditions $isNot(List<ParameterCampaignType> $isNot) {
    
    this.$isNot = $isNot;
    return this;
  }

  public QualificationsOptionFiltersCampaignTypeConditions add$IsNotItem(ParameterCampaignType $isNotItem) {
    if (this.$isNot == null) {
      this.$isNot = new ArrayList<>();
    }
    this.$isNot.add($isNotItem);
    return this;
  }

   /**
   * Get $isNot
   * @return $isNot
  **/
  @javax.annotation.Nullable
  public List<ParameterCampaignType> get$IsNot() {
    return $isNot;
  }


  public void set$IsNot(List<ParameterCampaignType> $isNot) {
    this.$isNot = $isNot;
  }


  public QualificationsOptionFiltersCampaignTypeConditions $in(List<ParameterCampaignType> $in) {
    
    this.$in = $in;
    return this;
  }

  public QualificationsOptionFiltersCampaignTypeConditions add$InItem(ParameterCampaignType $inItem) {
    if (this.$in == null) {
      this.$in = new ArrayList<>();
    }
    this.$in.add($inItem);
    return this;
  }

   /**
   * Get $in
   * @return $in
  **/
  @javax.annotation.Nullable
  public List<ParameterCampaignType> get$In() {
    return $in;
  }


  public void set$In(List<ParameterCampaignType> $in) {
    this.$in = $in;
  }


  public QualificationsOptionFiltersCampaignTypeConditions $notIn(List<ParameterCampaignType> $notIn) {
    
    this.$notIn = $notIn;
    return this;
  }

  public QualificationsOptionFiltersCampaignTypeConditions add$NotInItem(ParameterCampaignType $notInItem) {
    if (this.$notIn == null) {
      this.$notIn = new ArrayList<>();
    }
    this.$notIn.add($notInItem);
    return this;
  }

   /**
   * Get $notIn
   * @return $notIn
  **/
  @javax.annotation.Nullable
  public List<ParameterCampaignType> get$NotIn() {
    return $notIn;
  }


  public void set$NotIn(List<ParameterCampaignType> $notIn) {
    this.$notIn = $notIn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationsOptionFiltersCampaignTypeConditions qualificationsOptionFiltersCampaignTypeConditions = (QualificationsOptionFiltersCampaignTypeConditions) o;
    return Objects.equals(this.$is, qualificationsOptionFiltersCampaignTypeConditions.$is) &&
        Objects.equals(this.$isNot, qualificationsOptionFiltersCampaignTypeConditions.$isNot) &&
        Objects.equals(this.$in, qualificationsOptionFiltersCampaignTypeConditions.$in) &&
        Objects.equals(this.$notIn, qualificationsOptionFiltersCampaignTypeConditions.$notIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash($is, $isNot, $in, $notIn);
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
    sb.append("class QualificationsOptionFiltersCampaignTypeConditions {\n");
    sb.append("    $is: ").append(toIndentedString($is)).append("\n");
    sb.append("    $isNot: ").append(toIndentedString($isNot)).append("\n");
    sb.append("    $in: ").append(toIndentedString($in)).append("\n");
    sb.append("    $notIn: ").append(toIndentedString($notIn)).append("\n");
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
    openapiFields.add("$is");
    openapiFields.add("$is_not");
    openapiFields.add("$in");
    openapiFields.add("$not_in");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationsOptionFiltersCampaignTypeConditions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationsOptionFiltersCampaignTypeConditions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationsOptionFiltersCampaignTypeConditions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationsOptionFiltersCampaignTypeConditions.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationsOptionFiltersCampaignTypeConditions>() {
           @Override
           public void write(JsonWriter out, QualificationsOptionFiltersCampaignTypeConditions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QualificationsOptionFiltersCampaignTypeConditions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QualificationsOptionFiltersCampaignTypeConditions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationsOptionFiltersCampaignTypeConditions
  * @throws IOException if the JSON string is invalid with respect to QualificationsOptionFiltersCampaignTypeConditions
  */
  public static QualificationsOptionFiltersCampaignTypeConditions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationsOptionFiltersCampaignTypeConditions.class);
  }

 /**
  * Convert an instance of QualificationsOptionFiltersCampaignTypeConditions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

