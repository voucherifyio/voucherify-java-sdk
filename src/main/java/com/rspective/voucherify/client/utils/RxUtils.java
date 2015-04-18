package com.rspective.voucherify.client.utils;

import com.rspective.voucherify.client.callback.VoucherifyCallback;
import com.rspective.voucherify.client.exception.VoucherifyException;

import java.util.concurrent.Executor;

import retrofit.RetrofitError;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.schedulers.Schedulers;

/**
 * Utils's class used to wrap sync and async calls into RX world
 */
public final class RxUtils {

    /**
     *
     * @param executor
     * @param observable
     * @param callback
     * @param <R>
     * @return
     */
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

    /**
     * Convert method into observable
     * @param <T> represents return type of the wrapped method
     */
    public abstract static class DefFunc<T> implements Func0<Observable<T>> {
        @Override
        public final Observable<T> call() {
            return Observable.just(method());
        }

        public abstract T method();
    }

    /**
     * Requests are manged in io thread by default
     * @param func
     * @param <R>
     * @return
     */
    public static <R> Observable<R> defer(DefFunc<R> func) {
        return Observable.defer(func).subscribeOn(Schedulers.io());
    }

}
