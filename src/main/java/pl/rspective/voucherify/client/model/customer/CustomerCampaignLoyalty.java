package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;

public class CustomerCampaignLoyalty {

    private int points;

    @SerializedName("referred_customers")
    private int referredCustomers;

    private CustomerCampaignLoyalty() {}

    private CustomerCampaignLoyalty(int points, int referredCustomers) {
        this.points = points;
        this.referredCustomers = referredCustomers;
    }

    public int getPoints() {
        return points;
    }

    public int getReferredCustomers() {
        return referredCustomers;
    }
}
