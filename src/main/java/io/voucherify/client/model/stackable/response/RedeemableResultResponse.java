package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.redemption.response.GiftResponse;
import io.voucherify.client.model.redemption.response.LoyaltyCardResponse;
import io.voucherify.client.model.validation.response.VoucherValidationErrorResponse;
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

  @JsonProperty("error")
  private VoucherValidationErrorResponse voucherValidationError;
}
