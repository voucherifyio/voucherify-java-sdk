package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.async_actions.AsyncActionResponse;
import io.voucherify.client.model.async_actions.AsyncActionsFilter;
import io.voucherify.client.model.async_actions.AsyncActionsResponse;
import io.voucherify.client.utils.RxUtils;

import java.util.concurrent.Executor;

public final class AsyncActionsModule extends AbsModule<AsyncActionsModule.ExtAsync, AsyncActionsModule.ExtRxJava> {

  public AsyncActionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public AsyncActionResponse get(String id) {
    return executeSyncApiCall(api.getAsyncAction(id));
  }

  public AsyncActionsResponse list(AsyncActionsFilter asyncActionsFilter) {
    return executeSyncApiCall(api.listAsyncActions(asyncActionsFilter.asMap()));
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

    public void get(String id, VoucherifyCallback<AsyncActionResponse> callback) {
      RxUtils.subscribe(executor, rx().get(id), callback);
    }

      public void list(AsyncActionsFilter filter, VoucherifyCallback<AsyncActionsResponse> callback) {
          RxUtils.subscribe(executor, rx().list(filter), callback);
      }

  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<AsyncActionResponse> get(final String id) {
      return RxUtils.defer(
          new RxUtils.DefFunc<AsyncActionResponse>() {

            @Override
            public AsyncActionResponse method() {
              return AsyncActionsModule.this.get(id);
            }
          });
    }

    public Observable<AsyncActionsResponse> list(final AsyncActionsFilter asyncActionsFilter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<AsyncActionsResponse>() {

            @Override
            public AsyncActionsResponse method() {
              return AsyncActionsModule.this.list(asyncActionsFilter);
            }
          });
    }

  }
}
