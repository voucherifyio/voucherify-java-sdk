package io.voucherify;

import com.google.gson.JsonSyntaxException;

import io.voucherify.data.VoucherifyStore;
import io.voucherify.helpers.DeepMatch;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.voucherify.client.ApiClient;
import io.voucherify.client.api.*;
import io.voucherify.client.ApiException;
import io.voucherify.client.model.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@org.junit.jupiter.api.Order(11)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Orders/CreatedOrder.snapshot.json";
        OrdersCreateRequestBody createdOrder = createOrderRequestBody();

        try {
            OrdersCreateResponseBody createdOrderResponseBody = ordersApi.createOrder(createdOrder);
            VoucherifyStore.getInstance().getOrder().setId(createdOrderResponseBody.getId());

            List<String> keysToRemove = Arrays.asList("id", "createdAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, createdOrderResponseBody, keysToRemove));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void getOrderTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Orders/GetOrder.snapshot.json";
        try {
            OrdersGetResponseBody orderResponseBody = ordersApi
                    .getOrder(VoucherifyStore.getInstance().getOrder().getId());

            List<String> keysToRemove = Arrays.asList("id", "createdAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, orderResponseBody, keysToRemove));
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void updatePaidStatusOrderTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Orders/UpdatedOrder.snapshot.json";
        OrdersUpdateRequestBody updatedOrderRequestBody = updateOrderRequestBody();

        try {
            OrdersUpdateResponseBody updatedOrderResponseBody = ordersApi
                    .updateOrder(VoucherifyStore.getInstance().getOrder().getId(), updatedOrderRequestBody);

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "updatedAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, updatedOrderResponseBody, keysToRemove));
        } catch (Exception e) {
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