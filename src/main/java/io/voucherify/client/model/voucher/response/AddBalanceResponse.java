package io.voucherify.client.model.voucher.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.voucher.VoucherType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class AddBalanceResponse {

  private Integer amount;

  private String object;

  private VoucherType type;

  @JsonProperty("related_object")
  private RelatedObject relatedObject;

}
