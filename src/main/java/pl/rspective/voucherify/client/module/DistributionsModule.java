package pl.rspective.voucherify.client.module;

import java.util.concurrent.Executor;
import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.PublishParams;
import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.module.DistributionsModule.ExtAsync;
import pl.rspective.voucherify.client.module.DistributionsModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

/**
 * Distributions Module
 */
public final class DistributionsModule extends AbsModule<ExtAsync, ExtRxJava> {

  /**
   * @param api describes Voucherify REST API
   * @param executor of threads for current platform
   */
  public DistributionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  /**
   * Publish Voucher
   *
   * @param publishParams voucher code or campaign name with publish details
   * @return {@link Voucher} published voucher
   */
  public Voucher publish(PublishParams publishParams) {
    return api.publishVoucher(publishParams);
  }

  @Override
  ExtAsync createAsyncExtension() {
    return new ExtAsync();
  }

  @Override
  ExtRxJava createRxJavaExtension() {
    return new ExtRxJava();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ExtAsync async() {
    return extAsync;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ExtRxJava rx() {
    return extRxJava;
  }

  /**
   * Async extension.
   */
  public class ExtAsync extends AbsModule.Async {

    /**
     * Publish Voucher
     *
     * @param publishParams voucher code or campaign name with publish details
     */
    public void publish(PublishParams publishParams, VoucherifyCallback<Voucher> callback) {
      RxUtils.subscribe(executor, rx().publish(publishParams), callback);
    }
  }

  /**
   * RxJava extension.
   */
  public class ExtRxJava extends AbsModule.Rx {

    /**
     * Publish Voucher
     *
     * @param publishParams voucher code or campaign name with publish details
     * @return {@link Voucher} published voucher
     */
    public Observable<Voucher> publish(final PublishParams publishParams) {
      return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
        @Override
        public Voucher method() {
          return DistributionsModule.this.publish(publishParams);
        }
      });
    }
  }
}
