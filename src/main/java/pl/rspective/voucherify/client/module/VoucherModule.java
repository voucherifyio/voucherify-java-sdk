package pl.rspective.voucherify.client.module;

import java.util.List;
import java.util.concurrent.Executor;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.model.RedemptionDetails;
import pl.rspective.voucherify.client.model.RedemptionsFilter;
import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherRedemption;
import pl.rspective.voucherify.client.model.VoucherRedemptionResult;

/**
 * Vouchers Module to manage communication with Voucherify
 */
public final class VoucherModule extends BaseModule<Voucher, VoucherRedemption, VoucherRedemptionResult> {

    /**
     *
     * @param api describes Voucherify REST API
     * @param executor of threads for current platform
     */
    public VoucherModule(VoucherifyApi api, Executor executor) {
        super(api, executor);
    }
    
    public List<RedemptionDetails> listRedemptions(RedemptionsFilter filter) {
        return api.listRedemptions(filter);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public ExtAsync async() {
        return extAsync;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public ExtRxJava rx() {
        return extRxJava;
    }

}
