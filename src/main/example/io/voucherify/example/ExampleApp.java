package io.voucherify.example;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.campaign.AddVoucherToCampaign;
import io.voucherify.client.model.campaign.CampaignImportVoucher;
import io.voucherify.client.model.campaign.CampaignImportVouchers;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.DeleteCampaignParams;
import io.voucherify.client.model.campaign.response.CreateCampaignResponse;
import io.voucherify.client.model.voucher.CodeConfig;
import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Gift;
import io.voucherify.client.model.voucher.ImportVouchers;
import io.voucherify.client.model.voucher.Voucher;
import io.voucherify.client.model.voucher.VoucherRedemption;
import io.voucherify.client.model.voucher.VoucherType;
import io.voucherify.client.model.voucher.VoucherUpdate;
import io.voucherify.client.model.voucher.VouchersFilter;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import retrofit.RestAdapter;

import java.text.ParseException;
import java.util.List;

public class ExampleApp {

  public static void main(String[] args) throws ParseException, InterruptedException {
    ExampleApp exampleApp = new ExampleApp();
    exampleApp.start();
  }

  private static VoucherifyClient createVoucherifyClient() {
    return new VoucherifyClient.Builder()
            .setAppId("cfb281b6-e9f5-46d5-9ebe-4822945e3d0d")
            .setClientSecretKey("e09642b4-dd37-4356-89de-cd75da4aa8ce")
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .build();
  }

  private void start() {
    VoucherifyClient client = createVoucherifyClient();

    vouchers(client);
    campaign(client);
  }

  private void vouchers(VoucherifyClient client) {
    Voucher giftVoucher = Voucher.builder()
            .type(VoucherType.GIFT_VOUCHER)
            .gift(Gift.builder().amount(10000).build())
            .category("Java SDK Example")
            .redemption(VoucherRedemption.builder().quantity(1).build())
            .build();

    CreateVoucher createVoucher = CreateVoucher.builder()
            .voucher(giftVoucher)
            .codeConfig(CodeConfig.builder().pattern("PROMO-#####-2017").build())
            .build();

    VoucherResponse voucherResponse = client.vouchers().create(createVoucher);

    VoucherUpdate voucherUpdate = VoucherUpdate.builder()
            .active(false)
            .metadataEntry("test", true)
            .build();

    client.vouchers().update(voucherResponse.getCode(), voucherUpdate);

    client.vouchers().enable(voucherResponse.getCode());

    client.vouchers().disable(voucherResponse.getCode());

    client.vouchers().get(voucherResponse.getCode());

    Voucher voucher = Voucher.builder().active(false).type(VoucherType.DISCOUNT_VOUCHER).discount(Discount.amountOff(10)).code("test-1").build();
    ImportVouchers importVouchers = ImportVouchers.builder().voucher(voucher).build();

    client.vouchers().importVouchers(importVouchers);

    List<VoucherResponse> list = client.vouchers().list(VouchersFilter.builder().limit(10).page(0).build());

    for (VoucherResponse response : list) {
      client.vouchers().delete(response.getCode(), true);
    }
  }

  private void campaign(VoucherifyClient client) {
    Voucher campaignVoucher = Voucher.builder().active(false).type(VoucherType.DISCOUNT_VOUCHER).discount(Discount.amountOff(10)).build();
    CreateCampaign createCampaign = CreateCampaign.builder().name("campaign-name").voucher(campaignVoucher).build();

    CreateCampaignResponse response = client.campaigns().create(createCampaign);

    AddVoucherToCampaign addVoucherToCampaign = AddVoucherToCampaign.builder().category("new-category").build();

    client.campaigns().addVoucher(response.getName(), addVoucherToCampaign);
    client.campaigns().addVoucherWithCode(response.getName(), "some-code", addVoucherToCampaign);

    CampaignImportVoucher campaignImportVoucher = CampaignImportVoucher.builder().active(false).code("test02").build();
    CampaignImportVouchers importVouchers = CampaignImportVouchers.builder().voucher(campaignImportVoucher).build();

    client.campaigns().importVouchers(response.getName(), importVouchers);

    client.campaigns().delete("campaign-name", DeleteCampaignParams.builder().force(true).build());
  }

}
