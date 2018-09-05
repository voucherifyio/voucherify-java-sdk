package io.voucherify.client.model.validationRules;

import io.voucherify.client.model.Json;
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
public class UpdateBusinessValidationRule {

  private String id;

  private String name;

  @Builder.Default private Json rules = Json.builder().build();
}
