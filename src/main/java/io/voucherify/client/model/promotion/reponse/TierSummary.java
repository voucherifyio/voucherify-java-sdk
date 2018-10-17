package io.voucherify.client.model.promotion.reponse;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class TierSummary {

  private TierSummaryRedemptions redemptions;

  private TierSummaryOrders orders;
}
