package io.voucherify.client.model.order.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class OrderItemProductResponse {

    private String name;

    @Singular("metadataEntry")
    private Map<String, Object> metadata;

    private boolean override = false;
}
