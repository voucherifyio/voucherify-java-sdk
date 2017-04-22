package pl.rspective.voucherify.client.model;

import java.util.List;

/**
 * @deprecated Use {@link pl.rspective.voucherify.client.model.order.Order} instead
 */
@Deprecated
public class Order {
    
    private Integer amount;
    private List<OrderItem> items;
    
    public Order() {
    }
    
    public Order(Integer amount, List<OrderItem> items) {
        this.amount = amount;
        this.items = items;
    }

    public static Order amount(int amount) {
        return new Order(amount, null);
    }
    
    public Integer getAmount() {
        return amount;
    }
    
    public List<OrderItem> getItems() {
        return items;
    }
}
