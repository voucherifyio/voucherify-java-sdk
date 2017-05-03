package pl.rspective.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import org.junit.Test;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.customer.Customer;
import pl.rspective.voucherify.client.model.customer.response.CustomerResponse;
import rx.Observable;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class CustomersModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateCustomer() {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    // when
    CustomerResponse result = client.customers().create(customer);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetCustomer() {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    // when
    CustomerResponse result = client.customers().get("customer-id");

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomer() {
    // given
    Customer customer = Customer.builder()
            .id("customer-id")
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    // when
    CustomerResponse result = client.customers().update(customer);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeleteCustomer() {
    // given
    String customerId = "customer-id";

    enqueueEmptyResponse();

    // when
    client.customers().delete(customerId);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateCustomerAsync() {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    VoucherifyCallback callback = createCallback();

    // when
    client.customers().async().create(customer, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetCustomerAsync() {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    VoucherifyCallback callback = createCallback();

    // when
    client.customers().async().get("customer-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomerAsync() {
    // given
    Customer customer = Customer.builder()
            .id("customer-id")
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    VoucherifyCallback callback = createCallback();

    // when
    client.customers().async().update(customer, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeleteCustomerAsync() {
    // given
    String customerId = "customer-id";

    enqueueEmptyResponse();

    VoucherifyCallback callback = createCallback();

    // when
    client.customers().async().delete(customerId, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreateCustomerRxJava() {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    // when
    Observable<CustomerResponse> observable = client.customers().rx().create(customer);

    // then
    CustomerResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetCustomerRxJava() {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    // when
    Observable<CustomerResponse> observable = client.customers().rx().get("customer-id");

    // then
    CustomerResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomerRxJava() {
    // given
    Customer customer = Customer.builder()
            .id("customer-id")
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    // when
    Observable<CustomerResponse> observable = client.customers().rx().update(customer);

    // then
    CustomerResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeleteCustomerRxJava() {
    // given
    String customerId = "customer-id";
    enqueueEmptyResponse();

    // when
    Observable<Void> observable = client.customers().rx().delete(customerId);

    // then
    observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }
}
