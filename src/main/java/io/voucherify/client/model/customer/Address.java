package io.voucherify.client.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class Address {

  private String city;

  private String state;

  @JsonProperty("line_1")
  private String line1;

  @JsonProperty("line_2")
  private String line2;

  private String country;

  @JsonProperty("postal_code")
  private String postalCode;
}
