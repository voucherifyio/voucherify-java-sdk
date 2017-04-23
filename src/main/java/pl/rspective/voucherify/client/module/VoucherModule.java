package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.PublishParams;
import pl.rspective.voucherify.client.model.RedemptionsFilter;
import pl.rspective.voucherify.client.model.RedemptionsList;
import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherRedemption;
import pl.rspective.voucherify.client.model.VoucherRedemptionContext;
import pl.rspective.voucherify.client.model.VoucherRedemptionResult;
import pl.rspective.voucherify.client.model.VoucherUpdate;
import pl.rspective.voucherify.client.model.VoucherValidationContext;
import pl.rspective.voucherify.client.model.VoucherValidationResult;
import pl.rspective.voucherify.client.model.VouchersFilter;
import pl.rspective.voucherify.client.model.publish.PublishVoucher;
import pl.rspective.voucherify.client.model.redemption.RedeemVoucher;
import pl.rspective.voucherify.client.model.redemption.RollbackRedemption;
import pl.rspective.voucherify.client.model.voucher.CreateVoucher;
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

  /**
   * @deprecated Use {@link VoucherModule#list(pl.rspective.voucherify.client.model.voucher.VouchersFilter)} instead
   */
  @Deprecated
  public List<Voucher> listVouchers(VouchersFilter filter) {
    return api.listVouchers(filter);
  }

  /**
   * @deprecated Use {@link VoucherModule#get(String)} instead
   */
  @Deprecated
  public Voucher fetchVoucher(String identifier) {
    return api.fetch(identifier);
  }

  /**
   * @deprecated Use {@link VoucherModule#create(CreateVoucher)} instead
   */
  @Deprecated
  public Voucher createVoucher(Voucher voucher) {
    if (voucher.getCode() != null) {
      return api.createVoucherWithCode(voucher.getCode(), voucher);
    } else {
      return api.createVoucher(voucher);
    }
  }

  /**
   * @deprecated Use {@link VoucherModule#update(String, pl.rspective.voucherify.client.model.voucher.VoucherUpdate)} instead
   */
  @Deprecated
  public Voucher updateVoucher(String code, VoucherUpdate voucherUpdate) {
    return api.updateVoucher(code, voucherUpdate);
  }

  /**
   * @deprecated Use {@link DistributionsModule#publish(PublishVoucher)} instead
   */
  @Deprecated
  public Voucher publishVoucher(PublishParams publishParams) {
    return api.publishVoucher(publishParams);
  }

  /**
   * @deprecated Use {@link VoucherModule#disable(String)} instead
   */
  @Deprecated
  public void disableVoucher(String code) {
    api.disableVoucher(code);
  }

  /**
   * @deprecated Use {@link VoucherModule#enable(String)} instead
   */
  @Deprecated
  public void enableVoucher(String code) {
    api.enableVoucher(code);
  }

  /**
   * @deprecated Use {@link RedemptionsModule#redeem(String, RedeemVoucher)} instead
   */
  @Deprecated
  public VoucherRedemptionResult redeem(String identifier, String trackingId) {
    return api.redeem(identifier, trackingId);
  }

  /**
   * @deprecated Use {@link RedemptionsModule#redeem(String, RedeemVoucher)} instead
   */
  @Deprecated
  public VoucherRedemptionResult redeem(String identifier, VoucherRedemptionContext redemptionContext) {
    return api.redeem(identifier, redemptionContext);
  }

  /**
   * @deprecated Use {@link RedemptionsModule#get(String)} instead
   */
  @Deprecated
  public VoucherRedemption redemption(String identifier) {
    return api.redemption(identifier);
  }

  /**
   * @deprecated Use {@link RedemptionsModule#list(pl.rspective.voucherify.client.model.redemption.RedemptionsFilter)} instead
   */
  @Deprecated
  public RedemptionsList listRedemptions(RedemptionsFilter filter) {
    return api.listRedemptions(filter);
  }

  /**
   * @deprecated Use {@link RedemptionsModule#rollback(String, String, RollbackRedemption)} instead
   */
  @Deprecated
  public VoucherRedemptionResult rollbackRedemption(String redemptionId, String trackingId, String reason) {
    return api.rollbackRedemption(redemptionId, trackingId, reason);
  }

  /**
   * @deprecated Use {@link pl.rspective.voucherify.client.module.ValidationsModule#validateVoucher(String, VoucherValidationContext)} instead.
   */
  @Deprecated
  public VoucherValidationResult validate(String code, VoucherValidationContext validityContext) {
    return api.validateVoucher(code, validityContext);
  }

  // NEW

  public pl.rspective.voucherify.client.model.voucher.Voucher create(CreateVoucher createVoucher) {
    if (createVoucher.getVoucher().getCode() != null) {
      return api.createVoucher(createVoucher.getVoucher().getCode(), createVoucher);
    }
    return api.createVoucher(createVoucher);
  }

  public pl.rspective.voucherify.client.model.voucher.Voucher get(String code) {
    return api.getVoucher(code);
  }

  public pl.rspective.voucherify.client.model.voucher.Voucher update(String code, pl.rspective.voucherify.client.model.voucher.VoucherUpdate voucherUpdate) {
    return api.updateVoucher(code, voucherUpdate);
  }

  public void delete(String code, Boolean force) {
    api.deleteVoucher(code, force);
  }

  public List<pl.rspective.voucherify.client.model.voucher.Voucher> list(pl.rspective.voucherify.client.model.voucher.VouchersFilter vouchersFilter) {
    return api.listVouchers(vouchersFilter.asMap());
  }

  public pl.rspective.voucherify.client.model.voucher.Voucher disable(String code) {
    return api.disable(code);
  }

  public pl.rspective.voucherify.client.model.voucher.Voucher enable(String code) {
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

    /**
     * @deprecated Use {@link ExtAsync#list(pl.rspective.voucherify.client.model.voucher.VouchersFilter, VoucherifyCallback)} instead.
     */
    @Deprecated
    public void listVouchers(VouchersFilter filter, VoucherifyCallback<List<Voucher>> callback) {
      RxUtils.subscribe(executor, rx().listVouchers(filter), callback);
    }

    /**
     * @deprecated Use {@link ExtAsync#get(String, VoucherifyCallback)} instead.
     */
    @Deprecated
    public void fetchVoucher(String identifier, VoucherifyCallback<Voucher> callback) {
      RxUtils.subscribe(executor, rx().fetchVoucher(identifier), callback);
    }

    /**
     * @deprecated Use {@link ExtAsync#create(CreateVoucher, VoucherifyCallback)} instead.
     */
    @Deprecated
    public void createVoucher(Voucher voucher, VoucherifyCallback<Voucher> callback) {
      RxUtils.subscribe(executor, rx().createVoucher(voucher), callback);
    }

    /**
     * @deprecated Use {@link ExtAsync#update(String, pl.rspective.voucherify.client.model.voucher.VoucherUpdate, VoucherifyCallback)} instead.
     */
    @Deprecated
    public void updateVoucher(String code, VoucherUpdate voucherUpdate, VoucherifyCallback<Voucher> callback) {
      RxUtils.subscribe(executor, rx().updateVoucher(code, voucherUpdate), callback);
    }

    /**
     * @deprecated Use {@link ExtAsync#disable(String, VoucherifyCallback)} instead.
     */
    @Deprecated
    public void disableVoucher(String code, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().disableVoucher(code), callback);
    }

    /**
     * @deprecated Use {@link ExtAsync#enable(String)} instead.
     */
    @Deprecated
    public void enableVoucher(String code, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().disableVoucher(code), callback);
    }

    /**
     * @deprecated Use {@link DistributionsModule.ExtAsync#publish(PublishVoucher, VoucherifyCallback)} instead.
     */
    @Deprecated
    public void publishVoucher(PublishParams publishParams, VoucherifyCallback<Voucher> callback) {
      RxUtils.subscribe(executor, rx().publishVoucher(publishParams), callback);
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtAsync#redeem(String, RedeemVoucher)} instead
     */
    @Deprecated
    public void redeem(String identifier, String trackingId, VoucherifyCallback<VoucherRedemptionResult> callback) {
      RxUtils.subscribe(executor, rx().redeem(identifier, trackingId), callback);
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtAsync#redeem(String, RedeemVoucher)} instead
     */
    @Deprecated
    public void redeem(String identifier, VoucherRedemptionContext redemptionContext,
                       VoucherifyCallback<VoucherRedemptionResult> callback) {
      RxUtils.subscribe(executor, rx().redeem(identifier, redemptionContext), callback);
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtAsync#get(String)} instead
     */
    @Deprecated
    public void redemption(String identifier, VoucherifyCallback<VoucherRedemption> callback) {
      RxUtils.subscribe(executor, rx().redemption(identifier), callback);
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtAsync#list(pl.rspective.voucherify.client.model.redemption.RedemptionsFilter)} instead
     */
    @Deprecated
    public void listRedemptions(RedemptionsFilter filter, VoucherifyCallback<RedemptionsList> callback) {
      RxUtils.subscribe(executor, rx().listRedemptions(filter), callback);
    }

    /**
     * @deprecated Use {@link RedemptionsModule#rollback(String, String, RollbackRedemption)} instead
     */
    @Deprecated
    public void rollbackRedemption(String redemptionId, String trackingId, String reason, VoucherifyCallback<VoucherRedemptionResult> callback) {
      RxUtils.subscribe(executor, rx().rollbackRedemption(redemptionId, trackingId, reason), callback);
    }

    /**
     * @deprecated Use {@link pl.rspective.voucherify.client.module.ValidationsModule.ExtAsync#validateVoucher(String, VoucherValidationContext, VoucherifyCallback)} instead.
     */
    @Deprecated
    public void validate(String code, VoucherValidationContext validityContext, VoucherifyCallback<VoucherValidationResult> callback) {
      RxUtils.subscribe(executor, rx().validate(code, validityContext), callback);
    }

    public void list(pl.rspective.voucherify.client.model.voucher.VouchersFilter filter, VoucherifyCallback<List<pl.rspective.voucherify.client.model.voucher.Voucher>> callback) {
      RxUtils.subscribe(executor, rx().list(filter), callback);
    }

    public void get(String code, VoucherifyCallback<pl.rspective.voucherify.client.model.voucher.Voucher> callback) {
      RxUtils.subscribe(executor, rx().get(code), callback);
    }

    public void create(CreateVoucher createVoucher, VoucherifyCallback<pl.rspective.voucherify.client.model.voucher.Voucher> callback) {
      RxUtils.subscribe(executor, rx().create(createVoucher), callback);
    }

    public void update(String code, pl.rspective.voucherify.client.model.voucher.VoucherUpdate voucherUpdate, VoucherifyCallback<pl.rspective.voucherify.client.model.voucher.Voucher> callback) {
      RxUtils.subscribe(executor, rx().update(code, voucherUpdate), callback);
    }

    public void disable(String code, VoucherifyCallback<pl.rspective.voucherify.client.model.voucher.Voucher> callback) {
      RxUtils.subscribe(executor, rx().disable(code), callback);
    }

    public void enable(String code, VoucherifyCallback<pl.rspective.voucherify.client.model.voucher.Voucher> callback) {
      RxUtils.subscribe(executor, rx().enable(code), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    /**
     * @deprecated Use {@link ExtRxJava#list(pl.rspective.voucherify.client.model.voucher.VouchersFilter)} instead.
     */
    @Deprecated
    public Observable<List<Voucher>> listVouchers(final VouchersFilter filter) {
      return RxUtils.defer(new RxUtils.DefFunc<List<Voucher>>() {
        @Override
        public List<Voucher> method() {
          return VoucherModule.this.listVouchers(filter);
        }
      });
    }

    /**
     * @deprecated Use {@link ExtRxJava#get(String)} instead.
     */
    @Deprecated
    public Observable<Voucher> fetchVoucher(final String identifier) {
      return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
        @Override
        public Voucher method() {
          return VoucherModule.this.fetchVoucher(identifier);
        }
      });
    }

    /**
     * @deprecated Use {@link ExtRxJava#create(CreateVoucher)} instead.
     */
    @Deprecated
    public Observable<Voucher> createVoucher(final Voucher voucher) {
      return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
        @Override
        public Voucher method() {
          return VoucherModule.this.createVoucher(voucher);
        }
      });
    }

    /**
     * @deprecated Use {@link ExtRxJava#update(String, pl.rspective.voucherify.client.model.voucher.VoucherUpdate)} instead.
     */
    @Deprecated
    public Observable<Voucher> updateVoucher(final String code, final VoucherUpdate voucherUpdate) {
      return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
        @Override
        public Voucher method() {
          return VoucherModule.this.updateVoucher(code, voucherUpdate);
        }
      });
    }

    /**
     * @deprecated Use {@link ExtRxJava#disable(String)} instead.
     */
    @Deprecated
    public Observable<Void> disableVoucher(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          VoucherModule.this.disableVoucher(code);
          return null;
        }
      });
    }

    /**
     * @deprecated Use {@link ExtRxJava#enable(String)} instead.
     */
    @Deprecated
    public Observable<Void> enableVoucher(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          VoucherModule.this.enableVoucher(code);
          return null;
        }
      });
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtRxJava#redeem(String, RedeemVoucher)} instead
     */
    @Deprecated
    public Observable<VoucherRedemptionResult> redeem(final String identifier, final String trackingId) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemptionResult>() {
        @Override
        public VoucherRedemptionResult method() {
          return VoucherModule.this.redeem(identifier, trackingId);
        }
      });
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtRxJava#redeem(String, RedeemVoucher)} instead
     */
    @Deprecated
    public Observable<VoucherRedemptionResult> redeem(final String identifier, final VoucherRedemptionContext redemptionContext) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemptionResult>() {
        @Override
        public VoucherRedemptionResult method() {
          return VoucherModule.this.redeem(identifier, redemptionContext);
        }
      });
    }

    /**
     * @deprecated Use {@link DistributionsModule.ExtRxJava#publish(PublishVoucher)} instead
     */
    @Deprecated
    public Observable<Voucher> publishVoucher(final PublishParams publishParams) {
      return RxUtils.defer(new RxUtils.DefFunc<Voucher>() {
        @Override
        public Voucher method() {
          return VoucherModule.this.publishVoucher(publishParams);
        }
      });
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtRxJava#get(String)} instead
     */
    @Deprecated
    public Observable<VoucherRedemption> redemption(final String identifier) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemption>() {
        @Override
        public VoucherRedemption method() {
          return VoucherModule.this.redemption(identifier);
        }
      });
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtRxJava#list(pl.rspective.voucherify.client.model.redemption.RedemptionsFilter)} instead
     */
    @Deprecated
    public Observable<RedemptionsList> listRedemptions(final RedemptionsFilter filter) {
      return RxUtils.defer(new RxUtils.DefFunc<RedemptionsList>() {
        @Override
        public RedemptionsList method() {
          return VoucherModule.this.listRedemptions(filter);
        }
      });
    }

    /**
     * @deprecated Use {@link RedemptionsModule.ExtRxJava#rollback(String, String, RollbackRedemption)} instead
     */
    @Deprecated
    public Observable<VoucherRedemptionResult> rollbackRedemption(final String redemptionId, final String trackingId, final String reason) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherRedemptionResult>() {
        @Override
        public VoucherRedemptionResult method() {
          return api.rollbackRedemption(redemptionId, trackingId, reason);
        }
      });
    }

    /**
     * @deprecated Use {@link pl.rspective.voucherify.client.module.ValidationsModule.ExtRxJava#validateVoucher(String, VoucherValidationContext)} instead.
     */
    @Deprecated
    public Observable<VoucherValidationResult> validate(final String code, final VoucherValidationContext validityContext) {
      return RxUtils.defer(new RxUtils.DefFunc<VoucherValidationResult>() {
        @Override
        public VoucherValidationResult method() {
          return api.validateVoucher(code, validityContext);
        }
      });
    }

    public Observable<pl.rspective.voucherify.client.model.voucher.Voucher> create(final CreateVoucher createVoucher) {
      return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.voucher.Voucher>() {
        @Override
        public pl.rspective.voucherify.client.model.voucher.Voucher method() {
          return VoucherModule.this.create(createVoucher);
        }
      });
    }

    public Observable<pl.rspective.voucherify.client.model.voucher.Voucher> get(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.voucher.Voucher>() {
        @Override
        public pl.rspective.voucherify.client.model.voucher.Voucher method() {
          return VoucherModule.this.get(code);
        }
      });
    }

    public Observable<pl.rspective.voucherify.client.model.voucher.Voucher> update(final String code, final pl.rspective.voucherify.client.model.voucher.VoucherUpdate voucherUpdate) {
      return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.voucher.Voucher>() {
        @Override
        public pl.rspective.voucherify.client.model.voucher.Voucher method() {
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

    public Observable<List<pl.rspective.voucherify.client.model.voucher.Voucher>> list(final pl.rspective.voucherify.client.model.voucher.VouchersFilter vouchersFilter) {
      return RxUtils.defer(new RxUtils.DefFunc<List<pl.rspective.voucherify.client.model.voucher.Voucher>>() {
        @Override
        public List<pl.rspective.voucherify.client.model.voucher.Voucher> method() {
         return VoucherModule.this.list(vouchersFilter);
        }
      });
    }

    public Observable<pl.rspective.voucherify.client.model.voucher.Voucher> disable(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.voucher.Voucher>() {
        @Override
        public pl.rspective.voucherify.client.model.voucher.Voucher method() {
          return VoucherModule.this.disable(code);
        }
      });
    }

    public Observable<pl.rspective.voucherify.client.model.voucher.Voucher> enable(final String code) {
      return RxUtils.defer(new RxUtils.DefFunc<pl.rspective.voucherify.client.model.voucher.Voucher>() {
        @Override
        public pl.rspective.voucherify.client.model.voucher.Voucher method() {
          return VoucherModule.this.enable(code);
        }
      });
    }
  }

}
