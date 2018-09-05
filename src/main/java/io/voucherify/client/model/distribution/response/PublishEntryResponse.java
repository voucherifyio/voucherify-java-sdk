package io.voucherify.client.model.distribution.response;

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
public class PublishEntryResponse {

  @JsonProperty("customer_id")
  private String customerId;

  private String customer;

  private String channel;

  @JsonProperty("published_at")
  private Date publishedAt;

  private Map<String, Object> metadata;
}
