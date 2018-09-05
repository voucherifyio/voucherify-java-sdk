package io.voucherify.client.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.voucherify.client.ApiVersion;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignsResponse;

import java.io.IOException;
import java.util.Arrays;

public class CampaignsResponseDeserializer extends JsonDeserializer<CampaignsResponse> {

  private ApiVersion apiVersion;

  public CampaignsResponseDeserializer(ApiVersion apiVersion) {
    this.apiVersion = apiVersion;
  }

  @Override
  public CampaignsResponse deserialize(JsonParser jp, DeserializationContext ctxt)
      throws IOException {
    if (apiVersion == null) {
      return getDefaultCampaignsResponse(jp);
    }

    switch (apiVersion) {
      case V_2017_04_05:
      case V_2017_04_20:
      case V_2018_08_01:
        ObjectMapper mapper = (ObjectMapper) jp.getCodec();
        ObjectNode root = mapper.readTree(jp);
        JsonNode object = root.get("object");
        JsonNode total = root.get("total");
        JsonNode dataRef = root.get("data_ref");
        JsonNode campaignsNode = root.get("campaigns");
        CampaignResponse[] campaigns = mapper.convertValue(campaignsNode, CampaignResponse[].class);

        return CampaignsResponse.of(
            object != null ? object.asText() : "",
            total != null ? total.asInt(0) : 0,
            dataRef != null ? dataRef.asText() : "",
            Arrays.asList(campaigns));
      default:
        return getDefaultCampaignsResponse(jp);
    }
  }

  private CampaignsResponse getDefaultCampaignsResponse(JsonParser jp) throws IOException {
    CampaignResponse[] array = jp.readValueAs(CampaignResponse[].class);
    return CampaignsResponse.of(Arrays.asList(array));
  }
}
