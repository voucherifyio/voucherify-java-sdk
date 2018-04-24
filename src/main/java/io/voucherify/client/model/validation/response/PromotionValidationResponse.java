package io.voucherify.client.model.validation.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.promotion.reponse.PromotionTierValidationResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class PromotionValidationResponse {

  private Boolean valid;

  private List<PromotionTierValidationResponse> promotions;

  @JsonProperty("tracking_id")
  private String trackingId;
}
