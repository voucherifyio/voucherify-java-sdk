package io.voucherify.client.model.promotion.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.common.response.applicableTo.ApplicableToResponse;
import io.voucherify.client.model.voucher.Discount;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class PromotionTierValidationResponse {

    private String id;

    private String object;

    private String banner;

    private Discount discount;

    @JsonProperty("discount_amount")
    private Integer discountAmount;

    private Map<String, Object> metadata;

    @JsonProperty("applicable_to")
    private ApplicableToResponse applicableTo;
}
