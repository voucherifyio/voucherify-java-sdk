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
  private Long totalRedeemed;

  @JsonProperty("total_failed")
  private Long totalFailed;

  @JsonProperty("total_succeeded")
  private Long totalSucceeded;

  @JsonProperty("total_rolled_back")
  private Long totalRolledBack;

  @JsonProperty("total_rollback_failed")
  private Long totalRollbackFailed;

  @JsonProperty("total_rollback_succeeded")
  private Long totalRollbackSucceeded;

  private GiftRedemptionSummary gift;
}
