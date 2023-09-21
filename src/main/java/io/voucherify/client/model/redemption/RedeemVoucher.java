package io.voucherify.client.model.redemption;

import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.Order;
import io.voucherify.client.model.session.Session;
import lombok.*;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class RedeemVoucher {

    private Customer customer;

    private Order order;

    @Singular("metadataEntry")
    private Map<String, Object> metadata;

    private RedeemSession session;
}
