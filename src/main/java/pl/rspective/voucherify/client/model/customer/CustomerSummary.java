package pl.rspective.voucherify.client.model.customer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CustomerSummary {

  private CustomerRedemptionSummary redemptions;

  private CustomerOrderSummary orders;

}
