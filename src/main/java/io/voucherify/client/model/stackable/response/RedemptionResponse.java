package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.order.response.OrderResponse;
import io.voucherify.client.model.redemption.RedemptionResult;
import io.voucherify.client.model.redemption.RedemptionStatus;
import io.voucherify.client.model.voucher.response.VoucherResponse;

import java.util.Date;
import java.util.Map;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedemptionResponse {

  private String id;

  private String object;

  private Date date;

  @JsonProperty("customer_id")
  private String customerId;

  @JsonProperty("tracking_id")
  private String trackingId;

  private Map<String, Object> metadata;

  private String redemption;

  private RedemptionResult result;

  private RedemptionStatus status;

  private OrderResponse order;

  private Map<String, String> channel;

  private CustomerResponse customer;

  @JsonProperty("related_object_type")
  private String relatedObjectType;

  @JsonProperty("related_object_id")
  private String relatedObjectId;

  private VoucherResponse voucher;
}
