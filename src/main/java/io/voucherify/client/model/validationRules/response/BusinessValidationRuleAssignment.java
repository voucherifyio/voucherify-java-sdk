package io.voucherify.client.model.validationRules.response;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class BusinessValidationRuleAssignment {

  private String id;

  private String object;

  @JsonProperty("rule_id")
  private String ruleId;

  @JsonProperty("related_object_id")
  private String relatedObjectId;

  @JsonProperty("related_object_type")
  private String relatedObjectType;

  @JsonProperty("created_at")
  private Date createdAt;
}
