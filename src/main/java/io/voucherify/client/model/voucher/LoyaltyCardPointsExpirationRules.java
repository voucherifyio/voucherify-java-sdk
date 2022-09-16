package io.voucherify.client.model.voucher;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Builder
@ToString
public class LoyaltyCardPointsExpirationRules {

    @JsonProperty("period_type")
    private String periodType;

    @JsonProperty("period_value")
    private Integer periodValue;
}
