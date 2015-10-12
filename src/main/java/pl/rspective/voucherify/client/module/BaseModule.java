package pl.rspective.voucherify.client.module;

import java.util.concurrent.Executor;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.VoucherRedemptionContext;
import pl.rspective.voucherify.client.utils.RxUtils;
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
     * Redeem a voucher identified by code
     * @param identifier
     *          code of the voucher
     * @return voucher which was redeemed
     */
    public T redeem(String identifier, String trackingId) {
        return (T) api.redeem(identifier, trackingId);
    }
    
    /**
     * Redeem a voucher identified by code
     * @param identifier
     *          code of the voucher
     * @return voucher which was redeemed
     */
    public T redeem(String identifier, VoucherRedemptionContext redemptionContext) {
        return (T) api.redeem(identifier, redemptionContext);
    }

    /**
     * Fetch information about voucher redemption
     * @param identifier of the voucher for which we fetch the redemption details
     * @return voucher redemption information
     */
    public R redemption(String identifier) {
        return (R) api.redemption(identifier);
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
         * Redeem a voucher by his identifier
         * @param identifier of the voucher
         * @return voucher which was redeemed
         */
        public void redeem(String identifier, String trackingId, VoucherifyCallback<T> callback) {
            RxUtils.subscribe(executor, rx().redeem(identifier, trackingId), callback);
        }
        
        /**
         * Redeem a voucher by his identifier
         * @param identifier of the voucher
         * @return voucher which was redeemed
         */
        public void redeem(String identifier, VoucherRedemptionContext redemptionContext, VoucherifyCallback<T> callback) {
            RxUtils.subscribe(executor, rx().redeem(identifier, redemptionContext), callback);
        }

        /**
         * Fetch information about voucher redemption
         * @param identifier of the voucher for which we fetch the redemption details
         * @return voucher redemption information
         */
        public void redemption(String identifier, VoucherifyCallback<R> callback) {
            RxUtils.subscribe(executor, rx().redemption(identifier), callback);
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
         * Redeem a voucher by his identifier
         * @param identifier of the voucher
         * @return voucher which was consumed
         */
        public Observable<T> redeem(final String identifier, final String trackingId) {
            return RxUtils.defer(new RxUtils.DefFunc<T>() {
                @Override
                public T method() {
                    return BaseModule.this.redeem(identifier, trackingId);
                }
            });
        }
        
        /**
         * Redeem a voucher by his identifier
         * @param identifier of the voucher
         * @return voucher which was consumed
         */
        public Observable<T> redeem(final String identifier, final VoucherRedemptionContext redemptionContext) {
            return RxUtils.defer(new RxUtils.DefFunc<T>() {
                @Override
                public T method() {
                    return BaseModule.this.redeem(identifier, redemptionContext);
                }
            });
        }

        /**
         * Fetch information about voucher redemption
         * @param identifier of the voucher for which we fetch the redemption details
         * @return voucher redemption information
         */
        public Observable<R> redemption(final String identifier) {
            return RxUtils.defer(new RxUtils.DefFunc<R>() {
                @Override
                public R method() {
                    return BaseModule.this.redemption(identifier);
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