package io.voucherify.client.model.customer;

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
public class Customer {

  private String id;

  @JsonProperty("source_id")
  private String sourceId;

  private String name;

  private String email;

  private String description;

  private Address address;

  private String phone;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}
