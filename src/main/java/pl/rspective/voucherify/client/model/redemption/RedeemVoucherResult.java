package pl.rspective.voucherify.client.model.redemption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.model.order.Order;
import pl.rspective.voucherify.client.model.voucher.Voucher;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class RedeemVoucherResult {

  private String id;

  private String object;

  private Date date;

  @JsonProperty("tracking_id")
  private String trackingId;

  private Order order;

  private RedemptionStatus result;

  private Voucher voucher;

}
