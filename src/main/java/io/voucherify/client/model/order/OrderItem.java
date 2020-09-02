package io.voucherify.client.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

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

  @JsonProperty("related_object")
  private String relatedObject;

  @JsonProperty("source_id")
  private String sourceId;

  private Integer quantity;

  private Long amount;

  private Long price;

  @JsonProperty("product")
  private OrderItemProduct orderItemProduct;

  @JsonProperty("sku")
  private OrderItemSKU orderItemSku;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}
