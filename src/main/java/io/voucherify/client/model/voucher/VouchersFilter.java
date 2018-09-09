package io.voucherify.client.model.voucher;

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
@Getter
@Builder
@ToString
public class VouchersFilter extends AbstractFilter<String, Object> {

  private Integer limit;

  private Integer page;

  private String category;

  private String campaign;

  private String customer;

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("limit", limit);
    map.put("page", page);
    map.put("category", category);
    map.put("campaign", campaign);
    map.put("customer", customer);
    return map;
  }
}
