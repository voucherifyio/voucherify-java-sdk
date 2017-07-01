package io.voucherify.example.sync;

import com.sun.tools.javac.util.List;
import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.validationRules.IdPair;
import io.voucherify.client.model.validationRules.Junction;
import io.voucherify.client.model.Operator;
import io.voucherify.client.model.validationRules.OrderValidationRules;
import io.voucherify.client.model.validationRules.ProductValidationRules;
import io.voucherify.client.model.validationRules.RedemptionCountValidationRules;
import io.voucherify.client.model.validationRules.RedemptionValidationRules;
import io.voucherify.client.model.validationRules.SegmentValidationRules;
import io.voucherify.client.model.validationRules.SkuValidationRules;
import io.voucherify.client.model.validationRules.ValidationRules;
import io.voucherify.client.model.validationRules.response.ValidationRulesResponse;

public class ValidationRulesExample extends AbsExample {

  public ValidationRulesExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {
    ValidationRules rules = ValidationRules.builder()
            .junction(Junction.AND)
            .orderRules(OrderValidationRules.builder()
                    .junction(Junction.OR)
                    .productsCountCondition(Operator.$contains, List.of(10, 20))
                    .totalAmountCondition(Operator.$more_than, List.of(50))
                    .build()
            )
            .productRules(ProductValidationRules.builder()
                    .condition(Operator.$contains, List.of(IdPair.builder().id("some_id").sourceId("source_id").build()))
                    .condition(Operator.$contains, List.of(IdPair.builder().id("some_id_2").sourceId("source_id_2").build()))
                    .junction(Junction.OR)
                    .build()
            )
            .skuRules(SkuValidationRules.builder()
                    .condition(Operator.$is_not, List.of(IdPair.builder().id("id").build()))
                    .build()
            )
            .redemptionRules(RedemptionValidationRules.builder()
                    .junction(Junction.OR)
                    .countPerCustomer(RedemptionCountValidationRules.builder()
                            .condition(Operator.$contains, List.of(10, 20))
                            .build()
                    )
                    .build()
            )
            .segmentRules(SegmentValidationRules.builder()
                    .condition(Operator.$is, List.of("some"))
                    .build()
            ).build();

    ValidationRulesResponse result = client.validationRules().create(rules);

    System.out.println(result);

    client.validationRules().get(result.getId());

    client.validationRules().delete(result.getId());

  }
}
