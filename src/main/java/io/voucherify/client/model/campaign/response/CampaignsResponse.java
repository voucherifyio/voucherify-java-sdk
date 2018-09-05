package io.voucherify.client.model.campaign.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class CampaignsResponse {

  private String object;

  private Integer total;

  @JsonProperty("data_ref")
  private String dataRef;

  private List<CampaignResponse> campaigns;

  public static CampaignsResponse of(
      String object, Integer total, String dataRef, List<CampaignResponse> campaignResponses) {
    return new CampaignsResponse(object, total, dataRef, campaignResponses);
  }

  public static CampaignsResponse of(List<CampaignResponse> campaignResponses) {
    return new CampaignsResponse(null, null, null, campaignResponses);
  }
}
