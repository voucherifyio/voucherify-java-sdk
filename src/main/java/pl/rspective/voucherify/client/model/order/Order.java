package pl.rspective.voucherify.client.model.order;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import pl.rspective.voucherify.client.model.customer.Customer;

import java.util.Date;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class Order {

  private String id;

  @SerializedName("source_id")
  private String sourceId;

  @SerializedName("source_id")
  private Date createdAt;

  @SerializedName("source_id")
  private Date updatedAt;

  private OrderStatus status;

  private Integer amount;

  @Singular("item")
  private List<OrderItem> items;

  @SerializedName("customer_id")
  private String customerId;

  private Customer customer;

}
