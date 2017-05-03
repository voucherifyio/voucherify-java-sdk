package pl.rspective.voucherify.client.model.validation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.rspective.voucherify.client.model.voucher.Discount;
import pl.rspective.voucherify.client.model.voucher.Gift;
import pl.rspective.voucherify.client.model.voucher.VoucherType;

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
