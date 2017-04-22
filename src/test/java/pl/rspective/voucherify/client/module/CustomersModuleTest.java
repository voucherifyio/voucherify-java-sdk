package pl.rspective.voucherify.client.module;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.model.Address;
import pl.rspective.voucherify.client.model.customer.Customer;

import java.util.concurrent.Executor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class CustomersModuleTest {

  @Mock
  private VoucherifyApi voucherifyApi;

  @Mock
  private Executor executor;

  @InjectMocks
  private CustomerModule customersModule;

  @Test
  public void shouldCreateCustomer() {
    Customer customer = Customer.builder()
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    given(voucherifyApi.createCustomer(customer)).willReturn(null);

    Customer result = customersModule.create(customer);

    assertThat(result).isEqualTo(null);
    verify(voucherifyApi).createCustomer(customer);
    verifyZeroInteractions(executor);
  }

  @Test
  public void shouldGetCustomer() {
    given(voucherifyApi.getCustomerById("some Id")).willReturn(null);

    Customer result = customersModule.get("some Id");

    assertThat(result).isEqualTo(null);
    verify(voucherifyApi).getCustomerById("some Id");
    verifyZeroInteractions(executor);
  }

  @Test
  public void shouldUpdateCustomer() {
    Customer customer = Customer.builder()
            .address(Address.builder().value("line_1", "line").build())
            .id("some Id")
            .email("email")
            .phone("phone")
            .description("description")
            .build();

    given(voucherifyApi.updateCustomer("some Id", customer)).willReturn(null);

    Customer result = customersModule.update(customer);

    assertThat(result).isEqualTo(null);
    verify(voucherifyApi).updateCustomer("some Id", customer);
    verifyZeroInteractions(executor);
  }
}
