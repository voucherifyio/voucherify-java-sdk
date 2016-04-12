package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Map;

/**
 * Class represents a voucher
 */
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
     * The name of voucher's campaign
     */
    private String campaign;
    
    /**
     * The name of voucher's category
     */
    private String category;

    /**
     * Discount associated with the voucher
     */
    private Discount discount;

    /**
     * Voucher's start date
     */
    @SerializedName("start_date")
    private Date startDate;
    
    /**
     * Voucher's expiration date
     */
    @SerializedName("expiration_date")
    private Date expirationDate;
    
    /**
     * Disables a voucher when set to false even if it's within a activity period (start date - expiration date). 
     */
    private boolean active;

    /**
     * Hold information about voucher's redemption
     */
    private VoucherRedemption redemption;

    /**
     * Additional voucher's information
     */
    @SerializedName("additional_info")
    private String additionalInfo;
    
    private Map<String, Object> metadata;
    
    private Voucher() {
    }
    
    private Voucher(
            String id,
            String code,
            String campaign,
            String category,
            Discount discount,
            Date startDate,
            Date expirationDate,
            VoucherRedemption redemption,
            Boolean active,
            String additionalInfo,
            Map<String, Object> metadata) {
        this.id = id;
        this.code = code;
        this.campaign = campaign;
        this.category = category;
        this.discount = discount;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.redemption = redemption;
        this.active = active;
        this.additionalInfo = additionalInfo;
        this.metadata = metadata;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @return
     */
    public String getCampaign() {
        return campaign;
    }
    
    /**
    *
    * @return
    */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @return
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
    *
    * @return
    */
    public Date getStartDate() {
        return startDate;
    }
    
    /**
     *
     * @return
     */
    public Date getExpirationDate() {
        return expirationDate;
    }
    
    public boolean isActive() {
        return active;
    }

    /**
     *
     * @return
     */
    public VoucherRedemption getRedemption() {
        return redemption;
    }

    /**
     *
     * @return
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
    public static class Builder {

        private String id;

        private String code;

        private String campaign;
        
        private String category;

        private Discount discount;

        private Date startDate;

        private Date expirationDate;

        private VoucherRedemption redemption;

        private boolean active = true;

        private String additionalInfo;

        private Map<String, Object> metadata;

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

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setRedemption(VoucherRedemption redemption) {
            this.redemption = redemption;
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
            return new Voucher(id, code, campaign, category, discount, startDate, expirationDate, redemption, active, additionalInfo, metadata);
        }
    }


}
