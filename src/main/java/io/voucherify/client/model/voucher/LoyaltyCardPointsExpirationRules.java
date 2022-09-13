package io.voucherify.client.model.voucher;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Builder
@ToString
public class LoyaltyCardPointsExpirationRules {

    private String period_type;

    private Integer period_value;
}
