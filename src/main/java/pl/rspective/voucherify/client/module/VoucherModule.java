package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.voucher.CreateVoucher;
import pl.rspective.voucherify.client.model.voucher.VoucherUpdate;
import pl.rspective.voucherify.client.model.voucher.VouchersFilter;
import pl.rspective.voucherify.client.model.voucher.response.VoucherResponse;
import pl.rspective.voucherify.client.module.VoucherModule.ExtAsync;
import pl.rspective.voucherify.client.module.VoucherModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.List;
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

  public List<VoucherResponse> list(VouchersFilter vouchersFilter) {
    return api.listVouchers(vouchersFilter.asMap());
  }

  public VoucherResponse disable(String code) {
    return api.disable(code);
  }

  public VoucherResponse enable(String code) {
    return api.enable(code);
  }
  //

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

    public void list(VouchersFilter filter, VoucherifyCallback<List<VoucherResponse>> callback) {
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

    public Observable<List<VoucherResponse>> list(final VouchersFilter vouchersFilter) {
      return RxUtils.defer(new RxUtils.DefFunc<List<VoucherResponse>>() {
        @Override
        public List<VoucherResponse> method() {
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
  }

}
