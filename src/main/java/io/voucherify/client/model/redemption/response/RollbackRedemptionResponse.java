package io.voucherify.client.model.redemption.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.order.response.OrderResponse;
import io.voucherify.client.model.promotion.response.TierResponse;
import io.voucherify.client.model.redemption.RollbackStatus;
import io.voucherify.client.model.rewards.response.RewardResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
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
public class RollbackRedemptionResponse {

  private String id;

  private String object;

  private Date date;

  @JsonProperty("customer_id")
  private String customerId;

  @JsonProperty("tracking_id")
  private String trackingId;

  private Map<String, Object> metadata;

  private String redemption;

  //TODO: FIX result and status in next major version
  @JsonProperty("result")
  private RollbackStatus status;

  private OrderResponse order;

  private ChannelResponse channel;

  private CustomerResponse customer;

  @JsonProperty("related_object_type")
  private String relatedObjectType;

  @JsonProperty("related_object_id")
  private String relatedObjectId;

  private VoucherResponse voucher;

  @JsonProperty("promotion_tier")
  private TierResponse tier;

  private GiftResponse gift;

  private RewardResponse reward;

  @JsonProperty("loyalty_card")
  private LoyaltyCardResponse loyaltyCard;
}
