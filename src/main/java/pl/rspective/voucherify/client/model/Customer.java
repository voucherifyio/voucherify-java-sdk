package pl.rspective.voucherify.client.model;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    
    private final String id;
    private final String name;
    private final String email;
    private final String description;
    private final Map<String, Object> metadata;
    
    public Customer(
            String id,
            String name,
            String email,
            String description,
            Map<String, Object> metadata) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.description = description;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
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
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
    public static class Builder {
        private String id;
        private String name;
        private String email;
        private String description;
        private Map<String, Object> metadata;
              
        public Builder setId(String id) {
            this.id = id;
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
            return new Customer(id, name, email, description, metadata);
        }
        
    }
}
