package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.Operator;
import io.voucherify.client.model.campaign.CampaignType;
import io.voucherify.client.model.promotion.CreatePromotionCampaign;
import io.voucherify.client.model.promotion.Promotion;
import io.voucherify.client.model.promotion.Tier;
import io.voucherify.client.model.promotion.reponse.CreatePromotionCampaignResponse;
import io.voucherify.client.model.promotion.reponse.ListPromotionTiersResponse;
import io.voucherify.client.model.promotion.reponse.TierResponse;
import io.voucherify.client.model.validationRules.OrderValidationRules;
import io.voucherify.client.model.validationRules.ValidationRules;

import java.util.Arrays;
import java.util.Date;

public class PromotionsExample extends AbsExample {

  public PromotionsExample(VoucherifyClient client) {
    super(client);
  }

  @Override
  public void example() {
    CreatePromotionCampaign createPromotionCampaign = CreatePromotionCampaign.builder()
        .name("name-2")
        .campaignType(CampaignType.PROMOTION)
        .startDate(new Date())
        .promotion(Promotion.builder()
            .tier(Tier.builder()
                .banner("banner")
                .name("some name")
                .condition(ValidationRules.builder()
                    .orderRules(OrderValidationRules.builder()
                        .totalAmountCondition(Operator.$more_than, Arrays.asList(10))
                        .build()
                    )
                    .build()
                )
                .build()
            )
            .build()
        )
        .build();

    CreatePromotionCampaignResponse response = client.promotions().create(createPromotionCampaign);
    System.out.print(response);

    Tier tier = Tier.builder()
        .banner("other banner")
        .condition(ValidationRules.builder()
            .orderRules(OrderValidationRules.builder()
                .totalAmountCondition(Operator.$more_than, Arrays.asList(10))
                .build()
            )
            .build()
        )
        .build();

    TierResponse tierResponse = client.promotions().addPromotionTier(response.getId(), tier);
    System.out.print(tierResponse);

    Tier update = Tier.builder()
        .banner("other banner 2")
        .build();

    TierResponse updateResult = client.promotions().updatePromotionTier(tierResponse.getId(), update);
    System.out.print(updateResult);

    client.promotions().deletePromotionTier(updateResult.getId());

    ListPromotionTiersResponse list = client.promotions().list(response.getId());
    System.out.print(list);
  }
}
