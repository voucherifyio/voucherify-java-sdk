package io.voucherify.client.model.loyalties;

import io.voucherify.client.model.customer.Customer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class AddMember {

    private String voucher;

    private Customer customer;

    @Singular("metadataEntry")
    private Map<String, Object> metadata;
}
