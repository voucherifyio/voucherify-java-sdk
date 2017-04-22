package pl.rspective.voucherify.client.module;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.model.customer.Customer;
import pl.rspective.voucherify.client.model.order.Order;
import pl.rspective.voucherify.client.model.order.OrderItem;
import pl.rspective.voucherify.client.model.redemption.RedeemVoucher;
import pl.rspective.voucherify.client.model.redemption.RedeemVoucherResult;
import pl.rspective.voucherify.client.model.redemption.RedemptionEntry;
import pl.rspective.voucherify.client.model.redemption.RedemptionStatus;
import pl.rspective.voucherify.client.model.redemption.RedemptionsFilter;
import pl.rspective.voucherify.client.model.redemption.RedemptionsList;
import pl.rspective.voucherify.client.model.redemption.RollbackRedemption;
import pl.rspective.voucherify.client.model.redemption.RollbackRedemptionResult;
import pl.rspective.voucherify.client.model.redemption.VoucherRedemptionsResult;

import java.util.concurrent.Executor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class RedemptionsModuleTest {

  @Mock
  private VoucherifyApi voucherifyApi;

  @Mock
  private Executor executor;

  @InjectMocks
  private RedemptionsModule RedemptionsModule;

  @Test
  public void shouldRedeemVoucher() {
    Customer customer = Customer.builder().email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    Order order = Order.builder()
            .item(OrderItem.builder().productId("productId").quantity(10).skuId("skuId").build())
            .item(OrderItem.builder().productId("productId2").quantity(20).skuId("skuId2").build())
            .amount(25000)
            .build();

    RedeemVoucher redeemVoucher = RedeemVoucher.builder()
            .customer(customer)
            .order(order)
            .build();

    given(voucherifyApi.redeem("some code", redeemVoucher)).willReturn(null);

    RedeemVoucherResult result = RedemptionsModule.redeem("some code", redeemVoucher);

    assertThat(result).isEqualTo(null);
    verify(voucherifyApi).redeem("some code", redeemVoucher);
    verifyZeroInteractions(executor);
  }

  @Test
  public void shouldGetRedemption() {
    given(voucherifyApi.getRedemption("some id")).willReturn(null);

    RedemptionEntry result = RedemptionsModule.get("some id");

    assertThat(result).isEqualTo(null);
    verify(voucherifyApi).getRedemption("some id");
    verifyZeroInteractions(executor);
  }

  @Test
  public void shouldListRedemptions() {
    RedemptionsFilter redemptionsFilter = RedemptionsFilter.builder()
            .customer("customer")
            .campaign("campaing")
            .limit(10)
            .page(5)
            .result(RedemptionStatus.SUCCESS)
            .build();

    given(voucherifyApi.listRedemptions(redemptionsFilter)).willReturn(null);

    RedemptionsList list = RedemptionsModule.list(redemptionsFilter);

    assertThat(list).isEqualTo(null);
    verify(voucherifyApi).listRedemptions(redemptionsFilter);
    verifyZeroInteractions(executor);
  }

  @Test
  public void shouldGetRedemptionsForVoucher() {
    given(voucherifyApi.getVoucherRedemptions("some code")).willReturn(null);

    VoucherRedemptionsResult result = RedemptionsModule.getForVoucher("some code");

    assertThat(result).isEqualTo(null);
    verify(voucherifyApi).getVoucherRedemptions("some code");
    verifyZeroInteractions(executor);
  }

  @Test
  public void shouldRollbackRedemption() {
    Customer customer = Customer.builder().email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    RollbackRedemption rollbackRedemption = RollbackRedemption.builder()
            .customer(customer)
            .build();

    given(voucherifyApi.rollbackRedemption("some code", "reason", rollbackRedemption)).willReturn(null);

    RollbackRedemptionResult result = RedemptionsModule.rollback("some code", "reason", rollbackRedemption);

    assertThat(result).isEqualTo(null);
    verify(voucherifyApi).rollbackRedemption("some code", "reason", rollbackRedemption);
    verifyZeroInteractions(executor);
  }

}
