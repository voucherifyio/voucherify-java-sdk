package pl.rspective.voucherify.client.model;

import java.util.Date;

/**
 * I hold a history information about voucher redemption
 */
public class RedemptionEntry {

    /**
     * When the voucher was redeemed
     */
    private Date date;

    /**
     * Voucher's consumer tracking id
     */
    private String trackingId;

    public Date getDate() {
        return date;
    }

    public String getTrackingId() {
        return trackingId;
    }
}
