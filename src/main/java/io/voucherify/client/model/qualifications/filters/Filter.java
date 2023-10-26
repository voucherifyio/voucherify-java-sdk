package io.voucherify.client.model.qualifications.filters;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class Filter {

  @JsonProperty("category_id")
  private CategoryId categoryId;

  @JsonProperty("campaign_id")
  private CampaignId campaignId;

  @JsonProperty("resource_type")
  private ResourceType resourceType;

  @JsonProperty("voucher_type")
  private VoucherType voucherType;

  private Junction junction;
}
