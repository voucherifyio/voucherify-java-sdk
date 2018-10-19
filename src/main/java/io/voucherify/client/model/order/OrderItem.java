package io.voucherify.client.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class OrderItem {

  @JsonProperty("product_id")
  private String productId;

  @JsonProperty("sku_id")
  private String skuId;

  private Integer quantity;

  private Integer amount;

  private Integer price;

}
