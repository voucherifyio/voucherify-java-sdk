package pl.rspective.voucherify.client.model.redemption;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import pl.rspective.voucherify.client.model.customer.Customer;
import pl.rspective.voucherify.client.model.order.Order;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class RedeemVoucher {

  private Customer customer;

  private Order order;

  @Singular("medatadaEntry")
  private Map<String, Object> metadata;

}
