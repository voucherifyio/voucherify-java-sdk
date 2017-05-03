package pl.rspective.voucherify.client.model.validationRules.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.rspective.voucherify.client.model.validationRules.Junction;
import pl.rspective.voucherify.client.model.validationRules.OrderValidationRules;
import pl.rspective.voucherify.client.model.validationRules.ProductValidationRules;
import pl.rspective.voucherify.client.model.validationRules.RedemptionValidationRules;
import pl.rspective.voucherify.client.model.validationRules.SegmentValidationRules;
import pl.rspective.voucherify.client.model.validationRules.SkuValidationRules;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class ValidationRulesResponse {

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

  private String object;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("updated_at")
  private Date updatedAt;
}
