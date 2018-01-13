package io.voucherify.client.module;

import com.squareup.okhttp.mockwebserver.RecordedRequest;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.model.promotion.CreatePromotionCampaign;
import io.voucherify.client.model.promotion.Tier;
import io.voucherify.client.model.promotion.reponse.CreatePromotionCampaignResponse;
import io.voucherify.client.model.promotion.reponse.ListPromotionTiersResponse;
import io.voucherify.client.model.promotion.reponse.TierResponse;
import org.junit.Test;
import rx.Observable;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class PromotionsModuleTest extends AbstractModuleTest {

  @Test
  public void shouldCreatePromotionCampaign() {
    // given
    CreatePromotionCampaign createPromotionCampaign = CreatePromotionCampaign.builder()
        .name("some-name")
        .build();
    enqueueResponse("{\"id\" : \"some-id\", \"promotion\": {\"object\": \"list\"} }");

    // when
    CreatePromotionCampaignResponse result = client.promotions().create(createPromotionCampaign);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getPromotion()).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldListPromotionTiers() {
    // given
    enqueueResponse("{\"object\": \"list\", \"tiers\": []}");

    // when
    ListPromotionTiersResponse result = client.promotions().list("some-id");

    // then
    assertThat(result).isNotNull();
    assertThat(result.getTiers()).isEmpty();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/some-id/tiers");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldAddPromotionTierToCampaign() {
    // given
    Tier tier = Tier.builder().name("some-name").build();
    enqueueResponse("{\"object\": \"promotion_tier\", \"campaign\": {}, \"condition\": {}, \"action\": {}, \"metadata\": {}}");

    // when
    TierResponse result = client.promotions().addPromotionTier("some-id", tier);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCampaign()).isNotNull();
    assertThat(result.getAction()).isNotNull();
    assertThat(result.getMetadata()).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/some-id/tiers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldUpdatePromotionTier() {
    // given
    Tier tier = Tier.builder().name("some-name").build();
    enqueueResponse("{\"object\": \"promotion_tier\", \"campaign\": {}, \"condition\": {}, \"action\": {}, \"metadata\": {}}");

    // when
    TierResponse result = client.promotions().updatePromotionTier("some-id", tier);

    // then
    assertThat(result).isNotNull();
    assertThat(result.getCampaign()).isNotNull();
    assertThat(result.getAction()).isNotNull();
    assertThat(result.getMetadata()).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/tiers/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeletePromotionTier() {
    // given
    enqueueEmptyResponse();

    // when
    client.promotions().deletePromotionTier("some-id");

    // then
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/tiers/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreatePromotionCampaignAsync() {
    // given
    CreatePromotionCampaign createPromotionCampaign = CreatePromotionCampaign.builder()
        .name("some-name")
        .build();
    enqueueResponse("{\"id\" : \"some-id\", \"promotion\": {\"object\": \"list\"} }");
    VoucherifyCallback callback = createCallback();

    // when
    client.promotions().async().create(createPromotionCampaign, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldListPromotionTiersAsync() {
    // given
    enqueueResponse("{\"object\": \"list\", \"tiers\": []}");
    VoucherifyCallback callback = createCallback();

    // when
    client.promotions().async().list("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/some-id/tiers");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldAddPromotionTierToCampaignAsync() {
    // given
    Tier tier = Tier.builder().name("some-name").build();
    enqueueResponse("{\"object\": \"promotion_tier\", \"campaign\": {}, \"condition\": {}, \"action\": {}, \"metadata\": {}}");
    VoucherifyCallback callback = createCallback();

    // when
    client.promotions().async().addPromotionTier("some-id", tier, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/some-id/tiers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldUpdatePromotionTierAsync() {
    // given
    Tier tier = Tier.builder().name("some-name").build();
    enqueueResponse("{\"object\": \"promotion_tier\", \"campaign\": {}, \"condition\": {}, \"action\": {}, \"metadata\": {}}");
    VoucherifyCallback callback = createCallback();

    // when
    client.promotions().async().updatePromotionTier("some-id", tier, callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/tiers/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeletePromotionTierAsync() {
    // given
    enqueueEmptyResponse();
    VoucherifyCallback callback = createCallback();

    // when
    client.promotions().async().deletePromotionTier("some-id", callback);

    // then
    await().atMost(5, SECONDS).until(wasCallbackFired());
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/tiers/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }

  @Test
  public void shouldCreatePromotionCampaignRxJava() {
    // given
    CreatePromotionCampaign createPromotionCampaign = CreatePromotionCampaign.builder()
        .name("some-name")
        .build();
    enqueueResponse("{\"id\" : \"some-id\", \"promotion\": {\"object\": \"list\"} }");

    // when
    Observable<CreatePromotionCampaignResponse> observable = client.promotions().rx().create(createPromotionCampaign);

    // then
    CreatePromotionCampaignResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getPromotion()).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/campaigns");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldListPromotionTiersRxJava() {
    // given
    enqueueResponse("{\"object\": \"list\", \"tiers\": []}");

    // when
    Observable<ListPromotionTiersResponse> observable = client.promotions().rx().list("some-id");

    // then
    ListPromotionTiersResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getTiers()).isEmpty();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/some-id/tiers");
    assertThat(request.getMethod()).isEqualTo("GET");
  }

  @Test
  public void shouldAddPromotionTierToCampaignRxJava() {
    // given
    Tier tier = Tier.builder().name("some-name").build();
    enqueueResponse("{\"object\": \"promotion_tier\", \"campaign\": {}, \"condition\": {}, \"action\": {}, \"metadata\": {}}");

    // when
    Observable<TierResponse> observable = client.promotions().rx().addPromotionTier("some-id", tier);

    // then
    TierResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getCampaign()).isNotNull();
    assertThat(result.getAction()).isNotNull();
    assertThat(result.getMetadata()).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/some-id/tiers");
    assertThat(request.getMethod()).isEqualTo("POST");
  }

  @Test
  public void shouldUpdatePromotionTierRxJava() {
    // given
    Tier tier = Tier.builder().name("some-name").build();
    enqueueResponse("{\"object\": \"promotion_tier\", \"campaign\": {}, \"condition\": {}, \"action\": {}, \"metadata\": {}}");

    // when
    Observable<TierResponse> observable = client.promotions().rx().updatePromotionTier("some-id", tier);

    // then
    TierResponse result = observable.toBlocking().first();
    assertThat(result).isNotNull();
    assertThat(result.getCampaign()).isNotNull();
    assertThat(result.getAction()).isNotNull();
    assertThat(result.getMetadata()).isNotNull();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/tiers/some-id");
    assertThat(request.getMethod()).isEqualTo("PUT");
  }

  @Test
  public void shouldDeletePromotionTierRxJava() {
    // given
    enqueueEmptyResponse();

    // when
    Observable<Void> observable = client.promotions().rx().deletePromotionTier("some-id");

    // then
    observable.toBlocking().first();
    RecordedRequest request = getRequest();
    assertThat(request.getPath()).isEqualTo("/promotions/tiers/some-id");
    assertThat(request.getMethod()).isEqualTo("DELETE");
  }
}
