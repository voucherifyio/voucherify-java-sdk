package pl.rspective.voucherify.client.module;

import java.util.concurrent.Executor;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.VoucherValidationContext;
import pl.rspective.voucherify.client.model.VoucherValidationResult;
import pl.rspective.voucherify.client.module.ValidationsModule.ExtAsync;
import pl.rspective.voucherify.client.module.ValidationsModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

/**
 * Validations Module to manage communication with Voucherify
 */
public final class ValidationsModule extends AbsModule<ExtAsync, ExtRxJava> {

    /**
     *
     * @param api
     *            describes Voucherify REST API
     * @param executor
     *            of threads for current platform
     */
    public ValidationsModule(VoucherifyApi api, Executor executor) {
        super(api, executor);
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
    public VoucherValidationResult validateVoucher(String code, VoucherValidationContext validityContext) {
        return api.validateVoucher(code, validityContext);
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
         * Validates given voucher code against the customer.
         *
         * @param code
         *          code of the voucher
         * @param validationContext
         *          a context in terms of which the voucher is being validated (e.g. customer profile)
         *
         */
        public void validateVoucher(String code, VoucherValidationContext validationContext, VoucherifyCallback<VoucherValidationResult> callback) {
            RxUtils.subscribe(executor, rx().validateVoucher(code, validationContext), callback);
        }
    }

    /**
     * RxJava extension.
     */
    public class ExtRxJava extends AbsModule.Rx {

        /**
         * Validates given voucher code against the customer.
         *
         * @param code
         *          code of the voucher
         * @param validitionContext
         *          a context in terms of which the voucher is being validated (e.g. customer profile)
         *
         * @return voucher validity information
         */
        public Observable<VoucherValidationResult> validateVoucher(final String code, final VoucherValidationContext validitionContext) {
            return RxUtils.defer(new RxUtils.DefFunc<VoucherValidationResult>() {
                @Override
                public VoucherValidationResult method() {
                return api.validateVoucher(code, validitionContext);
                }
            });
        }
    }

}
