package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.promotion.CreatePromotionCampaign;
import io.voucherify.client.model.promotion.Tier;
import io.voucherify.client.model.promotion.reponse.CreatePromotionCampaignResponse;
import io.voucherify.client.model.promotion.reponse.ListPromotionTiersResponse;
import io.voucherify.client.model.promotion.reponse.TierResponse;
import io.voucherify.client.module.PromotionsModule.ExtAsync;
import io.voucherify.client.module.PromotionsModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public class PromotionsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public PromotionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CreatePromotionCampaignResponse create(CreatePromotionCampaign createPromotionCampaign) {
    return api.createPromotionCampaign(createPromotionCampaign);
  }

  public ListPromotionTiersResponse list(String campaignId) {
    return api.listPromotionTiers(campaignId);
  }

  public TierResponse addPromotionTier(String campaignId, Tier tier) {
    return api.addPromotionTier(campaignId, tier);
  }

  public TierResponse updatePromotionTier(String tierId, Tier tier) {
    return api.updatePromotionTier(tierId, tier);
  }

  public Void deletePromotionTier(String tierId) {
    return api.deletePromotionTier(tierId);
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

    public void create(CreatePromotionCampaign createPromotionCampaign, VoucherifyCallback<CreatePromotionCampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().create(createPromotionCampaign), callback);
    }

    public void list(String campaignId, VoucherifyCallback<ListPromotionTiersResponse> callback) {
      RxUtils.subscribe(executor, rx().list(campaignId), callback);
    }

    public void addPromotionTier(String campaignId, Tier tier, VoucherifyCallback<TierResponse> callback) {
      RxUtils.subscribe(executor, rx().addPromotionTier(campaignId, tier), callback);
    }

    public void updatePromotionTier(String tierId, Tier tier, VoucherifyCallback<TierResponse> callback) {
      RxUtils.subscribe(executor, rx().updatePromotionTier(tierId, tier), callback);
    }

    public void deletePromotionTier(String tierId, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().deletePromotionTier(tierId), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CreatePromotionCampaignResponse> create(final CreatePromotionCampaign createPromotionCampaign) {
      return RxUtils.defer(new RxUtils.DefFunc<CreatePromotionCampaignResponse>() {

        @Override
        public CreatePromotionCampaignResponse method() {
          return PromotionsModule.this.create(createPromotionCampaign);
        }
      });
    }

    public Observable<ListPromotionTiersResponse> list(final String campaignId) {
      return RxUtils.defer(new RxUtils.DefFunc<ListPromotionTiersResponse>() {

        @Override
        public ListPromotionTiersResponse method() {
          return PromotionsModule.this.list(campaignId);
        }
      });
    }

    public Observable<TierResponse> addPromotionTier(final String campaignId, final Tier tier) {
      return RxUtils.defer(new RxUtils.DefFunc<TierResponse>() {

        @Override
        public TierResponse method() {
          return PromotionsModule.this.addPromotionTier(campaignId, tier);
        }
      });
    }

    public Observable<TierResponse> updatePromotionTier(final String tierId, final Tier tier) {
      return RxUtils.defer(new RxUtils.DefFunc<TierResponse>() {

        @Override
        public TierResponse method() {
          return PromotionsModule.this.updatePromotionTier(tierId, tier);
        }
      });
    }

    public Observable<Void> deletePromotionTier(final String tierId) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {

        @Override
        public Void method() {
          PromotionsModule.this.deletePromotionTier(tierId);
          return null;
        }
      });
    }
  }
}
