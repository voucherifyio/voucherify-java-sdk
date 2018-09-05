package io.voucherify.client.model.campaign.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.campaign.CampaignType;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignmentList;
import io.voucherify.client.model.voucher.GenerationStatus;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class CampaignResponse {

  private String id;

  private String name;

  private String object;

  private CampaignType type;

  private String description;

  private Map<String, Object> metadata;

  private Integer vouchersCount;

  @JsonProperty("start_date")
  private Date startDate;

  @JsonProperty("expiration_date")
  private Date expirationDate;

  @JsonProperty("updated_at")
  private Date updatedAt;

  @JsonProperty("vouchers_generation_status")
  private GenerationStatus generationStatus;

  private VoucherResponse voucher;

  @JsonProperty("validation_rules_assignments")
  private BusinessValidationRuleAssignmentList validationRuleAssignments;
}
