package io.voucherify.client.model.redemption.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherRedemptionsResponse {

  private String object;

  private Integer total;

  @JsonProperty("data_ref")
  private String dataRef;

  private Integer quantity;

  @JsonProperty("redeemed_quantity")
  private Integer redeemedQuantity;

  @JsonProperty("redeemed_amount")
  private Long redeemedAmount;

  @JsonProperty("redemption_entries")
  private List<RedemptionEntryResponse> redemptionEntries;
}
