package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.order.CreateOrder;
import io.voucherify.client.model.order.OrderItem;
import io.voucherify.client.model.order.UpdateOrder;
import io.voucherify.client.model.order.response.CreateOrderResponse;
import io.voucherify.client.model.order.response.GetOrderResponse;
import io.voucherify.client.model.order.response.ListOrdersResponse;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class OrdersModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateOrder() {
    // given
    CreateOrder createOrder =
        CreateOrder.builder()
            .amount(10L)
            .item(OrderItem.builder().productId("productId").quantity(10).build())
            .build();

    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 10}");

    // when
    CreateOrderResponse result = client.orders().create(createOrder);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems()).isEmpty();
    assertThat(result.getAmount()).isEqualTo(10);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldCreateOrderWithItemWithPrice() {
    // given
    CreateOrder createOrder =
        CreateOrder.builder()
            .amount(10L)
            .item(OrderItem.builder().productId("productId").quantity(10).price(1200L).build())
            .build();

    enqueueResponse(
        "{\"id\" : \"some-id\", \"items\": [ { \"product_id\" : \"productId\", \"quantity\" : 10, \"price\" : 1200} ], \"amount\": 10}");

    // when
    CreateOrderResponse result = client.orders().create(createOrder);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems().size()).isEqualTo(1);
    assertThat(result.getItems().get(0).getProductId()).isEqualTo("productId");
    assertThat(result.getItems().get(0).getQuantity()).isEqualTo(10);
    assertThat(result.getItems().get(0).getPrice()).isEqualTo(1200);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetOrder() {
    // given
    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 10}");

    // when
    GetOrderResponse result = client.orders().get("some-id");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems()).isEmpty();
    assertThat(result.getAmount()).isEqualTo(10);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldGetOrderWithItemWithPrice() {
    // given
    enqueueResponse(
        "{\"id\" : \"some-id\", \"items\": [ { \"product_id\" : \"productId\", \"quantity\" : 1, \"price\" : 10000} ], \"amount\": 10}");

    // when
    GetOrderResponse result = client.orders().get("some-id");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems().size()).isEqualTo(1);
    assertThat(result.getItems().get(0).getPrice()).isEqualTo(10000);
    assertThat(result.getItems().get(0).getQuantity()).isEqualTo(1);
    assertThat(result.getItems().get(0).getProductId()).isEqualTo("productId");
    assertThat(result.getAmount()).isEqualTo(10);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateOrder() {
    // given
    UpdateOrder updateOrder =
        UpdateOrder.builder()
            .amount(100L)
            .item(OrderItem.builder().productId("productId").quantity(10).build())
            .build();
    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 100}");

    // when
    GetOrderResponse result = client.orders().update("some-id", updateOrder);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems()).isEmpty();
    assertThat(result.getAmount()).isEqualTo(100);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldUpdateOrderWithItemWithPrice() {
    // given
    UpdateOrder updateOrder =
        UpdateOrder.builder()
            .amount(100L)
            .item(OrderItem.builder().productId("productId").quantity(10).price(5000L).build())
            .build();
    enqueueResponse(
        "{\"id\" : \"some-id\", \"items\": [ { \"product_id\" : \"productId\", \"quantity\" : 10, \"price\" : 5000} ], \"amount\": 100}");

    // when
    GetOrderResponse result = client.orders().update("some-id", updateOrder);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems().size()).isEqualTo(1);
    assertThat(result.getItems().get(0).getProductId()).isEqualTo("productId");
    assertThat(result.getItems().get(0).getQuantity()).isEqualTo(10);
    assertThat(result.getItems().get(0).getPrice()).isEqualTo(5000);
    assertThat(result.getAmount()).isEqualTo(100);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListOrders() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"orders\": [], \"total\": 2 }");

    // when
    ListOrdersResponse result = client.orders().list();

    // then
    assertThat(result).isNotNull();
    assertThat(result.getOrders()).isEmpty();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldCreateOrderAsync() {
    // given
    CreateOrder createOrder =
        CreateOrder.builder()
            .amount(10L)
            .item(OrderItem.builder().productId("productId").quantity(10).build())
            .build();

    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 10}");
    VoucherifyCallback callback = createCallback();

    // when
    client.orders().async().create(createOrder, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetOrderAsync() {
    // given
    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 10}");
    VoucherifyCallback callback = createCallback();

    // when
    client.orders().async().get("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateOrderAsync() {
    // given
    UpdateOrder updateOrder =
        UpdateOrder.builder()
            .amount(100L)
            .item(OrderItem.builder().productId("productId").quantity(10).build())
            .build();
    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 100}");
    VoucherifyCallback callback = createCallback();

    // when
    client.orders().async().update("some-id", updateOrder, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListOrdersAsync() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"orders\": [], \"total\": 2 }");
    VoucherifyCallback callback = createCallback();

    // when
    client.orders().async().list(callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldCreateOrderRxJava() {
    // given
    CreateOrder createOrder =
        CreateOrder.builder()
            .amount(10L)
            .item(OrderItem.builder().productId("productId").quantity(10).build())
            .build();

    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 10}");

    // when
    Observable<CreateOrderResponse> observable = client.orders().rx().create(createOrder);

    // then
    CreateOrderResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems()).isEmpty();
    assertThat(result.getAmount()).isEqualTo(10);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetOrderRxJava() {
    // given
    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 10}");

    // when
    Observable<GetOrderResponse> observable = client.orders().rx().get("some-id");

    // then
    GetOrderResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems()).isEmpty();
    assertThat(result.getAmount()).isEqualTo(10);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateOrderRxJava() {
    // given
    UpdateOrder updateOrder =
        UpdateOrder.builder()
            .amount(100L)
            .item(OrderItem.builder().productId("productId").quantity(10).build())
            .build();
    enqueueResponse("{\"id\" : \"some-id\", \"items\": [], \"amount\": 100}");

    // when
    Observable<GetOrderResponse> observable = client.orders().rx().update("some-id", updateOrder);

    // then
    GetOrderResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    assertThat(result.getItems()).isEmpty();
    assertThat(result.getAmount()).isEqualTo(100);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListOrdersRxJava() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"orders\": [], \"total\": 2 }");

    // when
    Observable<ListOrdersResponse> observable = client.orders().rx().list();

    // then
    ListOrdersResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getOrders()).isEmpty();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/orders");
    assertThat(request.getMethod()).isEqualTo("GET");
  }
}
