package io.voucherify;

import com.google.gson.JsonSyntaxException;
import io.voucherify.data.VoucherifyStore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.ValidationRulesApi;
import io.voucherify.client.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(4)
public class ValidationRulesTest {
    public static ApiClient defaultClient = null;
    public static ValidationRulesApi validationRules = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        validationRules = new ValidationRulesApi(defaultClient);
    }

    @Test
    public void addValidationRuleTest() {

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

            ValidationRuleBaseError validationRuleBaseError = new ValidationRuleBaseError();
            validationRuleBaseError.setMessage("error message");

            validationRulesCreateRequestBody.setRules(rules);
            validationRulesCreateRequestBody.setName(Utils.getAlphaNumericString(10));
            validationRulesCreateRequestBody.setError(validationRuleBaseError);

            ValidationRuleBaseApplicableTo validationRuleBaseApplicableTo = new ValidationRuleBaseApplicableTo();

            ApplicableTo applicableTo = new ApplicableTo();
            applicableTo.setObject(ApplicableTo.ObjectEnum.PRODUCT);
            applicableTo.setId(VoucherifyStore.getInstance().getProducts().get(0).getId());
            applicableTo.setSourceId(VoucherifyStore.getInstance().getProducts().get(0).getSourceId());
            applicableTo.setStrict(false);
            applicableTo.effect(ApplicableToEffect.EVERY);

            List<ApplicableTo> included = new ArrayList<>();
            included.add(applicableTo);

            validationRuleBaseApplicableTo.included(included);
            validationRulesCreateRequestBody.setApplicableTo(validationRuleBaseApplicableTo);

            validationRulesCreateRequestBody.setType(ValidationRulesCreateRequestBody.TypeEnum.ADVANCED);

            ValidationRulesCreateResponseBody validationRulesCreateResponseBody = validationRules.createValidationRules(
                validationRulesCreateRequestBody
            );

            assertNotNull(validationRulesCreateResponseBody);

            VoucherifyStore.getInstance().getCouponCampaign().getValidationRuleIds().add(validationRulesCreateResponseBody.getId());
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
