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

    public CreateCampaignResult createCampaign(CreateCampaign createCampaign) {
        return api.createCampaign(createCampaign);
    }

    public AddVoucherToCampaignResult addVoucherToCampaign(String campaignName, AddVoucherToCampaign addVoucherToCampaign) {
        return api.addVoucherToCampaign(campaignName, addVoucherToCampaign);
    }

    public AddVoucherToCampaignResult addVoucherToCampaignWithCode(String campaignName, String code, AddVoucherToCampaign addVoucherToCampaign) {
        return api.addVoucherToCampaignWithCode(campaignName, code, addVoucherToCampaign);
    }

    public void deleteCampaign(String campaignName, DeleteCampaignParams deleteCampaignParams) {
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

        public void createCampaign(CreateCampaign createCampaign, VoucherifyCallback<CreateCampaignResult> callback) {
            RxUtils.subscribe(executor, rx().createCampaign(createCampaign), callback);
        }

        public void addVoucherToCampaign(String campaignName, AddVoucherToCampaign addVoucherToCampaign, VoucherifyCallback<AddVoucherToCampaignResult> callback) {
            RxUtils.subscribe(executor, rx().addVoucherToCampaign(campaignName, addVoucherToCampaign), callback);
        }

        public void addVoucherToCampaignWithCode(String campaignName, String code, AddVoucherToCampaign addVoucherToCampaign, VoucherifyCallback<AddVoucherToCampaignResult> callback) {
            RxUtils.subscribe(executor, rx().addVoucherToCampaignWithCode(campaignName, code, addVoucherToCampaign), callback);
        }

        public void deleteCampaign(String campaignName, DeleteCampaignParams deleteCampaignParams, VoucherifyCallback<Void> callback) {
            RxUtils.subscribe(executor, rx().deleteCampaign(campaignName, deleteCampaignParams), callback);
        }
    }

    public class ExtRxJava extends AbsModule.Rx {

        public Observable<CreateCampaignResult> createCampaign(final CreateCampaign createCampaign) {
            return RxUtils.defer(new RxUtils.DefFunc<CreateCampaignResult>() {
                @Override
                public CreateCampaignResult method() {
                    return CampaignsModule.this.createCampaign(createCampaign);
                }
            });
        }

        public Observable<AddVoucherToCampaignResult> addVoucherToCampaign(final String campaignName, final AddVoucherToCampaign addVoucherToCampaign) {
            return RxUtils.defer(new RxUtils.DefFunc<AddVoucherToCampaignResult>() {
                @Override
                public AddVoucherToCampaignResult method() {
                    return CampaignsModule.this.addVoucherToCampaign(campaignName, addVoucherToCampaign);
                }
            });
        }

        public Observable<AddVoucherToCampaignResult> addVoucherToCampaignWithCode(final String campaignName, final String code, final AddVoucherToCampaign addVoucherToCampaign) {
            return RxUtils.defer(new RxUtils.DefFunc<AddVoucherToCampaignResult>() {
                @Override
                public AddVoucherToCampaignResult method() {
                    return CampaignsModule.this.addVoucherToCampaignWithCode(campaignName, code, addVoucherToCampaign);
                }
            });
        }

        public Observable<Void> deleteCampaign(final String campaignName, final DeleteCampaignParams deleteCampaignParams) {
            return RxUtils.defer(new RxUtils.DefFunc<Void>() {
                @Override
                public Void method() {
                    CampaignsModule.this.deleteCampaign(campaignName, deleteCampaignParams);
                    return null;
                }
            });
        }
    }
}
