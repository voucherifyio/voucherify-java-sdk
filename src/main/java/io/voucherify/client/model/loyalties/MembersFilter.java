package io.voucherify.client.model.loyalties;

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
public class MembersFilter extends AbstractFilter<String, Object> {

  private Integer limit;

  private Integer page;

  @Singular("filter")
  private List<Filter> filters;

  @Override
  public Map<String, Object> getMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("limit", limit);
    map.put("page", page);

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
