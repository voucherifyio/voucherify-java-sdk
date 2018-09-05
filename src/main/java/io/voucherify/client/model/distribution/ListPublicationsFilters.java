package io.voucherify.client.model.distribution;

import io.voucherify.client.model.Operator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class ListPublicationsFilters {

  private String fieldName;

  private Operator operator;

  private int index;

  private String value;

  public String buildFilterParam() {
    return "filters"
        + "["
        + fieldName
        + "]"
        + "[conditions]"
        + "["
        + operator
        + "]"
        + "["
        + index
        + "]";
  }
}
