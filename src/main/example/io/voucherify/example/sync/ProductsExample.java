package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.product.DeleteProductParams;
import io.voucherify.client.model.product.DeleteSKUParams;
import io.voucherify.client.model.product.Product;
import io.voucherify.client.model.product.ProductsFilter;
import io.voucherify.client.model.product.SKU;
import io.voucherify.client.model.product.response.ProductResponse;
import io.voucherify.client.model.product.response.SKUResponse;

public class ProductsExample extends AbsExample {

  public ProductsExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {
    Product product = Product.builder().name("product")
            .attribute("attribute1")
            .attribute("attribute2")
            .metadataEntry("key_1", "value_1")
            .metadataEntry("key_2", "value_2")
            .build();

    ProductResponse result = client.products().create(product);

    client.products().get(result.getId());

    Product update = Product.builder().id(result.getId())
            .sourceId("sourceId")
            .build();

    client.products().update(update);

    client.products().list(ProductsFilter.builder().limit(10).page(0).build());

    SKU sku = SKU.builder()
            .sku("sku")
            .attribute("key_1", "value_1")
            .metadataEntry("key_1", "value_1")
            .build();

    SKUResponse skuResult = client.products().createSKU(result.getId(), sku);

    client.products().getSKU(result.getId(), skuResult.getId());

    SKU skuUpdate = SKU.builder()
            .id(skuResult.getId())
            .sourceId("sourceId")
            .build();

    client.products().updateSKU(result.getId(), skuUpdate);

    System.out.println(client.products().listSKU(result.getId()));

    client.products().deleteSKU(result.getId(), skuResult.getId(), DeleteSKUParams.builder().force(true).build());

    client.products().delete(result.getId(), DeleteProductParams.builder().force(true).build());
  }
}
