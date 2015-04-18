package com.rspective.voucherify.client.model;

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
     * Value of the voucher discount
     */
    private double discount;

    /**
     * The type of the voucher
     */
    private DiscountType discountType;

    /**
     * Voucher's expiration date
     */
    private Date expirationDate;

    /**
     * Hold information about voucher's usage
     */
    private VoucherUsage usage;

    /**
     * Additional voucher's information
     */
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
    public double getDiscount() {
        return discount;
    }

    /**
     *
     * @return
     */
    public DiscountType getDiscountType() {
        return discountType;
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
    public VoucherUsage getUsage() {
        return usage;
    }

    /**
     *
     * @return
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
