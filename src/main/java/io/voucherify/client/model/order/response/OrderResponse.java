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

  @JsonProperty("customer_id")
  private String customer_id;

  @JsonProperty("result")
  private OrderStatus status;

  private Long amount;

  @JsonProperty("discount_amount")
  private Integer discountAmount;

  @JsonProperty("total_amount")
  private Integer totalAmount;

  private List<OrderItemResponse> items;

  private Map<String, Object> metadata;

  private Referrer referrer;

  @JsonProperty("referrer_id")
  private String referrer_id;

  @JsonProperty("items_discount_amount")
  private Long itemsDiscountAmount;

  @JsonProperty("total_discount_amount")
  private Long totalDiscountAmount;

  @JsonProperty("total_amount")
  private Long total_amount;

  @JsonProperty("items_applied_discount_amount")
  private Long itemsAppliedDiscountAmount;

  @JsonProperty("total_applied_discount_amount")
  private Long totalAppliedDiscountAmount;
}
