package io.voucherify.client.module;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.reactivex.Observable;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.QualificationContext;
import io.voucherify.client.model.QualifiedResourceFilter;
import io.voucherify.client.model.common.SortingOrder;
import io.voucherify.client.model.customer.Customer;
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
import io.voucherify.client.model.voucher.response.ImportVouchersResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import io.voucherify.client.model.voucher.response.VouchersResponse;
import io.voucherify.client.utils.Irrelevant;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class VoucherModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateVoucher() {
    // given
    Voucher voucher =
        Voucher.builder()
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    CreateVoucher createVoucher = CreateVoucher.builder().voucher(voucher).build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().create(createVoucher);

    // then
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetVoucher() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().get("some-code");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCode()).isEqualTo(voucher.getCode());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchers() throws Exception {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(
        "{\"total\": 10, \"object\": \"list\", \"data_ref\": \"text\", \"vouchers\": ["
            + mapper.writeValueAsString(voucher)
            + "]}");

    VouchersFilter filter =
        VouchersFilter.builder()
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
    assertThat(request.getPath())
        .isEqualTo(
            "/v1/vouchers?limit=10&campaign=some-campaign&page=5&category=some-category&order=-updated_at");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersByCustomFilters() throws Exception {
    // given
    Map<String, Object> metadata = new HashMap<>();
    metadata.put("some-key", 123);

    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .metadata(metadata)
            .build();

    enqueueResponse("{\"vouchers\":[" + mapper.writeValueAsString(voucher) + "]}");

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
    assertThat(request.getPath())
        .isEqualTo(
            "/v1/vouchers?limit=10&campaign=some-campaign&%5Bfilters%5D%5Bmetadata.some-key%5D%5Bconditions%5D%5B%24is%5D=123&page=5&category=some-category&%5Bfilters%5D%5Bactive%5D%5Bconditions%5D%5B%24active%5D=true");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateVoucher() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(false)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherUpdate update = VoucherUpdate.builder().active(false).category("some-category").build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().update("some-code", update);

    // then
    assertThat(result.getCategory()).isEqualTo("some-category");
    assertThat(result.getActive()).isEqualTo(false);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDisableVoucher() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(false)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().disable("some-code");

    // then
    assertThat(result.getActive()).isEqualTo(false);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/disable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldEnableVoucher() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    VoucherResponse result = client.vouchers().enable("some-code");

    // then
    assertThat(result.getActive()).isEqualTo(true);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/enable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddBalance() {
    // given
    AddBalance addBalance = AddBalance.builder().amount(1000L).build();
    enqueueResponse("{\"amount\": 1000, \"object\": \"voucher\", \"type\": \"GIFT_VOUCHER\"}");

    // when
    AddBalanceResponse response = client.vouchers().addBalance("some-code", addBalance);

    // then
    assertThat(response).isNotNull();
    assertThat(response.getAmount()).isEqualTo(1000);
    assertThat(response.getObject()).isEqualTo("voucher");
    assertThat(response.getType()).isEqualTo(VoucherType.GIFT_VOUCHER);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/balance");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldImportVouchers() {
    // given
    Voucher voucher =
        Voucher.builder()
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    ImportVouchers importVouchers = ImportVouchers.builder().voucher(voucher).build();

    enqueueResponse("{\"async_action_id\": \"aa_123\"}");

    // when
    ImportVouchersResponse response = client.vouchers().importVouchers(importVouchers);

    // then
    assertThat(response).isNotNull();
    assertThat(response.getAsyncActionId()).isNotBlank();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetQualifiedCampaigns() throws Exception {
    // given
    QualificationContext context =
        QualificationContext.builder().customer(Customer.builder().id("some_id").build()).build();
    QualifiedResourceFilter filter =
        QualifiedResourceFilter.builder().audienceRulesOnly(true).limit(10).build();

    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(
        "{\"data\": [" + mapper.writeValueAsString(voucher) + "], \"id\": \"1234566\"}");

    // when
    client.vouchers().getQualified(context, filter);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath())
        .isEqualTo("/v1/vouchers/qualification?audienceRulesOnly=true&limit=10");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldCreateVoucherAsync() {
    // given
    Voucher voucher =
        Voucher.builder()
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
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
    assertThat(request.getPath()).isEqualTo("/v1/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetVoucherAsync() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    VoucherifyCallback callback = createCallback();

    // when
    client.vouchers().async().get("some-code", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersAsync() throws Exception {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(
        "{\"total\": 10, \"object\": \"list\", \"data_ref\": \"text\", \"vouchers\": ["
            + mapper.writeValueAsString(voucher)
            + "]}");

    VoucherifyCallback callback = createCallback();

    VouchersFilter filter =
        VouchersFilter.builder()
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
    assertThat(request.getPath())
        .isEqualTo("/v1/vouchers?limit=10&campaign=some-campaign&page=5&category=some-category");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersByCustomFiltersAsync() throws JsonProcessingException {

    // given
    Map<String, Object> metadata = new HashMap<>();
    metadata.put("some-key", 123);

    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .metadata(metadata)
            .build();

    enqueueResponse("{ \"vouchers\": [" + mapper.writeValueAsString(voucher) + "]}");

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
    assertThat(request.getPath())
        .isEqualTo(
            "/v1/vouchers?limit=10&campaign=some-campaign&%5Bfilters%5D%5Bmetadata.some-key%5D%5Bconditions%5D%5B%24is%5D=123&page=5&category=some-category&%5Bfilters%5D%5Bactive%5D%5Bconditions%5D%5B%24active%5D=true");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateVoucherAsync() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(false)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherUpdate update = VoucherUpdate.builder().active(false).category("some-category").build();

    VoucherifyCallback callback = createCallback();

    enqueueResponse(voucher);

    // when
    client.vouchers().async().update("some-code", update, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDisableVoucherAsync() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(false)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherifyCallback callback = createCallback();

    enqueueResponse(voucher);

    // when
    client.vouchers().async().disable("some-code", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/disable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldEnableVoucherAsync() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherifyCallback callback = createCallback();

    enqueueResponse(voucher);

    // when
    client.vouchers().async().enable("some-code", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/enable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddBalanceAsync() {
    // given
    AddBalance addBalance = AddBalance.builder().amount(1000L).build();
    enqueueResponse("{\"amount\": 1000, \"object\": \"voucher\", \"type\": \"GIFT_VOUCHER\"}");
    VoucherifyCallback callback = createCallback();

    // when
    client.vouchers().async().addBalance("some-code", addBalance, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/balance");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldImportVouchersAsync() {
    // given
    Voucher voucher =
        Voucher.builder()
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    ImportVouchers importVouchers = ImportVouchers.builder().voucher(voucher).build();

    VoucherifyCallback callback = createCallback();

    enqueueResponse("{\"async_action_id\": \"aa_123\"}");

    // when
    client.vouchers().async().importVouchers(importVouchers, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldCreateVoucherRxJava() {
    // given
    Voucher voucher =
        Voucher.builder()
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    CreateVoucher createVoucher = CreateVoucher.builder().voucher(voucher).build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().create(createVoucher);

    // then
    VoucherResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldGetVoucherRxJava() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().get("some-code");

    // then
    VoucherResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    assertThat(result.getCode()).isEqualTo(voucher.getCode());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersRxJava() throws Exception {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(
        "{\"total\": 10, \"object\": \"list\", \"data_ref\": \"text\", \"vouchers\": ["
            + mapper.writeValueAsString(voucher)
            + "]}");

    VouchersFilter filter =
        VouchersFilter.builder()
            .limit(10)
            .page(5)
            .campaign("some-campaign")
            .category("some-category")
            .build();

    // when
    Observable<VouchersResponse> observable = client.vouchers().rx().list(filter);

    // then
    VouchersResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath())
        .isEqualTo("/v1/vouchers?limit=10&campaign=some-campaign&page=5&category=some-category");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListVouchersByCustomFiltersRxJava() throws Exception {
    // given
    Map<String, Object> metadata = new HashMap<>();
    metadata.put("some-key", 123);

    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .metadata(metadata)
            .build();

    enqueueResponse("{\"vouchers\":[" + mapper.writeValueAsString(voucher) + "]}");

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
    VouchersResponse result = observable.blockingFirst();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();

    assertThat(request.getPath())
        .isEqualTo(
            "/v1/vouchers?limit=10&campaign=some-campaign&%5Bfilters%5D%5Bmetadata.some-key%5D%5Bconditions%5D%5B%24is%5D=123&page=5&category=some-category&%5Bfilters%5D%5Bactive%5D%5Bconditions%5D%5B%24active%5D=true");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldUpdateVoucherRxJava() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(false)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    VoucherUpdate update = VoucherUpdate.builder().active(false).category("some-category").build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().update("some-code", update);

    // then
    VoucherResponse result = observable.blockingFirst();
    assertThat(result.getCategory()).isEqualTo("some-category");
    assertThat(result.getActive()).isEqualTo(false);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDisableVoucherRxJava() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(false)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().disable("some-code");

    // then
    VoucherResponse result = observable.blockingFirst();
    assertThat(result.getActive()).isEqualTo(false);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/disable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldEnableVoucherRxJava() {
    // given
    Voucher voucher =
        Voucher.builder()
            .code("some-code")
            .active(true)
            .category("some-category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    enqueueResponse(voucher);

    // when
    Observable<VoucherResponse> observable = client.vouchers().rx().enable("some-code");

    // then
    VoucherResponse result = observable.blockingFirst();
    assertThat(result.getActive()).isEqualTo(true);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/enable");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddBalanceRxJava() {
    // given
    AddBalance addBalance = AddBalance.builder().amount(1000L).build();
    enqueueResponse("{\"amount\": 1000, \"object\": \"voucher\", \"type\": \"GIFT_VOUCHER\"}");

    // when
    Observable<AddBalanceResponse> observable =
        client.vouchers().rx().addBalance("some-code", addBalance);

    // then
    AddBalanceResponse response = observable.blockingFirst();
    assertThat(response).isNotNull();
    assertThat(response.getAmount()).isEqualTo(1000);
    assertThat(response.getObject()).isEqualTo("voucher");
    assertThat(response.getType()).isEqualTo(VoucherType.GIFT_VOUCHER);
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/some-code/balance");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldImportVouchersRxJava() {
    // given
    Voucher voucher =
        Voucher.builder()
            .active(true)
            .category("category")
            .campaign("my-campaign")
            .isReferralCode(false)
            .discount(Discount.unitOff(10.0))
            .build();

    ImportVouchers importVouchers = ImportVouchers.builder().voucher(voucher).build();

    enqueueResponse("{\"async_action_id\": \"aa_123\"}");

    // when
    Observable<ImportVouchersResponse> observable = client.vouchers().rx().importVouchers(importVouchers);

    // then
    ImportVouchersResponse response = observable.blockingFirst();
    assertThat(response).isNotNull();
    assertThat(response.getAsyncActionId()).isNotBlank();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/vouchers/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }
}
