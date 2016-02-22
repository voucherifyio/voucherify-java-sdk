package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

public enum RedemptionResult {

    @SerializedName("Success")
    SUCCESS(),
    
    @SerializedName("Failure-Inactive")
    FAILURE_INACTIVE,
    
    @SerializedName("Failure-NotExist")
    FAILURE_NOT_EXIST;
    
    @Override
    public String toString() {
        try {
            return getClass()
                    .getField(this.name())
                    .getAnnotation(SerializedName.class)
                    .value();
        } catch (NoSuchFieldException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
