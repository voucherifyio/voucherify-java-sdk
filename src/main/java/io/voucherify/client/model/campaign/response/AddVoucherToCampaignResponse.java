package io.voucherify.client.model.campaign.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Gift;
import io.voucherify.client.model.voucher.VoucherType;
import io.voucherify.client.model.voucher.response.VoucherRedemptionResponse;
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
public class AddVoucherToCampaignResponse {

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

  private VoucherRedemptionResponse redemption;

  private Boolean active;

  @JsonProperty("additional_info")
  private String additionalInfo;

  private Map<String, Object> metadata;

  private Map<String, Object> assets;

  @JsonProperty("is_referral_code")
  private Boolean isReferralCode;

  @JsonProperty("referrer_id")
  private String referrerId;

  @JsonProperty("updated_at")
  private Date updatedAt;

}
