package pl.rspective.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @deprecated Use{@link pl.rspective.voucherify.client.model.customer.Customer} instead
 */
@Deprecated
public class Customer {
    
    private String id;
    
    @JsonProperty("source_id")
    private String sourceId;
    
    private String name;
    
    private String email;
    
    private String description;
    
    @JsonProperty("created_at")
    private Date createdAt;
    
    private Map<String, Object> metadata;
    
    private String object;
    
    public String getId() {
        return id;
    }
    
    public String getSourceId() {
        return sourceId;
    }

    public Customer setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }
    
    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public String getDescription() {
        return description;
    }

    public Customer setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public Customer setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
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
        private Map<String, Object> metadata;
        
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
        
        public Builder setMetadata(Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        
        public Builder addMetadata(String key, Object value) {
            if (metadata == null) {
                metadata = new HashMap<>();
            }
            metadata.put(key, value);
            return this;
        }
        
        public Customer build() {
            Customer customer = new Customer();
            customer.id = id;
            customer.sourceId = sourceId;
            customer.name = name;
            customer.email = email;
            customer.description = description;
            customer.metadata = metadata;
            customer.object = "customer";
            return customer;
        }
        
    }
}
