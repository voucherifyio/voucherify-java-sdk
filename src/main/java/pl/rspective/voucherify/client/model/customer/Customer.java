package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.Address;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Customer {

    private String id;

    @SerializedName("source_id")
    private String sourceId;

    private String name;

    private String email;

    private String description;

    private Address address;

    private String phone;

    private String birthday;

    private CustomerSummary summary;

    private CustomerLoyalty loyalty;

    private Map<String, Object> metadata;

    @SerializedName("system_metadata")
    private Map<String, Object> systemMetadata;

    @SerializedName("created_at")
    private Date createdAt;

    @SerializedName("updated_at")
    private Date updatedAt;

    @SerializedName("email_unsubscribed")
    private Boolean emailUnsubscribed;

    private String object;

    private Customer() {}

    public String getId() {
        return id;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public CustomerSummary getSummary() {
        return summary;
    }

    public CustomerLoyalty getLoyalty() {
        return loyalty;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public Map<String, Object> getSystemMetadata() {
        return systemMetadata;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Boolean getEmailUnsubscribed() {
        return emailUnsubscribed;
    }

    public String getObject() {
        return object;
    }
}
