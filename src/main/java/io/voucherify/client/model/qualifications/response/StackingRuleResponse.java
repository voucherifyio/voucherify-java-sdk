package io.voucherify.client.model.qualifications.response;

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
public class StackingRuleResponse {

  @JsonProperty("redeemables_limit")
  private Long redeemablesLimit;

  @JsonProperty("applicable_redeemables_limit")
  private Long applicableRedeemablesLimit;
}
