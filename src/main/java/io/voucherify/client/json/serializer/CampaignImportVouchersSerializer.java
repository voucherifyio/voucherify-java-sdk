package io.voucherify.client.json.serializer;

import io.voucherify.client.model.campaign.CampaignImportVoucher;
import io.voucherify.client.model.campaign.CampaignImportVouchers;

import java.util.List;

public class CampaignImportVouchersSerializer
    extends AbstractListSerializer<CampaignImportVouchers, CampaignImportVoucher> {

  @Override
  protected List<CampaignImportVoucher> getList(CampaignImportVouchers value) {
    return value.getVouchers();
  }
}
