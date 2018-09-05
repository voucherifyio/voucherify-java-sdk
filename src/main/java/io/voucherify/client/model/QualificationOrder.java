package io.voucherify.client.model;

import io.voucherify.client.model.common.SortingOrder;
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
public class QualificationOrder {

  @Builder.Default
  private SortingOrder order = SortingOrder.ASC;

  private String fieldName;

  public String asQueryParam() {
    if (this.order == null || this.fieldName == null) {
      return "";
    }

    return this.order.getSorting() + this.fieldName.toLowerCase();
  }
}