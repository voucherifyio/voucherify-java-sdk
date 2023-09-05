package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;

import java.util.concurrent.Executor;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.stackable.RedeemStackableDiscount;
import io.voucherify.client.model.stackable.ValidateStackableDiscount;
import io.voucherify.client.model.stackable.response.RedeemStackableDiscountResponse;
import io.voucherify.client.model.stackable.response.RollbackRedemptionStackableResponse;
import io.voucherify.client.model.stackable.response.ValidateStackableDiscountResponse;
import io.voucherify.client.utils.RxUtils;

public class StackableModule extends AbsModule<StackableModule.ExtAsync, StackableModule.ExtRxJava> {

  public StackableModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public RedeemStackableDiscountResponse redeem(RedeemStackableDiscount redeemStackableDiscount) {
    return executeSyncApiCall(api.redeem(redeemStackableDiscount));
  }

  public ValidateStackableDiscountResponse validate(ValidateStackableDiscount validateStackableDiscount) {
    return executeSyncApiCall(api.validate(validateStackableDiscount));
  }

  public RollbackRedemptionStackableResponse rollbackRedemption(String parentRedemptionId) {
    return executeSyncApiCall(api.rollbackRedemption(parentRedemptionId));
  }

  @Override
  StackableModule.ExtAsync createAsyncExtension() {
    return new ExtAsync();
  }

  @Override
  StackableModule.ExtRxJava createRxJavaExtension() {
    return null;
  }

  @Override
  public StackableModule.ExtAsync async() {
    return null;
  }

  @Override
  public StackableModule.ExtRxJava rx() {
    return null;
  }


  public class ExtAsync extends AbsModule.Async {
    public void redeem(RedeemStackableDiscount redeemStackableDiscount, VoucherifyCallback<RedeemStackableDiscountResponse> callback) {
      RxUtils.subscribe(executor, rx().redeem(redeemStackableDiscount), callback);
    }

    public void validate(ValidateStackableDiscount validateStackableDiscount, VoucherifyCallback<ValidateStackableDiscountResponse> callback) {
      RxUtils.subscribe(executor, rx().validate(validateStackableDiscount), callback);
    }

    public void rollbackRedemption(String parentRedemptionId, VoucherifyCallback<RollbackRedemptionStackableResponse> callback) {
      RxUtils.subscribe(executor, rx().rollbackRedemption(parentRedemptionId), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<RedeemStackableDiscountResponse> redeem(final RedeemStackableDiscount redeemStackableDiscount) {
      return RxUtils.defer(new RxUtils.DefFunc<RedeemStackableDiscountResponse>() {

        @Override
        public RedeemStackableDiscountResponse method() {
          return StackableModule.this.redeem(redeemStackableDiscount);
        }
      });
    }

    public Observable<ValidateStackableDiscountResponse> validate(final ValidateStackableDiscount validateStackableDiscount) {
      return RxUtils.defer(new RxUtils.DefFunc<ValidateStackableDiscountResponse>() {

        @Override
        public ValidateStackableDiscountResponse method() {
          return StackableModule.this.validate(validateStackableDiscount);
        }
      });
    }

    public Observable<RollbackRedemptionStackableResponse> rollbackRedemption(final String parentRedemptionId) {
      return RxUtils.defer(new RxUtils.DefFunc<RollbackRedemptionStackableResponse>() {

        @Override
        public RollbackRedemptionStackableResponse method() {
          return StackableModule.this.rollbackRedemption(parentRedemptionId);
        }
      });
    }
  }
}


