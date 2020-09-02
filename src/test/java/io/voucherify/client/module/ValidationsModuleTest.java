package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.Order;
import io.voucherify.client.model.order.OrderItem;
import io.voucherify.client.model.validation.PromotionValidation;
import io.voucherify.client.model.validation.VoucherValidation;
import io.voucherify.client.model.validation.response.PromotionValidationResponse;
import io.voucherify.client.model.validation.response.VoucherValidationResponse;
import io.voucherify.client.model.voucher.DiscountType;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class ValidationsModuleTest extends AbstractModuleTest {

  private static final VoucherValidation VOUCHER_VALIDATION =
      VoucherValidation.builder()
          .customer(Customer.builder().email("some-email").build())
          .order(
              Order.builder()
                  .amount(1000L)
                  .item(OrderItem.builder().skuId("sku").quantity(1).build())
                  .build())
          .build();

  @Test
  public void shouldValidateVoucher() {
    // given
    enqueueResponse("{\"code\" : \"some-code\", \"valid\": true }");

    // when
    VoucherValidationResponse result =
        client.validations().validate("some-code", VOUCHER_VALIDATION);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCode()).isEqualTo("some-code");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/validate");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidatePromotionCampaign() {
    // given
    PromotionValidation validation =
        PromotionValidation.builder()
            .customer(Customer.builder().email("sth@sth.com").build())
            .build();
    enqueueResponse(
        "{\"valid\" : \"true\", \"tracking_id\": \"track_test\", \"promotions\": [{ \"id\": \"promo_mock\", \"banner\": \"Test Banner\", \"object\": \"promotion_tier\", \"discount\": { \"type\": \"AMOUNT\", \"amount_off\": 1000 }, \"metadata\": { \"test\": true}, \"discount_amount\": 1000}]}");

    // when
    PromotionValidationResponse result = client.validations().validate(validation);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getValid()).isEqualTo(true);
    assertThat(result.getTrackingId()).isEqualTo("track_test");
    assertThat(result.getPromotions().size()).isEqualTo(1);
    assertThat(result.getPromotions().get(0).getBanner()).isEqualTo("Test Banner");
    assertThat(result.getPromotions().get(0).getDiscount().getType())
        .isEqualTo(DiscountType.AMOUNT);
    assertThat(result.getPromotions().get(0).getDiscount().getAmountOff()).isEqualTo(1000);
    assertThat(result.getPromotions().get(0).getDiscountAmount()).isEqualTo(1000);
    assertThat(result.getPromotions().get(0).getId()).isEqualTo("promo_mock");
    assertThat(result.getPromotions().get(0).getObject()).isEqualTo("promotion_tier");
    assertThat(result.getPromotions().get(0).getMetadata().size()).isEqualTo(1);
    assertThat(result.getPromotions().get(0).getMetadata().get("test")).isEqualTo(true);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/promotions/validation");
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
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/validate");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidatePromotionCampaignAsync() {
    // given
    PromotionValidation validation =
        PromotionValidation.builder()
            .customer(Customer.builder().email("sth@sth.com").build())
            .build();
    enqueueResponse(
        "{\"valid\" : \"true\", \"promotions\": [{ \"id\": \"promo_mock\", \"banner\": \"Test Banner\", \"object\": \"promotion_tier\", \"discount\": { \"type\": \"AMOUNT\", \"amount_off\": 1000 }, \"metadata\": { \"test\": true}, \"discount_amount\": 1000}]}");
    VoucherifyCallback callback = createCallback();

    // when
    client.validations().async().validate(validation, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/promotions/validation");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidateVoucherRxJava() throws Exception {
    // given
    enqueueResponse("{\"code\" : \"some-code\", \"valid\": true }");

    // when
    Observable<VoucherValidationResponse> observable =
        client.validations().rx().validate("some-code", VOUCHER_VALIDATION);

    // then
    VoucherValidationResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/validate");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidatePromotionCampaignRxJava() {
    // given
    PromotionValidation validation =
        PromotionValidation.builder()
            .customer(Customer.builder().email("sth@sth.com").build())
            .build();
    enqueueResponse(
        "{\"valid\" : \"true\", \"tracking_id\": \"track_test\", \"promotions\": [{ \"id\": \"promo_mock\", \"banner\": \"Test Banner\", \"object\": \"promotion_tier\", \"discount\": { \"type\": \"AMOUNT\", \"amount_off\": 1000 }, \"metadata\": { \"test\": true}, \"discount_amount\": 1000}]}");

    // when
    Observable<PromotionValidationResponse> observable =
        client.validations().rx().validate(validation);

    // then
    PromotionValidationResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getValid()).isEqualTo(true);
    assertThat(result.getTrackingId()).isEqualTo("track_test");
    assertThat(result.getPromotions().size()).isEqualTo(1);
    assertThat(result.getPromotions().get(0).getBanner()).isEqualTo("Test Banner");
    assertThat(result.getPromotions().get(0).getDiscount().getType())
        .isEqualTo(DiscountType.AMOUNT);
    assertThat(result.getPromotions().get(0).getDiscount().getAmountOff()).isEqualTo(1000);
    assertThat(result.getPromotions().get(0).getDiscountAmount()).isEqualTo(1000);
    assertThat(result.getPromotions().get(0).getId()).isEqualTo("promo_mock");
    assertThat(result.getPromotions().get(0).getObject()).isEqualTo("promotion_tier");
    assertThat(result.getPromotions().get(0).getMetadata().size()).isEqualTo(1);
    assertThat(result.getPromotions().get(0).getMetadata().get("test")).isEqualTo(true);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/promotions/validation");
    assertThat(request.getMethod()).isEqualTo("POST");
  }
}
