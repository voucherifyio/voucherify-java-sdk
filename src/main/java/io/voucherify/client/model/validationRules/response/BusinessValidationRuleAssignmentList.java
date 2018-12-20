package io.voucherify.client.model.validationRules.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class BusinessValidationRuleAssignmentList {

  private List<BusinessValidationRuleAssignment> data;

  private Integer total;

  private String object;

  @JsonProperty("data_ref")
  private String dataRef;

  @JsonProperty("created_at")
  private Date createdAt;
}
