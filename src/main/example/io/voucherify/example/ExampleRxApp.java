package io.voucherify.example;

import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.order.Order;
import io.voucherify.client.model.redemption.RedeemVoucher;
import io.voucherify.client.model.redemption.RollbackRedemption;
import io.voucherify.client.model.redemption.response.RedeemVoucherResponse;
import io.voucherify.client.model.redemption.response.RollbackRedemptionResponse;
import io.voucherify.client.model.voucher.CodeConfig;
import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.Gift;
import io.voucherify.client.model.voucher.Voucher;
import io.voucherify.client.model.voucher.VoucherRedemption;
import io.voucherify.client.model.voucher.VoucherType;
import io.voucherify.client.model.voucher.VoucherUpdate;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import retrofit.RestAdapter;
import rx.functions.Action1;
import rx.functions.Func1;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class ExampleRxApp {

  public static void main(String[] args) throws ParseException, InterruptedException {
    ExampleRxApp exampleApp = new ExampleRxApp();
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
    final VoucherifyClient client = createVoucherifyClient();

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

    System.out.println("Creating gift voucher.");
    client.vouchers().rx()
            .create(createVoucher)
            .doOnNext(new Action1<VoucherResponse>() {
              @Override
              public void call(VoucherResponse voucherResponse) {
                System.out.println("Voucher created : " + voucherResponse);
              }
            })
            .map(new Func1<VoucherResponse, VoucherResponse>() {
              @Override
              public VoucherResponse call(VoucherResponse voucher) {
                VoucherUpdate voucherUpdate = VoucherUpdate.builder()
                        .metadataEntry("test", true)
                        .build();
                return client.vouchers().update(voucher.getCode(), voucherUpdate);
              }
            })
            .doOnNext(new Action1<VoucherResponse>() {
              @Override
              public void call(VoucherResponse voucher) {
                System.out.println("Voucher updated. Metadata: " + voucher.getMetadata());
              }
            })
            .map(new Func1<VoucherResponse, RedeemVoucherResponse>() {
              @Override
              public RedeemVoucherResponse call(VoucherResponse voucher) {
                Customer customer = Customer.builder().sourceId("alice.morgan").build();
                Order order = Order.builder().amount(7250).build();
                RedeemVoucher redeemVoucher = RedeemVoucher.builder().customer(customer).order(order).medatadaEntry("test", true).build();
                return client.redemptions().redeem(voucher.getCode(), redeemVoucher);
              }
            })
            .doOnNext(new Action1<RedeemVoucherResponse>() {
              @Override
              public void call(RedeemVoucherResponse redeemVoucherResponse) {
                System.out.println("Voucher redeemed. RedemptionId: " + redeemVoucherResponse.getId());
              }
            })
            .delay(5, TimeUnit.SECONDS)
            .map(new Func1<RedeemVoucherResponse, RollbackRedemptionResponse>() {

              @Override
              public RollbackRedemptionResponse call(RedeemVoucherResponse redemption) {
                Customer customer = Customer.builder().sourceId("alice.morgan").build();
                RollbackRedemption rollbackRedemption = RollbackRedemption.builder().customer(customer).build();
                return client.redemptions().rollback(redemption.getId(), "test", rollbackRedemption);
              }

            })
            .doOnNext(new Action1<RollbackRedemptionResponse>() {
              @Override
              public void call(RollbackRedemptionResponse rollbackRedemptionResponse) {
                System.out.println("Redemption rolled-back. RedemptionId: " + rollbackRedemptionResponse.getId());
              }
            })
            .doOnError(new Action1<Throwable>() {
              @Override
              public void call(Throwable error) {
                System.out.println("Something went wrong. Error: " + error);
              }
            })
            .toBlocking()
            .last();
  }

}
