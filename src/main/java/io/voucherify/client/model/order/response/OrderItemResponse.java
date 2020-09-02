package io.voucherify.client.model.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

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

  private Long price;

  @JsonProperty("discount_amount")
  private Long discountAmount;

  private Long amount;

  @JsonProperty("related_object")
  private String relatedObject;

  @JsonProperty("source_id")
  private String sourceId;

  @JsonProperty("product")
  private OrderItemProductResponse orderItemProduct;

  @JsonProperty("sku")
  private OrderItemSKUResponse orderItemSku;

  private Map<String, Object> metadata;
}
