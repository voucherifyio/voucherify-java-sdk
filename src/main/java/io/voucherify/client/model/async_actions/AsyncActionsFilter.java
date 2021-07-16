package io.voucherify.client.model.async_actions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.utils.AbstractFilter;
import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import static java.util.Objects.nonNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class AsyncActionsFilter extends AbstractFilter<String, Object> {

  private static SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
  static {
    DATE_FORMATTER.setTimeZone(TimeZone.getTimeZone("UTC"));
  }

  private Integer limit;

  @JsonProperty("end_date")
  private Date endDate;

  @Override
  public Map<String, Object> getMap() {
    Map<String, Object> map = new HashMap<>();

    if (nonNull(limit)) {
      map.put("limit", limit);
    }

    if (nonNull(endDate)) {
      map.put("end_date", DATE_FORMATTER.format(endDate));
    }

    return map;
  }

}
