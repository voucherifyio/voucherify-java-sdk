package pl.rspective.voucherify.client.model.campaign;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
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

  @SerializedName("_id")
  private String id;

  private String code;

  private String campaign;

  private String category;

  private VoucherType type;

  private Discount discount;

  private Gift gift;

  @SerializedName("start_date")
  private Date startDate;

  @SerializedName("expiration_date")
  private Date expirationDate;

  private VoucherPublish publish;

  private VoucherRedemption redemption;

  private Boolean active;

  @SerializedName("additional_info")
  private String additionalInfo;

  private Map<String, Object> metadata;

  private Map<String, Object> assets;

  @SerializedName("is_referral_code")
  private Boolean isReferralCode;

  @SerializedName("referrer_id")
  private String referrerId;

  @SerializedName("updated_at")
  private Date updatedAt;

}
