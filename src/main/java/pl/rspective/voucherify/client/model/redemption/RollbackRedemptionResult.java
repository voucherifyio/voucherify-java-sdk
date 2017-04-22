package pl.rspective.voucherify.client.model.redemption;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.model.customer.Customer;
import pl.rspective.voucherify.client.model.voucher.Voucher;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class RollbackRedemptionResult {

  private String id;

  private String object;

  private Date date;

  @SerializedName("customer_id")
  private String customerId;

  @SerializedName("tracking_id")
  private String trackingId;

  private String redemption;

  private RollbackStatus status;

  private Voucher voucher;
}
