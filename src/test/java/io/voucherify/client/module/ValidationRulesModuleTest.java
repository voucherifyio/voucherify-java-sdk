package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.Json;
import io.voucherify.client.model.validationRules.CreateBusinessValidationRule;
import io.voucherify.client.model.validationRules.UpdateBusinessValidationRule;
import io.voucherify.client.model.validationRules.response.BusinessValidationRule;
import io.voucherify.client.utils.Irrelevant;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class ValidationRulesModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateBusinessValidationRules() {
    CreateBusinessValidationRule rule =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();

    // given
    enqueueResponse(rule);

    // when
    BusinessValidationRule result = client.validationRules().create(rule);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules");
    assertThat(request.getMethod()).isEqualTo("POST");
    assertThat(result.getRules().getEntry("field")).isEqualTo("value");
  }

  @Test
  public void shouldGetValidationRules() {
    CreateBusinessValidationRule rule =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();

    // given
    enqueueResponse(rule);

    // when
    BusinessValidationRule result = client.validationRules().get("some-id");

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateValidationRules() {
    UpdateBusinessValidationRule rule =
        UpdateBusinessValidationRule.builder().name("somename").id("some-id").build();
    CreateBusinessValidationRule response =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();

    // given
    enqueueResponse(response);

    // when
    BusinessValidationRule result = client.validationRules().update(rule);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeleteValidationRules() {
    // given
    enqueueEmptyResponse();

    // when
    client.validationRules().delete("some-id");

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateValidationRulesAsync() {
    // given
    CreateBusinessValidationRule rule =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();
    enqueueResponse(rule);
    VoucherifyCallback callback = createCallback();

    // when
    client.validationRules().async().create(rule, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetValidationRulesAsync() {
    // given
    CreateBusinessValidationRule rule =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();

    enqueueResponse(rule);
    VoucherifyCallback callback = createCallback();

    // when
    client.validationRules().async().get("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateValidationRulesAsync() {
    // given
    UpdateBusinessValidationRule rule =
        UpdateBusinessValidationRule.builder().name("somename").id("some-id").build();
    CreateBusinessValidationRule response =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();

    enqueueResponse(response);
    VoucherifyCallback callback = createCallback();

    // when
    client.validationRules().async().update(rule, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeleteValidationRulesAsync() {
    // given
    enqueueEmptyResponse();
    VoucherifyCallback callback = createCallback();

    // when
    client.validationRules().async().delete("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateValidationRulesRxJava() {
    CreateBusinessValidationRule rule =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();
    // given
    enqueueResponse(rule);

    // when
    Observable<BusinessValidationRule> observable = client.validationRules().rx().create(rule);

    // then
    BusinessValidationRule result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetValidationRulesRxJava() {
    CreateBusinessValidationRule rule =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();

    // given
    enqueueResponse(rule);

    // when
    Observable<BusinessValidationRule> observable = client.validationRules().rx().get("some-id");

    // then
    BusinessValidationRule result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateValidationRulesRxJava() {
    UpdateBusinessValidationRule rule =
        UpdateBusinessValidationRule.builder().name("somename").id("some-id").build();
    CreateBusinessValidationRule response =
        CreateBusinessValidationRule.builder()
            .name("some name")
            .rules(
                Json.builder()
                    .addEntry("field", "value")
                    .addEntry("field2", Json.builder().addEntry("somefield3", true).build())
                    .build())
            .build();
    // given
    enqueueResponse(response);

    // when
    Observable<BusinessValidationRule> observable = client.validationRules().rx().update(rule);

    // then
    BusinessValidationRule result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeleteValidationRulesRxJava() {
    // given
    enqueueEmptyResponse();

    // when
    Observable<Irrelevant> observable = client.validationRules().rx().delete("some-id");

    // then
    observable.blockingFirst();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/validation-rules/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }
}
