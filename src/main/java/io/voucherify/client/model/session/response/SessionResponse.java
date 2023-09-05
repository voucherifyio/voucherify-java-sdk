package io.voucherify.client.model.session.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.session.SessionTTLUnit;
import io.voucherify.client.model.session.SessionType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class SessionResponse {

    private SessionType type;

    private String key;

    private Integer ttl;

    @JsonProperty("ttl_unit")
    private SessionTTLUnit ttlUnit;
}
