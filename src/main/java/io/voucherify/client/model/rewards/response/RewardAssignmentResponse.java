package io.voucherify.client.model.rewards.response;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class RewardAssignmentResponse {

  private String id;

  @JsonProperty("related_object_id")
  private String relatedObjectId;

  private String object;

  @JsonProperty("reward_id")
  private String rewardId;

  @JsonProperty("related_object_type")
  private String relatedObjectType;

  @JsonProperty("created_at")
  private Date createdAt;

  private Map<String, Object> parameters;
}
