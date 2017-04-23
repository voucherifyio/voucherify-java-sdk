package pl.rspective.voucherify.client.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CustomerCampaignLoyalty {

  private int points;

  @JsonProperty("referred_customers")
  private int referredCustomers;

}