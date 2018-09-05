package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.order.Order;
import io.voucherify.client.model.redemption.RedeemVoucher;
import io.voucherify.client.model.redemption.RedemptionsFilter;
import io.voucherify.client.model.redemption.RollbackRedemption;
import io.voucherify.client.model.redemption.response.RedeemVoucherResponse;
import io.voucherify.client.model.voucher.CodeConfig;
import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Gift;
import io.voucherify.client.model.voucher.Voucher;
import io.voucherify.client.model.voucher.VoucherRedemption;
import io.voucherify.client.model.voucher.VoucherType;
import io.voucherify.client.model.voucher.response.VoucherResponse;

public class RedemptionsExample extends AbsExample {

  public RedemptionsExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {
    exampleGiftVoucherValidation();
    examplePercentDiscountValidation();
  }

  public void examplePercentDiscountValidation() {
    Voucher percentDiscount =
        Voucher.builder()
            .type(VoucherType.DISCOUNT_VOUCHER)
            .discount(Discount.percentOff(10, 300))
            .category("Java SDK Example")
            .redemption(VoucherRedemption.builder().quantity(1).build())
            .build();

    CreateVoucher createVoucher =
        CreateVoucher.builder()
            .voucher(percentDiscount)
            .codeConfig(CodeConfig.builder().pattern("PROMO-#####-2017").build())
            .build();

    VoucherResponse result = client.vouchers().create(createVoucher);

    RedeemVoucher redeemVoucher =
        RedeemVoucher.builder().order(Order.builder().amount(10000).build()).build();

    RedeemVoucherResponse redeemVoucherResponse =
        client.redemptions().redeem(result.getCode(), redeemVoucher);

    client.vouchers().delete(result.getCode(), true);
  }

  public void exampleGiftVoucherValidation() {
    Voucher giftVoucher =
        Voucher.builder()
            .type(VoucherType.GIFT_VOUCHER)
            .gift(Gift.builder().amount(10000).build())
            .category("Java SDK Example")
            .redemption(VoucherRedemption.builder().quantity(1).build())
            .build();

    CreateVoucher createVoucher =
        CreateVoucher.builder()
            .voucher(giftVoucher)
            .codeConfig(CodeConfig.builder().pattern("PROMO-#####-2017").build())
            .build();

    VoucherResponse result = client.vouchers().create(createVoucher);
    Customer customer = Customer.builder().name("Doe").email("some-email").build();
    CustomerResponse customerResponse = client.customers().create(customer);

    Customer redeemCustomer = Customer.builder().id(customerResponse.getId()).build();

    RedeemVoucher redeemVoucher =
        RedeemVoucher.builder()
            .customer(redeemCustomer)
            .order(Order.builder().amount(100).build())
            .build();

    RedeemVoucherResponse redeemVoucherResponse =
        client.redemptions().redeem(result.getCode(), redeemVoucher);

    client
        .redemptions()
        .list(RedemptionsFilter.builder().customer(customerResponse.getId()).build());

    client.redemptions().getForVoucher(result.getCode());
    client
        .redemptions()
        .rollback(
            redeemVoucherResponse.getId(),
            "some reason",
            RollbackRedemption.builder().customer(redeemCustomer).build());

    client.vouchers().delete(result.getCode(), true);
    client.customers().delete(customerResponse.getId());
  }
}
