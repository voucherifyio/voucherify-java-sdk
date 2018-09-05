package io.voucherify.client.module;

import io.reactivex.Observable;
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
import io.voucherify.client.utils.Irrelevant;
import io.voucherify.client.utils.RxUtils;

import java.util.HashMap;
import java.util.concurrent.Executor;

public final class DistributionsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public DistributionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public PublishVoucherResponse publish(PublishVoucher publishVoucher) {
    return executeSyncApiCall(api.publishVoucher(publishVoucher));
  }

  public ExportResponse createExport(CreateExport createExport) {
    return executeSyncApiCall(api.createExport(createExport));
  }

  public ExportResponse getExport(String id) {
    return executeSyncApiCall(api.getExport(id));
  }

  public void deleteExport(String id) {
    executeSyncApiCall(api.deleteExport(id));
  }

  public ListPublicationsResponse list(ListPublicationsFilter filter) {
    return executeSyncApiCall(api.list(filter.asMap()));
  }

  public ListPublicationsResponse list() {
    return executeSyncApiCall(api.list(new HashMap<>()));
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

    public void publish(
        PublishVoucher publishParams, VoucherifyCallback<PublishVoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().publish(publishParams), callback);
    }

    public void createExport(
        CreateExport createExport, VoucherifyCallback<ExportResponse> callback) {
      RxUtils.subscribe(executor, rx().createExport(createExport), callback);
    }

    public void getExport(String id, VoucherifyCallback<ExportResponse> callback) {
      RxUtils.subscribe(executor, rx().getExport(id), callback);
    }

    public void deleteExport(String id, VoucherifyCallback<Irrelevant> callback) {
      RxUtils.subscribe(executor, rx().deleteExport(id), callback);
    }

    public void list(
        ListPublicationsFilter filter, VoucherifyCallback<ListPublicationsResponse> callback) {
      RxUtils.subscribe(executor, rx().list(filter), callback);
    }

    public void list(VoucherifyCallback<ListPublicationsResponse> callback) {
      RxUtils.subscribe(executor, rx().list(), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<PublishVoucherResponse> publish(final PublishVoucher publishVoucher) {
      return RxUtils.defer(
          new RxUtils.DefFunc<PublishVoucherResponse>() {

            @Override
            public PublishVoucherResponse method() {
              return DistributionsModule.this.publish(publishVoucher);
            }
          });
    }

    public Observable<ExportResponse> createExport(final CreateExport createExport) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ExportResponse>() {

            @Override
            public ExportResponse method() {
              return DistributionsModule.this.createExport(createExport);
            }
          });
    }

    public Observable<ExportResponse> getExport(final String id) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ExportResponse>() {

            @Override
            public ExportResponse method() {
              return DistributionsModule.this.getExport(id);
            }
          });
    }

    public Observable<Irrelevant> deleteExport(final String id) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Irrelevant>() {

            @Override
            public Irrelevant method() {
              DistributionsModule.this.deleteExport(id);
              return Irrelevant.NO_RESPONSE;
            }
          });
    }

    public Observable<ListPublicationsResponse> list(final ListPublicationsFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListPublicationsResponse>() {

            @Override
            public ListPublicationsResponse method() {
              return DistributionsModule.this.list(filter);
            }
          });
    }

    public Observable<ListPublicationsResponse> list() {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListPublicationsResponse>() {

            @Override
            public ListPublicationsResponse method() {
              return DistributionsModule.this.list();
            }
          });
    }
  }
}
