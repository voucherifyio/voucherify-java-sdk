package io.voucherify.example;

import pl.rspective.voucherify.client.VoucherifyClient;
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
                .setAppToken("e09642b4-dd37-4356-89de-cd75da4aa8ce")
                .build();
    }
    
    public void start() {
        Voucher giftVoucher = new Voucher.Builder()
                .setCodeConfig(CodeConfig.pattern("PROMO-#####-2017"))
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
                .map(new Func1<Voucher, Voucher>() {
                    @Override
                    public Voucher call(Voucher voucher) {
                        VoucherUpdate voucherUpdate = new VoucherUpdate.Builder()
                                .addMetadata("test", true)
                                .build();
                        return client.vouchers().updateVoucher(voucher.getCode(), voucherUpdate);
                    }
                })
                .doOnNext(new Action1<Voucher>() {
                    @Override
                    public void call(Voucher voucher) {
                        System.out.println("Voucher updated. Metadata: " + voucher.getMetadata());
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
                .delay(5, TimeUnit.SECONDS)
                .map(new Func1<VoucherRedemptionResult, VoucherRedemptionResult>() {

                    @Override
                    public VoucherRedemptionResult call(VoucherRedemptionResult redemption) {
                        return client.vouchers().rollbackRedemption(redemption.getId(), redemption.getTrackingId(), null);
                    }
                    
                })
                .doOnNext(new Action1<VoucherRedemptionResult>() {
                    @Override
                    public void call(VoucherRedemptionResult vrr) {
                        System.out.println("Redemption rolled-back. RedemptionId: " + vrr.getId());
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
