package io.voucherify.client.model.validationRules;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.Operator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@ToString
public class OrderValidationRules {

  private Junction junction;

  @JsonProperty("total_amount")
  @Singular("totalAmountCondition")
  private Map<Operator, List<Integer>> totalAmount;

  @JsonProperty("products_count")
  @Singular("productsCountCondition")
  private Map<Operator, List<Integer>> productsCount;

  @JsonProperty("all_orders_total_amount")
  @Singular("allOrdersTotalAmountCondition")
  private Map<Operator, List<Integer>> allOrdersTotalAmount;

  @JsonProperty("all_orders_discount_amount")
  @Singular("allOrdersDiscountAmountCondition")
  private Map<Operator, List<Integer>> allOrdersDiscountAmount;

}
