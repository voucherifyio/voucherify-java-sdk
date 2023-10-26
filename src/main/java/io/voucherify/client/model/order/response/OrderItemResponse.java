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

  private String object;

  @JsonProperty("product_id")
  private String productId;

  @JsonProperty("sku_id")
  private String skuId;

  private Integer quantity;

  private Long amount;

  @JsonProperty("discount_amount")
  private Long discountAmount;

  @JsonProperty("applied_discount_amount")
  private Long appliedDiscountAmount;

  private Long price;

  @JsonProperty("subtotal_amount")
  private Long subtotalAmount;

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
