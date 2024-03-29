package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.customer.CustomersFilter;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.customer.response.CustomersResponse;
import io.voucherify.client.utils.Irrelevant;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class CustomersModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateCustomer() {
    // given
    Customer customer =
        Customer.builder().email("email").phone("phone").description("description").build();

    enqueueResponse(customer);

    // when
    CustomerResponse result = client.customers().create(customer);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetCustomer() {
    // given
    Customer customer =
        Customer.builder().email("email").phone("phone").description("description").build();

    enqueueResponse(customer);

    // when
    CustomerResponse result = client.customers().get("customer-id");

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomer() {
    // given
    Customer customer =
        Customer.builder()
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
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
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
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldListCustomers() {
    // given
    CustomersFilter filter = CustomersFilter.builder().limit(5).email("sth@sth.com").build();

    enqueueResponse("{\"object\" : \"list\", \"customers\": [] }");

    // when
    CustomersResponse result = client.customers().list(filter);

    // then
    RecordedRequest request = getRequest();
    assertThat(result).isNotNull();
    assertThat(request.getPath()).isEqualTo("/v1/customers?limit=5&email=sth%40sth.com");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomerConsents() {
    // given
    enqueueResponse("{}");
    Map<String, Boolean> consents = new HashMap<>();
    consents.put("cnst_1", true);
    consents.put("unsubscribed", true);

    // when
    client.customers().updateCustomerConsents("cust_1", consents);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers/cust_1/consents");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldCreateCustomerAsync() {
    // given
    Customer customer =
        Customer.builder().email("email").phone("phone").description("description").build();

    enqueueResponse(customer);

    VoucherifyCallback callback = createCallback();

    // when
    client.customers().async().create(customer, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetCustomerAsync() {
    // given
    Customer customer =
        Customer.builder().email("email").phone("phone").description("description").build();

    enqueueResponse(customer);

    VoucherifyCallback callback = createCallback();

    // when
    client.customers().async().get("customer-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomerAsync() {
    // given
    Customer customer =
        Customer.builder()
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
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
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
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldListCustomersAsync() {
    // given
    CustomersFilter filter = CustomersFilter.builder().limit(5).email("sth@sth.com").build();
    VoucherifyCallback callback = createCallback();

    enqueueResponse("{\"object\" : \"list\", \"customers\": [] }");

    // when
    client.customers().async().list(filter, callback);

    // then
    RecordedRequest request = getRequest();
    await().atMost(5, SECONDS).until(wasCallbackFired());
    assertThat(request.getPath()).isEqualTo("/v1/customers?limit=5&email=sth%40sth.com");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomerConsentsAsync() {
    // given
    enqueueResponse("{}");
    VoucherifyCallback callback = createCallback();

    Map<String, Boolean> consents = new HashMap<>();
    consents.put("cnst_1", true);
    consents.put("unsubscribed", true);
    // when
    client.customers().async().updateCustomerConsents("cust_1", consents, callback);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers/cust_1/consents");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldCreateCustomerRxJava() {
    // given
    Customer customer =
        Customer.builder().email("email").phone("phone").description("description").build();

    enqueueResponse(customer);

    // when
    Observable<CustomerResponse> observable = client.customers().rx().create(customer);

    // then
    CustomerResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetCustomerRxJava() {
    // given
    Customer customer =
        Customer.builder().email("email").phone("phone").description("description").build();

    enqueueResponse(customer);

    // when
    Observable<CustomerResponse> observable = client.customers().rx().get("customer-id");

    // then
    CustomerResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomerRxJava() {
    // given
    Customer customer =
        Customer.builder()
            .id("customer-id")
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    enqueueResponse(customer);

    // when
    Observable<CustomerResponse> observable = client.customers().rx().update(customer);

    // then
    CustomerResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeleteCustomerRxJava() {
    // given
    String customerId = "customer-id";
    enqueueEmptyResponse();

    // when
    Observable<Irrelevant> observable = client.customers().rx().delete(customerId);

    // then
    observable.blockingFirst();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers/customer-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldListCustomersRxJava() {
    // given
    CustomersFilter filter = CustomersFilter.builder().limit(5).email("sth@sth.com").build();

    enqueueResponse("{\"object\" : \"list\", \"customers\": [] }");

    // when
    Observable<CustomersResponse> observable = client.customers().rx().list(filter);

    // then
    CustomersResponse result = observable.blockingFirst();
    RecordedRequest request = getRequest();
    assertThat(result).isNotNull();
    assertThat(request.getPath()).isEqualTo("/v1/customers?limit=5&email=sth%40sth.com");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateCustomerConsentsRxJava() {
    // given
    enqueueResponse("{}");

    Map<String, Boolean> consents = new HashMap<>();
    consents.put("cnst_1", true);
    consents.put("unsubscribed", true);

    // when
    Observable<Irrelevant> observable = client.customers().rx().updateCustomerConsents("cust_1", consents);

    // then
    observable.blockingFirst();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/customers/cust_1/consents");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }
}
