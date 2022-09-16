package io.voucherify.client.model.voucher;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Builder
@ToString
public class LoyaltyCard {

  private Long points;

  private Long balance;

  @JsonProperty("next_expiration_date")
  private Date nextExpirationDate;

  @JsonProperty("next_expiration_points")
  private Long nextExpirationPoints;

  @JsonProperty("expiration_rules")
  private LoyaltyCardPointsExpirationRules loyaltyCardPointsExpirationRules;
}
