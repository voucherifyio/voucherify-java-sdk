package io.voucherify.client.model.stackable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.Order;
import io.voucherify.client.model.session.Session;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Singular;
import lombok.AccessLevel;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class RedeemStackableDiscount {

  @JsonProperty("options")
  private Option option;

  private List<Redeemable> redeemables;

  private Session session;

  private Customer customer;

  private Order order;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}
