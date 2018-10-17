package io.voucherify.client.model.common.response.applicableTo;

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
public class ApplicableToResponse {

  private String object;

  private Integer total;

  private List<DataEntryResponse> data;

}
