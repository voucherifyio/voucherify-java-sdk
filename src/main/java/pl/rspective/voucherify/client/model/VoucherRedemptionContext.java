package pl.rspective.voucherify.client.model;

import java.util.Map;

public class VoucherRedemptionContext {

    private final Customer customer;
    
    private final Map<String, Object> metadata;

    public VoucherRedemptionContext(Customer customer, Map<String, Object> metadata) {
        this.customer = customer;
        this.metadata = metadata;
    }
    
    public VoucherRedemptionContext(Customer customer) {
        this(customer, null);
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
}
