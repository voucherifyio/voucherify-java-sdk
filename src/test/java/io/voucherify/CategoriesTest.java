package io.voucherify;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import io.voucherify.client.ApiClient;
import io.voucherify.data.VoucherifyStore;
import io.voucherify.client.model.*;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.CategoriesApi;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import io.voucherify.helpers.JsonHelper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Order(13)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoriesTest {
    public static ApiClient defaultClient = null;
    public static CategoriesApi categories = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        categories = new CategoriesApi(defaultClient);
    }

    @Test
    @Order(1)
    public void createCategoryTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Categories/CreatedCategory.snapshot.json";

        CategoriesCreateRequestBody category = new CategoriesCreateRequestBody();
        category.setName(Utils.getAlphaNumericString(10));
        category.setHierarchy(1);

        try {
            CategoriesCreateResponseBody responseBody = categories.createCategory(category);

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "name");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath, keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody, keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);

            VoucherifyStore.getInstance().getCategory().setId(responseBody.getId());
        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @Order(2)
    public void getCategoryTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Categories/GetCategory.snapshot.json";

        try {
            CategoriesGetResponseBody responseBody = categories
                    .getCategory(VoucherifyStore.getInstance().getCategory().getId());

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "name");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath, keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody, keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void updateCategoryTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Categories/UpdatedCategory.snapshot.json";

        CategoriesUpdateRequestBody category = new CategoriesUpdateRequestBody();
        category.setName(Utils.getAlphaNumericString(10));
        category.setHierarchy(2);

        try {
            CategoriesUpdateResponseBody responseBody = categories
                    .updateCategory(VoucherifyStore.getInstance().getCategory().getId(), category);

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "name", "updatedAt");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }
}
