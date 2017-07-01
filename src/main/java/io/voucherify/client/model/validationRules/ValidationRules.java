package io.voucherify.client.model.validationRules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@ToString
public class ValidationRules {

  private String id;

  @JsonProperty("voucher_code")
  private String voucherCode;

  @JsonProperty("campaign_name")
  private String campaignName;

  private Junction junction;

  @JsonProperty("segments")
  private SegmentValidationRules segmentRules;

  @JsonProperty("products")
  private ProductValidationRules productRules;

  @JsonProperty("skus")
  private SkuValidationRules skuRules;

  @JsonProperty("orders")
  private OrderValidationRules orderRules;

  @JsonProperty("redemptions")
  private RedemptionValidationRules redemptionRules;

}
