package pl.rspective.voucherify.client.utils;

import java.math.BigDecimal;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.rspective.voucherify.client.VoucherifyUtils;
import pl.rspective.voucherify.client.model.Discount;
import pl.rspective.voucherify.client.model.DiscountType;
import pl.rspective.voucherify.client.model.Gift;
import pl.rspective.voucherify.client.model.Voucher;

import static java.math.BigDecimal.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

public class VoucherifyUtilsTest {

    @Test
    public void shouldReturnDiscountedPrice() {
        assertPriceAfterDiscount(100, 2599, DiscountType.AMOUNT, "74.01");
    }

    @Test
    public void shouldReturnBasePriceWhenZeroDiscout() {
        assertPriceAfterDiscount(100, 0, DiscountType.AMOUNT, "100.00");
    }

    @Test
    public void shouldReturnZeroWhenDiscountAmountAboveBasePrice() {
        assertPriceAfterDiscount(10, 20000, DiscountType.AMOUNT, "0.00");
    }

    @Test
    public void shouldReturnZeroWhenDiscountAmountEqualsBasePrice() {
        assertPriceAfterDiscount(10, 10000, DiscountType.AMOUNT, "0.00");
    }

    @Test
    public void shouldReturnPercentDiscountedPriceFloatBasePrice() {
        assertPriceAfterDiscount(100.99, 2598, DiscountType.PERCENT, "74.75"); // 74.752798
    }

    @Test
    public void shouldReturnPercentDiscountedPriceFloatBasePriceWithRoundEdgeCase() {
        assertPriceAfterDiscount(100.97, 2409, DiscountType.PERCENT, "76.65"); // 76.646327
    }

    @Test
    public void shouldReturnPercentDiscountedPriceForFullDiscount() {
        assertPriceAfterDiscount(100.99, 10000, DiscountType.PERCENT, "0.00");
    }
    
    @Test
    public void shouldReturnUnitDiscountedPrice() {
        assertPriceAfterDiscount(50.00, 15.0, 200, DiscountType.UNIT, "20.00"); // 50.0 - 15.0 * 2 = 20.0
    }


    @Test
    public void shouldThrowExceptionWhenPercentDiscountAbove100() {
        try {
            VoucherifyUtils.calculatePrice(valueOf(100.88), createVoucher(10100, DiscountType.PERCENT), null);
            Assertions.failBecauseExceptionWasNotThrown(RuntimeException.class);
        } catch(RuntimeException e) {
            assertThat(e).hasMessage("Invalid voucher, percent discount should be between 0-100.");
        }
    }

    @Test
    public void shouldThrowExceptionWhenAmountDiscountBelow0() {
        try {
            VoucherifyUtils.calculatePrice(valueOf(100.88), createVoucher(-1000, DiscountType.AMOUNT), null);
            Assertions.failBecauseExceptionWasNotThrown(RuntimeException.class);
        } catch(RuntimeException e) {
            assertThat(e).hasMessage("Invalid voucher, amount discount must be higher than zero.");
        }
    }
    
    @Test
    public void shouldCalculatePriceApplyingEntireGiftAmount() {
        BigDecimal price = VoucherifyUtils.calculatePrice(valueOf(50.00), createGiftVoucher(10000, 10000), null);

        assertThat(price.toString()).isEqualTo("0.00");
    }
    
    @Test
    public void shouldCalculatePriceApplyingRemainingGiftAmount() {
        BigDecimal price = VoucherifyUtils.calculatePrice(valueOf(50.00), createGiftVoucher(10000,  3000), null);

        assertThat(price.toString()).isEqualTo("20.00");
    }

    private void assertPriceAfterDiscount(double basePrice, int discount, DiscountType type, String expectedPrice) {
        BigDecimal price = VoucherifyUtils.calculatePrice(valueOf(basePrice), createVoucher(discount, type), null);

        assertThat(price.toString()).isEqualTo(expectedPrice);
    }
    
    private void assertPriceAfterDiscount(double basePrice, double unitPrice, int discount, DiscountType type, String expectedPrice) {
        BigDecimal price = VoucherifyUtils.calculatePrice(valueOf(basePrice), createVoucher(discount, type), valueOf(unitPrice));

        assertThat(price.toString()).isEqualTo(expectedPrice);
    }

    // Calculate Discount

    @Test
    public void shouldReturnDiscount() {
        assertDiscount(100, 2599, DiscountType.AMOUNT, "25.99");
    }

    @Test
    public void shouldReturnZeroWhenZeroDiscout() {
        assertDiscount(100, 0, DiscountType.AMOUNT, "0.00");
    }

    @Test
    public void shouldReturnBasePriceWhenWhenDiscountIsHigher() {
        assertDiscount(10, 20000, DiscountType.AMOUNT, "10.00");
    }

    @Test
    public void shouldReturnBasePriceWhenWhenDiscountIsEqual() {
        assertDiscount(10, 10000, DiscountType.AMOUNT, "10.00");
    }

    @Test
    public void shouldReturnDiscountForPercentageVoucher() {
        assertDiscount(100.99, 2598, DiscountType.PERCENT, "26.24"); // 26.237202
    }

    @Test
    public void shouldReturnDiscountForPercentageVoucherNoRound() {
        assertDiscount(100.97, 2409, DiscountType.PERCENT, "24.32"); // 24.323673
    }

    @Test
    public void shouldReturnBasePriceWhen100PercentDiscount() {
        assertDiscount(100.99, 10000, DiscountType.PERCENT, "100.99");
    }
    
    @Test
    public void shouldReturnUnitDiscount() {
        assertDiscount(50.00, 15.0, 200, DiscountType.UNIT, "30.00"); // 15.0 * 2 = 30.0
    }
    
    @Test
    public void shouldCalculateDiscountApplyingEntireGiftAmount() {
        BigDecimal price = VoucherifyUtils.calculateDiscount(valueOf(50.00), createGiftVoucher(10000, 10000), null);

        assertThat(price.toString()).isEqualTo("50.00");
    }
    
    @Test
    public void shouldCalculateDiscountApplyingRemainingGiftAmount() {
        BigDecimal price = VoucherifyUtils.calculateDiscount(valueOf(50.00), createGiftVoucher(10000,  3000), null);

        assertThat(price.toString()).isEqualTo("30.00");
    }


    private void assertDiscount(double basePrice, double unitPrice, int discount, DiscountType type, String expectedDiscount) {
        BigDecimal finalDiscount = VoucherifyUtils.calculateDiscount(valueOf(basePrice), createVoucher(discount, type), valueOf(unitPrice));

        assertThat(finalDiscount.toString()).isEqualTo(expectedDiscount);
    }
    
    private void assertDiscount(double basePrice, int discount, DiscountType type, String expectedDiscount) {
        BigDecimal finalDiscount = VoucherifyUtils.calculateDiscount(valueOf(basePrice), createVoucher(discount, type), null);

        assertThat(finalDiscount.toString()).isEqualTo(expectedDiscount);
    }
    

    private Voucher createVoucher(int discountValue, DiscountType type) {
        return new Voucher.Builder()
                        .setDiscount(Discount.from(type, discountValue))
                        .build();
    }
    
    private Voucher createGiftVoucher(Integer amount, Integer balance) {
        return new Voucher.Builder()
                        .setGift(new Gift(amount, balance))
                        .build();
    }
}
