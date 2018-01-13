package io.voucherify.client.model.promotion.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.campaign.CampaignType;
import io.voucherify.client.model.voucher.GenerationStatus;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class CreatePromotionCampaignResponse {

  private String id;

  private String name;

  private String object;

  private CampaignType type;

  @JsonProperty("campaign_type")
  private String campaignType;

  private String description;

  @JsonProperty("start_date")
  private Date startDate;

  @JsonProperty("expiration_date")
  private Date expirationDate;

  private Map<String, Object> metadata;

  private Integer vouchersCount;

  @JsonProperty("vouchers_generation_status")
  private GenerationStatus generationStatus;

  private VoucherResponse voucher;

  private PromotionResponse promotion;
}
