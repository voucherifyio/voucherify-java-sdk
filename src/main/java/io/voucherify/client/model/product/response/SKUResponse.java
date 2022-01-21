package io.voucherify.client.model.product.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class SKUResponse {

  private String id;

  @JsonProperty("source_id")
  private String sourceId;

  private String sku;

  private Map<String, Object> attributes;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("image_url")
  private String imageUrl;

  private String currency;

  private String price;

  private Map<String, Object> metadata;

  private String object;
}
