package pl.rspective.voucherify.client.model.campaign;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import pl.rspective.voucherify.client.model.voucher.Voucher;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
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

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

}
