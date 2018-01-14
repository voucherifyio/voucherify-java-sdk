package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.event.CustomEvent;
import io.voucherify.client.model.event.response.CustomEventResponse;
import io.voucherify.client.module.EventsModule.ExtAsync;
import io.voucherify.client.module.EventsModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public class EventsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public EventsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CustomEventResponse track(CustomEvent customEvent) {
    return api.createCustomEvent(customEvent);
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

    public void track(CustomEvent customEvent, VoucherifyCallback<CustomEventResponse> callback) {
      RxUtils.subscribe(executor, rx().track(customEvent), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CustomEventResponse> track(final CustomEvent customEvent) {
      return RxUtils.defer(new RxUtils.DefFunc<CustomEventResponse>() {

        @Override
        public CustomEventResponse method() {
          return EventsModule.this.track(customEvent);
        }
      });
    }
  }
}
