package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CustomerOrderSummary {

  @SerializedName("total_amount")
  private int totalAmount;

  @SerializedName("total_count")
  private int totalCount;

  @SerializedName("average_amount")
  private int averageAmount;

  @SerializedName("last_order_amount")
  private int lastOrderAmount;

  @SerializedName("last_order_date")
  private Date lastOrderDate;

}
