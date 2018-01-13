package io.voucherify.client.model.order;

import io.voucherify.client.model.customer.Customer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class CreateOrder {

  private Customer customer;

  private Integer amount;

  @Singular("item")
  private List<OrderItem> items;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}
