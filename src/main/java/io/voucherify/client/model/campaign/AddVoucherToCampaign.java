package io.voucherify.client.model.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import io.voucherify.client.model.voucher.VoucherRedemption;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class AddVoucherToCampaign {

  private String category;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  @JsonProperty("additional_info")
  private String additionalInfo;

  private VoucherRedemption redemption;

}
