package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class CustomerOrderSummary {

    @SerializedName("total_amount")
    private int totalAmount;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName("average_amount")
    private int averageAmount;

    @SerializedName("last_order_amount")
    private int lastOrderAmount;

    @SerializedName("last_order_date")
    private Date lastOrderDate;

    private CustomerOrderSummary() {}

    private CustomerOrderSummary(int totalAmount, int totalCount, int averageAmount, int lastOrderAmount, Date lastOrderDate) {
        this.totalAmount = totalAmount;
        this.totalCount = totalCount;
        this.averageAmount = averageAmount;
        this.lastOrderAmount = lastOrderAmount;
        this.lastOrderDate = lastOrderDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getAverageAmount() {
        return averageAmount;
    }

    public int getLastOrderAmount() {
        return lastOrderAmount;
    }

    public Date getLastOrderDate() {
        return lastOrderDate;
    }
}
