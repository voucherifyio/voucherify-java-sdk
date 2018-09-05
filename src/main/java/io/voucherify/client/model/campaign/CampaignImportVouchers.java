package io.voucherify.client.model.campaign;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.voucherify.client.json.serializer.CampaignImportVouchersSerializer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
@JsonSerialize(using = CampaignImportVouchersSerializer.class)
public class CampaignImportVouchers {

  @Singular("voucher")
  private List<CampaignImportVoucher> vouchers;
}
