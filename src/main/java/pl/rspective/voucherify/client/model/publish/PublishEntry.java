package pl.rspective.voucherify.client.model.publish;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Map;

public class PublishEntry {

    @SerializedName("cusomer_id")
    private String customerId;

    private String customer;

    private String channel;

    @SerializedName("published_at")
    private Date publishedAt;

    private Map<String, Object> metadata;

    public PublishEntry() {
    }

    private PublishEntry(String customerId, String customer, String channel, Date publishedAt, Map<String, Object> metadata) {
        this.customerId = customerId;
        this.customer = customer;
        this.channel = channel;
        this.publishedAt = publishedAt;
        this.metadata = metadata;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomer() {
        return customer;
    }

    public String getChannel() {
        return channel;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }
}
