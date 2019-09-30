package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.segment.Segment;
import io.voucherify.client.model.segment.SegmentType;
import io.voucherify.client.model.segment.response.SegmentResponse;
import io.voucherify.client.utils.Irrelevant;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class SegmentsModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateSegment() {
    // given
    Segment segment = Segment.builder().name("segment").type(SegmentType.AUTO_UPDATE).build();

    enqueueResponse("{\"name\" : \"segment\"}");

    // when
    SegmentResponse result = client.segments().create(segment);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getName()).isEqualTo("segment");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetSegment() {
    // given
    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\" }");

    // when
    SegmentResponse result = client.segments().get("some-id");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteSegment() {
    // given
    enqueueEmptyResponse();

    // when
    client.segments().delete("some-id");

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateSegmentAsync() {
    // given
    Segment segment = Segment.builder().name("segment").build();
    VoucherifyCallback callback = createCallback();
    enqueueResponse("{\"name\" : \"segment\"}");

    // when
    client.segments().async().create(segment, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetSegmentAsync() {
    // given
    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\" }");
    VoucherifyCallback callback = createCallback();

    // when
    client.segments().async().get("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteSegmentAsync() {
    // given
    enqueueEmptyResponse();
    VoucherifyCallback callback = createCallback();

    // when
    client.segments().async().delete("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateSegmentRxJava() {
    // given
    Segment segment = Segment.builder().name("segment").build();

    enqueueResponse("{\"name\" : \"segment\"}");

    // when
    Observable<SegmentResponse> observable = client.segments().rx().create(segment);

    // then
    SegmentResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getName()).isEqualTo("segment");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetSegmentRxJava() {
    // given
    enqueueResponse("{\"name\" : \"some-name\", \"id\": \"some-id\" }");

    // when
    Observable<SegmentResponse> observable = client.segments().rx().get("some-id");

    // then
    SegmentResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("some-id");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments/some-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldDeleteSegmentRxJava() {
    // given
    enqueueEmptyResponse();

    // when
    Observable<Irrelevant> observable = client.segments().rx().delete("some-id");

    // then
    observable.blockingFirst();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/segments/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }
}
