package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class CustomerLoyalty {

    private int points;

    @SerializedName("referred_customers")
    private int referredCustomers;

    private Map<String, CustomerCampaignLoyalty> campaigns;

    private CustomerLoyalty() {}

    private CustomerLoyalty(int points, int referredCustomers, Map<String, CustomerCampaignLoyalty> campaigns) {
        this.points = points;
        this.referredCustomers = referredCustomers;
        this.campaigns = campaigns;
    }

    public int getPoints() {
        return points;
    }

    public int getReferredCustomers() {
        return referredCustomers;
    }

    public Map<String, CustomerCampaignLoyalty> getCampaigns() {
        return campaigns;
    }
}
