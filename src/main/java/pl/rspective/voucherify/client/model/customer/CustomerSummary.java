package pl.rspective.voucherify.client.model.customer;

public class CustomerSummary {

    private CustomerRedemptionSummary redemptions;

    private CustomerOrderSummary orders;

    private CustomerSummary() {}

    private CustomerSummary(CustomerRedemptionSummary redemptions, CustomerOrderSummary orders) {
        this.redemptions = redemptions;
        this.orders = orders;
    }

    public CustomerRedemptionSummary getRedemptions() {
        return redemptions;
    }

    public CustomerOrderSummary getOrders() {
        return orders;
    }
}
