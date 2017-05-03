package pl.rspective.voucherify.client.model.customer.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
class CustomerLoyalty {

  private Integer points;

  @JsonProperty("referred_customers")
  private Integer referredCustomers;

  private Map<String, CustomerCampaignLoyalty> campaigns;

}
