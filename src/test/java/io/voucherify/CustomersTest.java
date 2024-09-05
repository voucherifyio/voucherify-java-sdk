package io.voucherify;

import com.google.gson.JsonSyntaxException;
import io.voucherify.data.VoucherifyStore;
import io.voucherify.helpers.JsonHelper;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.CustomersApi;
import io.voucherify.client.model.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@org.junit.jupiter.api.Order(2)
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
    @org.junit.jupiter.api.Order(1)
    public void createCustomersTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Customers/CreatedCustomer.snapshot.json";

        try {
            CustomersCreateResponseBody customersCreateResponseBody = customers
                    .createCustomer(new CustomersCreateRequestBody());
            CustomersCreateResponseBody customersCreateResponseBody2 = customers
                    .createCustomer(new CustomersCreateRequestBody());

            List<String> keysToRemove = Arrays.asList("id", "createdAt");
            //JsonHelper.checkStrictAssertEquals(snapshotPath, customersCreateResponseBody, keysToRemove);

            VoucherifyStore.getInstance().getCustomer().setId(customersCreateResponseBody.getId());
            this.sourceIdToDelete = customersCreateResponseBody2.getId();
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
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
    @org.junit.jupiter.api.Order(3)
    public void getCustomersTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Customers/ListedCustomers.snapshot.json";
        try {
            CustomersListResponseBody responseBody = customers.listCustomers(
                    2,
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

            List<String> keysToRemove = Arrays.asList("id", "sourceId", "createdAt", "total");
            //JsonHelper.checkStrictAssertEquals(snapshotPath, responseBody, keysToRemove);

        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(4)
    public void deleteCustomerTest() {
        try {
            customers.deleteCustomer(this.sourceIdToDelete);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(5)
    public void uploadCsvFileWithCustomersTest() {
        try {
            File csvFile = new File("src/test/java/io/voucherify/helpers/test-csv.csv");
            List<String> lines = Files.readAllLines(csvFile.toPath(), StandardCharsets.UTF_8);
            StringBuilder csvContent = new StringBuilder();
            for (String line : lines) {
                csvContent.append(line).append(System.lineSeparator());
            }

            CustomersImportCsvCreateResponseBody result = customers.importCustomersUsingCsv(csvFile);

            assertNotNull(result);
        } catch (IOException | ApiException e) {
            e.printStackTrace();
        }
    }
}
