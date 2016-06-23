package pl.rspective.voucherify.client.model;


public class Order {
    
    private Integer amount;
    
    public static Order amount(int amount) {
        Order order = new Order();
        order.amount = amount;
        return order;
    }
    
    public Integer getAmount() {
        return amount;
    }
}
