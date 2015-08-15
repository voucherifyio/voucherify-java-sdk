package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.utils.RxUtils;

import java.util.concurrent.Executor;

import rx.Observable;

/**
 * BaseModule for all sync, async and rx calls to the Voucherify
 */
abstract class BaseModule<T, R> extends AbsModule<BaseModule.ExtAsync, BaseModule.ExtRxJava> {

    /**
     *
     * @param api describes Voucherif REST API
     * @param executor of threads for current platform
     */
    public BaseModule(VoucherifyApi api, Executor executor) {
        super(api, executor);
    }

    /**
     *
     * @return
     */
    @Override
    ExtAsync createAsyncExtension() {
        return new ExtAsync();
    }

    /**
     *
     * @return
     */
    @Override
    ExtRxJava createRxJavaExtension() {
        return new ExtRxJava();
    }

    /**
     * Fetch a single resource with an identifier.
     *
     * @param identifier resource id
     * @return resource result instance
     */
    public T fetchVoucher(String identifier) {
        return (T) api.fetch(identifier);
    }


    /**
     * Use a voucher by his identifier
     * @param identifier of the voucher
     * @return voucher which was consumed
     */
    public T consumeVoucher(String identifier, String trackingId) {
        return (T) api.use(identifier, trackingId);
    }

    /**
     * Fetch information about voucher usage
     * @param identifier of the voucher for which we fetch the usage details
     * @return voucher usage information
     */
    public R usageVoucher(String identifier) {
        return (R) api.usage(identifier);
    }

    /**
     * Base Async extension.
     */
    public class ExtAsync extends Async {

        /**
         * Fetch a single resource with an identifier.
         *
         * @param identifier resource id
         * @return resource result instance
         */
        public void fetchVoucher(String identifier, VoucherifyCallback<T> callback) {
            RxUtils.subscribe(executor, rx().fetchVoucher(identifier), callback);
        }

        /**
         * Use a voucher by his identifier
         * @param identifier of the voucher
         * @return voucher which was consumed
         */
        public void consumeVoucher(String identifier, String trackingId, VoucherifyCallback<T> callback) {
            RxUtils.subscribe(executor, rx().consumeVoucher(identifier, trackingId), callback);
        }

        /**
         * Fetch information about voucher usage
         * @param identifier of the voucher for which we fetch the usage details
         * @return voucher usage information
         */
        public void usageVoucher(String identifier, VoucherifyCallback<R> callback) {
            RxUtils.subscribe(executor, rx().usageVoucher(identifier), callback);
        }
    }

    /**
     * Base RxJava extension.
     */
    public class ExtRxJava extends Rx {

        /**
         * Fetch a single resource with an identifier.
         *
         * @param identifier resource id
         * @return resource result instance
         */
        public Observable<T> fetchVoucher(final String identifier) {
            return RxUtils.defer(new RxUtils.DefFunc<T>() {
                @Override
                public T method() {
                    return BaseModule.this.fetchVoucher(identifier);
                }
            });
        }

        /**
         * Use a voucher by his identifier
         * @param identifier of the voucher
         * @return voucher which was consumed
         */
        public Observable<T> consumeVoucher(final String identifier, final String trackingId) {
            return RxUtils.defer(new RxUtils.DefFunc<T>() {
                @Override
                public T method() {
                    return BaseModule.this.consumeVoucher(identifier, trackingId);
                }
            });
        }

        /**
         * Fetch information about voucher usage
         * @param identifier of the voucher for which we fetch the usage details
         * @return voucher usage information
         */
        public Observable<R> usageVoucher(final String identifier) {
            return RxUtils.defer(new RxUtils.DefFunc<R>() {
                @Override
                public R method() {
                    return BaseModule.this.usageVoucher(identifier);
                }
            });
        }

    }

    /**
     *
     */
    public class Rx {
    }

    /**
     *
     */
    public class Async {
    }

}