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
import io.voucherify.client.model.ClientValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct;
import io.voucherify.client.model.DiscountUnitMultipleOneUnit;
import io.voucherify.client.model.SimpleSkuDiscountUnit;
import java.io.IOException;
import java.math.BigDecimal;
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
 * ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AMOUNT("AMOUNT"),
    
    UNIT("UNIT"),
    
    PERCENT("PERCENT"),
    
    FIXED("FIXED");

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

  public static final String SERIALIZED_NAME_AMOUNT_OFF = "amount_off";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OFF)
  private BigDecimal amountOff;

  public static final String SERIALIZED_NAME_AMOUNT_OFF_FORMULA = "amount_off_formula";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OFF_FORMULA)
  private String amountOffFormula;

  public static final String SERIALIZED_NAME_AGGREGATED_AMOUNT_LIMIT = "aggregated_amount_limit";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_AMOUNT_LIMIT)
  private Integer aggregatedAmountLimit;

  /**
   * Gets or Sets effect
   */
  @JsonAdapter(EffectEnum.Adapter.class)
  public enum EffectEnum {
    APPLY_TO_ORDER("APPLY_TO_ORDER"),
    
    APPLY_TO_ITEMS("APPLY_TO_ITEMS"),
    
    APPLY_TO_ITEMS_PROPORTIONALLY("APPLY_TO_ITEMS_PROPORTIONALLY"),
    
    APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY("APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY"),
    
    APPLY_TO_ITEMS_BY_QUANTITY("APPLY_TO_ITEMS_BY_QUANTITY"),
    
    ADD_MISSING_ITEMS("ADD_MISSING_ITEMS"),
    
    ADD_NEW_ITEMS("ADD_NEW_ITEMS"),
    
    ADD_MANY_ITEMS("ADD_MANY_ITEMS");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EffectEnum fromValue(String value) {
      for (EffectEnum b : EffectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<EffectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EffectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EffectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private EffectEnum effect;

  public static final String SERIALIZED_NAME_IS_DYNAMIC = "is_dynamic";
  @SerializedName(SERIALIZED_NAME_IS_DYNAMIC)
  private Boolean isDynamic;

  public static final String SERIALIZED_NAME_UNIT_OFF = "unit_off";
  @SerializedName(SERIALIZED_NAME_UNIT_OFF)
  private Integer unitOff;

  public static final String SERIALIZED_NAME_UNIT_OFF_FORMULA = "unit_off_formula";
  @SerializedName(SERIALIZED_NAME_UNIT_OFF_FORMULA)
  private String unitOffFormula;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unit_type";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private ClientValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct product;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private SimpleSkuDiscountUnit sku;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private List<DiscountUnitMultipleOneUnit> units;

  public static final String SERIALIZED_NAME_PERCENT_OFF = "percent_off";
  @SerializedName(SERIALIZED_NAME_PERCENT_OFF)
  private BigDecimal percentOff;

  public static final String SERIALIZED_NAME_PERCENT_OFF_FORMULA = "percent_off_formula";
  @SerializedName(SERIALIZED_NAME_PERCENT_OFF_FORMULA)
  private String percentOffFormula;

  public static final String SERIALIZED_NAME_AMOUNT_LIMIT = "amount_limit";
  @SerializedName(SERIALIZED_NAME_AMOUNT_LIMIT)
  private BigDecimal amountLimit;

  public static final String SERIALIZED_NAME_FIXED_AMOUNT = "fixed_amount";
  @SerializedName(SERIALIZED_NAME_FIXED_AMOUNT)
  private BigDecimal fixedAmount;

  public static final String SERIALIZED_NAME_FIXED_AMOUNT_FORMULA = "fixed_amount_formula";
  @SerializedName(SERIALIZED_NAME_FIXED_AMOUNT_FORMULA)
  private String fixedAmountFormula;

  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount() {
  }

  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount type(TypeEnum type) {
    
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


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount amountOff(BigDecimal amountOff) {
    
    this.amountOff = amountOff;
    return this;
  }

   /**
   * Amount taken off the subtotal of a price. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000.
   * @return amountOff
  **/
  @javax.annotation.Nullable
  public BigDecimal getAmountOff() {
    return amountOff;
  }


  public void setAmountOff(BigDecimal amountOff) {
    this.amountOff = amountOff;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount amountOffFormula(String amountOffFormula) {
    
    this.amountOffFormula = amountOffFormula;
    return this;
  }

   /**
   * Get amountOffFormula
   * @return amountOffFormula
  **/
  @javax.annotation.Nullable
  public String getAmountOffFormula() {
    return amountOffFormula;
  }


  public void setAmountOffFormula(String amountOffFormula) {
    this.amountOffFormula = amountOffFormula;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount aggregatedAmountLimit(Integer aggregatedAmountLimit) {
    
    this.aggregatedAmountLimit = aggregatedAmountLimit;
    return this;
  }

   /**
   * Maximum discount amount per order.
   * @return aggregatedAmountLimit
  **/
  @javax.annotation.Nullable
  public Integer getAggregatedAmountLimit() {
    return aggregatedAmountLimit;
  }


  public void setAggregatedAmountLimit(Integer aggregatedAmountLimit) {
    this.aggregatedAmountLimit = aggregatedAmountLimit;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount effect(EffectEnum effect) {
    
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @javax.annotation.Nullable
  public EffectEnum getEffect() {
    return effect;
  }


  public void setEffect(EffectEnum effect) {
    this.effect = effect;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount isDynamic(Boolean isDynamic) {
    
    this.isDynamic = isDynamic;
    return this;
  }

   /**
   * Flag indicating whether the discount was calculated using a formula.
   * @return isDynamic
  **/
  @javax.annotation.Nullable
  public Boolean getIsDynamic() {
    return isDynamic;
  }


  public void setIsDynamic(Boolean isDynamic) {
    this.isDynamic = isDynamic;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount unitOff(Integer unitOff) {
    
    this.unitOff = unitOff;
    return this;
  }

   /**
   * Number of units to be granted a full value discount.
   * @return unitOff
  **/
  @javax.annotation.Nullable
  public Integer getUnitOff() {
    return unitOff;
  }


  public void setUnitOff(Integer unitOff) {
    this.unitOff = unitOff;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount unitOffFormula(String unitOffFormula) {
    
    this.unitOffFormula = unitOffFormula;
    return this;
  }

   /**
   * Formula used to calculate the number of units.
   * @return unitOffFormula
  **/
  @javax.annotation.Nullable
  public String getUnitOffFormula() {
    return unitOffFormula;
  }


  public void setUnitOffFormula(String unitOffFormula) {
    this.unitOffFormula = unitOffFormula;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount unitType(String unitType) {
    
    this.unitType = unitType;
    return this;
  }

   /**
   * The product deemed as free, chosen from product inventory (e.g. time, items).
   * @return unitType
  **/
  @javax.annotation.Nullable
  public String getUnitType() {
    return unitType;
  }


  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount product(ClientValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct getProduct() {
    return product;
  }


  public void setProduct(ClientValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct product) {
    this.product = product;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount sku(SimpleSkuDiscountUnit sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  public SimpleSkuDiscountUnit getSku() {
    return sku;
  }


  public void setSku(SimpleSkuDiscountUnit sku) {
    this.sku = sku;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount units(List<DiscountUnitMultipleOneUnit> units) {
    
    this.units = units;
    return this;
  }

  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount addUnitsItem(DiscountUnitMultipleOneUnit unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  public List<DiscountUnitMultipleOneUnit> getUnits() {
    return units;
  }


  public void setUnits(List<DiscountUnitMultipleOneUnit> units) {
    this.units = units;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount percentOff(BigDecimal percentOff) {
    
    this.percentOff = percentOff;
    return this;
  }

   /**
   * The percent discount that the customer will receive.
   * @return percentOff
  **/
  @javax.annotation.Nullable
  public BigDecimal getPercentOff() {
    return percentOff;
  }


  public void setPercentOff(BigDecimal percentOff) {
    this.percentOff = percentOff;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount percentOffFormula(String percentOffFormula) {
    
    this.percentOffFormula = percentOffFormula;
    return this;
  }

   /**
   * Get percentOffFormula
   * @return percentOffFormula
  **/
  @javax.annotation.Nullable
  public String getPercentOffFormula() {
    return percentOffFormula;
  }


  public void setPercentOffFormula(String percentOffFormula) {
    this.percentOffFormula = percentOffFormula;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount amountLimit(BigDecimal amountLimit) {
    
    this.amountLimit = amountLimit;
    return this;
  }

   /**
   * Upper limit allowed to be applied as a discount. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount is written as 600.
   * @return amountLimit
  **/
  @javax.annotation.Nullable
  public BigDecimal getAmountLimit() {
    return amountLimit;
  }


  public void setAmountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount fixedAmount(BigDecimal fixedAmount) {
    
    this.fixedAmount = fixedAmount;
    return this;
  }

   /**
   * Sets a fixed value for an order total or the item price. The value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000. If the fixed amount is calculated by the formula, i.e. the &#x60;fixed_amount_formula&#x60; parameter is present in the fixed amount definition, this value becomes the **fallback value**. As a result, if the formula cannot be calculated due to missing metadata, for example, this value will be used as the fixed value.
   * @return fixedAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getFixedAmount() {
    return fixedAmount;
  }


  public void setFixedAmount(BigDecimal fixedAmount) {
    this.fixedAmount = fixedAmount;
  }


  public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount fixedAmountFormula(String fixedAmountFormula) {
    
    this.fixedAmountFormula = fixedAmountFormula;
    return this;
  }

   /**
   * Get fixedAmountFormula
   * @return fixedAmountFormula
  **/
  @javax.annotation.Nullable
  public String getFixedAmountFormula() {
    return fixedAmountFormula;
  }


  public void setFixedAmountFormula(String fixedAmountFormula) {
    this.fixedAmountFormula = fixedAmountFormula;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount clientValidationsValidateResponseBodyRedeemablesItemResultDiscount = (ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount) o;
    return Objects.equals(this.type, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.type) &&
        Objects.equals(this.amountOff, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.amountOff) &&
        Objects.equals(this.amountOffFormula, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.amountOffFormula) &&
        Objects.equals(this.aggregatedAmountLimit, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.aggregatedAmountLimit) &&
        Objects.equals(this.effect, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.effect) &&
        Objects.equals(this.isDynamic, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.isDynamic) &&
        Objects.equals(this.unitOff, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.unitOff) &&
        Objects.equals(this.unitOffFormula, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.unitOffFormula) &&
        Objects.equals(this.unitType, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.unitType) &&
        Objects.equals(this.product, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.product) &&
        Objects.equals(this.sku, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.sku) &&
        Objects.equals(this.units, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.units) &&
        Objects.equals(this.percentOff, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.percentOff) &&
        Objects.equals(this.percentOffFormula, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.percentOffFormula) &&
        Objects.equals(this.amountLimit, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.amountLimit) &&
        Objects.equals(this.fixedAmount, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.fixedAmount) &&
        Objects.equals(this.fixedAmountFormula, clientValidationsValidateResponseBodyRedeemablesItemResultDiscount.fixedAmountFormula);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amountOff, amountOffFormula, aggregatedAmountLimit, effect, isDynamic, unitOff, unitOffFormula, unitType, product, sku, units, percentOff, percentOffFormula, amountLimit, fixedAmount, fixedAmountFormula);
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
    sb.append("class ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountOff: ").append(toIndentedString(amountOff)).append("\n");
    sb.append("    amountOffFormula: ").append(toIndentedString(amountOffFormula)).append("\n");
    sb.append("    aggregatedAmountLimit: ").append(toIndentedString(aggregatedAmountLimit)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
    sb.append("    unitOff: ").append(toIndentedString(unitOff)).append("\n");
    sb.append("    unitOffFormula: ").append(toIndentedString(unitOffFormula)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    percentOff: ").append(toIndentedString(percentOff)).append("\n");
    sb.append("    percentOffFormula: ").append(toIndentedString(percentOffFormula)).append("\n");
    sb.append("    amountLimit: ").append(toIndentedString(amountLimit)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    fixedAmountFormula: ").append(toIndentedString(fixedAmountFormula)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("amount_off");
    openapiFields.add("amount_off_formula");
    openapiFields.add("aggregated_amount_limit");
    openapiFields.add("effect");
    openapiFields.add("is_dynamic");
    openapiFields.add("unit_off");
    openapiFields.add("unit_off_formula");
    openapiFields.add("unit_type");
    openapiFields.add("product");
    openapiFields.add("sku");
    openapiFields.add("units");
    openapiFields.add("percent_off");
    openapiFields.add("percent_off_formula");
    openapiFields.add("amount_limit");
    openapiFields.add("fixed_amount");
    openapiFields.add("fixed_amount_formula");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount>() {
           @Override
           public void write(JsonWriter out, ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount
  * @throws IOException if the JSON string is invalid with respect to ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount
  */
  public static ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount.class);
  }

 /**
  * Convert an instance of ClientValidationsValidateResponseBodyRedeemablesItemResultDiscount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

