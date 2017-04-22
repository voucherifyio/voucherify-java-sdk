package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.campaign.*;
import pl.rspective.voucherify.client.module.CampaignsModule.ExtAsync;
import pl.rspective.voucherify.client.module.CampaignsModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class CampaignsModule extends AbsModule<ExtAsync, ExtRxJava> {

    public CampaignsModule(VoucherifyApi api, Executor executor) {
        super(api, executor);
    }

    public CreateCampaignResult create(CreateCampaign createCampaign) {
        return api.createCampaign(createCampaign);
    }

    public AddVoucherToCampaignResult addVoucher(String campaignName, AddVoucherToCampaign addVoucherToCampaign) {
        return api.addVoucherToCampaign(campaignName, addVoucherToCampaign);
    }

    public AddVoucherToCampaignResult addVoucherWithCode(String campaignName, String code, AddVoucherToCampaign addVoucherToCampaign) {
        return api.addVoucherToCampaignWithCode(campaignName, code, addVoucherToCampaign);
    }

    public void delete(String campaignName, DeleteCampaignParams deleteCampaignParams) {
        api.deleteCampaign(campaignName, deleteCampaignParams.getForce());
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

        public void create(CreateCampaign createCampaign, VoucherifyCallback<CreateCampaignResult> callback) {
            RxUtils.subscribe(executor, rx().create(createCampaign), callback);
        }

        public void addVoucher(String campaignName, AddVoucherToCampaign addVoucherToCampaign, VoucherifyCallback<AddVoucherToCampaignResult> callback) {
            RxUtils.subscribe(executor, rx().addVoucher(campaignName, addVoucherToCampaign), callback);
        }

        public void addVoucherWithCode(String campaignName, String code, AddVoucherToCampaign addVoucherToCampaign, VoucherifyCallback<AddVoucherToCampaignResult> callback) {
            RxUtils.subscribe(executor, rx().addVoucherWithCode(campaignName, code, addVoucherToCampaign), callback);
        }

        public void delete(String campaignName, DeleteCampaignParams deleteCampaignParams, VoucherifyCallback<Void> callback) {
            RxUtils.subscribe(executor, rx().delete(campaignName, deleteCampaignParams), callback);
        }
    }

    public class ExtRxJava extends AbsModule.Rx {

        public Observable<CreateCampaignResult> create(final CreateCampaign createCampaign) {
            return RxUtils.defer(new RxUtils.DefFunc<CreateCampaignResult>() {
                @Override
                public CreateCampaignResult method() {
                    return CampaignsModule.this.create(createCampaign);
                }
            });
        }

        public Observable<AddVoucherToCampaignResult> addVoucher(final String campaignName, final AddVoucherToCampaign addVoucherToCampaign) {
            return RxUtils.defer(new RxUtils.DefFunc<AddVoucherToCampaignResult>() {
                @Override
                public AddVoucherToCampaignResult method() {
                    return CampaignsModule.this.addVoucher(campaignName, addVoucherToCampaign);
                }
            });
        }

        public Observable<AddVoucherToCampaignResult> addVoucherWithCode(final String campaignName, final String code, final AddVoucherToCampaign addVoucherToCampaign) {
            return RxUtils.defer(new RxUtils.DefFunc<AddVoucherToCampaignResult>() {
                @Override
                public AddVoucherToCampaignResult method() {
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
    }
}
