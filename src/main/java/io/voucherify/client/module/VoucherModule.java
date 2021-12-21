package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.QualificationContext;
import io.voucherify.client.model.QualificationList;
import io.voucherify.client.model.QualifiedResourceFilter;
import io.voucherify.client.model.voucher.*;
import io.voucherify.client.model.voucher.response.AddBalanceResponse;
import io.voucherify.client.model.voucher.response.ImportVouchersResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import io.voucherify.client.model.voucher.response.VouchersResponse;
import io.voucherify.client.module.VoucherModule.ExtAsync;
import io.voucherify.client.module.VoucherModule.ExtRxJava;
import io.voucherify.client.utils.Irrelevant;
import io.voucherify.client.utils.RxUtils;

import java.util.HashMap;
import java.util.concurrent.Executor;

public final class VoucherModule extends AbsModule<ExtAsync, ExtRxJava> {

  public VoucherModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public VoucherResponse create(CreateVoucher createVoucher) {
    if (createVoucher.getVoucher().getCode() != null) {
      return executeSyncApiCall(
          api.createVoucher(createVoucher.getVoucher().getCode(), createVoucher));
    }
    return executeSyncApiCall(api.createVoucher(createVoucher));
  }

  public VoucherResponse get(String code) {
    return executeSyncApiCall(api.getVoucher(code));
  }

  public VoucherResponse update(String code, VoucherUpdate voucherUpdate) {
    return executeSyncApiCall(api.updateVoucher(code, voucherUpdate));
  }

  public void delete(String code, Boolean force) {
    executeSyncApiCall(api.deleteVoucher(code, force));
  }

  public VouchersResponse list(VouchersFilter vouchersFilter) {
    return executeSyncApiCall(api.listVouchers(vouchersFilter.asMap()));
  }

  public VoucherResponse disable(String code) {
    return executeSyncApiCall(api.disable(code));
  }

  public VoucherResponse enable(String code) {
    return executeSyncApiCall(api.enable(code));
  }

  public AddBalanceResponse addBalance(String code, AddBalance addBalance) {
    return executeSyncApiCall(api.addBalance(code, addBalance));
  }

  public ImportVouchersResponse importVouchers(ImportVouchers vouchers) {
    return executeSyncApiCall(api.importVouchers(vouchers));
  }

  public QualificationList<VoucherResponse> getQualified(
      QualificationContext context, QualifiedResourceFilter filter) {
    return executeSyncApiCall(
        api.getQualifiedVouchers(context, filter != null ? filter.asMap() : new HashMap<>()));
  }

  public void releaseSession(String code, String sessionKey) {
    executeSyncApiCall(api.releaseSession(code, sessionKey));
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

    public void list(VouchersFilter filter, VoucherifyCallback<VouchersResponse> callback) {
      RxUtils.subscribe(executor, rx().list(filter), callback);
    }

    public void get(String code, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().get(code), callback);
    }

    public void create(CreateVoucher createVoucher, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().create(createVoucher), callback);
    }

    public void update(
        String code, VoucherUpdate voucherUpdate, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().update(code, voucherUpdate), callback);
    }

    public void disable(String code, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().disable(code), callback);
    }

    public void enable(String code, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().enable(code), callback);
    }

    public void addBalance(
        String code, AddBalance addBalance, VoucherifyCallback<AddBalanceResponse> callback) {
      RxUtils.subscribe(executor, rx().addBalance(code, addBalance), callback);
    }

    public void importVouchers(
        ImportVouchers importVouchers, VoucherifyCallback<ImportVouchersResponse> callback) {
      RxUtils.subscribe(executor, rx().importVouchers(importVouchers), callback);
    }

    public void getQualifiedVouchers(
        QualificationContext context,
        QualifiedResourceFilter filter,
        VoucherifyCallback<QualificationList<VoucherResponse>> callback) {
      RxUtils.subscribe(executor, rx().getQualified(context, filter), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<VoucherResponse> create(final CreateVoucher createVoucher) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VoucherResponse>() {

            @Override
            public VoucherResponse method() {
              return VoucherModule.this.create(createVoucher);
            }
          });
    }

    public Observable<VoucherResponse> get(final String code) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VoucherResponse>() {

            @Override
            public VoucherResponse method() {
              return VoucherModule.this.get(code);
            }
          });
    }

    public Observable<VoucherResponse> update(
        final String code, final VoucherUpdate voucherUpdate) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VoucherResponse>() {

            @Override
            public VoucherResponse method() {
              return VoucherModule.this.update(code, voucherUpdate);
            }
          });
    }

    public Observable<Irrelevant> delete(final String code, final Boolean force) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Irrelevant>() {

            @Override
            public Irrelevant method() {
              VoucherModule.this.delete(code, force);
              return Irrelevant.NO_RESPONSE;
            }
          });
    }

    public Observable<VouchersResponse> list(final VouchersFilter vouchersFilter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VouchersResponse>() {

            @Override
            public VouchersResponse method() {
              return VoucherModule.this.list(vouchersFilter);
            }
          });
    }

    public Observable<VoucherResponse> disable(final String code) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VoucherResponse>() {

            @Override
            public VoucherResponse method() {
              return VoucherModule.this.disable(code);
            }
          });
    }

    public Observable<VoucherResponse> enable(final String code) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VoucherResponse>() {

            @Override
            public VoucherResponse method() {
              return VoucherModule.this.enable(code);
            }
          });
    }

    public Observable<AddBalanceResponse> addBalance(
        final String code, final AddBalance addBalance) {
      return RxUtils.defer(
          new RxUtils.DefFunc<AddBalanceResponse>() {

            @Override
            public AddBalanceResponse method() {
              return VoucherModule.this.addBalance(code, addBalance);
            }
          });
    }

    public Observable<ImportVouchersResponse> importVouchers(final ImportVouchers importVouchers) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ImportVouchersResponse>() {

            @Override
            public ImportVouchersResponse method() {
              return VoucherModule.this.importVouchers(importVouchers);
            }
          });
    }

    public Observable<QualificationList<VoucherResponse>> getQualified(
        final QualificationContext context, final QualifiedResourceFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<QualificationList<VoucherResponse>>() {
            @Override
            public QualificationList<VoucherResponse> method() {
              return VoucherModule.this.getQualified(context, filter);
            }
          });
    }

    public Observable<Irrelevant> releaseSession(final String code, final String sessionKey) {
        return RxUtils.defer(
            new RxUtils.DefFunc<Irrelevant>() {

              @Override
              public Irrelevant method() {
                VoucherModule.this.releaseSession(code, sessionKey);
                return Irrelevant.NO_RESPONSE;
              }
          });
      }
  }
}
