package io.voucherify.client.model.stackable.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class DiscountResponse {

  private String type;
  private String effect;

  @JsonProperty("amount_off")
  private Long amountOff;

  @JsonProperty("is_dynamic")
  private Boolean isDynamic;
}
