package pl.rspective.voucherify.client.model.redemption;

import com.google.gson.annotations.SerializedName;
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

  @SerializedName("data_ref")
  private String dataRef;

  private Integer quantity;

  @SerializedName("redeemed_quantity")
  private Integer redeemedQuantity;

  @SerializedName("redeemed_amount")
  private Integer redeemedAmount;

  @SerializedName("redemption_entries")
  private List<RedemptionEntry> redemptionEntries;
}
