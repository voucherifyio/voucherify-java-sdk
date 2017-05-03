package pl.rspective.voucherify.client.model.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import pl.rspective.voucherify.client.model.voucher.Voucher;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class CreateCampaign {

  private String name;

  @JsonProperty("start_date")
  private Date startDate;

  @JsonProperty("expiration_date")
  private Date expirationDate;

  private CampaignType type;

  @JsonProperty("vouchers_count")
  private Integer vouchersCount;

  private Voucher voucher;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

}
