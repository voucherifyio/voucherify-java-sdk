package io.voucherify.client.model.loyalties;

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
public class AddBalance {

  private Long points;

  @JsonProperty("expiration_date")
  private String expirationDate;

  @JsonProperty("expiration_type")
  private BalanceExpirationType expirationType;
}
