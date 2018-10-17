package io.voucherify.client.model.promotion.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class TierSummaryOrders {

  @JsonProperty("total_amount")
  private Integer totalAmount;

  @JsonProperty("total_discount_amount")
  private Integer totalDiscountAmount;
}
