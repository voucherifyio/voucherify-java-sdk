package io.voucherify.client.model.product.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.AccessLevel;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class ProductsBulkUpdateResponse {

  @JsonProperty("async_action_id")
  private String asyncActionId;
}
