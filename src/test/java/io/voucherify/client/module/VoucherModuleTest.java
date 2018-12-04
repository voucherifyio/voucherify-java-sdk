package io.voucherify.client.module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.squareup.okhttp.mockwebserver.RecordedRequest;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.common.SortingOrder;
import io.voucherify.client.model.voucher.AddBalance;
import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.ImportVouchers;
import io.voucherify.client.model.voucher.Voucher;
import io.voucherify.client.model.voucher.VoucherOrder;
import io.voucherify.client.model.voucher.VoucherType;
import io.voucherify.client.model.voucher.VoucherUpdate;
import io.voucherify.client.model.voucher.VouchersFilter;
import io.voucherify.client.model.voucher.response.AddBalanceResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import io.voucherify.client.model.voucher.response.VouchersResponse;
import org.junit.Test;
import rx.Observable;

import java.util.HashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class VoucherModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateVoucher() {
    // given
    Voucher voucher = Voucher.builder().active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    CreateVoucher createVoucher = CreateVoucher.builder().voucher(voucher).build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().create(createVoucher);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetVoucher() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().get("some-code");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCode()).isEqualTo(voucher.getCode());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchers() throws Exception {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse("[" + mapper.writeValueAsString(voucher) + "]");

    VouchersFilter filter = VouchersFilter.builder()
            .limit(10)
            .page(5)
            .order(VoucherOrder.builder().order(SortingOrder.DESC).fieldName("updated_at").build())
            .campaign("some-campaign")
            .category("some-category")
            .build();

    // when
    VouchersResponse list = client.vouchers().list(filter);

    // then
    assertThat(list).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers?limit=10&campaign=some-campaign&page=5&category=some-category&order=-updated_at");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersByCustomFilters() throws Exception {
    // given
    Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("some-key", 123);

    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .metadata(metadata)
            .build();

    enqueueResponse("[" + mapper.writeValueAsString(voucher) + "]");

    VouchersFilter filter =
        VouchersFilter.builder()
            .limit(10)
            .page(5)
            .campaign("some-campaign")
            .category("some-category")
            .filter(
                VouchersFilter.Filter.builder()
                    .fieldName("active")
                    .condition("$active")
                    .value(true)
                    .build())
            .filter(
                VouchersFilter.Filter.builder()
                    .fieldName("metadata.some-key")
                    .condition("$is")
                    .value(123)
                    .build())
            .build();

    // when
    VouchersResponse list = client.vouchers().list(filter);

    // then
    assertThat(list).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers?limit=10&campaign=some-campaign&[filters][metadata.some-key][conditions][$is]=123&page=5&category=some-category&[filters][active][conditions][$active]=true");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateVoucher() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(false).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherUpdate update = VoucherUpdate.builder()
            .active(false)
            .category("some-category")
            .build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().update("some-code", update);

    // then
    assertThat(result.getCategory()).isEqualTo("some-category");
    assertThat(result.getActive()).isEqualTo(false);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDisableVoucher() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(false).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().disable("some-code");

    // then
    assertThat(result.getActive()).isEqualTo(false);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/disable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldEnableVoucher() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().enable("some-code");

    // then
    assertThat(result.getActive()).isEqualTo(true);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/enable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddBalance() {
    // given
    AddBalance addBalance = AddBalance.builder().amount(1000).build();
    enqueueResponse("{\"amount\": 1000, \"object\": \"voucher\", \"type\": \"GIFT_VOUCHER\"}");

    // when
    AddBalanceResponse response = client.vouchers().addBalance("some-code", addBalance);

    // then
    assertThat(response).isNotNull();
    assertThat(response.getAmount()).isEqualTo(1000);
    assertThat(response.getObject()).isEqualTo("voucher");
    assertThat(response.getType()).isEqualTo(VoucherType.GIFT_VOUCHER);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/balance");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldImportVouchers() {
    // given
    Voucher voucher = Voucher.builder().active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    ImportVouchers importVouchers = ImportVouchers.builder().voucher(voucher).build();

    enqueueEmptyResponse();

    // when
    client.vouchers().importVouchers(importVouchers);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldCreateVoucherAsync() {
    // given
    Voucher voucher = Voucher.builder().active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    CreateVoucher createVoucher = CreateVoucher.builder().voucher(voucher).build();

    enqueueResponse(voucher);

    VoucherifyCallback callback = createCallback();

    // when
    client.vouchers().async().create(createVoucher, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetVoucherAsync() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    VoucherifyCallback callback = createCallback();

    // when
    client.vouchers().async().get("some-code", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersAsync() throws Exception {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse("[" + mapper.writeValueAsString(voucher) + "]");

    VoucherifyCallback callback = createCallback();

    VouchersFilter filter = VouchersFilter.builder()
            .limit(10)
            .page(5)
            .campaign("some-campaign")
            .category("some-category")
            .build();

    // when
    client.vouchers().async().list(filter, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers?limit=10&campaign=some-campaign&page=5&category=some-category");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersByCustomFiltersAsync() throws JsonProcessingException {

    // given
    Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("some-key", 123);

    Voucher voucher = Voucher.builder()
        .code("some-code")
        .active(true).category("category")
        .campaign("my-campaign").isReferralCode(false)
        .discount(Discount.unitOff(10.0))
        .metadata(metadata)
        .build();

    enqueueResponse("[" + mapper.writeValueAsString(voucher) + "]");

    VoucherifyCallback callback = createCallback();

    VouchersFilter filter =
        VouchersFilter.builder()
            .limit(10)
            .page(5)
            .campaign("some-campaign")
            .category("some-category")
            .filter(
                VouchersFilter.Filter.builder()
                    .fieldName("active")
                    .condition("$active")
                    .value(true)
                    .build())
            .filter(
                VouchersFilter.Filter.builder()
                    .fieldName("metadata.some-key")
                    .condition("$is")
                    .value(123)
                    .build())
            .build();

    // when
    client.vouchers().async().list(filter, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers?limit=10&campaign=some-campaign&[filters][metadata.some-key][conditions][$is]=123&page=5&category=some-category&[filters][active][conditions][$active]=true");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateVoucherAsync() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(false).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherUpdate update = VoucherUpdate.builder()
            .active(false)
            .category("some-category")
            .build();

    VoucherifyCallback callback = createCallback();

    enqueueResponse(voucher);

    // when
    client.vouchers().async().update("some-code", update, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDisableVoucherAsync() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(false).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherifyCallback callback = createCallback();

    enqueueResponse(voucher);

    // when
    client.vouchers().async().disable("some-code", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/disable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldEnableVoucherAsync() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherifyCallback callback = createCallback();

    enqueueResponse(voucher);

    // when
    client.vouchers().async().enable("some-code", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/enable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddBalanceAsync() {
    // given
    AddBalance addBalance = AddBalance.builder().amount(1000).build();
    enqueueResponse("{\"amount\": 1000, \"object\": \"voucher\", \"type\": \"GIFT_VOUCHER\"}");
    VoucherifyCallback callback = createCallback();

    // when
    client.vouchers().async().addBalance("some-code", addBalance, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/balance");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldImportVouchersAsync() {
    // given
    Voucher voucher = Voucher.builder().active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    ImportVouchers importVouchers = ImportVouchers.builder().voucher(voucher).build();

    VoucherifyCallback callback = createCallback();

    enqueueEmptyResponse();

    // when
    client.vouchers().async().importVouchers(importVouchers, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldCreateVoucherRxJava() {
    // given
    Voucher voucher = Voucher.builder().active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    CreateVoucher createVoucher = CreateVoucher.builder().voucher(voucher).build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().create(createVoucher);

    // then
    VoucherResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetVoucherRxJava() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().get("some-code");

    // then
    VoucherResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getCode()).isEqualTo(voucher.getCode());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersRxJava() throws Exception {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse("[" + mapper.writeValueAsString(voucher) + "]");

    VouchersFilter filter = VouchersFilter.builder()
            .limit(10)
            .page(5)
            .campaign("some-campaign")
            .category("some-category")
            .build();

    // when
    Observable<VouchersResponse> observable = client.vouchers().rx().list(filter);

    // then
    VouchersResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers?limit=10&campaign=some-campaign&page=5&category=some-category");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersByCustomFiltersRxJava() throws Exception {
    // given
    Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("some-key", 123);

    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .metadata(metadata)
            .build();

    enqueueResponse("[" + mapper.writeValueAsString(voucher) + "]");

    VouchersFilter filter =
        VouchersFilter.builder()
            .limit(10)
            .page(5)
            .campaign("some-campaign")
            .category("some-category")
            .filter(
                VouchersFilter.Filter.builder()
                    .fieldName("active")
                    .condition("$active")
                    .value(true)
                    .build())
            .filter(
                VouchersFilter.Filter.builder()
                    .fieldName("metadata.some-key")
                    .condition("$is")
                    .value(123)
                    .build())
            .build();

    // when
    Observable<VouchersResponse> observable = client.vouchers().rx().list(filter);

    // then
    VouchersResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers?limit=10&campaign=some-campaign&[filters][metadata.some-key][conditions][$is]=123&page=5&category=some-category&[filters][active][conditions][$active]=true");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateVoucherRxJava() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(false).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherUpdate update = VoucherUpdate.builder()
            .active(false)
            .category("some-category")
            .build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().update("some-code", update);

    // then
    VoucherResponse result = observable.toBlocking().first();
    assertThat(result.getCategory()).isEqualTo("some-category");
    assertThat(result.getActive()).isEqualTo(false);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDisableVoucherRxJava() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(false).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().disable("some-code");

    // then
    VoucherResponse result = observable.toBlocking().first();
    assertThat(result.getActive()).isEqualTo(false);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/disable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldEnableVoucherRxJava() {
    // given
    Voucher voucher = Voucher.builder()
            .code("some-code")
            .active(true).category("some-category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().enable("some-code");

    // then
    VoucherResponse result = observable.toBlocking().first();
    assertThat(result.getActive()).isEqualTo(true);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/enable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddBalanceRxJava() {
    // given
    AddBalance addBalance = AddBalance.builder().amount(1000).build();
    enqueueResponse("{\"amount\": 1000, \"object\": \"voucher\", \"type\": \"GIFT_VOUCHER\"}");

    // when
    Observable<AddBalanceResponse> observable = client.vouchers().rx().addBalance("some-code", addBalance);

    // then
    AddBalanceResponse response = observable.toBlocking().first();
    assertThat(response).isNotNull();
    assertThat(response.getAmount()).isEqualTo(1000);
    assertThat(response.getObject()).isEqualTo("voucher");
    assertThat(response.getType()).isEqualTo(VoucherType.GIFT_VOUCHER);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/some-code/balance");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldImportVouchersRxJava() {
    // given
    Voucher voucher = Voucher.builder().active(true).category("category")
            .campaign("my-campaign").isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    ImportVouchers importVouchers = ImportVouchers.builder().voucher(voucher).build();

    enqueueEmptyResponse();

    // when
    Observable<Void> observable = client.vouchers().rx().importVouchers(importVouchers);

    // then
    observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/vouchers/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }
}
