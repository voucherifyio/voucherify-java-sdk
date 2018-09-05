package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.api.VoucherifyApi;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.validationRules.BusinessValidationRuleAssignmentFilter;
import io.voucherify.client.model.validationRules.BusinessValidationRuleFilter;
import io.voucherify.client.model.validationRules.CreateBusinessValidationRule;
import io.voucherify.client.model.validationRules.CreateBusinessValidationRuleAssignment;
import io.voucherify.client.model.validationRules.UpdateBusinessValidationRule;
import io.voucherify.client.model.validationRules.response.BusinessValidationRule;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignment;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignmentList;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleList;
import io.voucherify.client.module.ValidationRulesModule.ExtAsync;
import io.voucherify.client.module.ValidationRulesModule.ExtRxJava;
import io.voucherify.client.utils.Irrelevant;
import io.voucherify.client.utils.RxUtils;

import java.util.HashMap;
import java.util.concurrent.Executor;

public final class ValidationRulesModule extends AbsModule<ExtAsync, ExtRxJava> {

  public ValidationRulesModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public BusinessValidationRule create(CreateBusinessValidationRule validationRule) {
    return executeSyncApiCall(api.createValidationRules(validationRule));
  }

  public BusinessValidationRule get(String id) {
    return executeSyncApiCall(api.getValidationRules(id));
  }

  public BusinessValidationRuleList list(BusinessValidationRuleFilter filter) {
    return executeSyncApiCall(
        api.listValidationRules(filter != null ? filter.asMap() : new HashMap<>()));
  }

  public BusinessValidationRule update(UpdateBusinessValidationRule validationRule) {
    return executeSyncApiCall(api.updateValidationRules(validationRule.getId(), validationRule));
  }

  public void delete(String id) {
    executeSyncApiCall(api.deleteValidationRules(id));
  }

  public BusinessValidationRuleAssignment createAssignment(
      String id, CreateBusinessValidationRuleAssignment assignment) {
    return executeSyncApiCall(api.createValidationRuleAssignment(id, assignment));
  }

  public BusinessValidationRuleAssignmentList listAssignments(
      String id, BusinessValidationRuleAssignmentFilter filter) {
    return executeSyncApiCall(
        api.listValidationRuleAssignments(id, filter != null ? filter.asMap() : new HashMap<>()));
  }

  public void deleteAssignment(String validationRuleId, String assignmentId) {
    executeSyncApiCall(api.deleteValidationRuleAssignment(validationRuleId, assignmentId));
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
        CreateBusinessValidationRule validationRule,
        VoucherifyCallback<BusinessValidationRule> callback) {
      RxUtils.subscribe(executor, rx().create(validationRule), callback);
    }

    public void get(String id, VoucherifyCallback<BusinessValidationRule> callback) {
      RxUtils.subscribe(executor, rx().get(id), callback);
    }

    public void update(
        UpdateBusinessValidationRule validationRule,
        VoucherifyCallback<BusinessValidationRule> callback) {
      RxUtils.subscribe(executor, rx().update(validationRule), callback);
    }

    public void delete(String id, VoucherifyCallback<Irrelevant> callback) {
      RxUtils.subscribe(executor, rx().delete(id), callback);
    }

    public void list(
        BusinessValidationRuleFilter filter,
        VoucherifyCallback<BusinessValidationRuleList> callback) {
      RxUtils.subscribe(executor, rx().list(filter), callback);
    }

    public void createAssignment(
        String id,
        CreateBusinessValidationRuleAssignment assignment,
        VoucherifyCallback<BusinessValidationRuleAssignment> callback) {
      RxUtils.subscribe(executor, rx().createAssignment(id, assignment), callback);
    }

    public void deleteAssignment(
        String validationRuleId, String assignmentId, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().deleteAssignment(validationRuleId, assignmentId), callback);
    }

    public void listAssignments(
        String id,
        BusinessValidationRuleAssignmentFilter filter,
        VoucherifyCallback<BusinessValidationRuleAssignmentList> callback) {
      RxUtils.subscribe(executor, rx().listAssignments(id, filter), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<BusinessValidationRule> create(
        final CreateBusinessValidationRule validationRule) {
      return RxUtils.defer(
          new RxUtils.DefFunc<BusinessValidationRule>() {
            @Override
            public BusinessValidationRule method() {
              return ValidationRulesModule.this.create(validationRule);
            }
          });
    }

    public Observable<BusinessValidationRule> get(final String id) {
      return RxUtils.defer(
          new RxUtils.DefFunc<BusinessValidationRule>() {
            @Override
            public BusinessValidationRule method() {
              return ValidationRulesModule.this.get(id);
            }
          });
    }

    public Observable<BusinessValidationRuleList> list(final BusinessValidationRuleFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<BusinessValidationRuleList>() {
            @Override
            public BusinessValidationRuleList method() {
              return ValidationRulesModule.this.list(filter);
            }
          });
    }

    public Observable<BusinessValidationRule> update(
        final UpdateBusinessValidationRule validationRule) {
      return RxUtils.defer(
          new RxUtils.DefFunc<BusinessValidationRule>() {
            @Override
            public BusinessValidationRule method() {
              return ValidationRulesModule.this.update(validationRule);
            }
          });
    }

    public Observable<Irrelevant> delete(final String id) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Irrelevant>() {

            @Override
            public Irrelevant method() {
              ValidationRulesModule.this.delete(id);
              return Irrelevant.NO_RESPONSE;
            }
          });
    }

    public Observable<BusinessValidationRuleAssignment> createAssignment(
        final String id, final CreateBusinessValidationRuleAssignment assignment) {
      return RxUtils.defer(
          new RxUtils.DefFunc<BusinessValidationRuleAssignment>() {
            @Override
            public BusinessValidationRuleAssignment method() {
              return ValidationRulesModule.this.createAssignment(id, assignment);
            }
          });
    }

    public Observable<BusinessValidationRuleAssignmentList> listAssignments(
        final String id, final BusinessValidationRuleAssignmentFilter filter) {
      return RxUtils.defer(
          new RxUtils.DefFunc<BusinessValidationRuleAssignmentList>() {
            @Override
            public BusinessValidationRuleAssignmentList method() {
              return ValidationRulesModule.this.listAssignments(id, filter);
            }
          });
    }

    public Observable<Void> deleteAssignment(
        final String validationRuleId, final String assignmentId) {
      return RxUtils.defer(
          new RxUtils.DefFunc<Void>() {
            @Override
            public Void method() {
              ValidationRulesModule.this.deleteAssignment(validationRuleId, assignmentId);
              return null;
            }
          });
    }
  }
}
