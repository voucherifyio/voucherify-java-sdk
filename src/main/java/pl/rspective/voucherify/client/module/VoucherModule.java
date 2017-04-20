package pl.rspective.voucherify.client.module;

import java.util.List;
import java.util.concurrent.Executor;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.PublishParams;
import pl.rspective.voucherify.client.model.RedemptionsFilter;
import pl.rspective.voucherify.client.model.RedemptionsList;
import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherRedemption;
import pl.rspective.voucherify.client.model.VoucherRedemptionContext;
import pl.rspective.voucherify.client.model.VoucherRedemptionResult;
import pl.rspective.voucherify.client.model.VoucherUpdate;
import pl.rspective.voucherify.client.model.VoucherValidity;
import pl.rspective.voucherify.client.model.VoucherValidityContext;
import pl.rspective.voucherify.client.model.VouchersFilter;
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
     * Create a voucher.
     * 
     * @param voucher
     *          voucher to be created
     *          
     * @return created voucher 
     */
    public Voucher createVoucher(Voucher voucher) {
        if (voucher.getCode() != null) {
            return api.createVoucherWithCode(voucher.getCode(), voucher);
        } else {
            return api.createVoucher(voucher);    
        }
    }
    
    /**
     * Update voucher.
     * 
     * @param code
     *          code of a voucher that should be updated
     * @param voucherUpdate
     *          voucher fields to be updated
     *          
     * @return updated voucher 
     */
    public Voucher updateVoucher(String code, VoucherUpdate voucherUpdate) {
        return api.updateVoucher(code, voucherUpdate);
    }

    /**
     * Publish voucher.
     *
     * @param publishParams
     *          voucher code or campaign name with publish details
     *
     * @return published voucher
     */
    public Voucher publishVoucher(PublishParams publishParams) {
        return api.publishVoucher(publishParams);
    }
    
    /**
     * Disable a voucher.
     * 
     * @param code
     *          code of a voucher that should be disabled
     */
    public void disableVoucher(String code) {
        api.disableVoucher(code);
    }
    
    /**
     * Enable a voucher.
     * 
     * @param code
     *          code of a voucher that should be enabled
     */
    public void enableVoucher(String code) {
        api.enableVoucher(code);
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
    public RedemptionsList listRedemptions(RedemptionsFilter filter) {
        return api.listRedemptions(filter);
    }
    
    /**
     * Redemption rollback reverts a redemption. 
     * 
     * @param redemptionId (required)
     *          id of a redemption
     * @param trackingId (optional)
     *          id of a customer
     * @param reason (optional)
     *           
     * @return rollback result 
     */
    public VoucherRedemptionResult rollbackRedemption(String redemptionId, String trackingId, String reason) {
        return api.rollbackRedemption(redemptionId, trackingId, reason);
    }

    /**
     * Validates given voucher code against the customer.
     *
     * @param code
     *          code of the voucher
     * @param validityContext
     *          a context in terms of which the voucher is being validated (e.g. customer profile)
     *
     * @return voucher validity information
     */
    public VoucherValidity validate(String code, VoucherValidityContext validityContext) {
        return api.validate(code, validityContext);
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
         * Create a voucher.
         * 
         * @param voucher
         *          voucher to be created
         *          
         */
        public void createVoucher(Voucher voucher, VoucherifyCallback<Voucher> callback) {
            RxUtils.subscribe(executor, rx().createVoucher(voucher), callback);
        }

        /**
         * Update voucher.
         * 
         * @param code
         *          code of a voucher that should be updated
         * @param voucherUpdate
         *          voucher fields to be updated 
         * @param callback
         *          callback to be invoked when voucher is updated         
         */
        public void updateVoucher(String code, VoucherUpdate voucherUpdate, VoucherifyCallback<Voucher> callback) {
            RxUtils.subscribe(executor, rx().updateVoucher(code, voucherUpdate), callback);
        }
        
        /**
         * Disable a voucher.
         * 
         * @param code
         *          code of a voucher that should be disabled
         */
        public void disableVoucher(String code, VoucherifyCallback<Void> callback) {
            RxUtils.subscribe(executor, rx().disableVoucher(code), callback);
        }

        /**
         * Enable a voucher.
         * 
         * @param code
         *          code of a voucher that should be enabled
         */
        public void enableVoucher(String code, VoucherifyCallback<Void> callback) {
            RxUtils.subscribe(executor, rx().disableVoucher(code), callback);
        }

        /**
         * Publish suitable voucher by given params
         *
         * @param publishParams
         *          voucher code or campaign name with publish details
         */
        public void publishVoucher(PublishParams publishParams, VoucherifyCallback<Voucher> callback) {
            RxUtils.subscribe(executor, rx().publishVoucher(publishParams), callback);
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
        public void listRedemptions(RedemptionsFilter filter, VoucherifyCallback<RedemptionsList> callback) {
            RxUtils.subscribe(executor, rx().listRedemptions(filter), callback);
        }
        
        /**
         * Redemption rollback reverts a redemption. 
         * 
         * @param redemptionId (required)
         *          id of a redemption
         * @param trackingId (optional)
         *          id of a customer
         * @param reason (optional)
         *    
         */
        public void rollbackRedemption(String redemptionId, String trackingId, String reason, VoucherifyCallback<VoucherRedemptionResult> callback) {
            RxUtils.subscribe(executor, rx().rollbackRedemption(redemptionId, trackingId, reason), callback);
        }

        /**
         * Validates given voucher code against the customer.
         *
         * @param code
         *          code of the voucher
         * @param validityContext
         *          a context in terms of which the voucher is being validated (e.g. customer profile)
         *
         * @return voucher validity information
         */
        public void validate(String code, VoucherValidityContext validityContext, VoucherifyCallback<VoucherValidity> callback) {
            RxUtils.subscribe(executor, rx().validate(code, validityContext), callback);
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
         * Create a voucher.
         * 
         * @param voucher
         *          voucher to be created
         *          
         * @return created voucher 
         */
        public Observable<Voucher> createVoucher(final Voucher voucher) {
            return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
                @Override
                public Voucher method() {
                    return VoucherModule.this.createVoucher(voucher);
                }
            });
        }
        
        /**
         * Update voucher.
         * 
         * @param code
         *          code of a voucher that should be updated
         * @param voucherUpdate
         *          voucher fields to be updated
         *          
         * @return updated voucher 
         */
        public Observable<Voucher> updateVoucher(final String code, final VoucherUpdate voucherUpdate) {
            return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
                @Override
                public Voucher method() {
                    return VoucherModule.this.updateVoucher(code, voucherUpdate);
                }
            });
        }
        
        /**
         * Disable a voucher.
         * 
         * @param code
         *          code of a voucher that should be disabled
         */
        public Observable<Void> disableVoucher(final String code) {
            return RxUtils.defer(new RxUtils.DefFunc<Void>() {
                @Override
                public Void method() {
                    VoucherModule.this.disableVoucher(code);
                    return null;
                }
            });
        }
        
        /**
         * Enable a voucher.
         * 
         * @param code
         *          code of a voucher that should be enabled
         */
        public Observable<Void> enableVoucher(final String code) {
            return RxUtils.defer(new RxUtils.DefFunc<Void>() {
                @Override
                public Void method() {
                    VoucherModule.this.enableVoucher(code);
                    return null;
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
         * Publish suitable voucher by given params
         *
         * @param publishParams
         *          voucher code or campaign name with publish details
         * @return published voucher
         */
        public Observable<Voucher> publishVoucher(final PublishParams publishParams) {
            return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
                @Override
                public Voucher method() {
                    return VoucherModule.this.publishVoucher(publishParams);
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
        public Observable<RedemptionsList> listRedemptions(final RedemptionsFilter filter) {
            return RxUtils.defer(new RxUtils.DefFunc<RedemptionsList>() {
                @Override
                public RedemptionsList method() {
                    return VoucherModule.this.listRedemptions(filter);
                }
            });
        }
        
        
        /**
         * Redemption rollback reverts a redemption. 
         * 
         * @param redemptionId (required)
         *          id of a redemption
         * @param trackingId (optional)
         *          id of a customer
         * @param reason (optional)
         *           
         * @return rollback result 
         */
        public Observable<VoucherRedemptionResult> rollbackRedemption(final String redemptionId, final String trackingId, final String reason) {
            return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemptionResult>() {
                @Override
                public VoucherRedemptionResult method() {
                    return api.rollbackRedemption(redemptionId, trackingId, reason);
                }
            });
        }


        /**
         * Validates given voucher code against the customer.
         *
         * @param code
         *          code of the voucher
         * @param validityContext
         *          a context in terms of which the voucher is being validated (e.g. customer profile)
         *
         * @return voucher validity information
         */
        public Observable<VoucherValidity> validate(final String code, final VoucherValidityContext validityContext) {
            return RxUtils.defer(new RxUtils.DefFunc<VoucherValidity>() {
                @Override
                public VoucherValidity method() {
                return api.validate(code, validityContext);
                }
            });
        }
    }

}
