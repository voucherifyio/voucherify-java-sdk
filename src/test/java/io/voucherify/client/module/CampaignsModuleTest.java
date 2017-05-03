package io.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.campaign.AddVoucherToCampaign;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.DeleteCampaignParams;
import io.voucherify.client.model.campaign.response.AddVoucherToCampaignResponse;
import io.voucherify.client.model.campaign.response.CreateCampaignResponse;
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
    CreateCampaignResponse result = client.campaigns().create(createCampaign);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getName()).isEqualTo(createCampaign.getName());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldAddVoucherToCampaign() throws Exception {
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
  public void shouldAddVoucherWithCodeToCampaign() throws Exception {
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
  public void shouldDeleteCampaign() throws Exception {
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
  public void shouldAddVoucherToCampaignAsync() throws Exception {
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
  public void shouldAddVoucherWithCodeToCampaignAsync() throws Exception {
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
  public void shouldDeleteCampaignAsync() throws Exception {
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
  public void shouldCreateCampaignRxJava() {
    // given
    CreateCampaign createCampaign = CreateCampaign
            .builder()
            .name("name")
            .build();

    enqueueResponse("{\"name\" : \"name\"}");

    // when
    Observable<CreateCampaignResponse> observable = client.campaigns().rx().create(createCampaign);

    // then
    CreateCampaignResponse result = observable.toBlocking().first();
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
  public void shouldAddVoucherWithCodeToCampaignRxJava() throws Exception {
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
  public void shouldDeleteCampaignRxJava() throws Exception {
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
}
