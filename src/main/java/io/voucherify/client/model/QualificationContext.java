package io.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.loyalties.Reward;
import io.voucherify.client.model.order.Order;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class QualificationContext {

  @JsonProperty("tracking_id")
  private String trackingId;

  private Customer customer;

  private Order order;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  private Reward reward;
}
