package io.voucherify.client.model.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.campaign.CampaignType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class CreatePromotionCampaign {

  private String name;

  @JsonProperty("campaign_type")
  private CampaignType campaignType;

  @JsonProperty("start_date")
  private Date startDate;

  @JsonProperty("expiration_date")
  private Date expirationDate;

  private List<Tier> tiers;
}
