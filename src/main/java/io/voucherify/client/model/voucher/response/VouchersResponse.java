package io.voucherify.client.model.voucher.response;

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
public class VouchersResponse {

  private String object;

  private Integer total;

  @JsonProperty("data_ref")
  private String dataRef;

  private List<VoucherResponse> vouchers;

  public static VouchersResponse of(String object, Integer total, String dataRef, List<VoucherResponse> vouchers) {
    return new VouchersResponse(object, total, dataRef, vouchers);
  }

  public static VouchersResponse of(List<VoucherResponse> vouchers) {
    return new VouchersResponse(null, null, null, vouchers);
  }
}
