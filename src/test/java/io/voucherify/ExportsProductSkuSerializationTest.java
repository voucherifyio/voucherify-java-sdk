package io.voucherify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.voucherify.client.JSON;
import io.voucherify.client.model.ExportsCreateRequestBody;
import io.voucherify.client.model.ExportsCreateResponseBody;
import io.voucherify.client.model.ExportsGetResponseBody;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ExportsProductSkuSerializationTest {

  @BeforeAll
  static void initGson() {
    new JSON();
  }

  @Test
  void shouldSupportProductAndSkuExportObjects() throws Exception {
    ExportsCreateRequestBody productRequest =
        ExportsCreateRequestBody.fromJson("{\"exported_object\":\"product\"}");
    ExportsCreateRequestBody skuRequest =
        ExportsCreateRequestBody.fromJson("{\"exported_object\":\"sku\"}");
    ExportsCreateResponseBody productCreateResponse =
        ExportsCreateResponseBody.fromJson("{\"exported_object\":\"product\"}");
    ExportsCreateResponseBody skuCreateResponse =
        ExportsCreateResponseBody.fromJson("{\"exported_object\":\"sku\"}");
    ExportsGetResponseBody productGetResponse =
        ExportsGetResponseBody.fromJson("{\"exported_object\":\"product\"}");
    ExportsGetResponseBody skuGetResponse =
        ExportsGetResponseBody.fromJson("{\"exported_object\":\"sku\"}");

    assertEquals(ExportsCreateRequestBody.ExportedObjectEnum.PRODUCT, productRequest.getExportedObject());
    assertEquals(ExportsCreateRequestBody.ExportedObjectEnum.SKU, skuRequest.getExportedObject());
    assertEquals(
        ExportsCreateResponseBody.ExportedObjectEnum.PRODUCT, productCreateResponse.getExportedObject());
    assertEquals(ExportsCreateResponseBody.ExportedObjectEnum.SKU, skuCreateResponse.getExportedObject());
    assertEquals(ExportsGetResponseBody.ExportedObjectEnum.PRODUCT, productGetResponse.getExportedObject());
    assertEquals(ExportsGetResponseBody.ExportedObjectEnum.SKU, skuGetResponse.getExportedObject());

    assertTrue(productRequest.toJson().contains("\"exported_object\":\"product\""));
    assertTrue(skuRequest.toJson().contains("\"exported_object\":\"sku\""));
  }
}
