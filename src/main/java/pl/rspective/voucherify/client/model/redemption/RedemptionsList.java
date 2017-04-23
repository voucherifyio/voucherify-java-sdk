package pl.rspective.voucherify.client.model.redemption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class RedemptionsList {

  private String object;

  private Integer total;

  @JsonProperty("data_ref")
  private String dataRef;

  private List<RedemptionEntry> redemptions;
}
