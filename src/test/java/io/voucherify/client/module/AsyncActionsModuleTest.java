package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.async_actions.AsyncActionResponse;
import io.voucherify.client.model.async_actions.AsyncActionsFilter;
import io.voucherify.client.model.async_actions.AsyncActionsResponse;
import okhttp3.mockwebserver.RecordedRequest;
import org.assertj.core.util.Maps;
import org.junit.Test;

import java.util.Date;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class AsyncActionsModuleTest extends AbstractModuleTest {

    @Test
    public void shouldGetAsyncAction() {
        // given
        enqueueResponse("{\"id\": \"id\", \"type\": \"type\", \"status\": \"status\", \"result\": { \"test\": 1 }, \"created_at\": \"2021-07-16T12:05:12Z\"}");

        // when
        AsyncActionResponse result = client.asyncActions().get("id");

        // then
        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo("id");
        assertThat(result.getType()).isEqualTo("type");
        assertThat(result.getStatus()).isEqualTo("status");
        assertThat(result.getResult()).isNotNull();
        assertThat(result.getResult().get("test")).isEqualTo(1);
        assertThat(result.getCreatedAt()).isEqualTo("2021-07-16T12:05:12Z");

        RecordedRequest request = getRequest();
        assertThat(request.getPath()).isEqualTo("/v1/async-actions/id");
        assertThat(request.getMethod()).isEqualTo("GET");
    }

    @Test
    public void shouldGetAsyncActionRxJava() {
        // given
        enqueueResponse("{\"id\": \"id\", \"type\": \"type\", \"status\": \"status\", \"result\": { \"test\": 1 }, \"created_at\": \"2021-07-16T12:05:12Z\"}");

        // when
        Observable<AsyncActionResponse> observable = client.asyncActions().rx().get("id");

        // then
        AsyncActionResponse result = observable.blockingFirst();
        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo("id");
        assertThat(result.getType()).isEqualTo("type");
        assertThat(result.getStatus()).isEqualTo("status");
        assertThat(result.getResult()).isNotNull();
        assertThat(result.getResult().get("test")).isEqualTo(1);
        assertThat(result.getCreatedAt()).isEqualTo("2021-07-16T12:05:12Z");

        RecordedRequest request = getRequest();
        assertThat(request.getPath()).isEqualTo("/v1/async-actions/id");
        assertThat(request.getMethod()).isEqualTo("GET");
    }

    @Test
    public void shouldGetAsyncActionAsync() {
        // given
        enqueueResponse("{\"id\": \"id\", \"type\": \"type\", \"status\": \"status\", \"result\": { \"test\": 1 }, \"created_at\": \"2021-07-16T12:05:12Z\"}");
        VoucherifyCallback callback = createCallback();

        // when
        client.asyncActions().async().get("id", callback);

        // then
        await().atMost(5, SECONDS).until(wasCallbackFired());
        RecordedRequest request = getRequest();
        assertThat(request.getPath()).isEqualTo("/v1/async-actions/id");
        assertThat(request.getMethod()).isEqualTo("GET");
    }

    @Test
    public void shouldListAsyncActions() throws Exception {
        // given
        AsyncActionResponse asyncAction = new AsyncActionResponse("id", "type", "status", Maps.newHashMap("test", 1), new Date());
        enqueueResponse("{\"async_actions\": [" + mapper.writeValueAsString(asyncAction) + "]}");

        Date endDate = new Date(1626438877000L);
        AsyncActionsFilter filter =
                AsyncActionsFilter.builder()
                        .limit(10)
                        .endDate(endDate)
                        .build();

        // when
        AsyncActionsResponse list = client.asyncActions().list(filter);

        // then
        assertThat(list).isNotNull();

        RecordedRequest request = getRequest();
        assertThat(request.getPath()).isEqualTo("/v1/async-actions?end_date=2021-07-16T12%3A34%3A37.000Z&limit=10");
        assertThat(request.getMethod()).isEqualTo("GET");
    }

    @Test
    public void shouldListAsyncActionsRxJava() throws Exception {
        // given
        AsyncActionResponse asyncAction = new AsyncActionResponse("id", "type", "status", Maps.newHashMap("test", 1), new Date());
        enqueueResponse("{\"async_actions\": [" + mapper.writeValueAsString(asyncAction) + "]}");

        Date endDate = new Date(1626438877000L);
        AsyncActionsFilter filter =
                AsyncActionsFilter.builder()
                        .limit(10)
                        .endDate(endDate)
                        .build();

        // when
        Observable<AsyncActionsResponse> observable = client.asyncActions().rx().list(filter);

        // then
        AsyncActionsResponse result = observable.blockingFirst();
        assertThat(result).isNotNull();

        RecordedRequest request = getRequest();
        assertThat(request.getPath()).isEqualTo("/v1/async-actions?end_date=2021-07-16T12%3A34%3A37.000Z&limit=10");
        assertThat(request.getMethod()).isEqualTo("GET");
    }

    @Test
    public void shouldListAsyncActionsAsync() throws Exception {
        // given
        AsyncActionResponse asyncAction = new AsyncActionResponse("id", "type", "status", Maps.newHashMap("test", 1), new Date());
        enqueueResponse("{\"async_actions\": [" + mapper.writeValueAsString(asyncAction) + "]}");
        VoucherifyCallback callback = createCallback();

        Date endDate = new Date(1626438877000L);
        AsyncActionsFilter filter =
                AsyncActionsFilter.builder()
                        .limit(10)
                        .endDate(endDate)
                        .build();

        // when
        client.asyncActions().async().list(filter, callback);

        // then
        await().atMost(5, SECONDS).until(wasCallbackFired());
        RecordedRequest request = getRequest();
        assertThat(request.getPath()).isEqualTo("/v1/async-actions?end_date=2021-07-16T12%3A34%3A37.000Z&limit=10");
        assertThat(request.getMethod()).isEqualTo("GET");
    }

}
