package io.voucherify.client.model.common.response.applicableTo;

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
public class InapplicableToResponse {

  private String object;

  private Integer total;

  private List<DataEntryResponse> data;

  @JsonProperty("data_ref")
  private String dataRef;
}
