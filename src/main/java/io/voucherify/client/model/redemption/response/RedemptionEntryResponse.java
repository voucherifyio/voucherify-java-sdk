package io.voucherify.client.model.redemption.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.order.response.OrderResponse;
import io.voucherify.client.model.redemption.RedemptionStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedemptionEntryResponse {

  private String id;

  private String object;

  private Date date;

  @JsonProperty("customer_id")
  private String customerId;

  @JsonProperty("tracking_id")
  private String trackingId;

  private String redemption;

  private String reason;

  private Long amount;

  private OrderResponse order;

  private Map<String, Object> metadata;

  private RedemptionStatus result;

  @JsonProperty("failure_code")
  private String failureCode;

  @JsonProperty("failure_message")
  private String failureMessage;
}
