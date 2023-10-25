package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.model.consents.response.ListConsentsResponse;
import io.voucherify.client.utils.RxUtils;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.module.ConsentsModule.ExtAsync;
import io.voucherify.client.module.ConsentsModule.ExtRxJava;

import java.util.concurrent.Executor;

public class ConsentsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public ConsentsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public ListConsentsResponse listConsents() {
    return executeSyncApiCall(api.listConsents());
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

    public void listConsents(VoucherifyCallback<ListConsentsResponse> callback) {
      RxUtils.subscribe(executor, rx().listConsents(), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<ListConsentsResponse> listConsents() {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListConsentsResponse>() {

            @Override
            public ListConsentsResponse method() {
              return ConsentsModule.this.listConsents();
            }
          });
    }
  }
}
