package io.voucherify.client.model.campaign;

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
public class DeleteCampaignParams extends AbstractFilter<String, Object> {

  private Boolean force;

  @Override
  public Map<String, Object> getMap() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("force", force);
    return map;
  }
}
