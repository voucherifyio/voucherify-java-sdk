package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class RedemptionDetails {

    @SerializedName("redemption_id")
    private String redemptionId;
    
    private RedemptionResult result;
    
    private Date date;
    
    @SerializedName("voucher_code")
    private String voucherCode;
    
    private Discount discount;

    private Customer customer;
    
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
}
