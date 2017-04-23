package pl.rspective.voucherify.client.model.redemption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.model.voucher.Voucher;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class RollbackRedemptionResult {

  private String id;

  private String object;

  private Date date;

  @JsonProperty("customer_id")
  private String customerId;

  @JsonProperty("tracking_id")
  private String trackingId;

  private String redemption;

  private RollbackStatus status;

  private Voucher voucher;
}
