package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.qualifications.ExamineQualifications;
import io.voucherify.client.model.qualifications.response.ExamineQualificationResponse;
import io.voucherify.client.module.QualificationModule.ExtAsync;
import io.voucherify.client.module.QualificationModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import java.util.concurrent.Executor;

public class QualificationModule extends AbsModule<ExtAsync, ExtRxJava> {

  public QualificationModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public ExamineQualificationResponse examineQualification(ExamineQualifications examineQualifications) {
    return executeSyncApiCall(api.examineQualification(examineQualifications));
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

    public void examineQualification(ExamineQualifications examineQualifications, VoucherifyCallback<ExamineQualificationResponse> callback) {
      RxUtils.subscribe(executor, rx().examineQualification(examineQualifications), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<ExamineQualificationResponse> examineQualification(final ExamineQualifications examineQualifications) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ExamineQualificationResponse>() {

            @Override
            public ExamineQualificationResponse method() {
              return QualificationModule.this.examineQualification(examineQualifications);
            }
          });
    }
  }
}
