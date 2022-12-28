package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.campaign.CampaignsFilter;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.DeleteCampaignParams;
import io.voucherify.client.model.campaign.UpdateCampaign;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignsResponse;
import io.voucherify.client.model.loyalties.AddBalance;
import io.voucherify.client.model.loyalties.AddMember;
import io.voucherify.client.model.loyalties.CreateEarningRule;
import io.voucherify.client.model.loyalties.EarningRulesFilter;
import io.voucherify.client.model.loyalties.MembersFilter;
import io.voucherify.client.model.loyalties.RedeemReward;
import io.voucherify.client.model.loyalties.UpdateEarningRule;
import io.voucherify.client.model.loyalties.response.AddBalanceResponse;
import io.voucherify.client.model.loyalties.response.EarningRuleResponse;
import io.voucherify.client.model.loyalties.response.ListEarningRulesResponse;
import io.voucherify.client.model.loyalties.MembersLoyaltyTier;
import io.voucherify.client.model.loyalties.response.MembersLoyaltyTierResponse;
import io.voucherify.client.model.redemption.response.RedeemVoucherResponse;
import io.voucherify.client.model.rewards.CreateRewardAssignment;
import io.voucherify.client.model.rewards.RewardsAssignmentsFilter;
import io.voucherify.client.model.rewards.UpdateRewardAssignment;
import io.voucherify.client.model.rewards.response.ListRewardAssignmentsResponse;
import io.voucherify.client.model.rewards.response.RewardAssignmentResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import io.voucherify.client.model.voucher.response.VouchersResponse;
import io.voucherify.client.module.LoyaltiesModule.ExtAsync;
import io.voucherify.client.module.LoyaltiesModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

public class LoyaltiesModule extends AbsModule<ExtAsync, ExtRxJava> {

  public LoyaltiesModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public CampaignsResponse list(CampaignsFilter filter) {
    return executeSyncApiCall(
        api.listLoyaltyCampaigns(filter != null ? filter.asMap() : new HashMap<>()));
  }

  public CampaignResponse create(CreateCampaign createCampaign) {
    return executeSyncApiCall(api.createLoyaltyCampaign(createCampaign));
  }

  public CampaignResponse update(String id, UpdateCampaign updateCampaign) {
    return executeSyncApiCall(api.updateLoyaltyCampaign(id, updateCampaign));
  }

  public CampaignResponse get(String id) {
    return executeSyncApiCall(api.getLoyaltyCampaign(id));
  }

  public void delete(String id, DeleteCampaignParams params) {
    executeSyncApiCall(
        api.deleteLoyaltyCampaign(id, params != null ? params.asMap() : new HashMap<>()));
  }

  public ListRewardAssignmentsResponse listRewardAssignments(
      String id, RewardsAssignmentsFilter filter) {
    return executeSyncApiCall(
        api.listLoyaltyRewardAssignments(id, filter != null ? filter.asMap() : new HashMap<>()));
  }

  public RewardAssignmentResponse createRewardAssignment(
      String id, List<CreateRewardAssignment> assignments) {
    return executeSyncApiCall(api.createLoyaltyRewardAssignment(id, assignments));
  }

  public RewardAssignmentResponse updateRewardAssignment(
      String id, String assignmentId, UpdateRewardAssignment updateRewardAssignment) {
    return executeSyncApiCall(
        api.updateLoyaltyRewardAssignment(id, assignmentId, updateRewardAssignment));
  }

  public void deleteRewardAssignment(String id, String assignmentId) {
    executeSyncApiCall(api.deleteLoyaltyRewardAssignment(id, assignmentId));
  }

  public ListEarningRulesResponse listEarningRules(String id, EarningRulesFilter filter) {
    return executeSyncApiCall(
        api.listLoyaltyEarningRules(id, filter != null ? filter.asMap() : new HashMap<>()));
  }

  public EarningRuleResponse createEarningRules(String id, List<CreateEarningRule> rules) {
    return executeSyncApiCall(api.createLoyaltyEarningRule(id, rules));
  }

  public EarningRuleResponse updateEarningRule(String id, String ruleId, UpdateEarningRule update) {
    return executeSyncApiCall(api.updateLoyaltyEarningRule(id, ruleId, update));
  }

  public void deleteEarningRule(String id, String ruleId) {
    executeSyncApiCall(api.deleteLoyaltyEarningRule(id, ruleId));
  }

  public VouchersResponse listMembers(String id, MembersFilter filter) {
    return executeSyncApiCall(
        api.listLoyaltyMembers(id, filter != null ? filter.asMap() : new HashMap<>()));
  }

  public VoucherResponse addMember(String id, AddMember addMember) {
    return executeSyncApiCall(api.addLoyaltyMember(id, addMember));
  }

  public VoucherResponse getMember(String id, String memberId) {
    return executeSyncApiCall(api.getLoyaltyMember(id, memberId));
  }

  public VoucherResponse getMember(String memberId) {
    return executeSyncApiCall(api.getLoyaltyMember(memberId));
  }

  public RedeemVoucherResponse redeemReward(String id, String memberId, RedeemReward redeemReward) {
    return executeSyncApiCall(api.redeemLoyaltyReward(id, memberId, redeemReward));
  }

  public AddBalanceResponse addLoyaltyCardBalance(
      String id, String memberId, AddBalance addBalance) {
    return executeSyncApiCall(api.addLoyaltyBalance(id, memberId, addBalance));
  }

  public MembersLoyaltyTierResponse getMembersLoyaltyTier(String memberId) {
    return executeSyncApiCall(api.getMembersLoyaltyTier(memberId));
  }
  
  public AddBalanceResponse addLoyaltyCardBalance(
      String memberId, AddBalance addBalance) {
    return executeSyncApiCall(api.addLoyaltyBalance(memberId, addBalance));
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

    public void delete(
        String id, DeleteCampaignParams deleteCampaignParams, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().delete(id, deleteCampaignParams), callback);
    }

    public void list(
        CampaignsFilter campaignsFilter, VoucherifyCallback<CampaignsResponse> callback) {
      RxUtils.subscribe(executor, rx().list(campaignsFilter), callback);
    }

    public void get(String id, VoucherifyCallback<CampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().get(id), callback);
    }

    public void update(
        String id, UpdateCampaign updateCampaign, VoucherifyCallback<CampaignResponse> callback) {
      RxUtils.subscribe(executor, rx().update(id, updateCampaign), callback);
    }

    public void createRewardAssignment(
        String id,
        List<CreateRewardAssignment> create,
        VoucherifyCallback<RewardAssignmentResponse> callback) {
      RxUtils.subscribe(executor, rx().createRewardAssignment(id, create), callback);
    }

    public void updateRewardAssignment(
        String id,
        String assignmentId,
        UpdateRewardAssignment update,
        VoucherifyCallback<RewardAssignmentResponse> callback) {
      RxUtils.subscribe(executor, rx().updateRewardAssignment(id, assignmentId, update), callback);
    }

    public void deleteRewardAssignment(
        String id, String assignmentId, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().deleteRewardAssignment(id, assignmentId), callback);
    }

    public void listRewardAssignments(
        String id,
        RewardsAssignmentsFilter filter,
        VoucherifyCallback<ListRewardAssignmentsResponse> callback) {
      RxUtils.subscribe(executor, rx().listRewardAssignments(id, filter), callback);
    }

    public void createEarningRules(
        String id,
        List<CreateEarningRule> create,
        VoucherifyCallback<EarningRuleResponse> callback) {
      RxUtils.subscribe(executor, rx().createEarningRules(id, create), callback);
    }

    public void updateEarningRule(
        String id,
        String ruleId,
        UpdateEarningRule update,
        VoucherifyCallback<EarningRuleResponse> callback) {
      RxUtils.subscribe(executor, rx().updateEarningRule(id, ruleId, update), callback);
    }

    public void deleteEarningRule(String id, String ruleId, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().deleteEarningRule(id, ruleId), callback);
    }

    public void listEarningRules(
        String id,
        EarningRulesFilter filter,
        VoucherifyCallback<ListEarningRulesResponse> callback) {
      RxUtils.subscribe(executor, rx().listEarningRules(id, filter), callback);
    }

    public void addMember(
        String id, AddMember addMember, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().addMember(id, addMember), callback);
    }

    public void listMembers(
        String id, MembersFilter filter, VoucherifyCallback<VouchersResponse> callback) {
      RxUtils.subscribe(executor, rx().listMembers(id, filter), callback);
    }

    public void getMember(
        String id, String memberId, VoucherifyCallback<VoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().getMember(id, memberId), callback);
    }

    public void redeemReward(
        String id,
        String memberId,
        RedeemReward redeemReward,
        VoucherifyCallback<RedeemVoucherResponse> callback) {
      RxUtils.subscribe(executor, rx().redeemReward(id, memberId, redeemReward), callback);
    }

    public void addLoyaltyCardBalance(
        String id,
        String memberId,
        AddBalance addBalance,
        VoucherifyCallback<AddBalanceResponse> callback) {
      RxUtils.subscribe(executor, rx().addLoyaltyCardBalance(id, memberId, addBalance), callback);
    }

    public void getMembersLoyaltyTier(
        String memberId,
        VoucherifyCallback<MembersLoyaltyTierResponse> callback) {
      RxUtils.subscribe(executor, rx().getMembersLoyaltyTier(memberId), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<CampaignResponse> create(final CreateCampaign createCampaign) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CampaignResponse>() {
            @Override
            public CampaignResponse method() {
              return LoyaltiesModule.this.create(createCampaign);
            }
          });
    }

    public Observable<Void> delete(
        final String id, final DeleteCampaignParams deleteCampaignParams) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Void>() {
            @Override
            public Void method() {
              LoyaltiesModule.this.delete(id, deleteCampaignParams);
              return null;
            }
          });
    }

    public Observable<CampaignsResponse> list(final CampaignsFilter campaignsFilter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CampaignsResponse>() {
            @Override
            public CampaignsResponse method() {
              return LoyaltiesModule.this.list(campaignsFilter);
            }
          });
    }

    public Observable<CampaignResponse> get(final String id) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CampaignResponse>() {
            @Override
            public CampaignResponse method() {
              return LoyaltiesModule.this.get(id);
            }
          });
    }

    public Observable<CampaignResponse> update(
        final String id, final UpdateCampaign updateCampaign) {
      return RxUtils.defer(
          new RxUtils.DefFunc<CampaignResponse>() {
            @Override
            public CampaignResponse method() {
              return LoyaltiesModule.this.update(id, updateCampaign);
            }
          });
    }

    public Observable<RewardAssignmentResponse> createRewardAssignment(
        final String id, final List<CreateRewardAssignment> createRewardAssignment) {
      return RxUtils.defer(
          new RxUtils.DefFunc<RewardAssignmentResponse>() {
            @Override
            public RewardAssignmentResponse method() {
              return LoyaltiesModule.this.createRewardAssignment(id, createRewardAssignment);
            }
          });
    }

    public Observable<RewardAssignmentResponse> updateRewardAssignment(
        final String id,
        final String assignmentId,
        final UpdateRewardAssignment updateRewardAssignment) {
      return RxUtils.defer(
          new RxUtils.DefFunc<RewardAssignmentResponse>() {
            @Override
            public RewardAssignmentResponse method() {
              return LoyaltiesModule.this.updateRewardAssignment(
                  id, assignmentId, updateRewardAssignment);
            }
          });
    }

    public Observable<Void> deleteRewardAssignment(final String id, final String assignmentId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Void>() {
            @Override
            public Void method() {
              LoyaltiesModule.this.deleteRewardAssignment(id, assignmentId);
              return null;
            }
          });
    }

    public Observable<ListRewardAssignmentsResponse> listRewardAssignments(
        final String id, final RewardsAssignmentsFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListRewardAssignmentsResponse>() {
            @Override
            public ListRewardAssignmentsResponse method() {
              return LoyaltiesModule.this.listRewardAssignments(id, filter);
            }
          });
    }

    public Observable<EarningRuleResponse> createEarningRules(
        final String id, final List<CreateEarningRule> create) {
      return RxUtils.defer(
          new RxUtils.DefFunc<EarningRuleResponse>() {
            @Override
            public EarningRuleResponse method() {
              return LoyaltiesModule.this.createEarningRules(id, create);
            }
          });
    }

    public Observable<EarningRuleResponse> updateEarningRule(
        final String id, final String ruleId, final UpdateEarningRule update) {
      return RxUtils.defer(
          new RxUtils.DefFunc<EarningRuleResponse>() {
            @Override
            public EarningRuleResponse method() {
              return LoyaltiesModule.this.updateEarningRule(id, ruleId, update);
            }
          });
    }

    public Observable<Void> deleteEarningRule(final String id, final String assignmentId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Void>() {
            @Override
            public Void method() {
              LoyaltiesModule.this.deleteEarningRule(id, assignmentId);
              return null;
            }
          });
    }

    public Observable<ListEarningRulesResponse> listEarningRules(
        final String id, final EarningRulesFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<ListEarningRulesResponse>() {
            @Override
            public ListEarningRulesResponse method() {
              return LoyaltiesModule.this.listEarningRules(id, filter);
            }
          });
    }

    public Observable<VouchersResponse> listMembers(final String id, final MembersFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VouchersResponse>() {
            @Override
            public VouchersResponse method() {
              return LoyaltiesModule.this.listMembers(id, filter);
            }
          });
    }

    public Observable<VoucherResponse> getMember(final String id, final String memberId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VoucherResponse>() {
            @Override
            public VoucherResponse method() {
              return LoyaltiesModule.this.getMember(id, memberId);
            }
          });
    }

    public Observable<VoucherResponse> addMember(final String id, final AddMember addMember) {
      return RxUtils.defer(
          new RxUtils.DefFunc<VoucherResponse>() {
            @Override
            public VoucherResponse method() {
              return LoyaltiesModule.this.addMember(id, addMember);
            }
          });
    }

    public Observable<RedeemVoucherResponse> redeemReward(
        final String id, final String memberId, final RedeemReward redeemReward) {
      return RxUtils.defer(
          new RxUtils.DefFunc<RedeemVoucherResponse>() {
            @Override
            public RedeemVoucherResponse method() {
              return LoyaltiesModule.this.redeemReward(id, memberId, redeemReward);
            }
          });
    }

    public Observable<AddBalanceResponse> addLoyaltyCardBalance(
        final String id, final String memberId, final AddBalance addBalance) {
      return RxUtils.defer(
          new RxUtils.DefFunc<AddBalanceResponse>() {
            @Override
            public AddBalanceResponse method() {
              return LoyaltiesModule.this.addLoyaltyCardBalance(id, memberId, addBalance);
            }
          });
    }

    public Observable<MembersLoyaltyTierResponse> getMembersLoyaltyTier(
        final String memberId) {

        return RxUtils.defer(
                new RxUtils.DefFunc<MembersLoyaltyTierResponse>() {
                    @Override
                    public MembersLoyaltyTierResponse method() {
                        return LoyaltiesModule.this.getMembersLoyaltyTier(memberId);
                    }
                });
    }
  }
}
