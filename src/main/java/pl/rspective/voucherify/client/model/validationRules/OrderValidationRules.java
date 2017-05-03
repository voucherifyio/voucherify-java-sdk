package pl.rspective.voucherify.client.model.validationRules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@ToString
public class OrderValidationRules {

  private Junction junction;

  @JsonProperty("total_amount")
  private Conditions<Integer> totalAmount;

  @JsonProperty("products_count")
  private Conditions<Integer> productsCount;
}
