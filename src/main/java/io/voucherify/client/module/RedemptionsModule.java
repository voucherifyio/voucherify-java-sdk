package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.redemption.RedeemPromotion;
import io.voucherify.client.model.redemption.RedeemVoucher;
import io.voucherify.client.model.redemption.RedemptionsFilter;
import io.voucherify.client.model.redemption.RollbackRedemption;
import io.voucherify.client.model.redemption.response.RedeemPromotionResponse;
import io.voucherify.client.model.redemption.response.RedeemVoucherResponse;
import io.voucherify.client.model.redemption.response.RedemptionEntryResponse;
import io.voucherify.client.model.redemption.response.RedemptionsResponse;
import io.voucherify.client.model.redemption.response.RollbackRedemptionResponse;
import io.voucherify.client.model.redemption.response.VoucherRedemptionsResponse;
import io.voucherify.client.module.RedemptionsModule.ExtAsync;
import io.voucherify.client.module.RedemptionsModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;

import java.util.concurrent.Executor;

public final class RedemptionsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public RedemptionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public RedeemVoucherResponse redeem(String code, RedeemVoucher redeemVoucher) {
    return executeSyncApiCall(api.redeem(code, redeemVoucher));
  }

  public RedeemPromotionResponse redeem(String id, RedeemPromotion redeemPromotion) {
    return executeSyncApiCall(api.redeem(id, redeemPromotion));
  }

  public RedemptionEntryResponse get(String redemptionId) {
    return executeSyncApiCall(api.getRedemption(redemptionId));
  }

  public RedemptionsResponse list(RedemptionsFilter redemptionsFilter) {
    return executeSyncApiCall(api.listRedemptions(redemptionsFilter.asMap()));
  }

  public VoucherRedemptionsResponse getForVoucher(String code) {
    return executeSyncApiCall(api.getVoucherRedemptions(code));
  }

  public RollbackRedemptionResponse rollback(
      String redemptionId, String reason, RollbackRedemption rollbackRedemption) {
    return executeSyncApiCall(api.rollbackRedemption(redemptionId, reason, rollbackRedemption));
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

    public void redeem(
        String code,
        RedeemVoucher redeemVoucher,
        VoucherifyCallback<RedeemVoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().redeem(code, redeemVoucher), callback);
    }

    public void redeem(
        String id,
        RedeemPromotion redeemPromotion,
        VoucherifyCallback<RedeemPromotionResponse> callback) {
      RxUtils.subscribe(executor, rx().redeem(id, redeemPromotion), callback);
    }

    public void list(
        RedemptionsFilter redemptionsFilter, VoucherifyCallback<RedemptionsResponse> callback) {
      RxUtils.subscribe(executor, rx().list(redemptionsFilter), callback);
    }

    public void get(String redemptionId, VoucherifyCallback<RedemptionEntryResponse> callback) {
      RxUtils.subscribe(executor, rx().get(redemptionId), callback);
    }

    public void getForVoucher(
        String code, VoucherifyCallback<VoucherRedemptionsResponse> callback) {
      RxUtils.subscribe(executor, rx().getForVoucher(code), callback);
    }

    public void rollback(
        String redemptionId,
        String reason,
        RollbackRedemption rollbackRedemption,
        VoucherifyCallback<RollbackRedemptionResponse> callback) {
      RxUtils.subscribe(
          executor, rx().rollback(redemptionId, reason, rollbackRedemption), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<RedeemVoucherResponse> redeem(
        final String code, final RedeemVoucher redeemVoucher) {
      return RxUtils.defer(
          new RxUtils.DefFunc<RedeemVoucherResponse>() {

            @Override
            public RedeemVoucherResponse method() {
              return RedemptionsModule.this.redeem(code, redeemVoucher);
            }
          });
    }

    public Observable<RedeemPromotionResponse> redeem(
        final String id, final RedeemPromotion redeemPromotion) {
      return RxUtils.defer(
          new RxUtils.DefFunc<RedeemPromotionResponse>() {

            @Override
            public RedeemPromotionResponse method() {
              return RedemptionsModule.this.redeem(id, redeemPromotion);
            }
          });
    }

    public Observable<RedemptionEntryResponse> get(final String redemptionId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<RedemptionEntryResponse>() {

            @Override
            public RedemptionEntryResponse method() {
              return RedemptionsModule.this.get(redemptionId);
            }
          });
    }

    public Observable<RedemptionsResponse> list(final RedemptionsFilter redemptionsFilter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<RedemptionsResponse>() {

            @Override
            public RedemptionsResponse method() {
              return RedemptionsModule.this.list(redemptionsFilter);
            }
          });
    }

    public Observable<VoucherRedemptionsResponse> getForVoucher(final String code) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VoucherRedemptionsResponse>() {

            @Override
            public VoucherRedemptionsResponse method() {
              return RedemptionsModule.this.getForVoucher(code);
            }
          });
    }

    public Observable<RollbackRedemptionResponse> rollback(
        final String redemptionId,
        final String reason,
        final RollbackRedemption rollbackRedemption) {
      return RxUtils.defer(
          new RxUtils.DefFunc<RollbackRedemptionResponse>() {

            @Override
            public RollbackRedemptionResponse method() {
              return RedemptionsModule.this.rollback(redemptionId, reason, rollbackRedemption);
            }
          });
    }
  }
}
