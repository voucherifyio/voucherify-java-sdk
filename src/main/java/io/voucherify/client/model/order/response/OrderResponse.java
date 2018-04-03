package io.voucherify.client.model.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.order.OrderStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class OrderResponse {

  @JsonProperty("result")
  private OrderStatus status;

  private Integer amount;

  @JsonProperty("discount_amount")
  private Integer discountAmount;

  @Singular("item")
  private List<OrderItemResponse> items;

}
