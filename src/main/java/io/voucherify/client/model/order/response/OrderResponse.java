package io.voucherify.client.model.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.Referrer;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.order.OrderStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class OrderResponse {

  private String id;

  private String object;

  @JsonProperty("source_id")
  private String sourceId;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("updated_at")
  private Date updatedAt;

  private CustomerResponse customer;

  @JsonProperty("result")
  private OrderStatus status;

  private Long amount;

  @JsonProperty("discount_amount")
  private Integer discountAmount;

  private List<OrderItemResponse> items;

  private Map<String, Object> metadata;

  private Referrer referrer;
}
