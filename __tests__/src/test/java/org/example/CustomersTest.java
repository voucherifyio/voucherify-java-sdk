package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.CustomersApi;
import io.voucherify.client.model.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(2)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CustomersTest {
    public static ApiClient defaultClient = null;
    public static CustomersApi customers = null;
    private String sourceIdToDelete = "";

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        customers = new CustomersApi(defaultClient);
    }

    @Test
    @Order(1)
    public void createCustomersTest() {
        try {
            CustomersCreateResponseBody customersCreateResponseBody = customers
                    .createCustomer(new CustomersCreateRequestBody());
            CustomersCreateResponseBody customersCreateResponseBody2 = customers
                    .createCustomer(new CustomersCreateRequestBody());

            assertNotNull(customersCreateResponseBody.getId());
            assertNotNull(customersCreateResponseBody2.getId());

            Voucherify.getInstance().getCustomer().setId(customersCreateResponseBody.getId());
            this.sourceIdToDelete = customersCreateResponseBody2.getId();
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(2)
    public void updateCustomersInBulkTest() {
        try {
            List<CustomersUpdateInBulkRequestBody> customersUpdateInBulkRequestBody = new ArrayList<>();

            CustomersUpdateInBulkRequestBody customer1 = new CustomersUpdateInBulkRequestBody();
            CustomersUpdateInBulkRequestBody customer2 = new CustomersUpdateInBulkRequestBody();

            customer1.setSourceId(Utils.getAlphaNumericString(10));
            customer2.setSourceId(Utils.getAlphaNumericString(10));

            customersUpdateInBulkRequestBody.add(customer1);
            customersUpdateInBulkRequestBody.add(customer2);

            CustomersUpdateInBulkResponseBody responseBody = customers
                    .updateCustomersInBulk(customersUpdateInBulkRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void getCustomersTest() {
        try {
            CustomersListResponseBody responseBody = customers.listCustomers(
                    15,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(4)
    public void deleteCustomerTest() {
        try {
            customers.deleteCustomer(this.sourceIdToDelete);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
