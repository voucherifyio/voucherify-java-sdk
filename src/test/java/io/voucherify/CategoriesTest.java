package io.voucherify;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import io.voucherify.client.ApiClient;
import io.voucherify.data.VoucherifyStore;
import io.voucherify.client.model.*;
import io.voucherify.client.api.CategoriesApi;
import io.voucherify.helpers.DeepMatch;

import java.util.Arrays;
import java.util.List;

@org.junit.jupiter.api.Order(13)
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
    @org.junit.jupiter.api.Order(1)
    public void createCategoryTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Categories/CreatedCategory.snapshot.json";

        CategoriesCreateRequestBody category = new CategoriesCreateRequestBody();
        category.setName(Utils.getAlphaNumericString(10));
        category.setHierarchy(1);

        try {
            CategoriesCreateResponseBody responseBody = categories.createCategory(category);

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "name");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));

            VoucherifyStore.getInstance().getCategory().setId(responseBody.getId());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void getCategoryTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Categories/GetCategory.snapshot.json";

        try {
            CategoriesGetResponseBody responseBody = categories
                    .getCategory(VoucherifyStore.getInstance().getCategory().getId());

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "name", "stackingRulesType");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void updateCategoryTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Categories/UpdatedCategory.snapshot.json";

        CategoriesUpdateRequestBody category = new CategoriesUpdateRequestBody();
        category.setName(Utils.getAlphaNumericString(10));
        category.setHierarchy(2);

        try {
            CategoriesUpdateResponseBody responseBody = categories
                    .updateCategory(VoucherifyStore.getInstance().getCategory().getId(), category);

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "name", "updatedAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));
        } catch (Exception e) {
            fail();
        }
    }
}