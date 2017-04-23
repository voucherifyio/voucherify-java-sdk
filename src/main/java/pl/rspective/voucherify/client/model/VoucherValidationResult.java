package pl.rspective.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class represents validity of a voucher
 */
public class VoucherValidationResult {

    /**
     * The unique voucher's code used for instance to consume it
     */
    private String code;

    /**
     * Status flag informing about validity of a voucher
     */
    private boolean valid;

    /**
     * Voucher's type
     */
    private VoucherType type;

    /**
     * Discount definition - present if type is DISCOUNT_VOUCHER
     */
    private Discount discount;

    /**
     * Gift definition (amount) - present if type is GIFT_VOUCHER
     */
    private Gift gift;

    /**
     * Reason - present when voucher is invalid
     */
    private String reason;

    /**
     * Tracking id which can be used in further calls
     */
    @JsonProperty("tracking_id")
    private String trackingId;

    private VoucherValidationResult() {
    }

    private VoucherValidationResult(String code, boolean valid, VoucherType type, Discount discount, Gift gift, String reason,
            String trackingId) {

        this.code = code;
        this.valid = valid;
        this.type = type;
        this.discount = discount;
        this.gift = gift;
        this.reason = reason;
        this.trackingId = trackingId;
    }

    public String getCode() {
        return code;
    }

    public boolean isValid() {
        return valid;
    }

    public VoucherType getType() {
        return type;
    }

    public Discount getDiscount() {
        return discount;
    }

    public Gift getGift() {
        return gift;
    }

    public String getReason() {
        return reason;
    }

    public String getTrackingId() {
        return trackingId;
    }

}
