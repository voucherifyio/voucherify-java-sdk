package pl.rspective.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import org.junit.Test;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.customer.Customer;
import pl.rspective.voucherify.client.model.publish.PublishVoucher;
import pl.rspective.voucherify.client.model.publish.response.PublishVoucherResponse;
import rx.Observable;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class DistributionsModuleTest extends AbstractModuleTest {

  private static final PublishVoucher PUBLISH_VOUCHER = PublishVoucher.builder()
          .voucher("some-voucher")
          .campaign("some-campaign")
          .customer(Customer
                  .builder()
                  .email("some-email")
                  .build())
          .channel("some-channel")
          .build();

  @Test
  public void shouldPublishVoucher() {
    // given
    enqueueResponse("{\"code\" : \"some-code\", \"campaign\": \"some-campaign\" }");

    // when
    PublishVoucherResponse result = client.distributions().publish(PUBLISH_VOUCHER);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCode()).isEqualTo("some-code");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/publish");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidateVoucherAsync() throws Exception {
    // given
    enqueueResponse("{\"code\" : \"some-code\", \"campaign\": \"some-campaign\" }");
    VoucherifyCallback callback = createCallback();

    // when
    client.distributions().async().publish(PUBLISH_VOUCHER, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/publish");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldValidateVoucherRxJava() throws Exception {
    // given
    enqueueResponse("{\"code\" : \"some-code\", \"campaign\": \"some-campaign\" }");

    // when
    Observable<PublishVoucherResponse> observable = client.distributions().rx().publish(PUBLISH_VOUCHER);

    // then
    PublishVoucherResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/publish");
    assertThat(request.getMethod()).isEqualTo("POST");
  }
}
