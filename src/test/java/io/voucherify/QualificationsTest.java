package io.voucherify;

import com.google.gson.JsonSyntaxException;
import io.voucherify.data.VoucherifyStore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.QualificationsApi;
import io.voucherify.client.model.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.Order(10)
public class QualificationsTest {
    public static ApiClient defaultClient = null;
    public static QualificationsApi qualifications = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        qualifications = new QualificationsApi(defaultClient);
    }

    @Test
    public void checkEligibilityTest() {
        try {
            QualificationsCheckEligibilityRequestBody qualificationsCheckEligibilityRequestBody = new QualificationsCheckEligibilityRequestBody();

            Customer customer = new Customer();
            customer.setId(VoucherifyStore.getInstance().getCustomer().getId());
            qualificationsCheckEligibilityRequestBody.setCustomer(customer);

            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(VoucherifyStore.getInstance().getProducts().get(0).getId());
            orderItem.setQuantity(1);
            orderItem.setAmount(100);

            ArrayList<OrderItem> orderItems = new ArrayList<>();
            orderItems.add(orderItem);

            Order order = new Order();
            order.setItems(orderItems);

            qualificationsCheckEligibilityRequestBody.setOrder(order);

            QualificationsCheckEligibilityResponseBody responseBody = qualifications
                    .checkEligibility(qualificationsCheckEligibilityRequestBody);

            assertFalse(responseBody.getRedeemables().getData().isEmpty());
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
