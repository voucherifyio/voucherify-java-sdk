package io.voucherify.client.model.validation.response;

import io.voucherify.client.model.promotion.reponse.PromotionResponse;
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

  private List<PromotionResponse> promotions;

  private String trackingId;
}
