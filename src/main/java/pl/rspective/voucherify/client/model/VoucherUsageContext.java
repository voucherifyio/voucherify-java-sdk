package pl.rspective.voucherify.client.model;

public class VoucherUsageContext {

    private final Customer customer;

    public VoucherUsageContext(Customer customer) {
        this.customer = customer;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
}
