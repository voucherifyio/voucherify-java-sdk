package io.voucherify.client.model.promotion.reponse;

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
public class ListPromotionTiersResponse {

  private String object;

  private Integer total;

  @JsonProperty("data_ref")
  private String dataRef;

  private List<TierResponse> tiers;
}
