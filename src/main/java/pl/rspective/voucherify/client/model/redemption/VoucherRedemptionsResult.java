package pl.rspective.voucherify.client.model.redemption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class VoucherRedemptionsResult {

  private String object;

  private Integer total;

  @JsonProperty("data_ref")
  private String dataRef;

  private Integer quantity;

  @JsonProperty("redeemed_quantity")
  private Integer redeemedQuantity;

  @JsonProperty("redeemed_amount")
  private Integer redeemedAmount;

  @JsonProperty("redemption_entries")
  private List<RedemptionEntry> redemptionEntries;
}
