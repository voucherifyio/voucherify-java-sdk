package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.redemption.RedeemVoucher;
import pl.rspective.voucherify.client.model.redemption.RedeemVoucherResult;
import pl.rspective.voucherify.client.model.redemption.RedemptionEntry;
import pl.rspective.voucherify.client.model.redemption.RedemptionsFilter;
import pl.rspective.voucherify.client.model.redemption.RedemptionsList;
import pl.rspective.voucherify.client.model.redemption.RollbackRedemption;
import pl.rspective.voucherify.client.model.redemption.RollbackRedemptionResult;
import pl.rspective.voucherify.client.model.redemption.VoucherRedemptionsResult;
import pl.rspective.voucherify.client.module.RedemptionsModule.ExtAsync;
import pl.rspective.voucherify.client.module.RedemptionsModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class RedemptionsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public RedemptionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public RedeemVoucherResult redeem(String code, RedeemVoucher redeemVoucher) {
    return api.redeem(code, redeemVoucher);
  }

  public RedemptionEntry get(String redemptionId) {
    return api.getRedemption(redemptionId);
  }

  public RedemptionsList list(RedemptionsFilter redemptionsFilter) {
    return api.listRedemptions(redemptionsFilter.asMap());
  }

  public VoucherRedemptionsResult getForVoucher(String code) {
    return api.getVoucherRedemptions(code);
  }

  public RollbackRedemptionResult rollback(String redemptionId, String reason, RollbackRedemption rollbackRedemption) {
    return api.rollbackRedemption(redemptionId, reason, rollbackRedemption);
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

    public void redeem(String code, RedeemVoucher redeemVoucher, VoucherifyCallback<RedeemVoucherResult> callback) {
      RxUtils.subscribe(executor, rx().redeem(code, redeemVoucher), callback);
    }

    public void list(RedemptionsFilter redemptionsFilter, VoucherifyCallback<RedemptionsList> callback) {
      RxUtils.subscribe(executor, rx().list(redemptionsFilter), callback);
    }

    public void get(String redemptionId, VoucherifyCallback<RedemptionEntry> callback) {
      RxUtils.subscribe(executor, rx().get(redemptionId), callback);
    }

    public void getForVoucher(String code, VoucherifyCallback<VoucherRedemptionsResult> callback) {
      RxUtils.subscribe(executor, rx().getForVoucher(code), callback);
    }

    public void rollback(String redemptionId, String reason, RollbackRedemption rollbackRedemption, VoucherifyCallback<RollbackRedemptionResult> callback) {
      RxUtils.subscribe(executor, rx().rollback(redemptionId, reason, rollbackRedemption), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<RedeemVoucherResult> redeem(final String code, final RedeemVoucher redeemVoucher) {
      return RxUtils.defer(new RxUtils.DefFunc<RedeemVoucherResult>() {
        @Override
        public RedeemVoucherResult method() {
          return RedemptionsModule.this.redeem(code, redeemVoucher);
        }
      });
    }

    public Observable<RedemptionEntry> get(final String redemptionId) {
      return RxUtils.defer(new RxUtils.DefFunc<RedemptionEntry>() {
        @Override
        public RedemptionEntry method() {
          return RedemptionsModule.this.get(redemptionId);
        }
      });
    }

    public Observable<RedemptionsList> list(final RedemptionsFilter redemptionsFilter) {
      return RxUtils.defer(new RxUtils.DefFunc<RedemptionsList>() {
        @Override
        public RedemptionsList method() {
          return RedemptionsModule.this.list(redemptionsFilter);
        }
      });
    }

    public Observable<VoucherRedemptionsResult> getForVoucher(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemptionsResult>() {
        @Override
        public VoucherRedemptionsResult method() {
          return RedemptionsModule.this.getForVoucher(code);
        }
      });
    }

    public Observable<RollbackRedemptionResult> rollback(final String redemptionId, final String reason, final RollbackRedemption rollbackRedemption) {
      return RxUtils.defer(new RxUtils.DefFunc<RollbackRedemptionResult>() {
        @Override
        public RollbackRedemptionResult method() {
          return RedemptionsModule.this.rollback(redemptionId, reason, rollbackRedemption);
        }
      });
    }
  }
}
