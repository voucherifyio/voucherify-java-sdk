package io.voucherify.client.model.qualifications.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.order.Order;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class CheckEligibilityResponse {

  @JsonProperty("redeemables")
  private RedeemableResponse redeemable;

  @JsonProperty("tracking_id")
  private String trackingId;

  private Order order;

  @JsonProperty("stacking_rules")
  private StackingRuleResponse stackingRule;
}
