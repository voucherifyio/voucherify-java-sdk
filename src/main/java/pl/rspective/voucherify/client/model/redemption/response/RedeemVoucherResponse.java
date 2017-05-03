package pl.rspective.voucherify.client.model.redemption.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.rspective.voucherify.client.model.order.response.OrderResponse;
import pl.rspective.voucherify.client.model.redemption.RedemptionStatus;
import pl.rspective.voucherify.client.model.voucher.response.VoucherResponse;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedeemVoucherResponse {

  private String id;

  private String object;

  private Date date;

  @JsonProperty("tracking_id")
  private String trackingId;

  private OrderResponse order;

  private RedemptionStatus result;

  private VoucherResponse voucher;

}
