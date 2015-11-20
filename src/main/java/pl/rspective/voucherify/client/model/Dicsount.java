package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

public class Dicsount {
    
    private DiscountType type;
    
    @SerializedName("amount_off")
    private Integer amountOff;
    
    @SerializedName("percent_off")
    private Double percentOff;
    
    @SerializedName("unit_off")
    private Double unitOff;
    
    @SerializedName("unit_type")
    private String unitType;

    public DiscountType getType() {
        return type;
    }

    public Integer getAmountOff() {
        return amountOff;
    }

    public Double getPercentOff() {
        return percentOff;
    }

    public Double getUnitOff() {
        return unitOff;
    }

    public String getUnitType() {
        return unitType;
    }
}
