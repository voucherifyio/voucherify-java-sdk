package io.voucherify;

import io.voucherify.data.VoucherifyStore;
import io.voucherify.helpers.DeepMatch;

import org.junit.jupiter.api.*;

import io.voucherify.client.ApiClient;
import io.voucherify.client.api.ValidationRulesApi;
import io.voucherify.client.model.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@org.junit.jupiter.api.Order(4)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ValidationRulesTest {
    public static ApiClient defaultClient = null;
    public static ValidationRulesApi validationRules = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        validationRules = new ValidationRulesApi(defaultClient);
    }

    @Test
    public void createValidationRuleTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/ValidationRules/CreatedValidationRule.snapshot.json";

        try {
            ValidationRulesCreateRequestBody validationRulesCreateRequestBody = new ValidationRulesCreateRequestBody();

            Map<String, Object> condition = new HashMap<>();
            condition.put("id", VoucherifyStore.getInstance().getProducts().get(0).getId());
            condition.put("type", "product_or_sku");
            condition.put("object", "product");
            condition.put("source_id", VoucherifyStore.getInstance().getProducts().get(0).getSourceId());

            ArrayList<Object> isConditions = new ArrayList<>();
            isConditions.add(condition);

            Map<String, Object> conditions = new HashMap<>();
            conditions.put("$is", isConditions);

            Map<String, Object> rule = new HashMap<>();
            rule.put("name", "order.items.any");
            rule.put("rules", new Object());
            rule.put("conditions", conditions);

            Map<String, Object> rules = new HashMap<>();
            rules.put("1", rule);
            rules.put("logic", "1");

            ValidationRulesCreateRequestBodyError validationRuleBaseError = new ValidationRulesCreateRequestBodyError();
            validationRuleBaseError.setMessage("error message");

            validationRulesCreateRequestBody.setRules(rules);
            validationRulesCreateRequestBody.setName(Utils.getAlphaNumericString(10));
            validationRulesCreateRequestBody.setError(validationRuleBaseError);

            ValidationRulesCreateRequestBodyApplicableTo validationRuleBaseApplicableTo = new ValidationRulesCreateRequestBodyApplicableTo();

            ApplicableTo applicableTo = new ApplicableTo();
            applicableTo.setObject(ApplicableTo.ObjectEnum.PRODUCT);
            applicableTo.setId(VoucherifyStore.getInstance().getProducts().get(0).getId());
            applicableTo.setSourceId(VoucherifyStore.getInstance().getProducts().get(0).getSourceId());
            applicableTo.setStrict(false);
            applicableTo.effect(ApplicableToEffect.TO_EVERY);

            List<ApplicableTo> included = new ArrayList<>();
            included.add(applicableTo);

            validationRuleBaseApplicableTo.included(included);
            validationRulesCreateRequestBody.setApplicableTo(validationRuleBaseApplicableTo);

            validationRulesCreateRequestBody.setType(ValidationRulesCreateRequestBody.TypeEnum.ADVANCED);

            // ValidationRulesCreateResponseBody validationRulesCreateResponseBody = validationRules.createValidationRules(
            //         validationRulesCreateRequestBody);
            //
            // List<String> keysToRemove = Arrays.asList("name", "id", "createdAt", "source_id", "sourceId");
            // assertTrue(DeepMatch.validateDeepMatch(snapshotPath, validationRulesCreateResponseBody, keysToRemove));
            //
            // VoucherifyStore.getInstance().getCouponCampaign().getValidationRuleIds()
            //         .add(validationRulesCreateResponseBody.getId());
            // TODO
        } catch (Exception e) {
            fail();
        }
    }
}
