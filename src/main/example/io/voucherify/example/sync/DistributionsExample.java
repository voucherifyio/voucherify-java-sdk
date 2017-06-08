package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.distribution.CreateExport;
import io.voucherify.client.model.distribution.ExportParams;
import io.voucherify.client.model.distribution.PublishVoucher;
import io.voucherify.client.model.distribution.response.ExportResponse;
import io.voucherify.client.model.voucher.CodeConfig;
import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Voucher;
import io.voucherify.client.model.voucher.VoucherRedemption;
import io.voucherify.client.model.voucher.VoucherType;
import io.voucherify.client.model.voucher.response.VoucherResponse;

public class DistributionsExample extends AbsExample {

  public DistributionsExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {
    Voucher discountVoucher = Voucher.builder()
            .type(VoucherType.DISCOUNT_VOUCHER)
            .discount(Discount.amountOff(100))
            .category("Java SDK Example")
            .redemption(VoucherRedemption.builder().quantity(1).build())
            .build();

    CreateVoucher createVoucher = CreateVoucher.builder()
            .voucher(discountVoucher)
            .codeConfig(CodeConfig.builder().pattern("PROMO-#####-2017").build())
            .build();

    VoucherResponse result = client.vouchers().create(createVoucher);

    Customer customer = Customer.builder().name("Doe").email("some-email").build();
    CustomerResponse customerResponse = client.customers().create(customer);

    Customer custToPublish = Customer.builder()
            .id(customerResponse.getId())
            .build();

    PublishVoucher publishVoucher = PublishVoucher.builder()
            .voucher(result.getCode())
            .customer(custToPublish)
            .build();

    System.out.println(client.distributions().publish(publishVoucher));

    CreateExport createExport = CreateExport.builder()
            .exportedObject("voucher")
            .parameters(ExportParams.builder()
                    .field("code")
                    .field("voucher_type")
                    .build()
            ).build();

    ExportResponse export = client.distributions().createExport(createExport);

    client.distributions().deleteExport(export.getId());

    client.vouchers().delete(result.getCode(), true);
    client.customers().delete(customerResponse.getId());
  }
}
