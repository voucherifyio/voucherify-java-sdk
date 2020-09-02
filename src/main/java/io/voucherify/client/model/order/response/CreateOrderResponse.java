package io.voucherify.client.model.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class CreateOrderResponse {

  private String id;

  @JsonProperty("source_id")
  private String sourceId;

  private String object;

  private Long amount;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("updated_at")
  private Date updatedAt;

  private List<OrderItemResponse> items;

  private OrderStatus status;

  private Map<String, Object> metadata;
}
