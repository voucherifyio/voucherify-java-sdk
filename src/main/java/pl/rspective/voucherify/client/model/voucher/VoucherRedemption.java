package pl.rspective.voucherify.client.model.voucher;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.redemption.RedemptionEntry;

import java.util.List;

public class VoucherRedemption {

    private Integer quantity;

    @SerializedName("redeemed_quantity")
    private Integer redeemedQuantity;

    @SerializedName("redeemed_amount")
    private Integer redeemedAmount;

    @SerializedName("redemption_entries")
    private List<RedemptionEntry> redemptionEntries;

    private VoucherRedemption() {
    }

    private VoucherRedemption(Integer quantity, Integer redeemedQuantity, Integer redeemedAmount, List<RedemptionEntry> redemptionEntries) {
        this.quantity = quantity;
        this.redeemedQuantity = redeemedQuantity;
        this.redeemedAmount = redeemedAmount;
        this.redemptionEntries = redemptionEntries;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getRedeemedQuantity() {
        return redeemedQuantity;
    }

    public Integer getRedeemedAmount() {
        return redeemedAmount;
    }

    public List<RedemptionEntry> getRedemptionEntries() {
        return redemptionEntries;
    }

    public static class Builder {

        private Integer quantity;

        public Builder setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public VoucherRedemption build() {
            return new VoucherRedemption(quantity, null, null, null);
        }
    }
}
