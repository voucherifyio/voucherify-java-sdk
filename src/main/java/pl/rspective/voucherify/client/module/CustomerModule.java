package pl.rspective.voucherify.client.module;

import java.util.concurrent.Executor;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.Customer;
import pl.rspective.voucherify.client.module.CustomerModule.ExtAsync;
import pl.rspective.voucherify.client.module.CustomerModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

public final class CustomerModule extends AbsModule<ExtAsync, ExtRxJava> {

    public CustomerModule(VoucherifyApi api, Executor executor) {
        super(api, executor);
    }

    /**
     * @deprecated User {@link CustomerModule#getCustomerById(String)} instead
     */
    public Customer getCustomer(String customerId) {
        return api.getCustomer(customerId);
    }

    /**
     * @deprecated User {@link CustomerModule#createCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
     */
    public Customer createCustomer(Customer customer) {
        return api.createCustomer(customer);
    }

    /**
     * @deprecated User {@link CustomerModule#updateCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
     */
    public Customer updateCustomer(Customer customer) {
        return api.updateCustomer(customer.getId(), customer);
    }


    public pl.rspective.voucherify.client.model.customer.Customer getCustomerById(String customerId) {
        return api.getCustomerById(customerId);
    }

    public pl.rspective.voucherify.client.model.customer.Customer createCustomer(pl.rspective.voucherify.client.model.customer.Customer customer) {
        return api.createCustomer(customer);
    }

    public pl.rspective.voucherify.client.model.customer.Customer updateCustomer(pl.rspective.voucherify.client.model.customer.Customer customer) {
        return api.updateCustomer(customer.getId(), customer);
    }

    public void deleteCustomer(String customerId) {
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
         * @deprecated User {@link CustomerModule.ExtAsync#getCustomerById(String)} instead
         */
        public void getCustomer(String customerId, VoucherifyCallback<Customer> callback) {
            RxUtils.subscribe(executor, rx().getCustomer(customerId), callback);
        }

        /**
         * @deprecated User {@link CustomerModule.ExtAsync#createCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
         */
        public void createCustomer(Customer customer, VoucherifyCallback<Customer> callback) {
            RxUtils.subscribe(executor, rx().createCustomer(customer), callback);
        }

        /**
         * @deprecated User {@link CustomerModule.ExtAsync#updateCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
         */
        public void updateCustomer(Customer customer, VoucherifyCallback<Customer> callback) {
            RxUtils.subscribe(executor, rx().updateCustomer(customer), callback);
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

        public void deleteCustomer(String customerId, VoucherifyCallback<Void> callback) {
            RxUtils.subscribe(executor, rx().deleteCustomer(customerId), callback);
        }
    }

    public class ExtRxJava extends AbsModule.Rx {

        /**
         * @deprecated User {@link CustomerModule.ExtRxJava#getCustomerById(String)} instead
         */
        public Observable<Customer> getCustomer(final String customerId) {
            return RxUtils.defer(new RxUtils.DefFunc<Customer>() {
                @Override
                public Customer method() {
                    return CustomerModule.this.getCustomer(customerId);
                }
            });
        }

        /**
         * @deprecated User {@link CustomerModule.ExtRxJava#createCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
         */
        public Observable<Customer> createCustomer(final Customer customer) {
            return RxUtils.defer(new RxUtils.DefFunc<Customer>() {
                @Override
                public Customer method() {
                    return CustomerModule.this.createCustomer(customer);
                }
            });
        }

        /**
         * @deprecated User {@link CustomerModule.ExtRxJava#updateCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
         */
        public Observable<Customer> updateCustomer(final Customer customer) {
            return RxUtils.defer(new RxUtils.DefFunc<Customer>() {
                @Override
                public Customer method() {
                    return CustomerModule.this.updateCustomer(customer);
                }
            });
        }

        public Observable<pl.rspective.voucherify.client.model.customer.Customer> getCustomerById(final String customerId) {
            return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.customer.Customer>() {
                @Override
                public pl.rspective.voucherify.client.model.customer.Customer method() {
                    return CustomerModule.this.getCustomerById(customerId);
                }
            });
        }

        public Observable<pl.rspective.voucherify.client.model.customer.Customer> createCustomer(final pl.rspective.voucherify.client.model.customer.Customer customer) {
            return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.customer.Customer>() {
                @Override
                public pl.rspective.voucherify.client.model.customer.Customer method() {
                    return CustomerModule.this.createCustomer(customer);
                }
            });
        }

        public Observable<pl.rspective.voucherify.client.model.customer.Customer> updateCustomer(final pl.rspective.voucherify.client.model.customer.Customer customer) {
            return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.customer.Customer>() {
                @Override
                public pl.rspective.voucherify.client.model.customer.Customer method() {
                    return CustomerModule.this.updateCustomer(customer);
                }
            });
        }

        public Observable<Void> deleteCustomer(final String customerId) {
            return RxUtils.defer(new RxUtils.DefFunc<Void>() {
                @Override
                public Void method() {
                    CustomerModule.this.deleteCustomer(customerId);
                    return null;
                }
            });
        }
    }
}
