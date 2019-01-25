package io.voucherify.client.model.order;

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
public class OrderItemProduct {

    private String name;

    @Singular("metadataEntry")
    private Map<String, Object> metadata;

    private boolean override = false;
}
