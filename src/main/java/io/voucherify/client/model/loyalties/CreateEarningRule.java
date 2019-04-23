package io.voucherify.client.model.loyalties;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class CreateEarningRule {

    @JsonProperty("validation_rule_id")
    private String validationRuleId;

    private String event;

    @JsonProperty("custom_event")
    private CustomEvent customEvent;

    @JsonProperty("segment")
    private Segment segment;

    private Source source;

    private Loyalty loyalty;
}
