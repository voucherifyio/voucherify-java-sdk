package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.publish.PublishVoucher;
import pl.rspective.voucherify.client.model.voucher.Voucher;
import pl.rspective.voucherify.client.module.DistributionsModule.ExtAsync;
import pl.rspective.voucherify.client.module.DistributionsModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class DistributionsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public DistributionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public Voucher publish(PublishVoucher publishVoucher) {
    return api.publishVoucher(publishVoucher);
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

    public void publish(PublishVoucher publishParams, VoucherifyCallback<Voucher> callback) {
      RxUtils.subscribe(executor, rx().publish(publishParams), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<Voucher> publish(final PublishVoucher publishVoucher) {
      return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
        @Override
        public Voucher method() {
          return DistributionsModule.this.publish(publishVoucher);
        }
      });
    }
  }
}