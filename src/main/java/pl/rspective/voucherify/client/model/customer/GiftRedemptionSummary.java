package pl.rspective.voucherify.client.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class GiftRedemptionSummary {

  @JsonProperty("redeemed_amount")
  private int redeemedAmount;

  @JsonProperty("amount_to_go")
  private int amountToGo;

}
