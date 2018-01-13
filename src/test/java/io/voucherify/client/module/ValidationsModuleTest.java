package io.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.Order;
import io.voucherify.client.model.order.OrderItem;
import io.voucherify.client.model.validation.PromotionValidation;
import io.voucherify.client.model.validation.VoucherValidation;
import io.voucherify.client.model.validation.VoucherValidationResponse;
import io.voucherify.client.model.validation.response.PromotionValidationResponse;
import org.junit.Test;
import rx.Observable;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class ValidationsModuleTest extends AbstractModuleTest {

  private static final VoucherValidation VOUCHER_VALIDATION = VoucherValidation
          .builder()
          .customer(Customer.builder()
                  .email("some-email")
                  .build())
          .order(Order.builder()
                  .amount(1000)
                  .item(OrderItem.builder()
                          .skuId("sku")
                          .quantity(1)
                          .build())
                  .build())
          .build();

  @Test
  public void shouldValidateVoucher() {
    // given
    enqueueResponse("{\"code\" : \"some-code\", \"valid\": true }");

    // when
    VoucherValidationResponse result = client.validations().validate("some-code", VOUCHER_VALIDATION);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCode()).isEqualTo("some-code");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/validate");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidatePromotionCampaign() {
    // given
    PromotionValidation validation = PromotionValidation.builder()
        .customer(
            Customer.builder()
                .email("sth@sth.com")
                .build()
        )
        .build();
    enqueueResponse("{\"valid\" : \"true\", \"promotions\": []}");

    // when
    PromotionValidationResponse result = client.validations().validate(validation);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getValid()).isEqualTo(true);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/validation");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidateVoucherAsync() throws Exception {
    // given
    enqueueResponse("{\"code\" : \"some-code\", \"valid\": true }");
    VoucherifyCallback callback = createCallback();

    // when
    client.validations().async().validate("some-code", VOUCHER_VALIDATION, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/validate");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidatePromotionCampaignAsync() {
    // given
    PromotionValidation validation = PromotionValidation.builder()
        .customer(
            Customer.builder()
                .email("sth@sth.com")
                .build()
        )
        .build();
    enqueueResponse("{\"valid\" : \"true\", \"promotions\": []}");
    VoucherifyCallback callback = createCallback();


    // when
    client.validations().async().validate(validation, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/validation");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidateVoucherRxJava() throws Exception {
    // given
    enqueueResponse("{\"code\" : \"some-code\", \"valid\": true }");

    // when
    Observable<VoucherValidationResponse> observable = client.validations().rx().validate("some-code", VOUCHER_VALIDATION);

    // then
    VoucherValidationResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/validate");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidatePromotionCampaignRxJava() {
    // given
    PromotionValidation validation = PromotionValidation.builder()
        .customer(
            Customer.builder()
                .email("sth@sth.com")
                .build()
        )
        .build();
    enqueueResponse("{\"valid\" : \"true\", \"promotions\": []}");

    // when
    Observable<PromotionValidationResponse> observable = client.validations().rx().validate(validation);

    // then
    PromotionValidationResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getValid()).isEqualTo(true);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/validation");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

}
