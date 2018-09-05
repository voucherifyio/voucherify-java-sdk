package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.order.CreateOrder;
import io.voucherify.client.model.order.OrdersFilter;
import io.voucherify.client.model.order.UpdateOrder;
import io.voucherify.client.model.order.response.CreateOrderResponse;
import io.voucherify.client.model.order.response.GetOrderResponse;
import io.voucherify.client.model.order.response.ListOrdersResponse;
import io.voucherify.client.module.OrdersModule.ExtAsync;
import io.voucherify.client.module.OrdersModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;

import java.util.HashMap;
import java.util.concurrent.Executor;

public class OrdersModule extends AbsModule<ExtAsync, ExtRxJava> {

  public OrdersModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CreateOrderResponse create(CreateOrder createOrder) {
    return executeSyncApiCall(api.createOrder(createOrder));
  }

  public GetOrderResponse get(String id) {
    return executeSyncApiCall(api.getOrder(id));
  }

  public GetOrderResponse update(String id, UpdateOrder updateOrder) {
    return executeSyncApiCall(api.updateOrder(id, updateOrder));
  }

  public ListOrdersResponse list(OrdersFilter ordersFilter) {
    return executeSyncApiCall(api.listOrders(ordersFilter.asMap()));
  }

  public ListOrdersResponse list() {
    return executeSyncApiCall(api.listOrders(new HashMap<>()));
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

    public void create(CreateOrder createOrder, VoucherifyCallback<CreateOrderResponse> callback) {
      RxUtils.subscribe(executor, rx().create(createOrder), callback);
    }

    public void get(String id, VoucherifyCallback<GetOrderResponse> callback) {
      RxUtils.subscribe(executor, rx().get(id), callback);
    }

    public void update(
        String id, UpdateOrder updateOrder, VoucherifyCallback<GetOrderResponse> callback) {
      RxUtils.subscribe(executor, rx().update(id, updateOrder), callback);
    }

    public void list(OrdersFilter ordersFilter, VoucherifyCallback<ListOrdersResponse> callback) {
      RxUtils.subscribe(executor, rx().list(ordersFilter), callback);
    }

    public void list(VoucherifyCallback<ListOrdersResponse> callback) {
      RxUtils.subscribe(executor, rx().list(), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CreateOrderResponse> create(final CreateOrder createOrder) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CreateOrderResponse>() {

            @Override
            public CreateOrderResponse method() {
              return OrdersModule.this.create(createOrder);
            }
          });
    }

    public Observable<GetOrderResponse> get(final String id) {
      return RxUtils.defer(
          new RxUtils.DefFunc<GetOrderResponse>() {

            @Override
            public GetOrderResponse method() {
              return OrdersModule.this.get(id);
            }
          });
    }

    public Observable<GetOrderResponse> update(final String id, final UpdateOrder updateOrder) {
      return RxUtils.defer(
          new RxUtils.DefFunc<GetOrderResponse>() {

            @Override
            public GetOrderResponse method() {
              return OrdersModule.this.update(id, updateOrder);
            }
          });
    }

    public Observable<ListOrdersResponse> list(final OrdersFilter ordersFilter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListOrdersResponse>() {

            @Override
            public ListOrdersResponse method() {
              return OrdersModule.this.list(ordersFilter);
            }
          });
    }

    public Observable<ListOrdersResponse> list() {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListOrdersResponse>() {

            @Override
            public ListOrdersResponse method() {
              return OrdersModule.this.list();
            }
          });
    }
  }
}
