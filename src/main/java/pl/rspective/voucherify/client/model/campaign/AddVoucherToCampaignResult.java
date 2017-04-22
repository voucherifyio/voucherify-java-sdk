package pl.rspective.voucherify.client.model.campaign;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.Discount;
import pl.rspective.voucherify.client.model.Gift;
import pl.rspective.voucherify.client.model.voucher.VoucherPublish;
import pl.rspective.voucherify.client.model.voucher.VoucherRedemption;
import pl.rspective.voucherify.client.model.voucher.VoucherType;

import java.util.Date;
import java.util.Map;

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

    private AddVoucherToCampaignResult() {
    }

    private AddVoucherToCampaignResult(String id, String code, String campaign, String category, VoucherType type, Discount discount, Gift gift, Date startDate, Date expirationDate, VoucherPublish publish, VoucherRedemption redemption, Boolean active, String additionalInfo, Map<String, Object> metadata, Map<String, Object> assets, Boolean isReferralCode, String referrerId, Date updatedAt) {
        this.id = id;
        this.code = code;
        this.campaign = campaign;
        this.category = category;
        this.type = type;
        this.discount = discount;
        this.gift = gift;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.publish = publish;
        this.redemption = redemption;
        this.active = active;
        this.additionalInfo = additionalInfo;
        this.metadata = metadata;
        this.assets = assets;
        this.isReferralCode = isReferralCode;
        this.referrerId = referrerId;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getCampaign() {
        return campaign;
    }

    public String getCategory() {
        return category;
    }

    public VoucherType getType() {
        return type;
    }

    public Discount getDiscount() {
        return discount;
    }

    public Gift getGift() {
        return gift;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public VoucherPublish getPublish() {
        return publish;
    }

    public VoucherRedemption getRedemption() {
        return redemption;
    }

    public Boolean getActive() {
        return active;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public Map<String, Object> getAssets() {
        return assets;
    }

    public Boolean getReferralCode() {
        return isReferralCode;
    }

    public String getReferrerId() {
        return referrerId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
