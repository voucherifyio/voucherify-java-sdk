package pl.rspective.voucherify.client.model.redemption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.rspective.voucherify.client.model.order.Order;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class RedemptionEntry {

  private String id;

  private String object;

  private Date date;

  @JsonProperty("customer_id")
  private String customerId;

  @JsonProperty("tracking_id")
  private String trackingId;

  private String redemption;

  private String reason;

  private Integer amount;

  private Order order;

  private Map<String, Object> metadata;

  private RedemptionStatus result;

  @JsonProperty("failure_code")
  private String failureCode;

  @JsonProperty("failure_message")
  private String failureMessage;
}
