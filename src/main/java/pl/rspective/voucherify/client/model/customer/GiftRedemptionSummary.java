package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class GiftRedemptionSummary {

  @SerializedName("redeemed_amount")
  private int redeemedAmount;

  @SerializedName("amount_to_go")
  private int amountToGo;

}
