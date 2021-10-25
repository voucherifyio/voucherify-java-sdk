package io.voucherify.client.model.redemption.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RedemptionsResponse {

  private String object;

  private Long total;

  @JsonProperty("data_ref")
  private String dataRef;

  private List<RedemptionEntryResponse> redemptions;
}
