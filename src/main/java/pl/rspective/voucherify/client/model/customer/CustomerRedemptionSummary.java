package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;

public class CustomerRedemptionSummary {

    @SerializedName("total_redemeed")
    private int totalRedeemed;

    @SerializedName("total_failed")
    private int totalFailed;

    @SerializedName("total_succeeded")
    private int totalSucceeded;

    @SerializedName("total_rolled_back")
    private int totalRolledBack;

    @SerializedName("total_rollback_failed")
    private int totalRollbackFailed;

    @SerializedName("total_rollback_succeeded")
    private int totalRollbackSucceeded;

    private GiftRedemptionSummary gift;

    private CustomerRedemptionSummary() {}

    private CustomerRedemptionSummary(int totalRedeemed, int totalFailed, int totalSucceeded, int totalRolledBack, int totalRollbackFailed, int totalRollbackSucceeded, GiftRedemptionSummary gift) {
        this.totalRedeemed = totalRedeemed;
        this.totalFailed = totalFailed;
        this.totalSucceeded = totalSucceeded;
        this.totalRolledBack = totalRolledBack;
        this.totalRollbackFailed = totalRollbackFailed;
        this.totalRollbackSucceeded = totalRollbackSucceeded;
        this.gift = gift;
    }

    public int getTotalRedeemed() {
        return totalRedeemed;
    }

    public int getTotalFailed() {
        return totalFailed;
    }

    public int getTotalSucceeded() {
        return totalSucceeded;
    }

    public int getTotalRolledBack() {
        return totalRolledBack;
    }

    public int getTotalRollbackFailed() {
        return totalRollbackFailed;
    }

    public int getTotalRollbackSucceeded() {
        return totalRollbackSucceeded;
    }

    public GiftRedemptionSummary getGift() {
        return gift;
    }
}
