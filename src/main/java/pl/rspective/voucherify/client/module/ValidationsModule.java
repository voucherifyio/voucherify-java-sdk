package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.validation.VoucherValidation;
import pl.rspective.voucherify.client.model.validation.VoucherValidationResponse;
import pl.rspective.voucherify.client.module.ValidationsModule.ExtAsync;
import pl.rspective.voucherify.client.module.ValidationsModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class ValidationsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public ValidationsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public VoucherValidationResponse validate(String code, VoucherValidation voucherValidation) {
    return api.validateVoucher(code, voucherValidation);
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
  }

}
