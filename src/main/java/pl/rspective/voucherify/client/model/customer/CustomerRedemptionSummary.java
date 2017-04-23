package pl.rspective.voucherify.client.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CustomerRedemptionSummary {

  @JsonProperty("total_redemeed")
  private int totalRedeemed;

  @JsonProperty("total_failed")
  private int totalFailed;

  @JsonProperty("total_succeeded")
  private int totalSucceeded;

  @JsonProperty("total_rolled_back")
  private int totalRolledBack;

  @JsonProperty("total_rollback_failed")
  private int totalRollbackFailed;

  @JsonProperty("total_rollback_succeeded")
  private int totalRollbackSucceeded;

  private GiftRedemptionSummary gift;

}
