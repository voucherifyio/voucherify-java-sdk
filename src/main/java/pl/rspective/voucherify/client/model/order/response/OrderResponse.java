package pl.rspective.voucherify.client.model.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import pl.rspective.voucherify.client.model.order.OrderStatus;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class OrderResponse {

  @JsonProperty("result")
  private OrderStatus status;

  private Integer amount;

  @Singular("item")
  private List<OrderItemResponse> items;

}
