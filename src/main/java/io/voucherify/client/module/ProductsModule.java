package io.voucherify.client.module;

import io.voucherify.client.model.product.ProductsFilter;
import io.voucherify.client.model.product.SKU;
import io.voucherify.client.model.product.response.ProductsResponse;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.product.DeleteProductParams;
import io.voucherify.client.model.product.DeleteSKUParams;
import io.voucherify.client.model.product.Product;
import io.voucherify.client.model.product.response.ProductResponse;
import io.voucherify.client.model.product.response.SKUResponse;
import io.voucherify.client.model.product.response.SKUsResponse;
import io.voucherify.client.module.ProductsModule.ExtAsync;
import io.voucherify.client.module.ProductsModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public class ProductsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public ProductsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public ProductResponse create(Product product) {
    return api.createProduct(product);
  }

  public ProductResponse get(String id) {
    return api.getProduct(id);
  }

  public ProductResponse update(Product product) {
    return api.updateProduct(product.getId(), product);
  }

  public ProductsResponse list(ProductsFilter filter) {
    return api.getProducts(filter.asMap());
  }

  public void delete(String id, DeleteProductParams params) {
    api.deleteProduct(id, params.asMap());
  }

  public SKUResponse createSKU(String productId, SKU sku) {
    return api.createSKU(productId, sku);
  }

  public SKUResponse getSKU(String productId, String skuId) {
    return api.getSKU(productId, skuId);
  }

  public SKUResponse updateSKU(String productId, SKU sku) {
    return api.updateSKU(productId, sku.getId(), sku);
  }

  public SKUsResponse listSKU(String productId) {
    return api.getSKUs(productId);
  }

  public void deleteSKU(String productId, String skuId, DeleteSKUParams params) {
    api.deleteSKU(productId, skuId, params.asMap());
  }

  @Override
  ExtAsync createAsyncExtension() {
    return new ExtAsync();
  }

  @Override
  ExtRxJava createRxJavaExtension() {
    return new ExtRxJava();
  }

  @Override
  public ExtAsync async() {
    return extAsync;
  }

  @Override
  public ExtRxJava rx() {
    return extRxJava;
  }

  public class ExtAsync extends AbsModule.Async {

    public void create(Product product, VoucherifyCallback<ProductResponse> callback) {
      RxUtils.subscribe(executor, rx().create(product), callback);
    }

    public void get(String id, VoucherifyCallback<ProductResponse> callback) {
      RxUtils.subscribe(executor, rx().get(id), callback);
    }

    public void update(Product product, VoucherifyCallback<ProductResponse> callback) {
      RxUtils.subscribe(executor, rx().update(product), callback);
    }

    public void list(ProductsFilter filter, VoucherifyCallback<ProductsResponse> callback) {
      RxUtils.subscribe(executor, rx().list(filter), callback);
    }

    public void delete(String id, DeleteProductParams params, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().delete(id, params), callback);
    }

    public void createSKU(String productId, SKU sku, VoucherifyCallback<SKUResponse> callback) {
      RxUtils.subscribe(executor, rx().createSKU(productId, sku), callback);
    }

    public void getSKU(String productId, String skuId, VoucherifyCallback<SKUResponse> callback) {
      RxUtils.subscribe(executor, rx().getSKU(productId, skuId), callback);
    }

    public void updateSKU(String productId, SKU sku, VoucherifyCallback<SKUResponse> callback) {
      RxUtils.subscribe(executor, rx().updateSKU(productId, sku), callback);
    }

    public void listSKU(String productId, VoucherifyCallback<SKUsResponse> callback) {
      RxUtils.subscribe(executor, rx().listSKU(productId), callback);
    }

    public void deleteSKU(String productId, String skuId, DeleteSKUParams params, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().deleteSKU(productId, skuId, params), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<ProductResponse> create(final Product product) {
      return RxUtils.defer(new RxUtils.DefFunc<ProductResponse>() {

        @Override
        public ProductResponse method() {
          return ProductsModule.this.create(product);
        }
      });
    }

    public Observable<ProductResponse> get(final String id) {
      return RxUtils.defer(new RxUtils.DefFunc<ProductResponse>() {

        @Override
        public ProductResponse method() {
          return ProductsModule.this.get(id);
        }
      });
    }

    public Observable<ProductResponse> update(final Product product) {
      return RxUtils.defer(new RxUtils.DefFunc<ProductResponse>() {

        @Override
        public ProductResponse method() {
          return ProductsModule.this.update(product);
        }
      });
    }

    public Observable<ProductsResponse> list(final ProductsFilter filter) {
      return RxUtils.defer(new RxUtils.DefFunc<ProductsResponse>() {

        @Override
        public ProductsResponse method() {
          return ProductsModule.this.list(filter);
        }
      });
    }

    public Observable<Void> delete(final String id, final DeleteProductParams params) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {

        @Override
        public Void method() {
          ProductsModule.this.delete(id, params);
          return null;
        }
      });
    }

    public Observable<SKUResponse> createSKU(final String productId, final SKU sku) {
      return RxUtils.defer(new RxUtils.DefFunc<SKUResponse>() {

        @Override
        public SKUResponse method() {
          return ProductsModule.this.createSKU(productId, sku);
        }
      });
    }

    public Observable<SKUResponse> getSKU(final String productId, final String skuId) {
      return RxUtils.defer(new RxUtils.DefFunc<SKUResponse>() {

        @Override
        public SKUResponse method() {
          return ProductsModule.this.getSKU(productId, skuId);
        }
      });
    }

    public Observable<SKUResponse> updateSKU(final String productId, final SKU sku) {
      return RxUtils.defer(new RxUtils.DefFunc<SKUResponse>() {

        @Override
        public SKUResponse method() {
          return ProductsModule.this.updateSKU(productId, sku);
        }
      });
    }

    public Observable<SKUsResponse> listSKU(final String productId) {
      return RxUtils.defer(new RxUtils.DefFunc<SKUsResponse>() {

        @Override
        public SKUsResponse method() {
          return ProductsModule.this.listSKU(productId);
        }
      });
    }

    public Observable<Void> deleteSKU(final String productId, final String skuId, final DeleteSKUParams params) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {

        @Override
        public Void method() {
          ProductsModule.this.deleteSKU(productId, skuId, params);
          return null;
        }
      });
    }
  }
}
