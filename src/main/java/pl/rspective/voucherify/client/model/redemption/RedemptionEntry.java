package pl.rspective.voucherify.client.model.redemption;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.order.Order;

import java.util.Date;
import java.util.Map;

public class RedemptionEntry {

    private String id;

    private String object;

    private Date date;

    @SerializedName("customer_id")
    private String customerId;

    @SerializedName("tracking_id")
    private String trackingId;

    private String redemption;

    private String reason;

    private Integer amount;

    private Order order;

    private Map<String, Object> metadata;

    private RedemptionStatus result;

    @SerializedName("failure_code")
    private String failureCode;

    @SerializedName("failure_message")
    private String failureMessage;

    private RedemptionEntry() {
    }

    private RedemptionEntry(String id, String object, Date date, String customerId, String trackingId, String redemption, String reason, Integer amount, Order order, Map<String, Object> metadata, RedemptionStatus result, String failureCode, String failureMessage) {
        this.id = id;
        this.object = object;
        this.date = date;
        this.customerId = customerId;
        this.trackingId = trackingId;
        this.redemption = redemption;
        this.reason = reason;
        this.amount = amount;
        this.order = order;
        this.metadata = metadata;
        this.result = result;
        this.failureCode = failureCode;
        this.failureMessage = failureMessage;
    }

    public String getId() {
        return id;
    }

    public String getObject() {
        return object;
    }

    public Date getDate() {
        return date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public String getRedemption() {
        return redemption;
    }

    public String getReason() {
        return reason;
    }

    public Integer getAmount() {
        return amount;
    }

    public Order getOrder() {
        return order;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public RedemptionStatus getResult() {
        return result;
    }

    public String getFailureCode() {
        return failureCode;
    }

    public String getFailureMessage() {
        return failureMessage;
    }
}
