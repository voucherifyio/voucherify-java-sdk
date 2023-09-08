package io.voucherify.client.model.stackable.response;

import io.voucherify.client.model.redemption.response.GiftResponse;
import io.voucherify.client.model.redemption.response.LoyaltyCardResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedeemableResultResponse {

  private DiscountResponse discount;

  private GiftResponse gift;

  private LoyaltyCardResponse loyaltyCard;

  //TODO: Add VoucherValidationErrorResponse after merge
}
