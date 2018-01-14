package io.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.event.CustomEvent;
import io.voucherify.client.model.event.response.CustomEventResponse;
import org.junit.Test;
import rx.Observable;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class EventsModuleTest extends AbstractModuleTest {

  @Test
  public void shouldTrackCustomEvent() {
    // given
    CustomEvent customEvent = CustomEvent.builder()
        .event("some event")
        .build();
    enqueueResponse("{\"object\" : \"event\", \"type\": \"page_iew\"}");

    // when
    CustomEventResponse result = client.events().track(customEvent);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getObject()).isEqualTo("event");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/events");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldTrackCustomEventAsync() {
    // given
    CustomEvent customEvent = CustomEvent.builder()
        .event("some event")
        .build();
    enqueueResponse("{\"object\" : \"event\", \"type\": \"page_iew\"}");
    VoucherifyCallback callback = createCallback();

    // when
    client.events().async().track(customEvent, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/events");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldTrackCustomEventRxJava() {
    // given
    CustomEvent customEvent = CustomEvent.builder()
        .event("some event")
        .build();
    enqueueResponse("{\"object\" : \"event\", \"type\": \"page_iew\"}");

    // when
    Observable<CustomEventResponse> observable = client.events().rx().track(customEvent);

    // then
    CustomEventResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getObject()).isEqualTo("event");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/events");
    assertThat(request.getMethod()).isEqualTo("POST");
  }
}
