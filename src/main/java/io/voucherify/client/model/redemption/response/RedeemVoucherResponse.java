package io.voucherify.client.model.redemption.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.loyalties.Reward;
import io.voucherify.client.model.order.response.OrderResponse;
import io.voucherify.client.model.redemption.RedemptionStatus;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedeemVoucherResponse {

  private String id;

  private String object;

  private Date date;

  @JsonProperty("customer_id")
  private String customerId;

  @JsonProperty("tracking_id")
  private String trackingId;

  private OrderResponse order;

  private RedemptionStatus result;

  private VoucherResponse voucher;

  private Reward reward;
}
