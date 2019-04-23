package io.voucherify.client.model.loyalties.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.loyalties.CustomEvent;
import io.voucherify.client.model.loyalties.Segment;
import io.voucherify.client.model.loyalties.Source;
import io.voucherify.client.model.loyalties.Loyalty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class EarningRuleResponse {

    private String id;

    private String object;

    @JsonProperty("validation_rule_id")
    private String validationRuleId;

    @JsonProperty("created_at")
    private Date createdAt;

    private String event;

    @JsonProperty("custom_event")
    private CustomEvent customEvent;

    @JsonProperty("segment")
    private Segment segment;

    private Source source;

    private Loyalty loyalty;
}
