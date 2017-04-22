package pl.rspective.voucherify.client.model.campaign;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import pl.rspective.voucherify.client.model.voucher.VoucherRedemption;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class AddVoucherToCampaign {

  private String category;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  @SerializedName("additional_info")
  private String additionalInfo;

  private VoucherRedemption redemption;

}
