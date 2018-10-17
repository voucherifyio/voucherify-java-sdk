package io.voucherify.client.model.promotion.reponse;

import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.validationRules.response.ValidationRulesResponse;
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

  private ValidationRulesResponse condition;

  private Map<String, Object> action;

  private TierSummary summary;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

}
