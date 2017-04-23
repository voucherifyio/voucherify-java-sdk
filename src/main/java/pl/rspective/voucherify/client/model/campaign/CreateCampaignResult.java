package pl.rspective.voucherify.client.model.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.model.voucher.GenerationStatus;
import pl.rspective.voucherify.client.model.voucher.Voucher;

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

  @JsonProperty("start_date")
  private Date startDate;

  @JsonProperty("expiration_date")
  private Date expirationDate;

  @JsonProperty("updated_at")
  private Date updatedAt;

  @JsonProperty("vouchers_generation_status")
  private GenerationStatus generationStatus;

  private Voucher voucher;

}