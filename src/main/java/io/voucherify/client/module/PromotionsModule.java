package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.promotion.CreatePromotionCampaign;
import io.voucherify.client.model.promotion.PromotionTiersFilter;
import io.voucherify.client.model.promotion.Tier;
import io.voucherify.client.model.promotion.response.CreatePromotionCampaignResponse;
import io.voucherify.client.model.promotion.response.ListPromotionTiersResponse;
import io.voucherify.client.model.promotion.response.TierResponse;
import io.voucherify.client.module.PromotionsModule.ExtAsync;
import io.voucherify.client.module.PromotionsModule.ExtRxJava;
import io.voucherify.client.utils.Irrelevant;
import io.voucherify.client.utils.RxUtils;

import java.util.HashMap;
import java.util.concurrent.Executor;

public class PromotionsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public PromotionsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CreatePromotionCampaignResponse create(CreatePromotionCampaign createPromotionCampaign) {
    return executeSyncApiCall(api.createPromotionCampaign(createPromotionCampaign));
  }

  public ListPromotionTiersResponse list(String campaignId) {
    return executeSyncApiCall(api.listPromotionTiers(campaignId));
  }

  public TierResponse addPromotionTier(String campaignId, Tier tier) {
    return executeSyncApiCall(api.addPromotionTier(campaignId, tier));
  }

  public TierResponse updatePromotionTier(String tierId, Tier tier) {
    return executeSyncApiCall(api.updatePromotionTier(tierId, tier));
  }

  public Void deletePromotionTier(String tierId) {
    return executeSyncApiCall(api.deletePromotionTier(tierId));
  }

  public ListPromotionTiersResponse list(PromotionTiersFilter filter) {
    return executeSyncApiCall(
        api.listPromotionTiers(filter != null ? filter.asMap() : new HashMap<>()));
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

    public void create(
        CreatePromotionCampaign createPromotionCampaign,
        VoucherifyCallback<CreatePromotionCampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().create(createPromotionCampaign), callback);
    }

    public void list(String campaignId, VoucherifyCallback<ListPromotionTiersResponse> callback) {
      RxUtils.subscribe(executor, rx().list(campaignId), callback);
    }

    public void addPromotionTier(
        String campaignId, Tier tier, VoucherifyCallback<TierResponse> callback) {
      RxUtils.subscribe(executor, rx().addPromotionTier(campaignId, tier), callback);
    }

    public void updatePromotionTier(
        String tierId, Tier tier, VoucherifyCallback<TierResponse> callback) {
      RxUtils.subscribe(executor, rx().updatePromotionTier(tierId, tier), callback);
    }

    public void deletePromotionTier(String tierId, VoucherifyCallback<Irrelevant> callback) {
      RxUtils.subscribe(executor, rx().deletePromotionTier(tierId), callback);
    }

    public void list(
        PromotionTiersFilter filter, VoucherifyCallback<ListPromotionTiersResponse> callback) {
      RxUtils.subscribe(executor, rx().list(filter), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CreatePromotionCampaignResponse> create(
        final CreatePromotionCampaign createPromotionCampaign) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CreatePromotionCampaignResponse>() {

            @Override
            public CreatePromotionCampaignResponse method() {
              return PromotionsModule.this.create(createPromotionCampaign);
            }
          });
    }

    public Observable<ListPromotionTiersResponse> list(final String campaignId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListPromotionTiersResponse>() {

            @Override
            public ListPromotionTiersResponse method() {
              return PromotionsModule.this.list(campaignId);
            }
          });
    }

    public Observable<TierResponse> addPromotionTier(final String campaignId, final Tier tier) {
      return RxUtils.defer(
          new RxUtils.DefFunc<TierResponse>() {

            @Override
            public TierResponse method() {
              return PromotionsModule.this.addPromotionTier(campaignId, tier);
            }
          });
    }

    public Observable<TierResponse> updatePromotionTier(final String tierId, final Tier tier) {
      return RxUtils.defer(
          new RxUtils.DefFunc<TierResponse>() {

            @Override
            public TierResponse method() {
              return PromotionsModule.this.updatePromotionTier(tierId, tier);
            }
          });
    }

    public Observable<Irrelevant> deletePromotionTier(final String tierId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Irrelevant>() {

            @Override
            public Irrelevant method() {
              PromotionsModule.this.deletePromotionTier(tierId);
              return Irrelevant.NO_RESPONSE;
            }
          });
    }

    public Observable<ListPromotionTiersResponse> list(final PromotionTiersFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListPromotionTiersResponse>() {

            @Override
            public ListPromotionTiersResponse method() {
              return PromotionsModule.this.list(filter);
            }
          });
    }
  }
}
