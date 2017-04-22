package pl.rspective.voucherify.client.model.redemption;

import lombok.*;
import pl.rspective.voucherify.client.model.customer.Customer;
import pl.rspective.voucherify.client.model.order.Order;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class RedeemVoucher {

  private Customer customer;

  private Order order;

  @Singular("medatadaEntry")
  private Map<String, Object> metadata;

}
