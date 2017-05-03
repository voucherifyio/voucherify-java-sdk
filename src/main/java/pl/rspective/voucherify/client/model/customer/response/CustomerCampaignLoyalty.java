package pl.rspective.voucherify.client.model.customer.response;

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
class CustomerCampaignLoyalty {

  private Integer points;

  @JsonProperty("referred_customers")
  private Integer referredCustomers;

}