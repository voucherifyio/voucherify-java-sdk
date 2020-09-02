package io.voucherify.client.module;

import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.Order;
import io.voucherify.client.model.order.OrderItem;
import io.voucherify.client.model.redemption.RedeemPromotion;
import io.voucherify.client.model.redemption.RedeemVoucher;
import io.voucherify.client.model.redemption.RedemptionStatus;
import io.voucherify.client.model.redemption.RedemptionsFilter;
import io.voucherify.client.model.redemption.RollbackRedemption;
import io.voucherify.client.model.redemption.response.RedeemPromotionResponse;
import io.voucherify.client.model.redemption.response.RedeemVoucherResponse;
import io.voucherify.client.model.redemption.response.RedemptionEntryResponse;
import io.voucherify.client.model.redemption.response.RedemptionsResponse;
import io.voucherify.client.model.redemption.response.RollbackRedemptionResponse;
import io.voucherify.client.model.redemption.response.VoucherRedemptionsResponse;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class RedemptionsModuleTest extends AbstractModuleTest {

  @Test
  public void shouldRedeemVoucher() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    Order order =
        Order.builder()
            .item(OrderItem.builder().productId("productId").quantity(10).skuId("skuId").build())
            .item(OrderItem.builder().productId("productId2").quantity(20).skuId("skuId2").build())
            .amount(25000L)
            .build();

    RedeemVoucher redeemVoucher = RedeemVoucher.builder().customer(customer).order(order).build();

    enqueueResponse(redeemVoucher);

    // when
    RedeemVoucherResponse result = client.redemptions().redeem("some code", redeemVoucher);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some%20code/redemption");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldRedeemPromotion() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    Order order =
        Order.builder()
            .item(OrderItem.builder().productId("productId").quantity(10).skuId("skuId").build())
            .item(OrderItem.builder().productId("productId2").quantity(20).skuId("skuId2").build())
            .amount(25000L)
            .build();

    RedeemPromotion redeemPromotion =
        RedeemPromotion.builder().customer(customer).order(order).build();

    enqueueResponse("{\"object\" : \"redemption\", \"order\": {}, \"promotion_tier\": {} }");

    // when
    RedeemPromotionResponse result = client.redemptions().redeem("id", redeemPromotion);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getTier()).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/promotions/tiers/id/redemption");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetRedemption() {
    // given
    enqueueResponse("{}");

    // when
    RedemptionEntryResponse result = client.redemptions().get("some id");

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/redemptions/some%20id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListRedemptions() {
    RedemptionsFilter redemptionsFilter =
        RedemptionsFilter.builder()
            .customer("customer")
            .campaign("campaign")
            .limit(10)
            .page(5)
            .result(RedemptionStatus.SUCCESS)
            .build();

    enqueueResponse("{}");

    // when
    RedemptionsResponse list = client.redemptions().list(redemptionsFilter);

    // then
    assertThat(list).isNotNull();
    RecordedRequest request = getRequest();

    assertThat(request.getPath())
        .isEqualTo(
            "/v1/redemptions?result=SUCCESS&limit=10&campaign=campaign&page=5&customer=customer");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldGetRedemptionsForVoucher() {
    // given
    enqueueResponse("{}");

    // when
    VoucherRedemptionsResponse result = client.redemptions().getForVoucher("some code");

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some%20code/redemption");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldRollbackRedemption() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    RollbackRedemption rollbackRedemption = RollbackRedemption.builder().customer(customer).build();

    enqueueResponse("{}");

    // when
    RollbackRedemptionResponse result =
        client.redemptions().rollback("some code", "reason", rollbackRedemption);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/redemptions/some%20code/rollback?reason=reason");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldRedeemVoucherAsync() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    Order order =
        Order.builder()
            .item(OrderItem.builder().productId("productId").quantity(10).skuId("skuId").build())
            .item(OrderItem.builder().productId("productId2").quantity(20).skuId("skuId2").build())
            .amount(25000L)
            .build();

    RedeemVoucher redeemVoucher = RedeemVoucher.builder().customer(customer).order(order).build();

    enqueueResponse(redeemVoucher);

    VoucherifyCallback callback = createCallback();

    // when
    client.redemptions().async().redeem("some code", redeemVoucher, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some%20code/redemption");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldRedeemPromotionAsync() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    Order order =
        Order.builder()
            .item(OrderItem.builder().productId("productId").quantity(10).skuId("skuId").build())
            .item(OrderItem.builder().productId("productId2").quantity(20).skuId("skuId2").build())
            .amount(25000L)
            .build();

    RedeemPromotion redeemPromotion =
        RedeemPromotion.builder().customer(customer).order(order).build();

    enqueueResponse("{\"object\" : \"redemption\", \"order\": {}, \"promotion_tier\": {} }");

    VoucherifyCallback callback = createCallback();

    // when
    client.redemptions().async().redeem("id", redeemPromotion, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/promotions/tiers/id/redemption");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetRedemptionAsync() {
    // given
    enqueueResponse("{}");
    VoucherifyCallback callback = createCallback();

    // when
    client.redemptions().async().get("some id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/redemptions/some%20id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListRedemptionsAsync() {
    RedemptionsFilter redemptionsFilter =
        RedemptionsFilter.builder()
            .customer("customer")
            .campaign("campaign")
            .limit(10)
            .page(5)
            .result(RedemptionStatus.SUCCESS)
            .build();

    enqueueResponse("{}");

    VoucherifyCallback callback = createCallback();

    // when
    client.redemptions().async().list(redemptionsFilter, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath())
        .isEqualTo(
            "/v1/redemptions?result=SUCCESS&limit=10&campaign=campaign&page=5&customer=customer");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldGetRedemptionsForVoucherAsync() {
    // given
    enqueueResponse("{}");
    VoucherifyCallback callback = createCallback();

    // when
    client.redemptions().async().getForVoucher("some code", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some%20code/redemption");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldRollbackRedemptionAsync() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    RollbackRedemption rollbackRedemption = RollbackRedemption.builder().customer(customer).build();

    enqueueResponse("{}");

    VoucherifyCallback callback = createCallback();

    // when
    client.redemptions().async().rollback("some code", "reason", rollbackRedemption, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/redemptions/some%20code/rollback?reason=reason");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldRedeemVoucherRxJava() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    Order order =
        Order.builder()
            .item(OrderItem.builder().productId("productId").quantity(10).skuId("skuId").build())
            .item(OrderItem.builder().productId("productId2").quantity(20).skuId("skuId2").build())
            .amount(25000L)
            .build();

    RedeemVoucher redeemVoucher = RedeemVoucher.builder().customer(customer).order(order).build();

    enqueueResponse(redeemVoucher);

    // when
    Observable<RedeemVoucherResponse> observable =
        client.redemptions().rx().redeem("some code", redeemVoucher);

    // then
    RedeemVoucherResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some%20code/redemption");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldRedeemPromotionRxJava() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    Order order =
        Order.builder()
            .item(OrderItem.builder().productId("productId").quantity(10).skuId("skuId").build())
            .item(OrderItem.builder().productId("productId2").quantity(20).skuId("skuId2").build())
            .amount(25000L)
            .build();

    RedeemPromotion redeemPromotion =
        RedeemPromotion.builder().customer(customer).order(order).build();

    enqueueResponse("{\"object\" : \"redemption\", \"order\": {}, \"promotion_tier\": {} }");

    // when
    Observable<RedeemPromotionResponse> observable =
        client.redemptions().rx().redeem("id", redeemPromotion);

    // then
    RedeemPromotionResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getTier()).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/promotions/tiers/id/redemption");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetRedemptionRxJava() {
    // given
    enqueueResponse("{}");

    // when
    Observable<RedemptionEntryResponse> observable = client.redemptions().rx().get("some id");

    // then
    RedemptionEntryResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/redemptions/some%20id");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListRedemptionsRxJava() {
    RedemptionsFilter redemptionsFilter =
        RedemptionsFilter.builder()
            .customer("customer")
            .campaign("campaign")
            .limit(10)
            .page(5)
            .result(RedemptionStatus.SUCCESS)
            .build();

    enqueueResponse("{}");

    // when
    Observable<RedemptionsResponse> observable = client.redemptions().rx().list(redemptionsFilter);

    // then
    RedemptionsResponse list = observable.blockingFirst();
    assertThat(list).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath())
        .isEqualTo(
            "/v1/redemptions?result=SUCCESS&limit=10&campaign=campaign&page=5&customer=customer");
    // assertThat(request.getPath())
    //     .isEqualTo(
    //         "/redemptions?result=SUCCESS&limit=10&campaign=campaign&page=5&customer=customer");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldGetRedemptionsForVoucherRxJava() {
    // given
    enqueueResponse("{}");

    // when
    Observable<VoucherRedemptionsResponse> observable =
        client.redemptions().rx().getForVoucher("some code");

    // then
    VoucherRedemptionsResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some%20code/redemption");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldRollbackRedemptionRxJava() {
    // given
    Customer customer =
        Customer.builder()
            .email("some email")
            .description("some description")
            .metadataEntry("locale", "en-GB")
            .build();

    RollbackRedemption rollbackRedemption = RollbackRedemption.builder().customer(customer).build();

    enqueueResponse("{}");

    // when
    Observable<RollbackRedemptionResponse> observable =
        client.redemptions().rx().rollback("some code", "reason", rollbackRedemption);

    // then
    RollbackRedemptionResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/redemptions/some%20code/rollback?reason=reason");
    assertThat(request.getMethod()).isEqualTo("POST");
  }
}
