package io.voucherify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.voucherify.client.JSON;
import io.voucherify.client.model.ValidationRule;
import io.voucherify.client.model.ValidationRuleError;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ValidationRuleErrorSerializationTest {

  @BeforeAll
  static void initGson() {
    new JSON();
  }

  @Test
  void shouldKeepValidationRuleErrorNullableAndCompatible() throws Exception {
    ValidationRule missingError = ValidationRule.fromJson("{}");
    ValidationRule nullError = ValidationRule.fromJson("{\"error\":null}");
    ValidationRule withError = ValidationRule.fromJson("{\"error\":{\"message\":\"not eligible\"}}");
    ValidationRuleError errorOnly = ValidationRuleError.fromJson("{\"message\":\"not eligible\"}");
    ValidationRuleError emptyError = ValidationRuleError.fromJson("{}");

    assertNull(missingError.getError());
    assertNull(nullError.getError());
    assertNotNull(withError.getError());
    assertEquals("not eligible", withError.getError().getMessage());
    assertEquals("not eligible", errorOnly.getMessage());
    assertNull(emptyError.getMessage());

    ValidationRule explicitNull = new ValidationRule().error(null);
    assertTrue(explicitNull.isErrorSet());
    assertNull(explicitNull.getError());
    assertTrue(explicitNull.toJson().contains("\"error\":null"));
  }
}
