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
public class OrderItemSKU {

  private String sku;

  @JsonProperty("product_id")
  private String productId;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  @Builder.Default
  private boolean override = false;
}
