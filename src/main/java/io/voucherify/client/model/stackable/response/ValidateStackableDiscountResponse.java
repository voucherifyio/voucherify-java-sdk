package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.order.response.OrderResponse;
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
public class ValidateStackableDiscountResponse {

  private Boolean valid;

  @JsonProperty("redeemables")
  private List<RedeemableResponse> redeemables;

  private OrderResponse order;
}
