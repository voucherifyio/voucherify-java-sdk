package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.campaign.AddVoucherToCampaign;
import io.voucherify.client.model.campaign.CampaignImportVoucher;
import io.voucherify.client.model.campaign.CampaignImportVouchers;
import io.voucherify.client.model.campaign.CampaignsFilter;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.DeleteCampaignParams;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Voucher;
import io.voucherify.client.model.voucher.VoucherType;

public class CampaignsExample extends AbsExample {

  public CampaignsExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {
    Voucher campaignVoucher = Voucher.builder().active(false).type(VoucherType.DISCOUNT_VOUCHER).discount(Discount.amountOff(10)).build();
    CreateCampaign createCampaign = CreateCampaign.builder().name("campaign-name").voucher(campaignVoucher).build();

    CampaignResponse response = client.campaigns().create(createCampaign);

    AddVoucherToCampaign addVoucherToCampaign = AddVoucherToCampaign.builder().category("new-category").build();

    client.campaigns().addVoucher(response.getName(), addVoucherToCampaign);
    client.campaigns().addVoucherWithCode(response.getName(), "some-code1", addVoucherToCampaign);

    CampaignImportVoucher campaignImportVoucher = CampaignImportVoucher.builder().active(false).code("test03").build();
    CampaignImportVouchers importVouchers = CampaignImportVouchers.builder().voucher(campaignImportVoucher).build();

    client.campaigns().importVouchers(response.getName(), importVouchers);

    client.campaigns().get("campaign-name");

    client.campaigns().list(CampaignsFilter.builder().limit(10).page(1).build());

    client.campaigns().delete("campaign-name", DeleteCampaignParams.builder().force(true).build());
  }
}
