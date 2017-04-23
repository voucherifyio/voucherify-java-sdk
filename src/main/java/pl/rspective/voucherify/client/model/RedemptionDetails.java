package pl.rspective.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class RedemptionDetails {

    @JsonProperty("id")
    private String redemptionId;
    
    private RedemptionResult result;
    
    private Date date;
    
    @JsonProperty("voucher_code")
    private String voucherCode;
    
    private Discount discount;

    private Customer customer;
    
    @JsonProperty("order")
    private Order Order;
    
    public String getRedemptionId() {
        return redemptionId;
    }
    
    public RedemptionResult getResult() {
        return result;
    }
    
    public Date getDate() {
        return date;
    }
    
    public String getVoucherCode() {
        return voucherCode;
    }
    
    public Discount getDiscount() {
        return discount;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public Order getOrder() {
        return Order;
    }
}
