package pl.rspective.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@Deprecated
public class PublishEntry {

    private String customer;
    private String channel;

    @JsonProperty("customer_id")
    private String customerId;
    
    @JsonProperty("published_at")
    private Date publishedAt;

    public String getCustomer() {
        return customer;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getChannel() {
        return channel;
    }

    
    public Date getPublishedAt() {
        return publishedAt;
    }
    
}
