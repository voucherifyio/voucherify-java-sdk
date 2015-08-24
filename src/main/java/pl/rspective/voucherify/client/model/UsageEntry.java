package pl.rspective.voucherify.client.model;

import java.util.Date;

/**
 * I hold a history information about voucher usage
 */
public class UsageEntry {

    /**
     * When the voucher was usaged
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
