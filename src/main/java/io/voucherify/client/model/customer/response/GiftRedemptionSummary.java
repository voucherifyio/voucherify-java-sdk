package io.voucherify.client.model.customer.response;

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
public class GiftRedemptionSummary {

  @JsonProperty("redeemed_amount")
  private long redeemedAmount;

  @JsonProperty("amount_to_go")
  private long amountToGo;
}
