package io.voucherify.client.model.redemption.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import io.voucherify.client.model.distribution.response.PublishVoucherResponse;
import io.voucherify.client.model.redemption.RollbackStatus;

import java.util.Date;

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

  private String redemption;

  private RollbackStatus status;

  private PublishVoucherResponse voucher;
}
