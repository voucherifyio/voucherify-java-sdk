package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * I hold a history information about voucher redemption
 */
public class RedemptionEntry {

    /**
     *  An identifier for entity
     */
    private String id;

    /**
     * When the voucher was redeemed
     */
    private Date date;

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Voucher's consumer tracking id
     */
    @SerializedName("tracking_id")
    private String trackingId;

    public Date getDate() {
        return date;
    }

    public String getTrackingId() {
        return trackingId;
    }
}
