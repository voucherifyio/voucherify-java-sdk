package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.product.Product;
import io.voucherify.client.model.product.SKU;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class DiscountResponse {

  private String type;

  private String effect;

  @JsonProperty("amount_off")
  private Long amountOff;

  @JsonProperty("percent_off")
  private Double percentOff;

  @JsonProperty("fixed_amount")
  private Double fixedAmount;

  @JsonProperty("unit_off")
  private Long unitOff;

  @JsonProperty("unit_type")
  private String unitType;

  @JsonProperty("amount_limit")
  private Double amountLimit;

  @JsonProperty("aggregated_amount_limit")
  private Long aggregatedAmountLimit;

  @JsonProperty("amount_off_formula")
  private String amountOffFormula;

  @JsonProperty("percent_off_formula")
  private String percentOffFormula;

  @JsonProperty("fixed_amount_formula")
  private String fixedAmountFormula;

  @JsonProperty("unit_off_formula")
  private String unitOffFormula;

  private Product product;

  private SKU sku;

  @JsonProperty("is_dynamic")
  private Boolean isDynamic;
}