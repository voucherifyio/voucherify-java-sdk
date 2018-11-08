package io.voucherify.client.model.voucher;

import io.voucherify.client.error.VoucherifyError;
import io.voucherify.client.utils.AbstractFilter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
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

  private List<Filter> filters;

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("limit", limit);
    map.put("page", page);
    map.put("category", category);
    map.put("campaign", campaign);
    map.put("customer", customer);

    if (filters != null) {
      for (Filter filter : filters) {
        String key = "[filters][" + filter.getFieldName() + "][conditions][" + filter.getCondition() + "]";
        List<Object> values = new ArrayList<Object>();
        values.add(filter.getValue());
        try {
          map.put(key, URLEncoder.encode(String.valueOf(filter.getValue()), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
          throw VoucherifyError.from("Filter value could not be encoded. Value: " + filter.getValue());
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
  }
}
