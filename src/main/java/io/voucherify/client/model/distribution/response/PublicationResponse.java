package io.voucherify.client.model.distribution.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.customer.response.CustomerResponse;
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
public class PublicationResponse {

  private String id;

  private String object;

  private Long total;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("customer_id")
  private String customerId;

  @JsonProperty("tracking_id")
  private String trackingId;

  private Map<String, Object> metadata;

  private String channel;

  private String result;

  private CustomerResponse customer;

  private VoucherResponse voucher;

  @JsonProperty("failure_code")
  private Integer failureCode;

  @JsonProperty("failure_message")
  private String failureMessage;
}
