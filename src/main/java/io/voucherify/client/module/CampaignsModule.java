package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.QualificationContext;
import io.voucherify.client.model.QualificationList;
import io.voucherify.client.model.QualifiedResourceFilter;
import io.voucherify.client.model.campaign.AddVoucherToCampaign;
import io.voucherify.client.model.campaign.CampaignImportVouchers;
import io.voucherify.client.model.campaign.CampaignsFilter;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.DeleteCampaignParams;
import io.voucherify.client.model.campaign.UpdateCampaign;
import io.voucherify.client.model.campaign.response.AddVoucherToCampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignsResponse;
import io.voucherify.client.module.CampaignsModule.ExtAsync;
import io.voucherify.client.module.CampaignsModule.ExtRxJava;
import io.voucherify.client.utils.Irrelevant;
import io.voucherify.client.utils.RxUtils;

import java.util.HashMap;
import java.util.concurrent.Executor;

public final class CampaignsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public CampaignsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CampaignResponse create(CreateCampaign createCampaign) {
    return executeSyncApiCall(api.createCampaign(createCampaign));
  }

  public CampaignResponse get(String name) {
    return executeSyncApiCall(api.getCampaign(name));
  }

  public CampaignResponse update(String name, UpdateCampaign updateCampaign) {
    return executeSyncApiCall(api.updateCampaign(name, updateCampaign));
  }

  public void delete(String campaignName, DeleteCampaignParams deleteCampaignParams) {
    executeSyncApiCall(
        api.deleteCampaign(
            campaignName,
            deleteCampaignParams != null ? deleteCampaignParams.asMap() : new HashMap<>()));
  }

  public AddVoucherToCampaignResponse addVoucher(
      String campaignName, AddVoucherToCampaign addVoucherToCampaign) {
    return executeSyncApiCall(api.addVoucherToCampaign(campaignName, addVoucherToCampaign));
  }

  public AddVoucherToCampaignResponse addVoucherWithCode(
      String campaignName, String code, AddVoucherToCampaign addVoucherToCampaign) {
    return executeSyncApiCall(
        api.addVoucherToCampaignWithCode(campaignName, code, addVoucherToCampaign));
  }

  public void importVouchers(String campaignName, CampaignImportVouchers importVouchers) {
    executeSyncApiCall(api.importVouchersToCampaign(campaignName, importVouchers));
  }

  public CampaignsResponse list(CampaignsFilter campaignsFilter) {
    return executeSyncApiCall(api.listCampaigns(campaignsFilter.asMap()));
  }

  public QualificationList<CampaignResponse> getQualified(
      QualificationContext context, QualifiedResourceFilter filter) {
    return executeSyncApiCall(
        api.getQualifiedCampaigns(context, filter != null ? filter.asMap() : new HashMap<>()));
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
        CreateCampaign createCampaign, VoucherifyCallback<CampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().create(createCampaign), callback);
    }

    public void addVoucher(
        String campaignName,
        AddVoucherToCampaign addVoucherToCampaign,
        VoucherifyCallback<AddVoucherToCampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().addVoucher(campaignName, addVoucherToCampaign), callback);
    }

    public void addVoucherWithCode(
        String campaignName,
        String code,
        AddVoucherToCampaign addVoucherToCampaign,
        VoucherifyCallback<AddVoucherToCampaignResponse> callback) {
      RxUtils.subscribe(
          executor, rx().addVoucherWithCode(campaignName, code, addVoucherToCampaign), callback);
    }

    public void delete(
        String campaignName,
        DeleteCampaignParams deleteCampaignParams,
        VoucherifyCallback<Irrelevant> callback) {
      RxUtils.subscribe(executor, rx().delete(campaignName, deleteCampaignParams), callback);
    }

    public void importVouchers(
        String campaignName,
        CampaignImportVouchers importVouchers,
        VoucherifyCallback<Irrelevant> callback) {
      RxUtils.subscribe(executor, rx().importVouchers(campaignName, importVouchers), callback);
    }

    public void list(
        CampaignsFilter campaignsFilter, VoucherifyCallback<CampaignsResponse> callback) {
      RxUtils.subscribe(executor, rx().list(campaignsFilter), callback);
    }

    public void get(String name, VoucherifyCallback<CampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().get(name), callback);
    }

    public void update(
        String name, UpdateCampaign updateCampaign, VoucherifyCallback<CampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().update(name, updateCampaign), callback);
    }

    public void getQualifiedCampaigns(
        QualificationContext context,
        QualifiedResourceFilter filter,
        VoucherifyCallback<QualificationList<CampaignResponse>> callback) {
      RxUtils.subscribe(executor, rx().getQualified(context, filter), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CampaignResponse> create(final CreateCampaign createCampaign) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CampaignResponse>() {

            @Override
            public CampaignResponse method() {
              return CampaignsModule.this.create(createCampaign);
            }
          });
    }

    public Observable<AddVoucherToCampaignResponse> addVoucher(
        final String campaignName, final AddVoucherToCampaign addVoucherToCampaign) {
      return RxUtils.defer(
          new RxUtils.DefFunc<AddVoucherToCampaignResponse>() {

            @Override
            public AddVoucherToCampaignResponse method() {
              return CampaignsModule.this.addVoucher(campaignName, addVoucherToCampaign);
            }
          });
    }

    public Observable<AddVoucherToCampaignResponse> addVoucherWithCode(
        final String campaignName,
        final String code,
        final AddVoucherToCampaign addVoucherToCampaign) {
      return RxUtils.defer(
          new RxUtils.DefFunc<AddVoucherToCampaignResponse>() {

            @Override
            public AddVoucherToCampaignResponse method() {
              return CampaignsModule.this.addVoucherWithCode(
                  campaignName, code, addVoucherToCampaign);
            }
          });
    }

    public Observable<Irrelevant> delete(
        final String campaignName, final DeleteCampaignParams deleteCampaignParams) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Irrelevant>() {

            @Override
            public Irrelevant method() {
              CampaignsModule.this.delete(campaignName, deleteCampaignParams);
              return Irrelevant.NO_RESPONSE;
            }
          });
    }

    public Observable<Irrelevant> importVouchers(
        final String campaignName, final CampaignImportVouchers importVouchers) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Irrelevant>() {

            @Override
            public Irrelevant method() {
              CampaignsModule.this.importVouchers(campaignName, importVouchers);
              return Irrelevant.NO_RESPONSE;
            }
          });
    }

    public Observable<CampaignsResponse> list(final CampaignsFilter campaignsFilter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CampaignsResponse>() {

            @Override
            public CampaignsResponse method() {
              return CampaignsModule.this.list(campaignsFilter);
            }
          });
    }

    public Observable<CampaignResponse> get(final String name) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CampaignResponse>() {

            @Override
            public CampaignResponse method() {
              return CampaignsModule.this.get(name);
            }
          });
    }

    public Observable<CampaignResponse> update(
        final String name, final UpdateCampaign updateCampaign) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CampaignResponse>() {

            @Override
            public CampaignResponse method() {
              return CampaignsModule.this.update(name, updateCampaign);
            }
          });
    }

    public Observable<QualificationList<CampaignResponse>> getQualified(
        final QualificationContext context, final QualifiedResourceFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<QualificationList<CampaignResponse>>() {
            @Override
            public QualificationList<CampaignResponse> method() {
              return CampaignsModule.this.getQualified(context, filter);
            }
          });
    }
  }
}
