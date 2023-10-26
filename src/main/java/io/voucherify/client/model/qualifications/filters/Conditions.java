package io.voucherify.client.model.qualifications.filters;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class Conditions {

  @JsonProperty("$in")
  private List<String> in;

  @JsonProperty("$is")
  private String is;

  @JsonProperty("$is_not")
  private String isNot;

  @JsonProperty("$has_value")
  private String hasValue;

  @JsonProperty("$is_unknown")
  private String isUnknown;
}
