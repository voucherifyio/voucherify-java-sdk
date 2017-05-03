package io.voucherify.client.model.validation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.Order;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class VoucherValidation {

  private Customer customer;

  private Order order;
}
