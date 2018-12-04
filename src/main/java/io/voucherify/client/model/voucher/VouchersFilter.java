package io.voucherify.client.model.voucher;

import io.voucherify.client.utils.AbstractFilter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
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

  private VoucherOrder order;

  @Singular("filter")
  private List<Filter> filters;

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("limit", limit);
    map.put("page", page);
    map.put("category", category);
    map.put("campaign", campaign);
    map.put("customer", customer);
    map.put("order", order != null ? order.asQueryParam() : order);

    if (filters != null) {
      for (Filter filter : filters) {
        if (filter != null) {
          map.put(filter.asKey(), filter.getValue());
        }
      }
    }

    return map;
  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  @AllArgsConstructor(access = AccessLevel.PRIVATE)
  @Getter
  @Builder
  @ToString
  public static class Filter {

    private String fieldName;

    private String condition;

    private Object value;

    String asKey() {
      return "[filters][" + this.fieldName + "][conditions][" + this.condition + "]";
    }

  }
}
