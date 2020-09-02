package io.voucherify.client.model.product.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class ProductResponse {

  private String id;

  @JsonProperty("source_id")
  private String sourceId;

  private String object;

  private String name;

  private List<String> attributes;

  private Map<String, Object> metadata;

  @JsonProperty("created_at")
  private Date createdAt;

  private Long price;

  private ProductSKUs skus;
}
