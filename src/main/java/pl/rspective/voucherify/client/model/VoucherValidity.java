package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

/**
 * Class represents validity of a voucher
 */
public class VoucherValidity {

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
   * Tracking id which can be used in further calls
   */
  @SerializedName("tracking_id")
  private String trackingId;

  private VoucherValidity() {
  }

  private VoucherValidity(
    String code,
    boolean valid,
    VoucherType type,
    Discount discount,
    Gift gift,
    String trackingId) {

    this.code = code;
    this.valid = valid;
    this.type = type;
    this.discount = discount;
    this.gift = gift;
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

  public String getTrackingId() {
    return trackingId;
  }

  public static class Builder {

    private String code;

    private boolean valid;

    private VoucherType type;

    private Discount discount;

    private Gift gift;

    private String trackingId;

    public Builder setCode(String code) {
      this.code = code;
      return this;
    }

    public Builder valid() {
      this.valid = true;
      return this;
    }

    public Builder invalid() {
      this.valid = false;
      return this;
    }

    public Builder setType(VoucherType type) {
      this.type = type;
      return this;
    }

    public Builder setDiscount(Discount discount) {
      this.discount = discount;
      return this;
    }

    public Builder setGift(Gift gift) {
      this.gift = gift;
      return this;
    }

    public Builder setTrackingId(String trackingId) {
      this.trackingId = trackingId;
      return this;
    }

    public VoucherValidity build() {
      return new VoucherValidity(code, valid, type, discount, gift, trackingId);
    }
  }
}
