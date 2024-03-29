package io.voucherify.client.model.voucher.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.redemption.response.RedemptionEntryResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherRedemptionResponse {

  private Long quantity;

  @JsonProperty("redeemed_quantity")
  private Long redeemedQuantity;

  @JsonProperty("redeemed_amount")
  private Long redeemedAmount;

  @JsonProperty("redemption_entries")
  @Singular("redemptionEntry")
  private List<RedemptionEntryResponse> redemptionEntries;
}
