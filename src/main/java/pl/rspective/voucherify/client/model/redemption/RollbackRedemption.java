package pl.rspective.voucherify.client.model.redemption;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.model.customer.Customer;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class RollbackRedemption {

  private Customer customer;

}
