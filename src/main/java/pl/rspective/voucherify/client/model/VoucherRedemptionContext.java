package pl.rspective.voucherify.client.model;

import java.util.Map;

public class VoucherRedemptionContext {

    private final Customer customer;
    
    private final Order order;
    
    private final Map<String, Object> metadata;

    public VoucherRedemptionContext(Customer customer, Order order, Map<String, Object> metadata) {
        this.customer = customer;
        this.order = order;
        this.metadata = metadata;
    }
    
    public VoucherRedemptionContext(Customer customer, Map<String, Object> metadata) {
        this(customer, null, metadata);
    }
    
    public VoucherRedemptionContext(Customer customer) {
        this(customer, null);
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public Order getOrder() {
        return order;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
}
