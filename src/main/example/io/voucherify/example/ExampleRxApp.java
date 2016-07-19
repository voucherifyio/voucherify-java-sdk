package io.voucherify.example;
import java.text.ParseException;

import pl.rspective.voucherify.client.VoucherifyClient;
import pl.rspective.voucherify.client.model.CodeConfig;
import pl.rspective.voucherify.client.model.Customer;
import pl.rspective.voucherify.client.model.Gift;
import pl.rspective.voucherify.client.model.Order;
import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherRedemption;
import pl.rspective.voucherify.client.model.VoucherRedemptionContext;
import pl.rspective.voucherify.client.model.VoucherRedemptionResult;
import pl.rspective.voucherify.client.model.VoucherType;
import rx.functions.Action1;
import rx.functions.Func1;

public class ExampleRxApp {

    public static void main(String[] args) throws ParseException, InterruptedException {
        ExampleRxApp exampleApp = new ExampleRxApp();
        exampleApp.start();
    }
    
    private static VoucherifyClient createVoucherifyClient() {
        return new VoucherifyClient.Builder()
                .setAppId("c70a6f00-cf91-4756-9df5-47628850002b")
                .setAppToken("3266b9f8-e246-4f79-bdf0-833929b1380c")
                .build();
    }
    
    public void start() {
        Voucher giftVoucher = new Voucher.Builder()
                .setCodeConfig(CodeConfig.pattern("PROMO-#####-2016"))
                .setType(VoucherType.GIFT_VOUCHER)
                .setGift(Gift.amount(10000))
                .setCategory("Java SDK Example")
                .setRedemption(VoucherRedemption.unlimited())
                .build();
        
        VoucherifyClient client = createVoucherifyClient();
        System.out.println("Creating gift voucher.");
        client.vouchers().rx()
                .createVoucher(giftVoucher)
                .doOnNext(new Action1<Voucher>() {
                    @Override
                    public void call(Voucher voucher) {
                        System.out.println("Voucher created. Code: " + voucher.getCode());
                    }
                })
                .map(new Func1<Voucher, VoucherRedemptionResult>() {
                    @Override
                    public VoucherRedemptionResult call(Voucher voucher) {
                        Customer customer = new Customer().setSourceId("alice.morgan");
                        Order order = Order.amount(7250);
                        VoucherRedemptionContext redemptionContext = new VoucherRedemptionContext(customer, order, null);
                        return client.vouchers().redeem(voucher.getCode(), redemptionContext);
                    }
                })
                .doOnNext(new Action1<VoucherRedemptionResult>() {
                    @Override
                    public void call(VoucherRedemptionResult vrr) {
                        System.out.println("Voucher redeemed. RedemptionId: " + vrr.getId());
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
