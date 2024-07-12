package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Product;
import org.example.data.Voucherify;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.ProductsApi;
import voucherify.client.model.ProductsCreateRequestBody;
import voucherify.client.model.ProductsCreateResponseBody;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(3)
public class ProductsTest {
    public static ApiClient defaultClient = null;
    public static ProductsApi products = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        products = new ProductsApi(defaultClient);
    }

    @Test
    public void createProductTest() {
        try {
            ProductsCreateRequestBody productsCreateRequestBody = new ProductsCreateRequestBody();

            String productName = "Test product";
            String productSourceId = Utils.getAlphaNumericString(10);

            productsCreateRequestBody.setSourceId(productSourceId);
            productsCreateRequestBody.setName(productName);

            ProductsCreateResponseBody productsCreateResponseBody = products.createProduct(productsCreateRequestBody);

            String productId = productsCreateResponseBody.getId();

            assertNotNull(productId);

            Voucherify.getInstance().getProducts().add(
                new Product(productId, productName, productSourceId)
            );
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
