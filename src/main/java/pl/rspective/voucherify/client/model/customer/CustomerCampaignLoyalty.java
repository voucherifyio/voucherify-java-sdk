package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CustomerCampaignLoyalty {

  private int points;

  @SerializedName("referred_customers")
  private int referredCustomers;

}