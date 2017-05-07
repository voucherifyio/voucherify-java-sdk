package io.voucherify.client.model.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.voucher.VoucherRedemption;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class CampaignImportVoucher {

  private String code;

  private String category;

  private VoucherRedemption redemption;

  private Boolean active;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  @JsonProperty("additional_info")
  private String additionalInfo;
}
