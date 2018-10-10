package io.voucherify.client.model.voucher.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.validationRules.Junction;
import io.voucherify.client.model.validationRules.OrderValidationRules;
import io.voucherify.client.model.validationRules.ProductValidationRules;
import io.voucherify.client.model.validationRules.PublicationValidationRules;
import io.voucherify.client.model.validationRules.RedemptionValidationRules;
import io.voucherify.client.model.validationRules.SegmentValidationRules;
import io.voucherify.client.model.validationRules.SkuValidationRules;
import io.voucherify.client.model.validationRules.UserValidationRules;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherValidationRules {

  private String id;

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

  @JsonProperty("publications")
  private PublicationValidationRules publicationRules;

  @JsonProperty("users")
  private UserValidationRules userRules;

  private String object;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("updated_at")
  private Date updatedAt;
}
