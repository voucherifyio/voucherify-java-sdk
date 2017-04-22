package pl.rspective.voucherify.client.model.order;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.customer.Customer;

import java.util.Date;
import java.util.List;

public class Order {

    private String id;

    @SerializedName("source_id")
    private String sourceId;

    @SerializedName("source_id")
    private Date createdAt;

    @SerializedName("source_id")
    private Date updatedAt;

    private OrderStatus status;

    private Integer amount;

    private List<OrderItem> items;

    @SerializedName("customer_id")
    private String customerId;

    private Customer customer;

    private Order() {}

    private Order(String id, String sourceId, Date createdAt, Date updatedAt, OrderStatus status, Integer amount, List<OrderItem> items, String customerId, Customer customer) {
        this.id = id;
        this.sourceId = sourceId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.amount = amount;
        this.items = items;
        this.customerId = customerId;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public String getSourceId() {
        return sourceId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Integer getAmount() {
        return amount;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Customer getCustomer() {
        return customer;
    }
}
