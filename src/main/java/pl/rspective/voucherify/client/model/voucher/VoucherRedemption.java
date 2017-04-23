package pl.rspective.voucherify.client.model.voucher;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import pl.rspective.voucherify.client.model.redemption.RedemptionEntry;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class VoucherRedemption {

  private Integer quantity;

  @JsonProperty("redeemed_quantity")
  private Integer redeemedQuantity;

  @JsonProperty("redeemed_amount")
  private Integer redeemedAmount;

  @JsonProperty("redemption_entries")
  @Singular("redemptionEntry")
  private List<RedemptionEntry> redemptionEntries;

  public Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private Integer quantity;

    public Builder setQuantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    public VoucherRedemption build() {
      return new VoucherRedemption(quantity, null, null, null);
    }
  }
}
