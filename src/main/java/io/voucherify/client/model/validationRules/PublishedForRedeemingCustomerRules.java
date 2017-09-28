package io.voucherify.client.model.validationRules;

import io.voucherify.client.model.Operator;
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
@Builder
@Getter
@ToString
public class PublishedForRedeemingCustomerRules {

  @Singular("condition")
  protected Map<Operator, List<Boolean>> conditions;
}
