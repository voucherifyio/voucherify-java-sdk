package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.product.Product;
import io.voucherify.client.model.product.SKU;
import io.voucherify.client.model.voucher.DiscountEffect;
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

  @JsonProperty("effect")
  private DiscountEffect effect;

  @JsonProperty("amount_off")
  private Long amountOff;

  @JsonProperty("percent_off")
  private Double percentOff;

  @JsonProperty("fixed_amount")
  private Double fixedAmount;

  @JsonProperty("fixed_amount_formula")
  private String fixedAmountFormula;

  @JsonProperty("percent_off_formula")
  private String percentOffFormula;

  @JsonProperty("amount_limit")
  private Double amountLimit;

  @JsonProperty("amount_off_formula")
  private String amountOffFormula;

  @JsonProperty("aggregated_amount_limit")
  private Long aggregatedAmountLimit;

  @JsonProperty("unit_off")
  private Long unitOff;

  @JsonProperty("unit_off_formula")
  private String unitOffFormula;

  @JsonProperty("unit_type")
  private String unitType;

  private Product product;

  private SKU sku;

  @JsonProperty("is_dynamic")
  private Boolean isDynamic;
}