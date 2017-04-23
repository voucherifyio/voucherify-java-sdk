package pl.rspective.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

/**
 * Class represents a voucher
 */
@Deprecated
public class Voucher {

    /**
     * The unique voucher's id
     */
    private String id;

    /**
     * The unique voucher's code used for instance to consume it
     */
    private String code;
    
    /**
     * A definition how to generate voucher's code. Used only on creation.
     */
    @JsonProperty("code_config")
    private CodeConfig codeConfig;
    
    /**
     * Voucher's type
     */
    private VoucherType type;

    /**
     * The name of voucher's campaign
     */
    private String campaign;
    
    /**
     * The name of voucher's category
     */
    private String category;

    /**
     * Discount definition - present if type is DISCOUNT_VOUCHER
     */
    private Discount discount;
    
    /**
     * Gift definition (amount) - present if type is GIFT_VOUCHER
     */
    private Gift gift;

    /**
     * Voucher's start date
     */
    @JsonProperty("start_date")
    private Date startDate;
    
    /**
     * Voucher's expiration date
     */
    @JsonProperty("expiration_date")
    private Date expirationDate;
    
    /**
     * Disables a voucher when set to false even if it's within a activity period (start date - expiration date). 
     */
    private boolean active;

    /**
     * Holds information about voucher's publications
     */
    private VoucherPublish publish;
    
    /**
     * Holds information about voucher's redemption
     */
    private VoucherRedemption redemption;

    /**
     * Additional voucher's information
     */
    @JsonProperty("additional_info")
    private String additionalInfo;
    
    private Map<String, Object> metadata;
    
    private Voucher() {
    }
    
    private Voucher(
            String id,
            VoucherType type,
            String code,
            CodeConfig codeConfig,
            String campaign,
            String category,
            Discount discount,
            Gift gift,
            Date startDate,
            Date expirationDate,
            VoucherPublish publish,
            VoucherRedemption redemption,
            Boolean active,
            String additionalInfo,
            Map<String, Object> metadata) {
        if (code != null && codeConfig != null) {
            throw new IllegalArgumentException("code and codeConfig are mutualy exclusive");
        }
        this.id = id;
        this.type = type;
        this.code = code;
        this.codeConfig = codeConfig;
        this.campaign = campaign;
        this.category = category;
        this.discount = discount;
        this.gift = gift;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.publish = publish;
        this.redemption = redemption;
        this.active = active;
        this.additionalInfo = additionalInfo;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }
    
    public VoucherType getType() {
        return type;
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
    
    public boolean isActive() {
        return active;
    }
    
    public VoucherPublish getPublish() {
        return publish;
    }

    public VoucherRedemption getRedemption() {
        return redemption;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
    public static class Builder {

        private String id;

        private String code;
        
        private CodeConfig codeConfig;
        
        private VoucherType type;

        private String campaign;
        
        private String category;

        private Discount discount;
        
        private Gift gift;

        private Date startDate;

        private Date expirationDate;

        private VoucherPublish publish;

        private VoucherRedemption redemption;

        private boolean active = true;

        private String additionalInfo;

        private Map<String, Object> metadata;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }
        
        public Builder setType(VoucherType type) {
            this.type = type;
            return this;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }
        
        public Builder setCodeConfig(CodeConfig codeConfig) {
            this.codeConfig = codeConfig;
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
        
        public Builder setDiscount(Discount discount) {
            this.discount = discount;
            return this;
        }
        
        public Builder setAmountOff(int amountOff) {
            this.discount = Discount.amountOff(amountOff);
            return this;
        }
        
        public Builder setPercentOff(double percentOff) {
            this.discount = Discount.percentOff(percentOff);
            return this;
        }
        
        public Builder setUnitOff(double unitOff) {
            this.discount = Discount.unitOff(unitOff);
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

        public Builder setRedemptionLimit(int limit) {
            this.redemption = VoucherRedemption.quantity(limit);
            return this;
        }
        
        public Builder setActive(boolean active) {
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

        public Builder enabled() {
            this.active = true;
            return this;
        }

        public Builder disabled() {
            this.active = false;
            return this;
        }

        public Voucher build() {
            return new Voucher(id, type, code, codeConfig, campaign, category, discount, gift, startDate, expirationDate, publish, redemption, active, additionalInfo, metadata);
        }
    }


}
