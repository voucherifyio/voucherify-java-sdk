package io.voucherify.client.model.customer.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class CustomerOrderSummary {

  @JsonProperty("total_amount")
  private Long totalAmount;

  @JsonProperty("total_count")
  private Long totalCount;

  @JsonProperty("average_amount")
  private Long averageAmount;

  @JsonProperty("last_order_amount")
  private Long lastOrderAmount;

  @JsonProperty("last_order_date")
  private Date lastOrderDate;
}
