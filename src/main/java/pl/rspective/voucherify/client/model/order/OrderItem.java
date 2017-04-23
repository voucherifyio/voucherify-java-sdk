package pl.rspective.voucherify.client.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class OrderItem {

  @JsonProperty("product_id")
  private String productId;

  @JsonProperty("sku_id")
  private String skuId;

  private Integer quantity;

}
