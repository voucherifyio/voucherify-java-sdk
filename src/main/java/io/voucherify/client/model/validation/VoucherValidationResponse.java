package io.voucherify.client.model.validation;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.common.response.applicableTo.ApplicableToResponse;
import io.voucherify.client.model.order.response.OrderResponse;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Gift;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherValidationResponse {

  private String code;

  private boolean valid;

  private Discount discount;

  private Gift gift;

  private OrderResponse order;

  private String reason;

  @JsonProperty("tracking_id")
  private String trackingId;

  private Map<String, Object> metadata;

  @JsonProperty("applicable_to")
  private ApplicableToResponse applicableTo;
}
