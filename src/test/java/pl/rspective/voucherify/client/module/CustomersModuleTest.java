package pl.rspective.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import org.junit.Test;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.customer.Customer;
import rx.Observable;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class CustomersModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateCustomer() throws Exception {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

    // when
    Customer result = client.customers().create(customer);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetCustomer() throws Exception {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

    // when
    Customer result = client.customers().get("customer-id");

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomer() throws Exception {
    // given
    Customer customer = Customer.builder()
            .id("customer-id")
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

    // when
    Customer result = client.customers().update(customer);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldCreateCustomerAsync() throws Exception {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

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
  public void shouldGetCustomerAsync() throws Exception {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

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
  public void shouldUpdateCustomerAsync() throws Exception {
    // given
    Customer customer = Customer.builder()
            .id("customer-id")
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

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
  public void shouldCreateCustomerRxJava() throws Exception {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

    // when
    Observable<Customer> observable = client.customers().rx().create(customer);

    // then
    Customer result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetCustomerRxJava() throws Exception {
    // given
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

    // when
    Observable<Customer> observable = client.customers().rx().get("customer-id");

    // then
    Customer result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomerRxJava() throws Exception {
    // given
    Customer customer = Customer.builder()
            .id("customer-id")
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueRequest(customer);

    // when
    Observable<Customer> observable = client.customers().rx().update(customer);

    // then
    Customer result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }
}
