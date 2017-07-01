package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.campaign.AddVoucherToCampaign;
import io.voucherify.client.model.campaign.CampaignImportVouchers;
import io.voucherify.client.model.campaign.CampaignsFilter;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.DeleteCampaignParams;
import io.voucherify.client.model.campaign.response.AddVoucherToCampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignsResponse;
import io.voucherify.client.module.CampaignsModule.ExtAsync;
import io.voucherify.client.module.CampaignsModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class CampaignsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public CampaignsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CampaignResponse create(CreateCampaign createCampaign) {
    return api.createCampaign(createCampaign);
  }

  public AddVoucherToCampaignResponse addVoucher(String campaignName, AddVoucherToCampaign addVoucherToCampaign) {
    return api.addVoucherToCampaign(campaignName, addVoucherToCampaign);
  }

  public AddVoucherToCampaignResponse addVoucherWithCode(String campaignName, String code, AddVoucherToCampaign addVoucherToCampaign) {
    return api.addVoucherToCampaignWithCode(campaignName, code, addVoucherToCampaign);
  }

  public void delete(String campaignName, DeleteCampaignParams deleteCampaignParams) {
    api.deleteCampaign(campaignName, deleteCampaignParams.getForce());
  }

  public void importVouchers(String campaignName, CampaignImportVouchers importVouchers) {
    api.importVouchersToCampaign(campaignName, importVouchers);
  }

  public CampaignResponse get(String name) {
    return api.getCampaign(name);
  }

  public CampaignsResponse list(CampaignsFilter campaignsFilter) {
    return api.listCampaigns(campaignsFilter.asMap());
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

    public void create(CreateCampaign createCampaign, VoucherifyCallback<CampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().create(createCampaign), callback);
    }

    public void addVoucher(String campaignName, AddVoucherToCampaign addVoucherToCampaign, VoucherifyCallback<AddVoucherToCampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().addVoucher(campaignName, addVoucherToCampaign), callback);
    }

    public void addVoucherWithCode(String campaignName, String code, AddVoucherToCampaign addVoucherToCampaign, VoucherifyCallback<AddVoucherToCampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().addVoucherWithCode(campaignName, code, addVoucherToCampaign), callback);
    }

    public void delete(String campaignName, DeleteCampaignParams deleteCampaignParams, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().delete(campaignName, deleteCampaignParams), callback);
    }

    public void importVouchers(String campaignName, CampaignImportVouchers importVouchers, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().importVouchers(campaignName, importVouchers), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CampaignResponse> create(final CreateCampaign createCampaign) {
      return RxUtils.defer(new RxUtils.DefFunc<CampaignResponse>() {
        @Override
        public CampaignResponse method() {
          return CampaignsModule.this.create(createCampaign);
        }
      });
    }

    public Observable<AddVoucherToCampaignResponse> addVoucher(final String campaignName, final AddVoucherToCampaign addVoucherToCampaign) {
      return RxUtils.defer(new RxUtils.DefFunc<AddVoucherToCampaignResponse>() {
        @Override
        public AddVoucherToCampaignResponse method() {
          return CampaignsModule.this.addVoucher(campaignName, addVoucherToCampaign);
        }
      });
    }

    public Observable<AddVoucherToCampaignResponse> addVoucherWithCode(final String campaignName, final String code, final AddVoucherToCampaign addVoucherToCampaign) {
      return RxUtils.defer(new RxUtils.DefFunc<AddVoucherToCampaignResponse>() {
        @Override
        public AddVoucherToCampaignResponse method() {
          return CampaignsModule.this.addVoucherWithCode(campaignName, code, addVoucherToCampaign);
        }
      });
    }

    public Observable<Void> delete(final String campaignName, final DeleteCampaignParams deleteCampaignParams) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          CampaignsModule.this.delete(campaignName, deleteCampaignParams);
          return null;
        }
      });
    }

    public Observable<Void> importVouchers(final String campaignName, final CampaignImportVouchers importVouchers) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          CampaignsModule.this.importVouchers(campaignName, importVouchers);
          return null;
        }
      });
    }

    public Observable<CampaignsResponse> list(final CampaignsFilter campaignsFilter) {
      return RxUtils.defer(new RxUtils.DefFunc<CampaignsResponse>() {
        @Override
        public CampaignsResponse method() {
          return CampaignsModule.this.list(campaignsFilter);
        }
      });
    }

    public Observable<CampaignResponse> get(final String name) {
      return RxUtils.defer(new RxUtils.DefFunc<CampaignResponse>() {
        @Override
        public CampaignResponse method() {
          return CampaignsModule.this.get(name);
        }
      });
    }
  }
}
