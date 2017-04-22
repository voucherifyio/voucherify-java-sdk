package pl.rspective.voucherify.client.model;

import java.util.List;

/**
 * @deprecated Use {@link pl.rspective.voucherify.client.model.redemption.RedemptionsList} instead
 */

@Deprecated
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
