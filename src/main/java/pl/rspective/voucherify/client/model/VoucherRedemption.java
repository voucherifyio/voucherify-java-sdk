package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @deprecated Use {@link pl.rspective.voucherify.client.model.redemption.VoucherRedemptionsResult}
 */
@Deprecated
public class VoucherRedemption {

  private Integer quantity;

  @SerializedName("redeemed_quantity")
  private int redeemedQuantity;

  @SerializedName("redemption_entries")
  private List<RedemptionEntry> redemptionEntries;

  public static VoucherRedemption quantity(int limit) {
    VoucherRedemption redemption = new VoucherRedemption();
    redemption.quantity = limit;
    return redemption;
  }

  public static VoucherRedemption unlimited() {
    return new VoucherRedemption();
  }

  public Integer getQuantity() {
    return quantity;
  }

  public int getRedeemedQuantity() {
    return redeemedQuantity;
  }

  public List<RedemptionEntry> getRedemptionEntries() {
    return redemptionEntries;
  }
}
