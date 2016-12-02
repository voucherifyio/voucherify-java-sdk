package pl.rspective.voucherify.client.model;

public class Gift {
    
    private Integer amount;
    private Integer balance;
    
    public Gift(Integer amount, Integer balance) {
        this.amount = amount;
        this.balance = balance;
    }
    
    public static Gift amount(int amount) {
        return new Gift(amount, amount);
    }
    
    public Integer getAmount() {
        return amount;
    }
    
    public Integer getBalance() {
        return balance;
    }
}
