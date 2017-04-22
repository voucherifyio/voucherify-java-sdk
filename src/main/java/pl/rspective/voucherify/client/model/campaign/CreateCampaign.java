package pl.rspective.voucherify.client.model.campaign;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.voucher.Voucher;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CreateCampaign {

    private String name;

    @SerializedName("start_date")
    private Date startDate;

    @SerializedName("expiration_date")
    private Date expirationDate;

    private CampaignType type;

    @SerializedName("vouchers_count")
    private Integer vouchersCount;

    private Voucher voucher;

    private Map<String, Object> metadata;

    private CreateCampaign() {
    }

    private CreateCampaign(String name, Date startDate, Date expirationDate, CampaignType type, Integer vouchersCount, Voucher voucher, Map<String, Object> metadata) {
        this.name = name;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.type = type;
        this.vouchersCount = vouchersCount;
        this.voucher = voucher;
        this.metadata = metadata;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public CampaignType getType() {
        return type;
    }

    public Integer getVouchersCount() {
        return vouchersCount;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public static class Builder {

        private String name;

        private Date startDate;

        private Date expirationDate;

        private CampaignType type;

        private Integer vouchersCount;

        private Voucher voucher;

        private Map<String, Object> metadata;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
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

        public Builder setType(CampaignType type) {
            this.type = type;
            return this;
        }

        public Builder setVouchersCount(Integer vouchersCount) {
            this.vouchersCount = vouchersCount;
            return this;
        }

        public Builder setVoucher(Voucher voucher) {
            this.voucher = voucher;
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

        public CreateCampaign build() {
            return new CreateCampaign(name, startDate, expirationDate, type, vouchersCount, voucher, metadata);
        }
    }
}
