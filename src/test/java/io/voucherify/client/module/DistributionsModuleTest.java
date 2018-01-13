package io.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.Operator;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.distribution.CreateExport;
import io.voucherify.client.model.distribution.ListPublicationsFilter;
import io.voucherify.client.model.distribution.ListPublicationsFilters;
import io.voucherify.client.model.distribution.PublishVoucher;
import io.voucherify.client.model.distribution.response.ExportResponse;
import io.voucherify.client.model.distribution.response.ExportStatus;
import io.voucherify.client.model.distribution.response.ListPublicationsResponse;
import io.voucherify.client.model.distribution.response.PublishVoucherResponse;
import org.junit.Test;
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
  public void shouldCreateExport() {
    // given
    CreateExport createExport = CreateExport.builder().exportedObject("voucher").build();
    enqueueResponse("{\"status\" : \"IN_PROGRESS\", \"id\": \"1\" }");

    // when
    ExportResponse result = client.distributions().createExport(createExport);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getStatus()).isEqualTo(ExportStatus.IN_PROGRESS);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetExport() {
    // given
    enqueueResponse("{\"status\" : \"IN_PROGRESS\", \"id\": \"1\" }");

    // when
    ExportResponse result = client.distributions().getExport("some-id");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getStatus()).isEqualTo(ExportStatus.IN_PROGRESS);
    assertThat(result.getId()).isEqualTo("1");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteExport() {
    // given
    enqueueEmptyResponse();

    // when
    client.distributions().deleteExport("some-id");

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldListPublications() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"publications\": [] }");
    ListPublicationsFilter filter = ListPublicationsFilter.builder()
        .filter(
            ListPublicationsFilters.builder()
                .fieldName("some_field")
                .operator(Operator.$has_value)
                .index(0)
                .value("sth")
                .build()
        )
        .filter(
            ListPublicationsFilters.builder()
                .fieldName("some_field")
                .operator(Operator.$has_value)
                .index(1)
                .value("sth2")
                .build()
        )
        .build();

    // when
    ListPublicationsResponse response = client.distributions().list(filter);

    // then
    assertThat(response).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/publications?filters[some_field][conditions][$has_value][0]=sth&filters[some_field][conditions][$has_value][1]=sth2");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldPublishVoucherAsync() {
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
  public void shouldCreateExportAsync() {
    // given
    CreateExport createExport = CreateExport.builder().exportedObject("voucher").build();
    enqueueResponse("{\"status\" : \"IN_PROGRESS\", \"id\": \"1\" }");
    VoucherifyCallback callback = createCallback();

    // when
    client.distributions().async().createExport(createExport, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetExportAsync() {
    // given
    enqueueResponse("{\"status\" : \"IN_PROGRESS\", \"id\": \"1\" }");
    VoucherifyCallback callback = createCallback();

    // when
    client.distributions().async().getExport("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteExportAsync() {
    // given
    enqueueEmptyResponse();
    VoucherifyCallback callback = createCallback();

    // when
    client.distributions().async().deleteExport("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldListPublicationsAsync() {
    // given
    VoucherifyCallback callback = createCallback();
    enqueueResponse("{\"object\" : \"list\", \"publications\": [] }");
    ListPublicationsFilter filter = ListPublicationsFilter.builder()
        .filter(
            ListPublicationsFilters.builder()
                .fieldName("some_field")
                .operator(Operator.$has_value)
                .index(0)
                .value("sth")
                .build()
        )
        .filter(
            ListPublicationsFilters.builder()
                .fieldName("some_field")
                .operator(Operator.$has_value)
                .index(1)
                .value("sth2")
                .build()
        )
        .build();

    // when
   client.distributions().async().list(filter, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/publications?filters[some_field][conditions][$has_value][0]=sth&filters[some_field][conditions][$has_value][1]=sth2");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldPublishVoucherRxJava() {
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

  @Test
  public void shouldCreateExportRxJava() {
    // given
    CreateExport createExport = CreateExport.builder().exportedObject("voucher").build();
    enqueueResponse("{\"status\" : \"IN_PROGRESS\", \"id\": \"1\" }");

    // when
    Observable<ExportResponse> observable = client.distributions().rx().createExport(createExport);

    // then
    ExportResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getStatus()).isEqualTo(ExportStatus.IN_PROGRESS);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetExportRxJava() {
    // given
    enqueueResponse("{\"status\" : \"IN_PROGRESS\", \"id\": \"1\" }");

    // when
    Observable<ExportResponse> observable = client.distributions().rx().getExport("some-id");

    // then
    ExportResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getStatus()).isEqualTo(ExportStatus.IN_PROGRESS);
    assertThat(result.getId()).isEqualTo("1");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteExportRxJava() {
    // given
    enqueueEmptyResponse();

    // when
    Observable<Void> observable = client.distributions().rx().deleteExport("some-id");

    // then
    observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/exports/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldListPublicationsRxJava() {
    // given
    enqueueResponse("{\"object\" : \"list\", \"publications\": [] }");
    ListPublicationsFilter filter = ListPublicationsFilter.builder()
        .filter(
            ListPublicationsFilters.builder()
                .fieldName("some_field")
                .operator(Operator.$has_value)
                .index(0)
                .value("sth")
                .build()
        )
        .filter(
            ListPublicationsFilters.builder()
                .fieldName("some_field")
                .operator(Operator.$has_value)
                .index(1)
                .value("sth2")
                .build()
        )
        .build();

    // when
    Observable<ListPublicationsResponse> observable = client.distributions().rx().list(filter);

    // then
    ListPublicationsResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/publications?filters[some_field][conditions][$has_value][0]=sth&filters[some_field][conditions][$has_value][1]=sth2");
    assertThat(request.getMethod()).isEqualTo("GET");
  }
}
