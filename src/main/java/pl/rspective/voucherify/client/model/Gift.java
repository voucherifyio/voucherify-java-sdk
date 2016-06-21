package pl.rspective.voucherify.client.model;

public class Gift {
    
    private Integer amount;
    
    public static Gift amount(int amount) {
        Gift gift = new Gift();
        gift.amount = amount;
        return gift;
    }
    
    public Integer getAmount() {
        return amount;
    }
}
