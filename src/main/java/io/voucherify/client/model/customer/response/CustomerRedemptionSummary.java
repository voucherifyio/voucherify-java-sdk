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
public class CustomerRedemptionSummary {

  @JsonProperty("total_redemeed")
  private Integer totalRedeemed;

  @JsonProperty("total_failed")
  private Integer totalFailed;

  @JsonProperty("total_succeeded")
  private Integer totalSucceeded;

  @JsonProperty("total_rolled_back")
  private Integer totalRolledBack;

  @JsonProperty("total_rollback_failed")
  private Integer totalRollbackFailed;

  @JsonProperty("total_rollback_succeeded")
  private Integer totalRollbackSucceeded;

  private GiftRedemptionSummary gift;
}
