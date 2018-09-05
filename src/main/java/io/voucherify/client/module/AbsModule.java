package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.error.VoucherifyErrorHandler;
import io.voucherify.client.module.AbsModule.Async;
import io.voucherify.client.module.AbsModule.Rx;
import retrofit2.Call;

import java.io.IOException;
import java.util.concurrent.Executor;

abstract class AbsModule<A extends Async, R extends Rx> {

  final Executor executor;

  final VoucherifyApi api;

  final A extAsync;

  final R extRxJava;

  private final VoucherifyErrorHandler errorHandler = new VoucherifyErrorHandler();

  AbsModule(VoucherifyApi api, Executor executor) {
    this.api = api;
    this.executor = executor;

    this.extAsync = createAsyncExtension();
    this.extRxJava = createRxJavaExtension();
  }

  protected <T> T executeSyncApiCall(Call<T> call) {
    try {
      return call.execute().body();
    } catch (IOException e) {
      throw errorHandler.from(e);
    }
  }

  abstract A createAsyncExtension();

  abstract R createRxJavaExtension();

  public abstract A async();

  public abstract R rx();

  public static class Rx {}

  public static class Async {}
}
