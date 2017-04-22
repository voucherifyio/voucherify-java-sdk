package pl.rspective.voucherify.client.model.voucher;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import pl.rspective.voucherify.client.model.Discount;
import pl.rspective.voucherify.client.model.Gift;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class Voucher {

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

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  @Singular("asset")
  private Map<String, Object> assets;

  @SerializedName("is_referral_code")
  private Boolean isReferralCode;

  @SerializedName("referrer_id")
  private String referrerId;

  @SerializedName("updated_at")
  private Date updatedAt;

}
