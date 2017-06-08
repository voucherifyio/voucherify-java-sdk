package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
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
import io.voucherify.client.model.voucher.response.VouchersResponse;

import java.util.List;

public class VouchersExample extends AbsExample {

  public VouchersExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {
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

    VouchersResponse vouchers = client.vouchers().list(VouchersFilter.builder().limit(10).page(1).build());

    for (VoucherResponse response : vouchers.getVouchers()) {
      client.vouchers().delete(response.getCode(), true);
    }
  }
}
