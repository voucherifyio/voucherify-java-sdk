package io.voucherify.client.model.loyalties.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.loyalties.MembersLoyaltyTier;
import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class MembersLoyaltyTierResponse {

  private String object;

  @JsonProperty("data_ref")
  private String dataRef;

  private List<MembersLoyaltyTier> data;

  private Integer total;

}
