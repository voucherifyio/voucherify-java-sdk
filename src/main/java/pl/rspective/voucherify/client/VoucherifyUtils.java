package pl.rspective.voucherify.client;

import pl.rspective.voucherify.client.exception.VoucherifyException;
import pl.rspective.voucherify.client.model.DiscountType;
import pl.rspective.voucherify.client.model.Voucher;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.valueOf;

public class VoucherifyUtils {


    public static BigDecimal calculatePrice(BigDecimal basePrice, Voucher voucher) {
        BigDecimal discount = valueOf(voucher.getDiscount() / 100.0);

        if (voucher.getDiscountType() == DiscountType.PERCENT) {
            if(voucher.getDiscount() < 0 || voucher.getDiscount() > 10000) {
                throw new RuntimeException("Invalid voucher, percent discount should be between 0-100.");
            }

            BigDecimal priceDiscount = basePrice.multiply(discount.divide(valueOf(100)));
            return basePrice.subtract(priceDiscount).setScale(2, RoundingMode.HALF_UP);

        } else if (voucher.getDiscountType() == DiscountType.AMOUNT) {
            if(voucher.getDiscount() < 0) {
                throw new RuntimeException("Invalid voucher, amount discount must be higher than zero.");
            }

            BigDecimal newPrice = basePrice.subtract(discount);

            return (newPrice.doubleValue() > 0.0 ? newPrice : BigDecimal.valueOf(0)).setScale(2, RoundingMode.HALF_UP);
        } else {
            throw new RuntimeException("Unknown voucher type");
        }
    }

    public static BigDecimal calculateDiscount(BigDecimal basePrice, Voucher voucher) {
        BigDecimal discount = valueOf(voucher.getDiscount() / 100.0);

        if (voucher.getDiscountType() == DiscountType.PERCENT) {
            if(voucher.getDiscount() < 0 || voucher.getDiscount() > 10000) {
                throw new RuntimeException("Invalid voucher, percent discount should be between 0-100.");
            }

            return basePrice.multiply(discount.divide(valueOf(100))).setScale(2, RoundingMode.HALF_UP);

        } else if (voucher.getDiscountType() == DiscountType.AMOUNT) {
            if(voucher.getDiscount() < 0) {
                throw new RuntimeException("Invalid voucher, amount discount must be higher than zero.");
            }

            BigDecimal newPrice = basePrice.subtract(discount).setScale(2, RoundingMode.HALF_UP);

            return (newPrice.doubleValue() > 0 ? discount : basePrice).setScale(2, RoundingMode.HALF_UP);
        } else {
            throw new RuntimeException("Unknown voucher type");
        }
    }
}
