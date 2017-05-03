package pl.rspective.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import org.junit.Test;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.product.DeleteProductParams;
import pl.rspective.voucherify.client.model.product.DeleteSKUParams;
import pl.rspective.voucherify.client.model.product.Product;
import pl.rspective.voucherify.client.model.product.ProductsFilter;
import pl.rspective.voucherify.client.model.product.SKU;
import pl.rspective.voucherify.client.model.product.response.ProductResponse;
import pl.rspective.voucherify.client.model.product.response.ProductsResponse;
import pl.rspective.voucherify.client.model.product.response.SKUResponse;
import pl.rspective.voucherify.client.model.product.response.SKUsResponse;
import rx.Observable;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class ProductsModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateProduct() {
    // given
    Product product = Product.builder().name("some-name").build();

    enqueueResponse("{\"name\" : \"some-name\"}");

    // when
    ProductResponse result = client.products().create(product);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getName()).isEqualTo("some-name");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetProduct() {
    // given
    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\"}");

    // when
    ProductResponse result = client.products().get("some-id");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateProduct() {
    // given
    Product product = Product.builder().id("some-id").name("some-name").build();

    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\"}");

    // when
    ProductResponse result = client.products().update(product);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListProducts() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"products\": [], \"total\": 0}");

    // when
    ProductsResponse result = client.products().list(ProductsFilter.builder().limit(10).page(1).build());

    // then
    assertThat(result).isNotNull();
    assertThat(result.getProducts()).isEmpty();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products?limit=10&page=1");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteProduct() {
    // given
    enqueueEmptyResponse();

    // when
    client.products().delete("some-id", DeleteProductParams.builder().force(true).build());

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateSKU() {
    // given
    SKU sku = SKU.builder().sku("sku").build();

    enqueueResponse("{\"sku\" : \"sku\"}");

    // when
    SKUResponse result = client.products().createSKU("productId", sku);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getSku()).isEqualTo("sku");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetSKU() {
    // given
    enqueueResponse("{\"sku\" : \"sku\", \"id\": \"skuId\"}");

    // when
    SKUResponse result = client.products().getSKU("productId", "skuId");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("skuId");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateSKU() {
    // given
    SKU sku = SKU.builder().id("skuId").sku("sku").build();

    enqueueResponse("{\"sku\" : \"sku\", \"id\": \"skuId\"}");

    // when
    SKUResponse result = client.products().updateSKU("productId", sku);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("skuId");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListSKUs() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"skus\": [], \"total\": 0}");

    // when
    SKUsResponse result = client.products().listSKU("productId");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getSkus()).isEmpty();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteSKU() {
    // given
    enqueueEmptyResponse();

    // when
    client.products().deleteSKU("productId", "skuId", DeleteSKUParams.builder().force(true).build());

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  // ASYNC
  @Test
  public void shouldCreateProductAsync() {
    // given
    Product product = Product.builder().name("some-name").build();

    enqueueResponse("{\"name\" : \"some-name\"}");
    VoucherifyCallback callback = createCallback();

    // when
    client.products().async().create(product, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetProductAsync() {
    // given
    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\"}");
    VoucherifyCallback callback = createCallback();

    // when
    client.products().async().get("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateProductAsync() {
    // given
    Product product = Product.builder().id("some-id").name("some-name").build();
    VoucherifyCallback callback = createCallback();

    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\"}");

    // when
    client.products().async().update(product, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListProductsAsync() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"products\": [], \"total\": 0}");
    VoucherifyCallback callback = createCallback();

    // when
    client.products().async().list(ProductsFilter.builder().limit(10).page(1).build(), callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products?limit=10&page=1");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteProductAsync() {
    // given
    enqueueEmptyResponse();
    VoucherifyCallback callback = createCallback();

    // when
    client.products().async().delete("some-id", DeleteProductParams.builder().force(true).build(), callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateSKUAsync() {
    // given
    SKU sku = SKU.builder().sku("sku").build();
    VoucherifyCallback callback = createCallback();
    enqueueResponse("{\"sku\" : \"sku\"}");

    // when
    client.products().async().createSKU("productId", sku, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetSKUAsync() {
    // given
    VoucherifyCallback callback = createCallback();
    enqueueResponse("{\"sku\" : \"sku\", \"id\": \"skuId\"}");

    // when
    client.products().async().getSKU("productId", "skuId", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateSKUAsync() {
    // given
    SKU sku = SKU.builder().id("skuId").sku("sku").build();
    VoucherifyCallback callback = createCallback();
    enqueueResponse("{\"sku\" : \"sku\", \"id\": \"skuId\"}");

    // when
    client.products().async().updateSKU("productId", sku, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListSKUsAsync() {
    // given
    VoucherifyCallback callback = createCallback();
    enqueueResponse("{\"object\" : \"list\", \"skus\": [], \"total\": 0}");

    // when
    client.products().async().listSKU("productId", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteSKUAsync() {
    // given
    VoucherifyCallback callback = createCallback();
    enqueueEmptyResponse();

    // when
    client.products().async().deleteSKU("productId", "skuId", DeleteSKUParams.builder().force(true).build(), callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateProductRxJava() {
    // given
    Product product = Product.builder().name("some-name").build();

    enqueueResponse("{\"name\" : \"some-name\"}");

    // when
    Observable<ProductResponse> observable = client.products().rx().create(product);

    // then
    ProductResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getName()).isEqualTo("some-name");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetProductRxJava() {
    // given
    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\"}");

    // when
    Observable<ProductResponse> observable = client.products().rx().get("some-id");

    // then
    ProductResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateProductRxJava() {
    // given
    Product product = Product.builder().id("some-id").name("some-name").build();

    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\"}");

    // when
    Observable<ProductResponse> observable = client.products().rx().update(product);

    // then
    ProductResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListProductsRxJava() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"products\": [], \"total\": 0}");

    // when
    Observable<ProductsResponse> observable = client.products().rx().list(ProductsFilter.builder().limit(10).page(1).build());

    // then
    ProductsResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getProducts()).isEmpty();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products?limit=10&page=1");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteProductRxJava() {
    // given
    enqueueEmptyResponse();

    // when
    Observable<Void> observable = client.products().rx().delete("some-id", DeleteProductParams.builder().force(true).build());

    // then
    observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/some-id?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateSKURxJava() {
    // given
    SKU sku = SKU.builder().sku("sku").build();

    enqueueResponse("{\"sku\" : \"sku\"}");

    // when
    Observable<SKUResponse> observable = client.products().rx().createSKU("productId", sku);

    // then
    SKUResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getSku()).isEqualTo("sku");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetSKURxJava() {
    // given
    enqueueResponse("{\"sku\" : \"sku\", \"id\": \"skuId\"}");

    // when
    Observable<SKUResponse> observable = client.products().rx().getSKU("productId", "skuId");

    // then
    SKUResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("skuId");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateSKURxJava() {
    // given
    SKU sku = SKU.builder().id("skuId").sku("sku").build();

    enqueueResponse("{\"sku\" : \"sku\", \"id\": \"skuId\"}");

    // when
    Observable<SKUResponse> observable = client.products().rx().updateSKU("productId", sku);

    // then
    SKUResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("skuId");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldListSKUsRxJava() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"skus\": [], \"total\": 0}");

    // when
    Observable<SKUsResponse> observable = client.products().rx().listSKU("productId");

    // then
    SKUsResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getSkus()).isEmpty();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteSKURxJava() {
    // given
    enqueueEmptyResponse();

    // when
    Observable<Void> observable = client.products().rx().deleteSKU("productId", "skuId", DeleteSKUParams.builder().force(true).build());

    // then
    observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/products/productId/skus/skuId?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

}
