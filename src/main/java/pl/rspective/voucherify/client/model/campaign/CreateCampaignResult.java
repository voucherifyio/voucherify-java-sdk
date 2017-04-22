package pl.rspective.voucherify.client.model.campaign;

import com.google.gson.annotations.SerializedName;
import pl.rspective.voucherify.client.model.voucher.Voucher;
import pl.rspective.voucherify.client.model.voucher.GenerationStatus;

import java.util.Date;
import java.util.Map;

public class CreateCampaignResult {

    private String name;

    private String object;

    private CampaignType type;

    private String description;

    private Map<String, Object> metadata;

    private Integer vouchersCount;

    @SerializedName("start_date")
    private Date startDate;

    @SerializedName("expiration_date")
    private Date expirationDate;

    @SerializedName("updated_at")
    private Date updatedAt;

    @SerializedName("vouchers_generation_status")
    private GenerationStatus generationStatus;

    private Voucher voucher;

    private CreateCampaignResult() {}

    private CreateCampaignResult(String name, String object, CampaignType type, String description, Map<String, Object> metadata, Integer vouchersCount, Date startDate, Date expirationDate, Date updatedAt, GenerationStatus generationStatus, Voucher voucher) {
        this.name = name;
        this.object = object;
        this.type = type;
        this.description = description;
        this.metadata = metadata;
        this.vouchersCount = vouchersCount;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.updatedAt = updatedAt;
        this.generationStatus = generationStatus;
        this.voucher = voucher;
    }

    public String getName() {
        return name;
    }

    public String getObject() {
        return object;
    }

    public CampaignType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public Integer getVouchersCount() {
        return vouchersCount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public GenerationStatus getGenerationStatus() {
        return generationStatus;
    }

    public Voucher getVoucher() {
        return voucher;
    }
}
