package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.utils.RxUtils;

import java.util.List;
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
    public T fetchOne(String identifier) {
        return (T) api.fetchVoucher(identifier);
    }

    /**
     *
     * @param identifier
     * @return
     */
    public R consumeVoucher(String identifier) {
        return (R) api.useVoucher(identifier);
    }

    /**
     * Base Async extension.
     */
    public class ExtAsync extends Async {

        /**
         *
         * @param identifier
         * @param callback
         */
        public void fetchOne(final String identifier, VoucherifyCallback<Voucher> callback) {
            RxUtils.subscribe(executor, rx().fetchOne(identifier), callback);
        }

        /**
         *
         * @param identifier
         * @param callback
         */
        public void consumeVoucher(String identifier, VoucherifyCallback<R> callback) {
            RxUtils.subscribe(executor, rx().consumeVoucher(identifier), callback);
        }
    }

    /**
     * Base RxJava extension.
     */
    public class ExtRxJava extends Rx {

        /**
         *
         * @param identifier
         * @return
         */
        public Observable<T> fetchOne(final String identifier) {
            return RxUtils.defer(new RxUtils.DefFunc<T>() {
                @Override
                public T method() {
                    return BaseModule.this.fetchOne(identifier);
                }
            });
        }

        /**
         *
         * @param identifier
         * @return
         */
        public Observable<R> consumeVoucher(final String identifier) {
            return RxUtils.defer(new RxUtils.DefFunc<R>() {
                @Override
                public R method() {
                    return BaseModule.this.consumeVoucher(identifier);
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