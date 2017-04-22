package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.Customer;
import pl.rspective.voucherify.client.module.CustomerModule.ExtAsync;
import pl.rspective.voucherify.client.module.CustomerModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class CustomerModule extends AbsModule<ExtAsync, ExtRxJava> {

  public CustomerModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  /**
   * @deprecated Use {@link CustomerModule#get(String)} instead
   */
  @Deprecated
  public Customer getCustomer(String customerId) {
    return api.getCustomer(customerId);
  }

  /**
   * @deprecated Use {@link CustomerModule#create(pl.rspective.voucherify.client.model.customer.Customer)} instead
   */
  @Deprecated
  public Customer createCustomer(Customer customer) {
    return api.createCustomer(customer);
  }

  /**
   * @deprecated Use {@link CustomerModule#update(pl.rspective.voucherify.client.model.customer.Customer)} instead
   */
  @Deprecated
  public Customer updateCustomer(Customer customer) {
    return api.updateCustomer(customer.getId(), customer);
  }

  /**
   * @deprecated Use {@link CustomerModule#delete(String)} instead
   */
  @Deprecated
  public void deleteCustomer(String customerId) {
    api.deleteCustomer(customerId);
  }

  public pl.rspective.voucherify.client.model.customer.Customer get(String customerId) {
    return api.getCustomerById(customerId);
  }

  public pl.rspective.voucherify.client.model.customer.Customer create(pl.rspective.voucherify.client.model.customer.Customer customer) {
    return api.createCustomer(customer);
  }

  public pl.rspective.voucherify.client.model.customer.Customer update(pl.rspective.voucherify.client.model.customer.Customer customer) {
    return api.updateCustomer(customer.getId(), customer);
  }

  public void delete(String customerId) {
    api.deleteCustomer(customerId);
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

    /**
     * @deprecated Use {@link CustomerModule.ExtAsync#get(String)} instead
     */
    @Deprecated
    public void getCustomer(String customerId, VoucherifyCallback<Customer> callback) {
      RxUtils.subscribe(executor, rx().getCustomer(customerId), callback);
    }

    /**
     * @deprecated Use {@link CustomerModule.ExtAsync#create(pl.rspective.voucherify.client.model.customer.Customer)} instead
     */
    @Deprecated
    public void createCustomer(Customer customer, VoucherifyCallback<Customer> callback) {
      RxUtils.subscribe(executor, rx().createCustomer(customer), callback);
    }

    /**
     * @deprecated User{@link CustomerModule.ExtAsync#update(pl.rspective.voucherify.client.model.customer.Customer)} instead
     */
    @Deprecated
    public void updateCustomer(Customer customer, VoucherifyCallback<Customer> callback) {
      RxUtils.subscribe(executor, rx().updateCustomer(customer), callback);
    }

    /**
     * @deprecated Use {@link CustomerModule.ExtAsync#delete(String)} instead
     */
    @Deprecated
    public void deleteCustomer(String customerId, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().deleteCustomer(customerId), callback);
    }

    public void getCustomerById(String customerId, VoucherifyCallback<pl.rspective.voucherify.client.model.customer.Customer> callback) {
      RxUtils.subscribe(executor, rx().getCustomerById(customerId), callback);
    }

    public void createCustomer(pl.rspective.voucherify.client.model.customer.Customer customer, VoucherifyCallback<pl.rspective.voucherify.client.model.customer.Customer> callback) {
      RxUtils.subscribe(executor, rx().createCustomer(customer), callback);
    }

    public void updateCustomer(pl.rspective.voucherify.client.model.customer.Customer customer, VoucherifyCallback<pl.rspective.voucherify.client.model.customer.Customer> callback) {
      RxUtils.subscribe(executor, rx().updateCustomer(customer), callback);
    }

    public void delete(String customerId, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().delete(customerId), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    /**
     * @deprecated Use {@link CustomerModule.ExtRxJava#getCustomerById(String)} instead
     */
    @Deprecated
    public Observable<Customer> getCustomer(final String customerId) {
      return RxUtils.defer(new RxUtils.DefFunc<Customer>() {
        @Override
        public Customer method() {
          return CustomerModule.this.getCustomer(customerId);
        }
      });
    }

    /**
     * @deprecated Use {@link CustomerModule.ExtRxJava#createCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
     */
    @Deprecated
    public Observable<Customer> createCustomer(final Customer customer) {
      return RxUtils.defer(new RxUtils.DefFunc<Customer>() {
        @Override
        public Customer method() {
          return CustomerModule.this.createCustomer(customer);
        }
      });
    }

    /**
     * @deprecated Use {@link CustomerModule.ExtRxJava#updateCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
     */
    @Deprecated
    public Observable<Customer> updateCustomer(final Customer customer) {
      return RxUtils.defer(new RxUtils.DefFunc<Customer>() {
        @Override
        public Customer method() {
          return CustomerModule.this.updateCustomer(customer);
        }
      });
    }

    /**
     * @deprecated Use {@link CustomerModule.ExtRxJava#delete(String)} instead
     */
    @Deprecated
    public Observable<Void> deleteCustomer(final String customerId) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          CustomerModule.this.delete(customerId);
          return null;
        }
      });
    }

    public Observable<pl.rspective.voucherify.client.model.customer.Customer> getCustomerById(final String customerId) {
      return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.customer.Customer>() {
        @Override
        public pl.rspective.voucherify.client.model.customer.Customer method() {
          return CustomerModule.this.get(customerId);
        }
      });
    }

    public Observable<pl.rspective.voucherify.client.model.customer.Customer> createCustomer(final pl.rspective.voucherify.client.model.customer.Customer customer) {
      return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.customer.Customer>() {
        @Override
        public pl.rspective.voucherify.client.model.customer.Customer method() {
          return CustomerModule.this.create(customer);
        }
      });
    }

    public Observable<pl.rspective.voucherify.client.model.customer.Customer> updateCustomer(final pl.rspective.voucherify.client.model.customer.Customer customer) {
      return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.customer.Customer>() {
        @Override
        public pl.rspective.voucherify.client.model.customer.Customer method() {
          return CustomerModule.this.update(customer);
        }
      });
    }

    public Observable<Void> delete(final String customerId) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          CustomerModule.this.delete(customerId);
          return null;
        }
      });
    }
  }
}
