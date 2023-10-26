package io.voucherify.client.model.qualifications.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.common.response.applicableTo.ApplicableToResponse;
import io.voucherify.client.model.common.response.applicableTo.InapplicableToResponse;
import io.voucherify.client.model.stackable.response.RedeemableResultResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedeemableDataResponse {

  private String id;

  private String object;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("applicable_to")
  private ApplicableToResponse applicableTo;

  @JsonProperty("inapplicable_to")
  private InapplicableToResponse inapplicableTo;

  private RedeemableResultResponse result;
}
