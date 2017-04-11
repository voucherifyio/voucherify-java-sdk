package pl.rspective.voucherify.client.model;

import java.util.List;

public class RedemptionsList {
    
    private Long total;
    
    private List<RedemptionDetails> redemptions;
    
    public Long getTotal() {
        return total;
    }
    
    public List<RedemptionDetails> getRedemptions() {
        return redemptions;
    }
}
