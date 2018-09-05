package io.voucherify.client.utils;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.error.VoucherifyErrorHandler;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class RxUtils {

  private static final VoucherifyErrorHandler HANDLER = new VoucherifyErrorHandler();

  public static <R> VoucherifyCallback<R> subscribe(
      final Executor executor, Observable<R> observable, final VoucherifyCallback<R> callback) {
    observable.subscribe(
        r -> executor.execute(() -> callback.onSuccess(r)),
        throwable -> executor.execute(() -> callback.onFailure(HANDLER.from(throwable))));

    return callback;
  }

  public static <R> Observable<R> defer(DefFunc<R> func) {
    return Observable.defer(func).subscribeOn(Schedulers.io());
  }

  public abstract static class DefFunc<T> implements Callable<Observable<T>> {

    @Override
    public final Observable<T> call() {
      return Observable.just(method());
    }

    public abstract T method();
  }
}
