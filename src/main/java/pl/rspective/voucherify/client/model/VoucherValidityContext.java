package pl.rspective.voucherify.client.model;

public class VoucherValidityContext {

  private final Customer customer;

  private final Order order;

  public VoucherValidityContext(Customer customer) {
    this(customer, null);
  }

  public VoucherValidityContext(Customer customer, Order order) {
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
