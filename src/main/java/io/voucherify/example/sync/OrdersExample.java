package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.CreateOrder;
import io.voucherify.client.model.order.OrderItem;
import io.voucherify.client.model.order.UpdateOrder;
import io.voucherify.client.model.order.response.CreateOrderResponse;
import io.voucherify.client.model.order.response.GetOrderResponse;
import io.voucherify.client.model.order.response.ListOrdersResponse;

public class OrdersExample extends AbsExample {

  public OrdersExample(VoucherifyClient client) {
    super(client);
  }

  @Override
  public void example() {
    CreateOrder createOrder =
        CreateOrder.builder()
            .item(OrderItem.builder().quantity(10).productId("id").build())
            .amount(10L)
            .customer(Customer.builder().email("sth@sth.com").name("test").build())
            .build();

    CreateOrderResponse createOrderResponse = client.orders().create(createOrder);
    System.out.print(createOrderResponse);

    GetOrderResponse getOrderResponse = client.orders().get(createOrderResponse.getId());
    System.out.print(getOrderResponse);

    UpdateOrder updateOrder = UpdateOrder.builder().amount(5L).build();

    GetOrderResponse updateOrderResponse =
        client.orders().update(getOrderResponse.getId(), updateOrder);
    System.out.print(updateOrderResponse);

    ListOrdersResponse list = client.orders().list();
    System.out.print(list);
  }
}
