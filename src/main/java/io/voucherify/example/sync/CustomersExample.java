package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.customer.Address;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.customer.response.CustomerResponse;

public class CustomersExample extends AbsExample {

  public CustomersExample(VoucherifyClient client) {
    super(client);
  }

  @Override
  public void example() {
    Address address =
        Address.builder()
            .state("state")
            .city("City")
            .country("Country")
            .line1("line1")
            .line2("line2")
            .postalCode("postalCode")
            .build();

    Customer customer = Customer.builder().name("Doe").email("some-email").address(address).build();

    CustomerResponse result = client.customers().create(customer);

    client.customers().get(result.getId());

    Customer update = Customer.builder().id(result.getId()).description("some desc").build();
    client.customers().update(update);

    client.customers().delete(result.getId());
  }
}
