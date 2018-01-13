package io.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.campaign.AddVoucherToCampaign;
import io.voucherify.client.model.campaign.CampaignImportVoucher;
import io.voucherify.client.model.campaign.CampaignImportVouchers;
import io.voucherify.client.model.campaign.CampaignType;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.DeleteCampaignParams;
import io.voucherify.client.model.campaign.UpdateCampaign;
import io.voucherify.client.model.campaign.response.AddVoucherToCampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import org.junit.Test;
import rx.Observable;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class CampaignsModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateCampaign() {
    // given
    CreateCampaign createCampaign = CreateCampaign
            .builder()
            .name("name")
            .build();

    enqueueResponse("{\"name\" : \"name\"}");

    // when
    CampaignResponse result = client.campaigns().create(createCampaign);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getName()).isEqualTo(createCampaign.getName());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddVoucherToCampaign() {
    // given
    AddVoucherToCampaign addVoucher = AddVoucherToCampaign
            .builder()
            .category("category")
            .build();

    enqueueResponse("{\"campaign\": \"campaign-name\"}");

    // when
    AddVoucherToCampaignResponse result = client.campaigns().addVoucher("campaign-name", addVoucher);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCampaign()).isEqualTo("campaign-name");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddVoucherWithCodeToCampaign() {
    // given
    AddVoucherToCampaign addVoucher = AddVoucherToCampaign
            .builder()
            .category("category")
            .build();

    enqueueResponse("{\"campaign\": \"campaign-name\", \"code\": \"some-code\"}");

    // when
    AddVoucherToCampaignResponse result = client.campaigns().addVoucherWithCode("campaign-name", "some-code", addVoucher);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCampaign()).isEqualTo("campaign-name");
    assertThat(result.getCode()).isEqualTo("some-code");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldDeleteCampaign() {
    // given
    DeleteCampaignParams params = DeleteCampaignParams.builder().force(true).build();
    enqueueEmptyResponse();

    // when
    client.campaigns().delete("campaign-name", params);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldImportVouchers() {
    // given
    CampaignImportVoucher voucher = CampaignImportVoucher.builder().active(true).code("some-code").build();
    CampaignImportVouchers campaignImportVouchers = CampaignImportVouchers.builder().voucher(voucher).build();
    enqueueEmptyResponse();

    // when
    client.campaigns().importVouchers("campaign-name", campaignImportVouchers);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldUpdateCampaign() {
    // given
    UpdateCampaign updateCampaign = UpdateCampaign.builder().type(CampaignType.AUTO_UPDATE).build();
    enqueueResponse("{\"campaign\": \"campaign-name\", \"type\": \"AUTO_UPDATE\"}");

    // when
    client.campaigns().update("campaign-name", updateCampaign);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldCreateCampaignAsync() {
    // given
    CreateCampaign createCampaign = CreateCampaign
            .builder()
            .name("name")
            .build();

    enqueueResponse("{\"name\" : \"name\"}");

    VoucherifyCallback callback = createCallback();

    // when
    client.campaigns().async().create(createCampaign, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddVoucherToCampaignAsync() {
    // given
    AddVoucherToCampaign addVoucher = AddVoucherToCampaign
            .builder()
            .category("category")
            .build();

    enqueueResponse("{\"campaign\": \"campaign-name\"}");

    VoucherifyCallback callback = createCallback();

    // when
    client.campaigns().async().addVoucher("campaign-name", addVoucher, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddVoucherWithCodeToCampaignAsync() {
    // given
    AddVoucherToCampaign addVoucher = AddVoucherToCampaign
            .builder()
            .category("category")
            .build();

    enqueueResponse("{\"campaign\": \"campaign-name\", \"code\": \"some-code\"}");

    VoucherifyCallback callback = createCallback();

    // when
    client.campaigns().async().addVoucherWithCode("campaign-name", "some-code", addVoucher, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldDeleteCampaignAsync() {
    // given
    DeleteCampaignParams params = DeleteCampaignParams.builder().force(true).build();
    enqueueEmptyResponse();
    VoucherifyCallback callback = createCallback();

    // when
    client.campaigns().async().delete("campaign-name", params, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldImportVouchersAsync() {
    // given
    CampaignImportVoucher voucher = CampaignImportVoucher.builder().active(true).code("some-code").build();
    CampaignImportVouchers campaignImportVouchers = CampaignImportVouchers.builder().voucher(voucher).build();
    VoucherifyCallback callback = createCallback();
    enqueueEmptyResponse();

    // when
    client.campaigns().async().importVouchers("campaign-name", campaignImportVouchers, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldUpdateCampaignAsync() {
    // given
    UpdateCampaign updateCampaign = UpdateCampaign.builder().type(CampaignType.AUTO_UPDATE).build();
    VoucherifyCallback callback = createCallback();
    enqueueResponse("{\"campaign\": \"campaign-name\", \"type\": \"AUTO_UPDATE\"}");

    // when
    client.campaigns().async().update("campaign-name", updateCampaign, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldCreateCampaignRxJava() {
    // given
    CreateCampaign createCampaign = CreateCampaign
            .builder()
            .name("name")
            .build();

    enqueueResponse("{\"name\" : \"name\"}");

    // when
    Observable<CampaignResponse> observable = client.campaigns().rx().create(createCampaign);

    // then
    CampaignResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddVoucherToCampaignRxJava() {
    // given
    AddVoucherToCampaign addVoucher = AddVoucherToCampaign
            .builder()
            .category("category")
            .build();

    enqueueResponse("{\"campaign\": \"campaign-name\"}");

    // when
    Observable<AddVoucherToCampaignResponse> observable = client.campaigns().rx().addVoucher("campaign-name", addVoucher);

    // then
    AddVoucherToCampaignResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/vouchers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddVoucherWithCodeToCampaignRxJava() {
    // given
    AddVoucherToCampaign addVoucher = AddVoucherToCampaign
            .builder()
            .category("category")
            .build();

    enqueueResponse("{\"campaign\": \"campaign-name\", \"code\": \"some-code\"}");

    // when
    Observable<AddVoucherToCampaignResponse> observable = client.campaigns().rx().addVoucherWithCode("campaign-name", "some-code", addVoucher);

    // then
    AddVoucherToCampaignResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/vouchers/some-code");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldDeleteCampaignRxJava() {
    // given
    DeleteCampaignParams params = DeleteCampaignParams.builder().force(true).build();
    enqueueEmptyResponse();

    // when
    Observable<Void> observable = client.campaigns().rx().delete("campaign-name", params);

    // then
    observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldImportVouchersRxJava() {
    // given
    CampaignImportVoucher voucher = CampaignImportVoucher.builder().active(true).code("some-code").build();
    CampaignImportVouchers campaignImportVouchers = CampaignImportVouchers.builder().voucher(voucher).build();
    enqueueEmptyResponse();

    // when
    Observable<Void> observable = client.campaigns().rx().importVouchers("campaign-name", campaignImportVouchers);

    // then
    observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name/import");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldUpdateCampaignRxJava() {
    // given
    UpdateCampaign updateCampaign = UpdateCampaign.builder().type(CampaignType.AUTO_UPDATE).build();
    VoucherifyCallback callback = createCallback();
    enqueueResponse("{\"campaign\": \"campaign-name\", \"type\": \"AUTO_UPDATE\"}");

    // when
    Observable<CampaignResponse> observable = client.campaigns().rx().update("campaign-name", updateCampaign);

    // then
    CampaignResponse result = observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(result).isNotNull();
    assertThat(request.getPath()).isEqualTo("/campaigns/campaign-name");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }
}
