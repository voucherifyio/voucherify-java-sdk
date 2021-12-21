package io.voucherify.client.model.session;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class Session {

    private SessionType type;

    private String key;

    private Integer ttl;

    @JsonProperty("ttl_unit")
    private SessionTTLUnit ttlUnit;
}
