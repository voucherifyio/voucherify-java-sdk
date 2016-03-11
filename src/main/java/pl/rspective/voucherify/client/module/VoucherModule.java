package pl.rspective.voucherify.client.module;

import java.util.List;
import java.util.concurrent.Executor;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.*;
import pl.rspective.voucherify.client.module.VoucherModule.ExtAsync;
import pl.rspective.voucherify.client.module.VoucherModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

/**
 * Vouchers Module to manage communication with Voucherify
 */
public final class VoucherModule extends AbsModule<ExtAsync, ExtRxJava> {

    /**
     *
     * @param api
     *            describes Voucherify REST API
     * @param executor
     *            of threads for current platform
     */
    public VoucherModule(VoucherifyApi api, Executor executor) {
        super(api, executor);
    }

    /**
     * Fetch user's list of vouchers which meet provided filters.
     *
     * @param filter
     *            a set of conditions to narrow down the result
     * @return list of vouchers
     */
    public List<Voucher> listVouchers(VouchersFilter filter) {
        return api.listVouchers(filter);
    }

    /**
     * Fetch a single resource with an identifier.
     *
     * @param identifier
     *            resource id
     * @return resource result instance
     */
    public Voucher fetchVoucher(String identifier) {
        return api.fetch(identifier);
    }

    /**
     * Redeem a voucher identified by code
     * 
     * @param identifier
     *            code of the voucher
     * @return voucher which was redeemed
     */
    public VoucherRedemptionResult redeem(String identifier, String trackingId) {
        return api.redeem(identifier, trackingId);
    }

    /**
     * Redeem a voucher identified by code
     * 
     * @param identifier
     *            code of the voucher
     * @return voucher which was redeemed
     */
    public VoucherRedemptionResult redeem(String identifier, VoucherRedemptionContext redemptionContext) {
        return api.redeem(identifier, redemptionContext);
    }

    /**
     * Fetch information about voucher redemption
     * 
     * @param identifier
     *            of the voucher for which we fetch the redemption details
     * @return voucher redemption information
     */
    public VoucherRedemption redemption(String identifier) {
        return api.redemption(identifier);
    }

    /**
     * List redemptions across all vouchers.
     * 
     * @param filter 
     *          a set of conditions to narrow down the result
     *           
     * @return a list of redemption details
     */
    public List<RedemptionDetails> listRedemptions(RedemptionsFilter filter) {
        return api.listRedemptions(filter);
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
         * Fetch user's list of vouchers which meet provided filters.
         *
         * @param filter
         *            a set of conditions to narrow down the result
         * @return list of vouchers
         */
        public void listVouchers(VouchersFilter filter, VoucherifyCallback<List<Voucher>> callback) {
            RxUtils.subscribe(executor, rx().listVouchers(filter), callback);
        }

        /**
         * Fetch a single resource with an identifier.
         *
         * @param identifier
         *            resource id
         */
        public void fetchVoucher(String identifier, VoucherifyCallback<Voucher> callback) {
            RxUtils.subscribe(executor, rx().fetchVoucher(identifier), callback);
        }

        /**
         * Redeem a voucher by his identifier
         * 
         * @param identifier
         *            of the voucher
         */
        public void redeem(String identifier, String trackingId, VoucherifyCallback<VoucherRedemptionResult> callback) {
            RxUtils.subscribe(executor, rx().redeem(identifier, trackingId), callback);
        }

        /**
         * Redeem a voucher by his identifier
         * 
         * @param identifier
         *            of the voucher
         */
        public void redeem(String identifier, VoucherRedemptionContext redemptionContext,
                VoucherifyCallback<VoucherRedemptionResult> callback) {
            RxUtils.subscribe(executor, rx().redeem(identifier, redemptionContext), callback);
        }

        /**
         * Fetch information about voucher redemption
         * 
         * @param identifier
         *            of the voucher for which we fetch the redemption details
         */
        public void redemption(String identifier, VoucherifyCallback<VoucherRedemption> callback) {
            RxUtils.subscribe(executor, rx().redemption(identifier), callback);
        }
        
        /**
         * List redemptions across all vouchers.
         * 
         * @param filter 
         *          a set of conditions to narrow down the result
         */
        public void listRedemptions(RedemptionsFilter filter, VoucherifyCallback<List<RedemptionDetails>> callback) {
            RxUtils.subscribe(executor, rx().listRedemptions(filter), callback);
        }
    }

    /**
     * RxJava extension.
     */
    public class ExtRxJava extends AbsModule.Rx {

        /**
         * Fetch user's list of vouchers which meet provided filters.
         *
         * @param filter
         *            a set of conditions to narrow down the result
         * @return list of vouchers
         */
        public Observable<List<Voucher>> listVouchers(final VouchersFilter filter) {
            return RxUtils.defer(new RxUtils.DefFunc<List<Voucher>>() {
                @Override
                public List<Voucher> method() {
                    return VoucherModule.this.listVouchers(filter);
                }
            });
        }

        /**
         * Fetch a single resource with an identifier.
         *
         * @param identifier
         *            resource id
         * @return resource result instance
         */
        public Observable<Voucher> fetchVoucher(final String identifier) {
            return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
                @Override
                public Voucher method() {
                    return VoucherModule.this.fetchVoucher(identifier);
                }
            });
        }

        /**
         * Redeem a voucher by his identifier
         * 
         * @param identifier
         *            of the voucher
         * @return voucher which was consumed
         */
        public Observable<VoucherRedemptionResult> redeem(final String identifier, final String trackingId) {
            return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemptionResult>() {
                @Override
                public VoucherRedemptionResult method() {
                    return VoucherModule.this.redeem(identifier, trackingId);
                }
            });
        }

        /**
         * Redeem a voucher by his identifier
         * 
         * @param identifier
         *            of the voucher
         * @return voucher which was consumed
         */
        public Observable<VoucherRedemptionResult> redeem(final String identifier, final VoucherRedemptionContext redemptionContext) {
            return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemptionResult>() {
                @Override
                public VoucherRedemptionResult method() {
                    return VoucherModule.this.redeem(identifier, redemptionContext);
                }
            });
        }

        /**
         * Fetch information about voucher redemption
         * 
         * @param identifier
         *            of the voucher for which we fetch the redemption details
         * @return voucher redemption information
         */
        public Observable<VoucherRedemption> redemption(final String identifier) {
            return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemption>() {
                @Override
                public VoucherRedemption method() {
                    return VoucherModule.this.redemption(identifier);
                }
            });
        }
        
        /**
         * List redemptions across all vouchers.
         * 
         * @param filter 
         *          a set of conditions to narrow down the result
         *           
         * @return a list of redemption details
         */
        public Observable<List<RedemptionDetails>> listRedemptions(final RedemptionsFilter filter) {
            return RxUtils.defer(new RxUtils.DefFunc<List<RedemptionDetails>>() {
                @Override
                public List<RedemptionDetails> method() {
                    return VoucherModule.this.listRedemptions(filter);
                }
            });
        }

    }

}
