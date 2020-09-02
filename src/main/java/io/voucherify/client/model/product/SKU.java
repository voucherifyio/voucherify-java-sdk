package io.voucherify.client.model.product;

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
@Builder
@Getter
@ToString
public class SKU {

  private String id;

  private String sku;

  @JsonProperty("source_id")
  private String sourceId;

  private Long price;

  @Singular("attribute")
  private Map<String, Object> attributes;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}
