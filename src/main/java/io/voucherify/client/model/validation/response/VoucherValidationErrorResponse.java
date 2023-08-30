package io.voucherify.client.model.validation.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherValidationErrorResponse {
    private String code;

    private String key;

    private String message;

    private String details;

    @JsonProperty("request_id")
    private String requestId;

    @JsonProperty("resource_id")
    private String resource_id;

    @JsonProperty("resource_type")
    private String resource_type;
}
