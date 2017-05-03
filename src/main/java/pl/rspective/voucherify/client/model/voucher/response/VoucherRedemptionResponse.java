package pl.rspective.voucherify.client.model.voucher.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import pl.rspective.voucherify.client.model.redemption.response.RedemptionEntryResponse;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherRedemptionResponse {

  private Integer quantity;

  @JsonProperty("redeemed_quantity")
  private Integer redeemedQuantity;

  @JsonProperty("redeemed_amount")
  private Integer redeemedAmount;

  @JsonProperty("redemption_entries")
  @Singular("redemptionEntry")
  private List<RedemptionEntryResponse> redemptionEntries;

}
