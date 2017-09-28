package io.voucherify.client.model.validationRules;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@ToString
public class MetadataValidationRules {

  @Singular("rule")
  private Map<String, MetadataRules> rules;

  @JsonAnyGetter
  public Map<String, MetadataRules> getRules() {
    return rules;
  }

  @JsonAnySetter
  public void setRules(String key, MetadataRules value) {
    if(rules == null) {
      rules = new HashMap<String, MetadataRules>();
    }

    rules.put(key, value);
  }
}
