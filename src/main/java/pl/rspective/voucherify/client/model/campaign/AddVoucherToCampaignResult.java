package pl.rspective.voucherify.client.model.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.model.Discount;
import pl.rspective.voucherify.client.model.Gift;
import pl.rspective.voucherify.client.model.voucher.VoucherPublish;
import pl.rspective.voucherify.client.model.voucher.VoucherRedemption;
import pl.rspective.voucherify.client.model.voucher.VoucherType;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class AddVoucherToCampaignResult {

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

  private VoucherPublish publish;

  private VoucherRedemption redemption;

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
