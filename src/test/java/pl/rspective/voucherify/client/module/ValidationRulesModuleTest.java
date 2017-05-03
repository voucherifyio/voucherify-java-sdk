package pl.rspective.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import org.junit.Test;
import pl.rspective.voucherify.client.model.validationRules.Conditions;
import pl.rspective.voucherify.client.model.validationRules.IdPair;
import pl.rspective.voucherify.client.model.validationRules.Junction;
import pl.rspective.voucherify.client.model.validationRules.Operator;
import pl.rspective.voucherify.client.model.validationRules.OrderValidationRules;
import pl.rspective.voucherify.client.model.validationRules.ProductValidationRules;
import pl.rspective.voucherify.client.model.validationRules.ValidationRules;
import pl.rspective.voucherify.client.model.validationRules.response.ValidationRulesResponse;

import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationRulesModuleTest extends AbstractModuleTest {

  private static final ValidationRules RULES = ValidationRules.builder().junction(Junction.AND)
          .campaignName("campaign")
          .voucherCode("code")
          .orderRules(OrderValidationRules.builder()
                  .junction(Junction.AND)
                  .productsCount(new Conditions<Integer>()
                          .addCondition(Operator.$contains, new LinkedList<Integer>()))
                  .build())
          .productRules(ProductValidationRules.builder()
                  .conditions(new Conditions<IdPair>()
                          .addCondition(Operator.$is_not, new LinkedList<IdPair>()))
                  .build())
          .build();

  @Test
  public void shouldCreateValidationRules() {
    // given
    enqueueResponse(RULES);

    // when
    ValidationRulesResponse result = client.validationRules().create(RULES);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/validation-rules");
    assertThat(request.getMethod()).isEqualTo("POST");
  }
}
