package io.voucherify.client.model.validationRules.response;

import io.voucherify.client.model.Json;
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
public class BusinessValidationRule {

  private String name;

  private String id;

  private Json rules;

  private String object;

  private Date createdAt;
}

