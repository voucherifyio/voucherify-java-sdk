package pl.rspective.voucherify.client.model;

public class VoucherRedemptionContext {

    private final Customer customer;

    public VoucherRedemptionContext(Customer customer) {
        this.customer = customer;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
}
