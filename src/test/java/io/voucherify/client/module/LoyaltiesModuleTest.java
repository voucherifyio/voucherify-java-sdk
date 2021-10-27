package io.voucherify.client.module;

import io.voucherify.client.model.campaign.*;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignsResponse;
import io.voucherify.client.model.voucher.Voucher;
import io.voucherify.client.model.voucher.VoucherType;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoyaltiesModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreateLoyaltyCampaign() {
    // given
    CreateCampaign createCampaign =
        CreateCampaign.builder()
            .type(CampaignExtensionType.AUTO_UPDATE)
            .voucher(Voucher.builder().type(VoucherType.LOYALTY_CARD).build())
            .name("campaign")
            .build();

    enqueueResponse("{\"name\" : \"campaign\"}");

    // when
    CampaignResponse result = client.loyalties().create(createCampaign);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getName()).isEqualTo(createCampaign.getName());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/loyalties");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldDeleteLoyaltyCampaign() {
    // given
    DeleteCampaignParams params = DeleteCampaignParams.builder().force(true).build();
    enqueueEmptyResponse();

    // when
    client.loyalties().delete("campaignid", params);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/loyalties/campaignid?force=true");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldUpdateLoyaltyCampaign() {
    // given
    UpdateCampaign updateCampaign = UpdateCampaign.builder().type(CampaignExtensionType.AUTO_UPDATE).build();
    enqueueResponse("{\"campaign\": \"campaign-name\", \"type\": \"AUTO_UPDATE\"}");

    // when
    client.loyalties().update("campaignid", updateCampaign);

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/loyalties/campaignid");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldGetLoyaltyCampaign() {
    // given
    enqueueResponse("{\"name\" : \"campaign\", \"id\": \"campaignId\"}");

    // when
    CampaignResponse result = client.loyalties().get("campaignId");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getId()).isEqualTo("campaignId");
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/loyalties/campaignId");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldListLoyaltyCampaigns() {
    // given
    enqueueResponse("{\"campaigns\": [{\"name\" : \"campaign\"}]}");

    CampaignsFilter filter = CampaignsFilter.builder().limit(10).page(5).build();

    // when
    CampaignsResponse list = client.loyalties().list(filter);

    // then
    assertThat(list).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/v1/loyalties?limit=10&page=5");
    assertThat(request.getMethod()).isEqualTo("GET");
  }
}
