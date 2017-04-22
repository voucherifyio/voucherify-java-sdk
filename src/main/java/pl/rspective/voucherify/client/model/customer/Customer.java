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

    private Customer(String id, String sourceId, String name, String email, String description, Address address, String phone, String birthday, CustomerSummary summary, CustomerLoyalty loyalty, Map<String, Object> metadata, Map<String, Object> systemMetadata, Date createdAt, Date updatedAt, Boolean emailUnsubscribed, String object) {
        this.id = id;
        this.sourceId = sourceId;
        this.name = name;
        this.email = email;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
        this.summary = summary;
        this.loyalty = loyalty;
        this.metadata = metadata;
        this.systemMetadata = systemMetadata;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.emailUnsubscribed = emailUnsubscribed;
        this.object = object;
    }

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

    public static class Builder {

        private String id;
        private String sourceId;
        private String name;
        private String email;
        private String description;
        private Address address;
        private String phone;
        private String birthday;
        private Map<String, Object> metadata;
        private String object;

        public Builder() {}

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder setMetadata(Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Customer build() {
            return new Customer(id, sourceId, name, email, description, address, phone, birthday, null, null, metadata, null, null, null, null, null);
        }
    }
}
