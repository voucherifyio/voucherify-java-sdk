package pl.rspective.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

/**
 * I hold a history information about voucher redemption
 */
@Deprecated
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
     * Type of the operation (redemption or redemption_rollback)
     */
    private String object;
    
    /**
     * Id of a customer who made this redemption
     */
    @JsonProperty("customer_id")
    private String customerId;
    
    /**
     * Voucher's consumer tracking id
     */
    @JsonProperty("tracking_id")
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
     *
     * @return
     */
    public String getId() {
        return id;
    }
    
    public String getObject() {
        return object;
    }

    public Date getDate() {
        return date;
    }
    
    public String getCustomerId() {
        return customerId;
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
}
