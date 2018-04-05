package io.voucherify.client.model.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class OrderItemResponse {

  @JsonProperty("product_id")
  private String productId;

  @JsonProperty("sku_id")
  private String skuId;

  private Integer quantity;

  private Integer price;

}
