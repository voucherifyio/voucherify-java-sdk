package pl.rspective.voucherify.client.model.voucher;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.utils.AbstractFilter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class VouchersFilter extends AbstractFilter<String, Object> {

  private Integer limit;

  private Integer page;

  private String category;

  private String campaign;

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("limit", limit);
    map.put("page", page);
    map.put("category", category);
    map.put("campaign", campaign);
    return map;
  }
}
