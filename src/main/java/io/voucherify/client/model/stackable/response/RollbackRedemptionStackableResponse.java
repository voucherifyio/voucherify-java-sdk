package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.order.response.OrderResponse;
import io.voucherify.client.model.redemption.response.RollbackRedemptionResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RollbackRedemptionStackableResponse {

  private List<RollbackRedemptionResponse> rollbacks;

  @JsonProperty("parent_rollback")
  private RollbackRedemptionResponse parentRollback;

  private OrderResponse order;
}
