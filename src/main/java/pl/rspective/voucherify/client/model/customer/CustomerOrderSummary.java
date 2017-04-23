package pl.rspective.voucherify.client.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CustomerOrderSummary {

  @JsonProperty("total_amount")
  private int totalAmount;

  @JsonProperty("total_count")
  private int totalCount;

  @JsonProperty("average_amount")
  private int averageAmount;

  @JsonProperty("last_order_amount")
  private int lastOrderAmount;

  @JsonProperty("last_order_date")
  private Date lastOrderDate;

}
