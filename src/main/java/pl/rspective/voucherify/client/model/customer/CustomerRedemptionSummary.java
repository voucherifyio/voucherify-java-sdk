package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CustomerRedemptionSummary {

  @SerializedName("total_redemeed")
  private int totalRedeemed;

  @SerializedName("total_failed")
  private int totalFailed;

  @SerializedName("total_succeeded")
  private int totalSucceeded;

  @SerializedName("total_rolled_back")
  private int totalRolledBack;

  @SerializedName("total_rollback_failed")
  private int totalRollbackFailed;

  @SerializedName("total_rollback_succeeded")
  private int totalRollbackSucceeded;

  private GiftRedemptionSummary gift;

}
