package io.voucherify.client.model.loyalties;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class MembersLoyaltyTier {

  private String id;

  private String name;

  @JsonProperty("campaign_id")
  private String campaignId;

  private Map<String, Object> metadata;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("updated_at")
  private Date updatedAt;
  
  private String object;

}
