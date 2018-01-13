package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.distribution.CreateExport;
import io.voucherify.client.model.distribution.ListPublicationsFilter;
import io.voucherify.client.model.distribution.PublishVoucher;
import io.voucherify.client.model.distribution.response.ExportResponse;
import io.voucherify.client.model.distribution.response.ListPublicationsResponse;
import io.voucherify.client.model.distribution.response.PublishVoucherResponse;
import io.voucherify.client.module.DistributionsModule.ExtAsync;
import io.voucherify.client.module.DistributionsModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class DistributionsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public DistributionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public PublishVoucherResponse publish(PublishVoucher publishVoucher) {
    return api.publishVoucher(publishVoucher);
  }

  public ExportResponse createExport(CreateExport createExport) {
    return api.createExport(createExport);
  }

  public ExportResponse getExport(String id) {
    return api.getExport(id);
  }

  public void deleteExport(String id) {
    api.deleteExport(id);
  }

  public ListPublicationsResponse list(ListPublicationsFilter filter) {
    return api.list(filter.asMap());
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

    public void publish(PublishVoucher publishParams, VoucherifyCallback<PublishVoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().publish(publishParams), callback);
    }

    public void createExport(CreateExport createExport, VoucherifyCallback<ExportResponse> callback) {
      RxUtils.subscribe(executor, rx().createExport(createExport), callback);
    }

    public void getExport(String id, VoucherifyCallback<ExportResponse> callback) {
      RxUtils.subscribe(executor, rx().getExport(id), callback);
    }

    public void deleteExport(String id, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().deleteExport(id), callback);
    }

    public void list(ListPublicationsFilter filter, VoucherifyCallback<ListPublicationsResponse> callback) {
      RxUtils.subscribe(executor, rx().list(filter), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<PublishVoucherResponse> publish(final PublishVoucher publishVoucher) {
      return RxUtils.defer(new RxUtils.DefFunc<PublishVoucherResponse>() {

        @Override
        public PublishVoucherResponse method() {
          return DistributionsModule.this.publish(publishVoucher);
        }
      });
    }

    public Observable<ExportResponse> createExport(final CreateExport createExport) {
      return RxUtils.defer(new RxUtils.DefFunc<ExportResponse>() {

        @Override
        public ExportResponse method() {
          return DistributionsModule.this.createExport(createExport);
        }
      });
    }

    public Observable<ExportResponse> getExport(final String id) {
      return RxUtils.defer(new RxUtils.DefFunc<ExportResponse>() {

        @Override
        public ExportResponse method() {
          return DistributionsModule.this.getExport(id);
        }
      });
    }

    public Observable<Void> deleteExport(final String id) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {

        @Override
        public Void method() {
          DistributionsModule.this.deleteExport(id);
          return null;
        }
      });
    }

    public Observable<ListPublicationsResponse> list(final ListPublicationsFilter filter) {
      return RxUtils.defer(new RxUtils.DefFunc<ListPublicationsResponse>() {

        @Override
        public ListPublicationsResponse method() {
          return DistributionsModule.this.list(filter);
        }
      });
    }
  }
}