package io.voucherify.client.model.redemption;

import io.voucherify.client.utils.AbstractFilter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@ToString
public class RedemptionsFilter extends AbstractFilter<String, Object> {

  private Integer limit;

  private Integer page;

  private RedemptionResult result;

  private String customer;

  private String campaign;

  @Override
  public Map<String, Object> getMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("limit", limit);
    map.put("page", page);
    map.put("result", result);
    map.put("customer", customer);
    map.put("campaign", campaign);
    return map;
  }
}
