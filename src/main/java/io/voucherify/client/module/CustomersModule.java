package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.customer.CustomersFilter;
import io.voucherify.client.model.customer.response.CustomerBulkUpdateResponse;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.customer.response.CustomersResponse;
import io.voucherify.client.module.CustomersModule.ExtAsync;
import io.voucherify.client.module.CustomersModule.ExtRxJava;
import io.voucherify.client.utils.Irrelevant;
import io.voucherify.client.utils.RxUtils;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

public final class CustomersModule extends AbsModule<ExtAsync, ExtRxJava> {

  public CustomersModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CustomerResponse get(String customerId) {
    return executeSyncApiCall(api.getCustomerById(customerId));
  }

  public CustomerResponse create(Customer customer) {
    return executeSyncApiCall(api.createCustomer(customer));
  }

  public CustomerResponse update(Customer customer) {
    return executeSyncApiCall(api.updateCustomer(customer.getId(), customer));
  }

  public CustomerBulkUpdateResponse update(List<Customer> customers) {
      return executeSyncApiCall(api.bulkUpdateCustomer(customers));
  }

  public void delete(String customerId) {
    executeSyncApiCall(api.deleteCustomer(customerId));
  }

  public CustomersResponse list(CustomersFilter filter) {
    return executeSyncApiCall(api.listCustomers(filter.asMap()));
  }

  public CustomersResponse list() {
    return executeSyncApiCall(api.listCustomers(new HashMap<>()));
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

    public void get(String customerId, VoucherifyCallback<CustomerResponse> callback) {
      RxUtils.subscribe(executor, rx().get(customerId), callback);
    }

    public void create(Customer customer, VoucherifyCallback<CustomerResponse> callback) {
      RxUtils.subscribe(executor, rx().create(customer), callback);
    }

    public void update(Customer customer, VoucherifyCallback<CustomerResponse> callback) {
      RxUtils.subscribe(executor, rx().update(customer), callback);
    }

    public void delete(String customerId, VoucherifyCallback<Irrelevant> callback) {
      RxUtils.subscribe(executor, rx().delete(customerId), callback);
    }

    public void list(CustomersFilter filter, VoucherifyCallback<CustomersResponse> callback) {
      RxUtils.subscribe(executor, rx().list(filter), callback);
    }

    public void list(VoucherifyCallback<CustomersResponse> callback) {
      RxUtils.subscribe(executor, rx().list(), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CustomerResponse> get(final String customerId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CustomerResponse>() {

            @Override
            public CustomerResponse method() {
              return CustomersModule.this.get(customerId);
            }
          });
    }

    public Observable<CustomerResponse> create(final Customer customer) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CustomerResponse>() {

            @Override
            public CustomerResponse method() {
              return CustomersModule.this.create(customer);
            }
          });
    }

    public Observable<CustomerResponse> update(final Customer customer) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CustomerResponse>() {

            @Override
            public CustomerResponse method() {
              return CustomersModule.this.update(customer);
            }
          });
    }

    public Observable<Irrelevant> delete(final String customerId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Irrelevant>() {

            @Override
            public Irrelevant method() {
              CustomersModule.this.delete(customerId);
              return Irrelevant.NO_RESPONSE;
            }
          });
    }

    public Observable<CustomersResponse> list(final CustomersFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CustomersResponse>() {

            @Override
            public CustomersResponse method() {
              return CustomersModule.this.list(filter);
            }
          });
    }

    public Observable<CustomersResponse> list() {
      return RxUtils.defer(
          new RxUtils.DefFunc<CustomersResponse>() {

            @Override
            public CustomersResponse method() {
              return CustomersModule.this.list();
            }
          });
    }
  }
}
