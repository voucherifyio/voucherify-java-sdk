package io.voucherify.client.model.loyalties.response;

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
public class GetActivitiesResponse {

  private String object;

  @JsonProperty("data_ref")
  private String dataRef;

  private List<ActivityResponse> activities;

  private Long total;
}
