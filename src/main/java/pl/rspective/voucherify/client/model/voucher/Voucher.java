package pl.rspective.voucherify.client.model.voucher;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.Discount;
import pl.rspective.voucherify.client.model.Gift;

import java.util.Date;
import java.util.Map;

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

    private Map<String, Object> metadata;

    private Map<String, Object> assets;

    @SerializedName("is_referral_code")
    private Boolean isReferralCode;

    @SerializedName("referrer_id")
    private String referrerId;

    @SerializedName("updated_at")
    private Date updatedAt;

    private Voucher() {
    }

    private Voucher(String id, String code, String campaign, String category, VoucherType type, Discount discount, Gift gift, Date startDate, Date expirationDate, VoucherPublish publish, VoucherRedemption redemption, Boolean active, String additionalInfo, Map<String, Object> metadata, Map<String, Object> assets, Boolean isReferralCode, String referrerId, Date updatedAt) {
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

    public static class Builder {

        private String id;

        private String code;

        private String campaign;

        private String category;

        private VoucherType type;

        private Discount discount;

        private Gift gift;

        private Date startDate;

        private Date expirationDate;

        private VoucherPublish publish;

        private VoucherRedemption redemption;

        private Boolean active;

        private String additionalInfo;

        private Map<String, Object> metadata;

        private Map<String, Object> assets;

        private Boolean isReferralCode;

        private String referrerId;

        private Date updatedAt;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setCampaign(String campaign) {
            this.campaign = campaign;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setType(VoucherType type) {
            this.type = type;
            return this;
        }

        public Builder setDiscount(Discount discount) {
            this.discount = discount;
            return this;
        }

        public Builder setGift(Gift gift) {
            this.gift = gift;
            return this;
        }

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setPublish(VoucherPublish publish) {
            this.publish = publish;
            return this;
        }

        public Builder setRedemption(VoucherRedemption redemption) {
            this.redemption = redemption;
            return this;
        }

        public Builder setActive(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder setMetadata(Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setAssets(Map<String, Object> assets) {
            this.assets = assets;
            return this;
        }

        public Builder setReferralCode(Boolean referralCode) {
            isReferralCode = referralCode;
            return this;
        }

        public Builder setReferrerId(String referrerId) {
            this.referrerId = referrerId;
            return this;
        }

        public Builder setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Voucher build() {
            return new Voucher(id, code, campaign, category, type, discount, gift, startDate, expirationDate, publish, redemption, active, additionalInfo, metadata, assets, isReferralCode, referrerId, updatedAt);
        }
    }
}
