package io.voucherify.client.module;

import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.rewards.CreateReward;
import io.voucherify.client.model.rewards.CreateRewardAssignment;
import io.voucherify.client.model.rewards.RewardsAssignmentsFilter;
import io.voucherify.client.model.rewards.RewardsFilter;
import io.voucherify.client.model.rewards.UpdateReward;
import io.voucherify.client.model.rewards.UpdateRewardAssignment;
import io.voucherify.client.model.rewards.response.ListRewardAssignmentsResponse;
import io.voucherify.client.model.rewards.response.ListRewardsResponse;
import io.voucherify.client.model.rewards.response.RewardAssignmentResponse;
import io.voucherify.client.model.rewards.response.RewardResponse;
import io.voucherify.client.module.RewardsModule.ExtAsync;
import io.voucherify.client.module.RewardsModule.ExtRxJava;
import io.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.HashMap;
import java.util.concurrent.Executor;

public class RewardsModule extends AbsModule<ExtAsync, ExtRxJava> {

    public RewardsModule(VoucherifyApi api, Executor executor) {
        super(api, executor);
    }

    public ListRewardsResponse list(RewardsFilter filter) {
        return api.listRewards(filter != null ? filter.asMap() : new HashMap<String, Object>());
    }

    public RewardResponse create(CreateReward createReward) {
        return api.createReward(createReward);
    }

    public RewardResponse get(String id) {
        return api.getReward(id);
    }

    public RewardResponse update(String id, UpdateReward updateReward) {
        return api.updateReward(id, updateReward);
    }

    public void delete(String id) {
        api.deleteReward(id);
    }

    public ListRewardAssignmentsResponse listAssignments(String id, RewardsAssignmentsFilter filter) {
        return api.listRewardAssignments(id, filter != null ? filter.asMap() : new HashMap<String, Object>());
    }

    public RewardAssignmentResponse createAssignment(String rewardId, CreateRewardAssignment createRewardAssignment) {
        return api.createRewardAssignment(rewardId, createRewardAssignment);
    }

    public RewardAssignmentResponse updateAssignment(String rewardId, String assignmentId, UpdateRewardAssignment updateRewardAssignment) {
        return api.updateRewardAssignment(rewardId, assignmentId, updateRewardAssignment);
    }

    public void deleteAssignment(String rewardId, String assignmentId) {
        api.deleteRewardAssignment(rewardId, assignmentId);
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

        public void list(RewardsFilter filter, VoucherifyCallback<ListRewardsResponse> callback) {
            RxUtils.subscribe(executor, rx().list(filter), callback);
        }

        public void create(CreateReward createReward, VoucherifyCallback<RewardResponse> callback) {
            RxUtils.subscribe(executor, rx().create(createReward), callback);
        }

        public void update(String id, UpdateReward updateReward, VoucherifyCallback<RewardResponse> callback) {
            RxUtils.subscribe(executor, rx().update(id, updateReward), callback);
        }

        public void get(String id, VoucherifyCallback<RewardResponse> callback) {
            RxUtils.subscribe(executor, rx().get(id), callback);
        }

        public void delete(String id, VoucherifyCallback<Void> callback) {
            RxUtils.subscribe(executor, rx().delete(id), callback);
        }

        public void listAssignments(String rewardId, RewardsAssignmentsFilter filter, VoucherifyCallback<ListRewardAssignmentsResponse> callback) {
            RxUtils.subscribe(executor, rx().listAssignments(rewardId, filter), callback);
        }

        public void createAssignment(String rewardId, CreateRewardAssignment createRewardAssignment, VoucherifyCallback<RewardAssignmentResponse> callback) {
            RxUtils.subscribe(executor, rx().createAssignment(rewardId, createRewardAssignment), callback);
        }

        public void updateAssignment(String rewardId, String assignmentId, UpdateRewardAssignment updateRewardAssignment, VoucherifyCallback<RewardAssignmentResponse> callback) {
            RxUtils.subscribe(executor, rx().updateAssignment(rewardId, assignmentId, updateRewardAssignment), callback);
        }

        public void deleteAssignment(String rewardId, String assignmentId, VoucherifyCallback<Void> callback) {
            RxUtils.subscribe(executor, rx().deleteAssignment(rewardId, assignmentId), callback);
        }

    }

    public class ExtRxJava extends AbsModule.Rx {

        public Observable<ListRewardsResponse> list(final RewardsFilter filter) {
            return RxUtils.defer(new RxUtils.DefFunc<ListRewardsResponse>() {
                @Override
                public ListRewardsResponse method() {
                    return RewardsModule.this.list(filter);
                }
            });
        }

        public Observable<RewardResponse> create(final CreateReward createReward) {
            return RxUtils.defer(new RxUtils.DefFunc<RewardResponse>() {
                @Override
                public RewardResponse method() {
                    return RewardsModule.this.create(createReward);
                }
            });
        }

        public Observable<RewardResponse> update(final String id, final UpdateReward updateReward) {
            return RxUtils.defer(new RxUtils.DefFunc<RewardResponse>() {
                @Override
                public RewardResponse method() {
                    return RewardsModule.this.update(id, updateReward);
                }
            });
        }

        public Observable<RewardResponse> get(final String id) {
            return RxUtils.defer(new RxUtils.DefFunc<RewardResponse>() {
                @Override
                public RewardResponse method() {
                    return RewardsModule.this.get(id);
                }
            });
        }

        public Observable<Void> delete(final String id) {
            return RxUtils.defer(new RxUtils.DefFunc<Void>() {
                @Override
                public Void method() {
                    RewardsModule.this.delete(id);
                    return null;
                }
            });
        }

        public Observable<ListRewardAssignmentsResponse> listAssignments(final String rewardId, final RewardsAssignmentsFilter filter) {
            return RxUtils.defer(new RxUtils.DefFunc<ListRewardAssignmentsResponse>() {
                @Override
                public ListRewardAssignmentsResponse method() {
                    return RewardsModule.this.listAssignments(rewardId, filter);
                }
            });
        }

        public Observable<RewardAssignmentResponse> createAssignment(final String rewardId, final CreateRewardAssignment createRewardAssignment) {
            return RxUtils.defer(new RxUtils.DefFunc<RewardAssignmentResponse>() {
                @Override
                public RewardAssignmentResponse method() {
                    return RewardsModule.this.createAssignment(rewardId, createRewardAssignment);
                }
            });
        }

        public Observable<RewardAssignmentResponse> updateAssignment(final String rewardId, final String assignmentId, final UpdateRewardAssignment updateRewardAssignment) {
            return RxUtils.defer(new RxUtils.DefFunc<RewardAssignmentResponse>() {
                @Override
                public RewardAssignmentResponse method() {
                    return RewardsModule.this.updateAssignment(rewardId, assignmentId, updateRewardAssignment);
                }
            });
        }

        public Observable<Void> deleteAssignment(final String rewardId, final String assignmentId) {
            return RxUtils.defer(new RxUtils.DefFunc<Void>() {
                @Override
                public Void method() {
                    RewardsModule.this.deleteAssignment(rewardId, assignmentId);
                    return null;
                }
            });
        }
    }
}
