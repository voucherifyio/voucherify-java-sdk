package io.voucherify.client.model.validationRules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@ToString
public class RedemptionValidationRules {

  private Junction junction;

  @JsonProperty("count_per_campaign")
  private RedemptionCountValidationRules countPerCampaign;

  @JsonProperty("count_per_customer")
  private RedemptionCountValidationRules countPerCustomer;

  @JsonProperty("count_per_customer_per_campaign")
  private RedemptionCountValidationRules countPerCustomerPerCampaign;

  @JsonProperty("count_per_customer_per_day")
  private RedemptionCountValidationRules countPerCustomerPerDay;

  @JsonProperty("count_per_user")
  private RedemptionCountValidationRules countPerUser;

  @JsonProperty("gift_cards_amount")
  private RedemptionCountValidationRules giftCardsAmount;

  @JsonProperty("metadata")
  private MetadataValidationRules metadata;

}
