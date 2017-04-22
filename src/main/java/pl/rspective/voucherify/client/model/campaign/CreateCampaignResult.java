package pl.rspective.voucherify.client.model.campaign;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.model.voucher.Voucher;
import pl.rspective.voucherify.client.model.voucher.GenerationStatus;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
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

}