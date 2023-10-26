package io.voucherify.client.model.qualifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.Order;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class CheckEligibility {

  private Customer customer;

  private Order order;

  @JsonProperty("options")
  private Option option;

  private Map<String, Object> metadata;

  private String mode;

  private Scenario scenario;
}

