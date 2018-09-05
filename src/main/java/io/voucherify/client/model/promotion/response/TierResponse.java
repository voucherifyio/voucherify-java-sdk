package io.voucherify.client.model.promotion.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignmentList;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class TierResponse {

  private String id;

  private String object;

  private String name;

  private String banner;

  private CampaignResponse campaign;

  private Map<String, Object> action;

  private TierSummary summary;

  @JsonProperty("validation_rule_assignments")
  private BusinessValidationRuleAssignmentList assignments;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}
