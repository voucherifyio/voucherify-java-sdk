package pl.rspective.voucherify.client.model;

public class VoucherValidationContext {

    private final Customer customer;

    private final Order order;

    public VoucherValidationContext(Customer customer) {
        this(customer, null);
    }

    public VoucherValidationContext(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order getOrder() {
        return order;
    }
}
