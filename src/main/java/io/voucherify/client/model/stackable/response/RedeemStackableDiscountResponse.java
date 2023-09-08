package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.order.response.OrderResponse;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedeemStackableDiscountResponse {

  private List<RedemptionResponse> redemptions;

  private OrderResponse order;

  @JsonProperty("parent_redemption")
  private RedemptionResponse parentRedemption;

  @JsonProperty("inapplicable_redeemables")
  private List<InapplicableRedeemableResponse> inapplicableRedeemables;

  @JsonProperty("skipped_redeemables")
  private List<SkippedRedeemableResponse> skippedRedeemables;
}
