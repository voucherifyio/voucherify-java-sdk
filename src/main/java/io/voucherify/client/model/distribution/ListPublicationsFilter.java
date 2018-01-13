package io.voucherify.client.model.distribution;

import io.voucherify.client.model.voucher.VoucherType;
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
public class ListPublicationsFilter extends AbstractFilter<String, Object> {

  private Integer limit;

  private Integer page;

  private ListPublicationsOrder order;

  private String campaign;

  private String voucher;

  private String result;

  private VoucherType voucherType;

  private Boolean isReferralCode;

  @Singular("filter")
  private List<ListPublicationsFilters> filters;

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("limit", limit);
    map.put("page", page);
    map.put("order", order != null ? order.getValue() : null);
    map.put("campaign", campaign);
    map.put("voucher", voucher);
    map.put("result", result);
    map.put("voucher_type", voucherType);
    map.put("is_referral_code", isReferralCode);
    attachFilters(map);

    return map;
  }

  private void attachFilters(Map<String, Object> map) {
    if (filters == null || filters.isEmpty()) {
      return;
    }

    for (ListPublicationsFilters filter : filters) {
      map.put(filter.buildFilterParam(), filter.getValue());
    }
  }
}
