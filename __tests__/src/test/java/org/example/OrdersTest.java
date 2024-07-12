package org.example;

import com.google.gson.JsonSyntaxException;

import org.example.data.Voucherify;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.voucherify.client.ApiClient;
import io.voucherify.client.api.*;
import io.voucherify.client.ApiException;
import io.voucherify.client.model.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.math.BigDecimal;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.example.helpers.JsonHelper;

public class OrdersTest {
    public static ApiClient defaultClient = null;
    public static OrdersApi ordersApi = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        ordersApi = new OrdersApi(defaultClient);
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void createOrderTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Orders/CreatedOrder.snapshot.json";
        OrdersCreateRequestBody createdOrder = createOrderRequestBody();

        try {
            OrdersCreateResponseBody createdOrderResponseBody = ordersApi.createOrder(createdOrder);
            Voucherify.getInstance().getOrder().setId(createdOrderResponseBody.getId());

            String responseBodyJson = JsonHelper.getObjectMapper().writeValueAsString(createdOrderResponseBody);
            String snapshot = JsonHelper.readJsonFile(snapshotPath);
            assertNotNull(createdOrderResponseBody);
            JSONAssert.assertEquals(snapshot, responseBodyJson, false);
        } catch (ApiException | IOException | JSONException | JsonSyntaxException e) {
            System.out.println(e);
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void getOrderTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Orders/GetOrder.snapshot.json";
        try {
            OrdersGetResponseBody orderResponseBody = ordersApi.getOrder(Voucherify.getInstance().getOrder().getId());

            String responseBodyJson = JsonHelper.getObjectMapper().writeValueAsString(orderResponseBody);
            String snapshot = JsonHelper.readJsonFile(snapshotPath);
            assertNotNull(orderResponseBody);
            JSONAssert.assertEquals(snapshot, responseBodyJson, false);
        } catch (ApiException | IOException | JSONException
                | JsonSyntaxException e) {
            fail();
        }

    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void updatePaidStatusOrderTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Orders/UpdatedOrder.snapshot.json";
        OrdersUpdateRequestBody updatedOrderRequestBody = updateOrderRequestBody();

        try {
            OrdersUpdateResponseBody updatedOrderResponseBody = ordersApi
                    .updateOrder(Voucherify.getInstance().getOrder().getId(), updatedOrderRequestBody);
            String responseBodyJson = JsonHelper.getObjectMapper().writeValueAsString(updatedOrderResponseBody);
            String snapshot = JsonHelper.readJsonFile(snapshotPath);

            assertNotNull(updatedOrderResponseBody);
            JSONAssert.assertEquals(snapshot, responseBodyJson, false);
        } catch (ApiException | IOException | JSONException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(4)
    public void listOrdersTest() {

        try {
            OrdersListResponseBody listedOrdersResponseBody = ordersApi.listOrders(10, 1, null);

            assertNotNull(listedOrdersResponseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    private static OrdersUpdateRequestBody updateOrderRequestBody() {
        OrdersUpdateRequestBody order = new OrdersUpdateRequestBody();
        order.setAmount(20000);
        order.setStatus(OrdersUpdateRequestBody.StatusEnum.PAID);

        return order;
    }

    private static OrdersCreateRequestBody createOrderRequestBody() {
        OrdersCreateRequestBody order = new OrdersCreateRequestBody();
        order.setAmount(10000);
        order.setStatus(OrdersCreateRequestBody.StatusEnum.CREATED);

        List<OrderItem> items = new ArrayList<>();
        items.add(createOrderItem("test_order_item1", 1));
        items.add(createOrderItem("test_order_item2", 1));
        order.setItems(items);

        return order;
    }

    private static OrderItem createOrderItem(String productId, int quantity) {
        OrderItem item = new OrderItem();
        item.setProductId(productId);
        item.setQuantity(quantity);
        return item;
    }
}
