package io.voucherify.client.model.async_actions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.common.response.applicableTo.ApplicableToResponse;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignmentList;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Gift;
import io.voucherify.client.model.voucher.LoyaltyCard;
import io.voucherify.client.model.voucher.VoucherType;
import io.voucherify.client.model.voucher.response.VoucherPublishResponse;
import io.voucherify.client.model.voucher.response.VoucherRedemptionResponse;
import lombok.*;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@ToString
public class AsyncActionResponse {

  private String id;

  private String type;

  private String status;

  private Map<String, Object> result;

  @JsonProperty("created_at")
  private Date createdAt;

}
