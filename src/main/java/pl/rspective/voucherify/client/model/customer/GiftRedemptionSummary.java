package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;

public class GiftRedemptionSummary {

    @SerializedName("redeemed_amount")
    private int redeemedAmount;

    @SerializedName("amount_to_go")
    private int amountToGo;

    private GiftRedemptionSummary() {}

    private GiftRedemptionSummary(int redeemedAmount, int amountToGo) {
        this.redeemedAmount = redeemedAmount;
        this.amountToGo = amountToGo;
    }

    public int getRedeemedAmount() {
        return redeemedAmount;
    }

    public int getAmountToGo() {
        return amountToGo;
    }
}
