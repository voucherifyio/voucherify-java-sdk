package pl.rspective.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import org.junit.Test;
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

import static org.assertj.core.api.Assertions.assertThat;

public class RedemptionsModuleTest extends AbstractModuleTest {

  @Test
  public void shouldRedeemVoucher() throws Exception {
    // given
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

    enqueueRequest(redeemVoucher);

    // when
    RedeemVoucherResult result = client.redemptions().redeem("some code", redeemVoucher);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some%20code/redemption");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetRedemption() throws Exception {
    // given
    enqueueRequest("{}");

    //when
    RedemptionEntry result = client.redemptions().get("some id");

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/redemption/some%20id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListRedemptions() throws Exception {
    RedemptionsFilter redemptionsFilter = RedemptionsFilter.builder()
            .customer("customer")
            .campaign("campaign")
            .limit(10)
            .page(5)
            .result(RedemptionStatus.SUCCESS)
            .build();

    enqueueRequest("{}");

    // when
    RedemptionsList list = client.redemptions().list(redemptionsFilter);

    // then
    assertThat(list).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/redemptions?result=SUCCESS&limit=10&campaign=campaign&page=5&customer=customer");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldGetRedemptionsForVoucher() throws Exception {
    // given
    enqueueRequest("{}");

    // when
    VoucherRedemptionsResult result = client.redemptions().getForVoucher("some code");

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some%20code/redemption");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldRollbackRedemption() throws Exception {
    // given
    Customer customer = Customer.builder().email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    RollbackRedemption rollbackRedemption = RollbackRedemption.builder()
            .customer(customer)
            .build();

    enqueueRequest("{}");

    // when
    RollbackRedemptionResult result = client.redemptions().rollback("some code", "reason", rollbackRedemption);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/redemption/some%20code/rollback?reason=reason");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

}
