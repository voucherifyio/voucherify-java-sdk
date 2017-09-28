package io.voucherify.example.sync;

import com.sun.tools.javac.util.List;
import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.Operator;
import io.voucherify.client.model.validationRules.IdPair;
import io.voucherify.client.model.validationRules.Junction;
import io.voucherify.client.model.validationRules.MetadataRules;
import io.voucherify.client.model.validationRules.MetadataValidationRules;
import io.voucherify.client.model.validationRules.OrderValidationRules;
import io.voucherify.client.model.validationRules.ProductValidationRules;
import io.voucherify.client.model.validationRules.PublicationValidationRules;
import io.voucherify.client.model.validationRules.PublishedForRedeemingCustomerRules;
import io.voucherify.client.model.validationRules.RedemptionCountValidationRules;
import io.voucherify.client.model.validationRules.RedemptionValidationRules;
import io.voucherify.client.model.validationRules.SegmentValidationRules;
import io.voucherify.client.model.validationRules.SkuValidationRules;
import io.voucherify.client.model.validationRules.UserLoginRules;
import io.voucherify.client.model.validationRules.UserValidationRules;
import io.voucherify.client.model.validationRules.ValidationRules;
import io.voucherify.client.model.validationRules.response.ValidationRulesResponse;

import java.util.Arrays;

public class ValidationRulesExample extends AbsExample {

  public ValidationRulesExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {
    userRulesExample();
    orderRulesExample();
    segmentRulesExample();
    productRulesExample();
    redemptionRulesExample();
    publicationRulesExample();
    skuRulesExample();
  }

  private void userRulesExample() {
    ValidationRules userValidationRules = ValidationRules.builder()
        .userRules(UserValidationRules.builder()
            .junction(Junction.AND)
            .userLogin(UserLoginRules.builder()
                .condition(Operator.$is, List.of("johndoe@johndoe.com"))
                .build()
            )
            .build()
        )
        .build();

    ValidationRulesResponse result = client.validationRules().create(userValidationRules);
    client.validationRules().get(result.getId());
    client.validationRules().delete(result.getId());
  }

  private void orderRulesExample() {
    ValidationRules orderValidationRules = ValidationRules.builder()
        .orderRules(OrderValidationRules.builder()
            .totalAmountCondition(Operator.$less_than_or_equal, List.of(50000))
            .productsCountCondition(Operator.$more_than, List.of(10000))
            .allOrdersDiscountAmountCondition(Operator.$less_than_or_equal, List.of(30))
            .allOrdersTotalAmountCondition(Operator.$is, List.of(100000))
            .build()
        )
        .build();

    ValidationRulesResponse result = client.validationRules().create(orderValidationRules);
    client.validationRules().get(result.getId());
    client.validationRules().delete(result.getId());
  }

  private void segmentRulesExample() {
    ValidationRules segmentValidationRules = ValidationRules.builder()
        .segmentRules(SegmentValidationRules.builder()
            .condition(Operator.$is, List.of("a", "b"))
            .build()
        )
        .build();

    ValidationRulesResponse result = client.validationRules().create(segmentValidationRules);
    client.validationRules().get(result.getId());
    client.validationRules().delete(result.getId());
  }

  private void productRulesExample() {
    ValidationRules productValidationRules = ValidationRules.builder()
        .productRules(ProductValidationRules.builder()
            .condition(Operator.$contains, List.of(IdPair.builder().id("id").sourceId("sourceId").build()))
            .build())
        .build();

    ValidationRulesResponse result = client.validationRules().create(productValidationRules);
    client.validationRules().get(result.getId());
    client.validationRules().delete(result.getId());
  }

  private void redemptionRulesExample() {
    ValidationRules redemptionValidationRules = ValidationRules.builder()
        .redemptionRules(RedemptionValidationRules.builder()
            .countPerCampaign(RedemptionCountValidationRules.builder()
                .condition(Operator.$contains, List.of(10))
                .build()
            )
            .countPerCustomer(RedemptionCountValidationRules.builder()
                .condition(Operator.$contains, List.of(20))
                .build()
            )
            .countPerCustomerPerDay(RedemptionCountValidationRules.builder()
                .condition(Operator.$contains, List.of(30))
                .build()
            )
            .countPerUser(RedemptionCountValidationRules.builder()
                .condition(Operator.$contains, List.of(40))
                .build()
            )
            .countPerCustomerPerCampaign(RedemptionCountValidationRules.builder()
                .condition(Operator.$contains, List.of(50))
                .build()
            )
            .giftCardsAmount(RedemptionCountValidationRules.builder()
                .condition(Operator.$contains, List.of(60))
                .build()
            )
            .metadata(MetadataValidationRules.builder()
                .rule("city", MetadataRules.builder()
                    .condition(Operator.$in, Arrays.asList("Paris", "London"))
                    .condition(Operator.$is, Arrays.asList("Madrid"))
                    .build()
                )
                .build()
            )
            .build()
        )
        .build();

    ValidationRulesResponse result = client.validationRules().create(redemptionValidationRules);

    System.out.println(result);
    client.validationRules().get(result.getId());
    client.validationRules().delete(result.getId());
  }

  private void publicationRulesExample() {
    ValidationRules publicationValidationRules = ValidationRules.builder()
        .publicationRules(PublicationValidationRules.builder()
            .publishedForRedeemingCustomer(PublishedForRedeemingCustomerRules.builder()
                .condition(Operator.$is, Arrays.asList(true))
                .build()
            )
            .build()
        )
        .build();

    ValidationRulesResponse result = client.validationRules().create(publicationValidationRules);

    System.out.println(result);
    client.validationRules().get(result.getId());
    client.validationRules().delete(result.getId());
  }

  private void skuRulesExample() {
    ValidationRules skuValidationRules = ValidationRules.builder()
        .skuRules(SkuValidationRules.builder()
            .condition(Operator.$is, Arrays.asList(IdPair.builder()
                .id("id")
                .sourceId("sourceId")
                .build())
            )
            .build()
        )
        .build();

    ValidationRulesResponse result = client.validationRules().create(skuValidationRules);

    System.out.println(result);
    client.validationRules().get(result.getId());
    client.validationRules().delete(result.getId());
  }
}
