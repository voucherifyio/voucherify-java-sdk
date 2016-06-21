package pl.rspective.voucherify.client.module;

import java.util.concurrent.Executor;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.Customer;
import pl.rspective.voucherify.client.module.CustomerModule.ExtAsync;
import pl.rspective.voucherify.client.module.CustomerModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

/**
 * Customer Module to manage communication with Voucherify
 */
public final class CustomerModule extends AbsModule<ExtAsync, ExtRxJava> {

    /**
     *
     * @param api
     *            describes Voucherify REST API
     * @param executor
     *            of threads for current platform
     */
    public CustomerModule(VoucherifyApi api, Executor executor) {
        super(api, executor);
    }

    /**
     * Get a single resource with an customerId.
     *
     * @param customerId
     *            resource id
     * @return resource result instance
     */
    public Customer getCustomer(String customerId) {
        return api.getCustomer(customerId);
    }

    /**
     * Create a customer.
     *
     * @param customer
     *          customer to be created
     *
     * @return created customer
     */
    public Customer createCustomer(Customer customer) {
        return api.createCustomer(customer);
    }

    /**
     * Update a customer.
     *
     * @param customer
     *          customer to be updated
     *
     * @return updated customer
     */
    public Customer updateCustomer(Customer customer) {
        return api.updateCustomer(customer.getId(), customer);
    }

    /**
     * Delete a customer.
     *
     * @param customerId
     *          id of a customer to be deleted
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtAsync async() {
        return extAsync;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtRxJava rx() {
        return extRxJava;
    }

    /**
     * Async extension.
     */
    public class ExtAsync extends AbsModule.Async {

        /**
         * Fetch a single resource with a customerId.
         *
         * @param customerId
         *            resource id
         */
        public void getCustomer(String customerId, VoucherifyCallback<Customer> callback) {
            RxUtils.subscribe(executor, rx().getCustomer(customerId), callback);
        }

        /**
         * Create a customer.
         *
         * @param customer
         *          customer to be created
         *
         */
        public void createCustomer(Customer customer, VoucherifyCallback<Customer> callback) {
            RxUtils.subscribe(executor, rx().createCustomer(customer), callback);
        }

        /**
         * Update a customer.
         *
         * @param customer
         *          customer to be updated
         *
         */
        public void updateCustomer(Customer customer, VoucherifyCallback<Customer> callback) {
            RxUtils.subscribe(executor, rx().updateCustomer(customer), callback);
        }


        /**
         * Delete a customer by customerId.
         *
         * @param customerId
         *          id of a customer to be deleted
         *
         */
        public void deleteCustomer(String customerId, VoucherifyCallback<Void> callback) {
            RxUtils.subscribe(executor, rx().deleteCustomer(customerId), callback);
        }
    }

    /**
     * RxJava extension.
     */
    public class ExtRxJava extends AbsModule.Rx {

        /**
         * Get a single resource with a customerId.
         *
         * @param customerId
         *            resource id
         * @return resource result instance
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
         * Create a customer.
         *
         * @param customer
         *          customer to be created
         *
         * @return created customer
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
         * Update a customer.
         *
         * @param customer
         *          customer to be updated
         *
         * @return updated customer
         */
        public Observable<Customer> updateCustomer(final Customer customer) {
            return RxUtils.defer(new RxUtils.DefFunc<Customer>() {
                @Override
                public Customer method() {
                    return CustomerModule.this.updateCustomer(customer);
                }
            });
        }

        /**
         * Delete a customer by customerId.
         *
         * @param customerId
         *          customerId to be deleted
         */
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
