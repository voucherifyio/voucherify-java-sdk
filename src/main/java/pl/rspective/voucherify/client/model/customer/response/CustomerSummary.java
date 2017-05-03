package pl.rspective.voucherify.client.model.customer.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
class CustomerSummary {

  private CustomerRedemptionSummary redemptions;

  private CustomerOrderSummary orders;

}
