package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

public enum RedemptionResult {

    @SerializedName("Success")
    SUCCESS, 
    
    @SerializedName("Failure-Inactive")
    FAILURE_INACTIVE,
    
    @SerializedName("Failure-NotExist")
    FAILURE_NOT_EXIST;
}
