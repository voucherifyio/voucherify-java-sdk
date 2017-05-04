package io.voucherify.client.utils;

import io.voucherify.client.callback.VoucherifyCallback;
import retrofit.RetrofitError;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.schedulers.Schedulers;

import java.util.concurrent.Executor;

public final class RxUtils {

  public static <R> VoucherifyCallback<R> subscribe(final Executor executor, Observable<R> observable, final VoucherifyCallback<R> callback) {
    observable
            .subscribe(
                    new Action1<R>() {
                      @Override
                      public void call(final R r) {
                        executor.execute(new Runnable() {
                          @Override
                          public void run() {
                            callback.onSuccess(r);
                          }
                        });
                      }
                    },
                    new Action1<Throwable>() {
                      @Override
                      public void call(final Throwable throwable) {
                        executor.execute(new Runnable() {
                          @Override
                          public void run() {
                            callback.onFailure(RetrofitError.unexpectedError("", throwable));
                          }
                        });
                      }
                    });

    return callback;
  }

  public abstract static class DefFunc<T> implements Func0<Observable<T>> {

    @Override
    public final Observable<T> call() {
      return Observable.just(method());
    }

    public abstract T method();
  }

  public static <R> Observable<R> defer(DefFunc<R> func) {
    return Observable.defer(func).subscribeOn(Schedulers.io());
  }

}
