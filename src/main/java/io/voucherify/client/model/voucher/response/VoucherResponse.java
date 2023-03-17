package io.voucherify.client.model.voucher.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.common.response.applicableTo.ApplicableToResponse;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignmentList;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Gift;
import io.voucherify.client.model.voucher.LoyaltyCard;
import io.voucherify.client.model.voucher.VoucherType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherResponse {

  private String id;

  private String code;

  private String campaign;

  private String category;

  private VoucherType type;

  private Discount discount;

  private Gift gift;

  @JsonProperty("start_date")
  private Date startDate;

  @JsonProperty("expiration_date")
  private Date expirationDate;

  private VoucherPublishResponse publish;

  @JsonProperty("loyalty_card")
  private LoyaltyCard loyaltyCard;

  private VoucherRedemptionResponse redemption;

  private Boolean active;

  @JsonProperty("additional_info")
  private String additionalInfo;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  @Singular("asset")
  private Map<String, Object> assets;

  @JsonProperty("is_referral_code")
  private Boolean isReferralCode;

  @JsonProperty("referrer_id")
  private String referrerId;

  @JsonProperty("updated_at")
  private Date updatedAt;

  @JsonProperty("holder_id")
  private String holderId;

  @JsonProperty("applicable_to")
  private ApplicableToResponse applicableTo;

  @JsonProperty("validation_rules_assignments")
  private BusinessValidationRuleAssignmentList validationRuleAssignments;
}
