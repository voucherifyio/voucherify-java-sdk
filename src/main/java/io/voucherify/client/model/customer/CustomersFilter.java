package io.voucherify.client.model.customer;

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
public class CustomersFilter extends AbstractFilter<String, Object> {

  private Integer limit;

  private Integer page;

  private String email;

  private String city;

  private String name;

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("limit", limit);
    map.put("page", page);
    map.put("email", email);
    map.put("city", city);
    map.put("name", name);
    return map;
  }
}
