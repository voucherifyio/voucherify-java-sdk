package pl.rspective.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class VoucherUpdate {
    
    private String category;

    @JsonProperty("start_date")
    private Date startDate;

    @JsonProperty("expiration_date")
    private Date expirationDate;

    private boolean active;

    @JsonProperty("additional_info")
    private String additionalInfo;

    private Map<String, Object> metadata;
    
    private VoucherUpdate() {
    }
    
    private VoucherUpdate(String category, Date startDate, Date expirationDate, Boolean active, String additionalInfo, Map<String, Object> metadata) {
        this.category = category;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.active = active;
        this.additionalInfo = additionalInfo;
        this.metadata = metadata;
    }
    
    public String getCategory() {
        return category;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public boolean isActive() {
        return active;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public static class Builder {
        
        private String category;
        
        private Date startDate;

        private Date expirationDate;        

        private boolean active = true;

        private String additionalInfo;

        private Map<String, Object> metadata;
        
        public Builder() {
        }
        
        public Builder(Voucher fromVoucher) {
            this.category = fromVoucher.getCategory();
            this.startDate = fromVoucher.getStartDate();
            this.expirationDate = fromVoucher.getExpirationDate();
            this.active = fromVoucher.isActive();
            this.additionalInfo = fromVoucher.getAdditionalInfo();
            this.metadata = fromVoucher.getMetadata();
        }
        
        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        
        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public Builder setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder setMetadata(Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder addMetadata(String key, Object value) {
            if (this.metadata == null) {
                this.metadata = new HashMap<>();
            }
            this.metadata.put(key, value);
            return this;
        }

        public VoucherUpdate build() {
            return new VoucherUpdate(category, startDate, expirationDate, active, additionalInfo, metadata);
        }
    }

}
