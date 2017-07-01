package io.voucherify.client.model.validation;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Gift;
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
public class VoucherValidationResponse {

  private String code;

  private boolean valid;

  private VoucherType type;

  private Discount discount;

  private Gift gift;

  private String reason;

  @JsonProperty("tracking_id")
  private String trackingId;

}
