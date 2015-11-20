package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

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
    private Dicsount discount;

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
     * Hold information about voucher's redemption
     */
    private VoucherRedemption redemption;

    /**
     * Additional voucher's information
     */
    @SerializedName("additional_info")
    private String additionalInfo;

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
    public Dicsount getDiscount() {
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

    public void setDiscount(Dicsount discount) {
        this.discount = discount;
    }


}
