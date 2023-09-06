package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.consents.response.ListConsentsResponse;
import io.voucherify.client.model.event.CustomEvent;
import io.voucherify.client.model.event.response.CustomEventResponse;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class ConsentsModuleTest extends AbstractModuleTest {

  @Test
  public void shouldListConsents() {
    // given
    enqueueResponse("{\"groups\":{\"object\":\"list\",\"data_ref\":\"data\",\"data\":[{\"id\":\"cnstgr_sBNXFfc8L73TKmgaBpeWO52a\",\"name\":\"GROUP_1\",\"description\":\"Group one\",\"consents\":[\"cnst_ySYJRNcgW2eAXKUSHc7SNMJA\"],\"created_at\":\"2023-09-06T09:37:11.339Z\",\"updated_at\":null,\"object\":\"consent_group\"}],\"total\":1},\"consents\":{\"object\":\"list\",\"data_ref\":\"data\",\"data\":[{\"id\":\"cnst_ySYJRNcgW2eAXKUSHc7SNMJA\",\"name\":\"Name\",\"description\":\"desc\",\"category\":\"poland\",\"created_at\":\"2023-09-06T09:36:46.189Z\",\"updated_at\":null,\"object\":\"consent\"}],\"total\":1}}");

    // when
    ListConsentsResponse listConsentsResponse = client.consents().listConsents();

    // then
    assertThat(listConsentsResponse).isNotNull();
    assertThat(listConsentsResponse.getGroups().getObject()).isEqualTo("list");
    assertThat(listConsentsResponse.getGroups().getDataRef()).isEqualTo("data");
    assertThat(listConsentsResponse.getGroups().getData().get(0).getId()).isEqualTo("cnstgr_sBNXFfc8L73TKmgaBpeWO52a");
    assertThat(listConsentsResponse.getGroups().getTotal()).isEqualTo(1);

    assertThat(listConsentsResponse.getConsents().getObject()).isEqualTo("list");
    assertThat(listConsentsResponse.getConsents().getDataRef()).isEqualTo("data");
    assertThat(listConsentsResponse.getConsents().getData().get(0).getId()).isEqualTo("cnst_ySYJRNcgW2eAXKUSHc7SNMJA");
    assertThat(listConsentsResponse.getConsents().getTotal()).isEqualTo(1);

    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/consents");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListConsentsAsync() {
    // given
    enqueueResponse("{\"object\" : \"event\", \"type\": \"page_iew\"}");
    VoucherifyCallback callback = createCallback();

    // when
    client.consents().async().listConsents(callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/consents");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListConsentsRxJava() {
    // given
    enqueueResponse("{\"groups\":{\"object\":\"list\",\"data_ref\":\"data\",\"data\":[{\"id\":\"cnstgr_sBNXFfc8L73TKmgaBpeWO52a\",\"name\":\"GROUP_1\",\"description\":\"Group one\",\"consents\":[\"cnst_ySYJRNcgW2eAXKUSHc7SNMJA\"],\"created_at\":\"2023-09-06T09:37:11.339Z\",\"updated_at\":null,\"object\":\"consent_group\"}],\"total\":1},\"consents\":{\"object\":\"list\",\"data_ref\":\"data\",\"data\":[{\"id\":\"cnst_ySYJRNcgW2eAXKUSHc7SNMJA\",\"name\":\"Name\",\"description\":\"desc\",\"category\":\"poland\",\"created_at\":\"2023-09-06T09:36:46.189Z\",\"updated_at\":null,\"object\":\"consent\"}],\"total\":1}}");

    // when
    Observable<ListConsentsResponse> observable = client.consents().rx().listConsents();

    // then
    ListConsentsResponse listConsentsResponse = observable.blockingFirst();
    assertThat(listConsentsResponse).isNotNull();
    assertThat(listConsentsResponse.getGroups().getObject()).isEqualTo("list");
    assertThat(listConsentsResponse.getGroups().getDataRef()).isEqualTo("data");
    assertThat(listConsentsResponse.getGroups().getData().get(0).getId()).isEqualTo("cnstgr_sBNXFfc8L73TKmgaBpeWO52a");
    assertThat(listConsentsResponse.getGroups().getTotal()).isEqualTo(1);

    assertThat(listConsentsResponse.getConsents().getObject()).isEqualTo("list");
    assertThat(listConsentsResponse.getConsents().getDataRef()).isEqualTo("data");
    assertThat(listConsentsResponse.getConsents().getData().get(0).getId()).isEqualTo("cnst_ySYJRNcgW2eAXKUSHc7SNMJA");
    assertThat(listConsentsResponse.getConsents().getTotal()).isEqualTo(1);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/consents");
    assertThat(request.getMethod()).isEqualTo("GET");
  }
}
