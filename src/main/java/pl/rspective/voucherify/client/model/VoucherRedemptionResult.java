package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Map;

public class VoucherRedemptionResult {

    /**
     *  An identifier for entity
     */
    private String id;

    /**
     * When the voucher was redeemed
     */
    private Date date;
    
    /**
     * Type of the operation (redemption or redemption_rollback)
     */
    private String object;
    
    /**
     * Voucher's consumer tracking id
     */
    @SerializedName("tracking_id")
    private String trackingId;
    
    /**
     * Original redemption id (present if this entry is a rollback).
     */
    private String redemption;
    
    /**
     * Reason of the rollback.
     */
    private String reason;
    
    /**
     * Metadata - whatever you
     */
    private Map<String, Object> metadata;
    
    /**
     * Full voucher data
     */
    private Voucher voucher;

    public String getId() {
        return id;
    }
    
    public String getObject() {
        return object;
    }

    public Date getDate() {
        return date;
    }

    public String getTrackingId() {
        return trackingId;
    }
    
    public String getRedemption() {
        return redemption;
    }
    
    public String getReason() {
        return reason;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
    public Voucher getVoucher() {
        return voucher;
    }
}
