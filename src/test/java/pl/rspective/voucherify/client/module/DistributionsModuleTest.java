package pl.rspective.voucherify.client.module;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import java.util.HashMap;
import java.util.concurrent.Executor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.model.Customer;
import pl.rspective.voucherify.client.model.PublishParams;
import pl.rspective.voucherify.client.model.Voucher;

@RunWith(MockitoJUnitRunner.class)
public class DistributionsModuleTest {

  @Mock
  private VoucherifyApi voucherifyApi;

  @Mock
  private Executor executor;

  @InjectMocks
  private DistributionsModule distributionsModule;

  private static final PublishParams PUBLISH_PARAMS = PublishParams
      .voucher("voucher", new Customer.Builder().build(), "channel", new HashMap<String, Object>());
  private static final Voucher EXPECTED = new Voucher.Builder().build();

  @Test
  public void shouldPublishVoucher() {
    given(voucherifyApi.publishVoucher(PUBLISH_PARAMS)).willReturn(EXPECTED);

    Voucher result = distributionsModule.publish(PUBLISH_PARAMS);

    assertThat(result).isEqualTo(EXPECTED);
    verify(voucherifyApi).publishVoucher(PUBLISH_PARAMS);
    verifyZeroInteractions(executor);
  }

  @Test
  public void shouldPublishVoucherUsingRxJava() {
    given(voucherifyApi.publishVoucher(PUBLISH_PARAMS)).willReturn(EXPECTED);

    Voucher result = distributionsModule.rx().publish(PUBLISH_PARAMS).toBlocking().first();

    assertThat(result).isEqualTo(EXPECTED);
    verify(voucherifyApi).publishVoucher(PUBLISH_PARAMS);
    verifyZeroInteractions(executor);
  }

}
