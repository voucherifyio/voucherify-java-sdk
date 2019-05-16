package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.QualificationContext;
import io.voucherify.client.model.QualificationList;
import io.voucherify.client.model.QualifiedResourceFilter;
import io.voucherify.client.model.voucher.AddBalance;
import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.ImportVouchers;
import io.voucherify.client.model.voucher.VoucherUpdate;
import io.voucherify.client.model.voucher.VouchersFilter;
import io.voucherify.client.model.voucher.response.AddBalanceResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import io.voucherify.client.model.voucher.response.VouchersResponse;
import io.voucherify.client.module.VoucherModule.ExtAsync;
import io.voucherify.client.module.VoucherModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.HashMap;
import java.util.concurrent.Executor;

public final class VoucherModule extends AbsModule<ExtAsync, ExtRxJava> {

  public VoucherModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public VoucherResponse create(CreateVoucher createVoucher) {
    if (createVoucher.getVoucher().getCode() != null) {
      return api.createVoucher(createVoucher.getVoucher().getCode(), createVoucher);
    }
    return api.createVoucher(createVoucher);
  }

  public VoucherResponse get(String code) {
    return api.getVoucher(code);
  }

  public VoucherResponse update(String code, VoucherUpdate voucherUpdate) {
    return api.updateVoucher(code, voucherUpdate);
  }

  public void delete(String code, Boolean force) {
    api.deleteVoucher(code, force);
  }

  public VouchersResponse list(VouchersFilter vouchersFilter) {
    return api.listVouchers(vouchersFilter.asMap());
  }

  public VoucherResponse disable(String code) {
    return api.disable(code);
  }

  public VoucherResponse enable(String code) {
    return api.enable(code);
  }

  public AddBalanceResponse addBalance(String code, AddBalance addBalance) {
    return api.addBalance(code, addBalance);
  }

  public void importVouchers(ImportVouchers vouchers) {
    api.importVouchers(vouchers);
  }

  public QualificationList<VoucherResponse> getQualified(QualificationContext context, QualifiedResourceFilter filter) {
    return api.getQualifiedVouchers(context, filter != null ? filter.asMap() : new HashMap<String, Object>());
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

    public void update(String code, VoucherUpdate voucherUpdate, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().update(code, voucherUpdate), callback);
    }

    public void disable(String code, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().disable(code), callback);
    }

    public void enable(String code, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().enable(code), callback);
    }

    public void addBalance(String code, AddBalance addBalance, VoucherifyCallback<AddBalanceResponse> callback) {
      RxUtils.subscribe(executor, rx().addBalance(code, addBalance), callback);
    }

    public void importVouchers(ImportVouchers importVouchers, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().importVouchers(importVouchers), callback);
    }

    public void getQualifiedVouchers(QualificationContext context, QualifiedResourceFilter filter, VoucherifyCallback<QualificationList<VoucherResponse>> callback) {
      RxUtils.subscribe(executor, rx().getQualified(context, filter), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<VoucherResponse> create(final CreateVoucher createVoucher) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherResponse>() {
        @Override
        public VoucherResponse method() {
          return VoucherModule.this.create(createVoucher);
        }
      });
    }

    public Observable<VoucherResponse> get(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherResponse>() {
        @Override
        public VoucherResponse method() {
          return VoucherModule.this.get(code);
        }
      });
    }

    public Observable<VoucherResponse> update(final String code, final VoucherUpdate voucherUpdate) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherResponse>() {
        @Override
        public VoucherResponse method() {
          return VoucherModule.this.update(code, voucherUpdate);
        }
      });
    }

    public Observable<Void> delete(final String code, final Boolean force) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          VoucherModule.this.delete(code, force);
          return null;
        }
      });
    }

    public Observable<VouchersResponse> list(final VouchersFilter vouchersFilter) {
      return RxUtils.defer(new RxUtils.DefFunc<VouchersResponse>() {
        @Override
        public VouchersResponse method() {
          return VoucherModule.this.list(vouchersFilter);
        }
      });
    }

    public Observable<VoucherResponse> disable(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherResponse>() {
        @Override
        public VoucherResponse method() {
          return VoucherModule.this.disable(code);
        }
      });
    }

    public Observable<VoucherResponse> enable(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherResponse>() {
        @Override
        public VoucherResponse method() {
          return VoucherModule.this.enable(code);
        }
      });
    }

    public Observable<AddBalanceResponse> addBalance(final String code, final AddBalance addBalance) {
      return RxUtils.defer(new RxUtils.DefFunc<AddBalanceResponse>() {
        @Override
        public AddBalanceResponse method() {
          return VoucherModule.this.addBalance(code, addBalance);
        }
      });
    }

    public Observable<Void> importVouchers(final ImportVouchers importVouchers) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          VoucherModule.this.importVouchers(importVouchers);
          return null;
        }
      });
    }

    public Observable<QualificationList<VoucherResponse>> getQualified(final QualificationContext context, final QualifiedResourceFilter filter) {
      return RxUtils.defer(new RxUtils.DefFunc<QualificationList<VoucherResponse>>() {
        @Override
        public QualificationList<VoucherResponse> method() {
          return VoucherModule.this.getQualified(context, filter);
        }
      });
    }
  }

}
