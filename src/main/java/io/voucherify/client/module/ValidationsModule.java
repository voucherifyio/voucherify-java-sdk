package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.validation.PromotionValidation;
import io.voucherify.client.model.validation.VoucherValidation;
import io.voucherify.client.model.validation.VoucherValidationResponse;
import io.voucherify.client.model.validation.response.PromotionValidationResponse;
import io.voucherify.client.module.ValidationsModule.ExtAsync;
import io.voucherify.client.module.ValidationsModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class ValidationsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public ValidationsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public VoucherValidationResponse validate(String code, VoucherValidation voucherValidation) {
    return api.validateVoucher(code, voucherValidation);
  }

  public PromotionValidationResponse validate(PromotionValidation promotionValidation) {
    return api.validatePromotion(promotionValidation);
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

    public void validate(String code, VoucherValidation voucherValidation, VoucherifyCallback<VoucherValidationResponse> callback) {
      RxUtils.subscribe(executor, rx().validate(code, voucherValidation), callback);
    }

    public void validate(PromotionValidation promotionValidation, VoucherifyCallback<PromotionValidationResponse> callback) {
      RxUtils.subscribe(executor, rx().validate(promotionValidation), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<VoucherValidationResponse> validate(final String code, final VoucherValidation voucherValidation) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherValidationResponse>() {

        @Override
        public VoucherValidationResponse method() {
          return ValidationsModule.this.validate(code, voucherValidation);
        }
      });
    }

    public Observable<PromotionValidationResponse> validate(final PromotionValidation promotionValidation) {
      return RxUtils.defer(new RxUtils.DefFunc<PromotionValidationResponse>() {

        @Override
        public PromotionValidationResponse method() {
          return ValidationsModule.this.validate(promotionValidation);
        }
      });
    }
  }

}
