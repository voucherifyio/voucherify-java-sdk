package io.voucherify.loyalty;

import com.google.gson.JsonElement;

public class LoyaltyV2HttpException extends Exception {
    private final int status;
    private final JsonElement body;

    public LoyaltyV2HttpException(int status, String message, JsonElement body) {
        super(message);
        this.status = status;
        this.body = body;
    }

    public int getStatus() {
        return status;
    }

    public JsonElement getBody() {
        return body;
    }
}
