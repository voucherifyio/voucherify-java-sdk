package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.common.response.applicableTo.ApplicableToResponse;
import io.voucherify.client.model.common.response.applicableTo.InapplicableToResponse;
import io.voucherify.client.model.order.response.OrderResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedeemableResponse {

  private String status;

  private String id;

  private String object;

  private OrderResponse order;

  @JsonProperty("applicable_to")
  private ApplicableToResponse applicableTo;

  @JsonProperty("inapplicable_to")
  private InapplicableToResponse inapplicableTo;

  private RedeemableResultResponse result;
}
