package pl.rspective.voucherify.client.model.voucher;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class CreateVoucher {

  @JsonUnwrapped
  private Voucher voucher;

  @JsonProperty("code_config")
  private CodeConfig codeConfig;

}
