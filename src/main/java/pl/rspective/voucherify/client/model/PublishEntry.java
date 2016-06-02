package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class PublishEntry {

    private String customer;
    private String channel;
    
    @SerializedName("published_at")
    private Date publishedAt;

    public String getCustomer() {
        return customer;
    }

    public String getChannel() {
        return channel;
    }

    
    public Date getPublishedAt() {
        return publishedAt;
    }
    
}
