package pl.rspective.voucherify.client.model.product;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.rspective.voucherify.client.utils.AbstractFilter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class ProductsFilter extends AbstractFilter<String, Object> {

  private Integer limit;

  private Integer page;

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("limit", limit);
    map.put("page", page);
    return map;
  }
}
