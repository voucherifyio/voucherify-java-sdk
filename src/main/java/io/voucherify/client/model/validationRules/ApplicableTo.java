package io.voucherify.client.model.validationRules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class ApplicableTo {

  private ApplicableToObjectType object;

  private String id;

  @JsonProperty("source_id")
  private String sourceId;

  @JsonProperty("product_id")
  private String productId;

  @JsonProperty("product_source_id")
  private String productSourceId;

  private Boolean strict;

  private Double price;

  @JsonProperty("price_formula")
  private Double priceFormula;

  private ApplicableToEffect effect;

  @JsonProperty("quantity_limit")
  private Integer quantityLimit;

  @JsonProperty("aggregated_quantity_limit")
  private Integer aggregatedQuantityLimit;

  @JsonProperty("amount_limit")
  private Integer amountLimit;

  @JsonProperty("aggregated_amount_limit")
  private Integer aggregatedAmountLimit;

  @JsonProperty("order_item_indices")
  private List<Integer> orderItemIndices;
}
