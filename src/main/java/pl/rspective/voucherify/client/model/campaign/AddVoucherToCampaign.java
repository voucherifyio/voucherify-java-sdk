package pl.rspective.voucherify.client.model.campaign;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.voucher.VoucherRedemption;

import java.util.Map;

public class AddVoucherToCampaign {

    private String category;

    private Map<String, Object> metadata;

    @SerializedName("additional_info")
    private String additionalInfo;

    private VoucherRedemption redemption;

    private AddVoucherToCampaign() {
    }

    private AddVoucherToCampaign(String category, Map<String, Object> metadata, String additionalInfo, VoucherRedemption redemption) {
        this.category = category;
        this.metadata = metadata;
        this.additionalInfo = additionalInfo;
        this.redemption = redemption;
    }

    public String getCategory() {
        return category;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public VoucherRedemption getRedemption() {
        return redemption;
    }

    public static class Builder {

        private String category;

        private Map<String, Object> metadata;

        private String additionalInfo;

        private VoucherRedemption redemption;

        public Builder() {
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setMetadata(Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder setRedemption(VoucherRedemption redemption) {
            this.redemption = redemption;
            return this;
        }

        public AddVoucherToCampaign build() {
            return new AddVoucherToCampaign(category, metadata, additionalInfo, redemption);
        }
    }
}
