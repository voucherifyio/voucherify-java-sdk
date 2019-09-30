package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.Json;
import io.voucherify.client.model.validationRules.BusinessValidationRuleAssignmentFilter;
import io.voucherify.client.model.validationRules.BusinessValidationRuleFilter;
import io.voucherify.client.model.validationRules.CreateBusinessValidationRule;
import io.voucherify.client.model.validationRules.CreateBusinessValidationRuleAssignment;
import io.voucherify.client.model.validationRules.UpdateBusinessValidationRule;
import io.voucherify.client.model.validationRules.response.BusinessValidationRule;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignment;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignmentList;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleList;

import java.util.Arrays;

public class ValidationRulesExample extends AbsExample {

  public ValidationRulesExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {

    CreateBusinessValidationRule rule =
        CreateBusinessValidationRule.builder()
            .name("my-name")
            .rules(
                Json.builder()
                    .addEntry(
                        "1",
                        Json.builder()
                            .addEntry("name", "customer.segment")
                            .addEntry(
                                "conditions",
                                Json.builder()
                                    .addEntry(
                                        "$is", Arrays.asList("seg_n3vVcU5t0m3rs4rEPr3C1oU5"))
                                    .build())
                            .build())
                    .addEntry(
                        "2",
                        Json.builder()
                            .addEntry("name", "redemption.count.per_customer")
                            .addEntry(
                                "conditions",
                                Json.builder().addEntry("$is", Arrays.asList(1)).build())
                            .build())
                    .addEntry("logic", "1 or 2")
                    .build())
            .build();

    BusinessValidationRule businessValidationRule = client.validationRules().create(rule);
    System.out.println(businessValidationRule);

    BusinessValidationRuleList rulesList =
        client
            .validationRules()
            .list(BusinessValidationRuleFilter.builder().limit(10).page(1).build());
    System.out.println(rulesList);

    BusinessValidationRule receivedRule = client.validationRules().get(businessValidationRule.getId());
    System.out.println(receivedRule);


    UpdateBusinessValidationRule update = UpdateBusinessValidationRule.builder()
        .id(businessValidationRule.getId())
        .name("new-name")
        .rules(Json.builder()
            .addEntry(
                "1",
                Json.builder()
                    .addEntry("name", "customer.segment")
                    .addEntry(
                        "conditions",
                        Json.builder()
                            .addEntry(
                                "$is", Arrays.asList("seg_n3vVcU5t0m3rs4rEPr3C1oU5"))
                            .build())
                    .build())
        .build())
        .build();

    BusinessValidationRule updatedRule = client.validationRules().update(update);
    System.out.println(updatedRule);

    CreateBusinessValidationRuleAssignment assignment = CreateBusinessValidationRuleAssignment.builder()
        .campaign("test-campaign")
        .build();

    BusinessValidationRuleAssignment createdAssignment = client.validationRules().createAssignment(businessValidationRule.getId(), assignment);

    System.out.println(createdAssignment);

    BusinessValidationRuleAssignmentList assigments = client.validationRules().listAssignments(businessValidationRule.getId(), BusinessValidationRuleAssignmentFilter.builder()
        .limit(10)
        .page(1)
        .build());

    System.out.println(assigments);

    client.validationRules().deleteAssignment(businessValidationRule.getId(), createdAssignment.getId());
    client.validationRules().delete(businessValidationRule.getId());
  }
}
