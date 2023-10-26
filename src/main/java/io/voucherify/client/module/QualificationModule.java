package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.qualifications.CheckEligibility;
import io.voucherify.client.model.qualifications.response.CheckEligibilityResponse;
import io.voucherify.client.module.QualificationModule.ExtAsync;
import io.voucherify.client.module.QualificationModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import java.util.concurrent.Executor;

public class QualificationModule extends AbsModule<ExtAsync, ExtRxJava> {

  public QualificationModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CheckEligibilityResponse checkEligibility(CheckEligibility checkEligibility) {
    return executeSyncApiCall(api.checkEligibility(checkEligibility));
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

    public void checkEligibility(CheckEligibility checkEligibility, VoucherifyCallback<CheckEligibilityResponse> callback) {
      RxUtils.subscribe(executor, rx().checkEligibility(checkEligibility), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CheckEligibilityResponse> checkEligibility(final CheckEligibility checkEligibility) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CheckEligibilityResponse>() {

            @Override
            public CheckEligibilityResponse method() {
              return QualificationModule.this.checkEligibility(checkEligibility);
            }
          });
    }
  }
}
