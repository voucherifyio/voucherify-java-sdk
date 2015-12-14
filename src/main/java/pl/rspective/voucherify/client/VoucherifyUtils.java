package pl.rspective.voucherify.client;

import java.math.BigDecimal;
import java.math.RoundingMode;

import pl.rspective.voucherify.client.model.Discount;
import pl.rspective.voucherify.client.model.DiscountType;
import pl.rspective.voucherify.client.model.Voucher;

import static java.math.BigDecimal.valueOf;

public class VoucherifyUtils {

    private static void validateAmountDiscount(Discount discount) {
        if(discount.getAmountOff() < 0) {
            throw new RuntimeException("Invalid voucher, amount discount must be higher than zero.");
        }
    }
    
    private static void validateUnitDiscount(Discount discount) {
        if(discount.getUnitOff() < 0) {
            throw new RuntimeException("Invalid voucher, unit discount must be higher than zero.");
        }
    } 
    
    private static void validatePercentDiscount(Discount discount) {
        if(discount.getPercentOff() < 0.0 || discount.getPercentOff() > 100.0) {
            throw new RuntimeException("Invalid voucher, percent discount should be between 0-100.");
        }
    }
    
    
    public static BigDecimal calculatePrice(BigDecimal basePrice, Voucher voucher, BigDecimal unitPrice) {
        Discount discount = voucher.getDiscount();

        if (discount.getType() == DiscountType.PERCENT) {
            validatePercentDiscount(discount);

            BigDecimal priceDiscount = basePrice.multiply(valueOf(discount.getPercentOff() / 100.0));
            return basePrice.subtract(priceDiscount).setScale(2, RoundingMode.HALF_UP);

        } else if (discount.getType() == DiscountType.AMOUNT) {
            validateAmountDiscount(discount);

            BigDecimal amountOff = valueOf(discount.getAmountOff() / 100.0);
            BigDecimal newPrice = basePrice.subtract(amountOff);

            return (newPrice.doubleValue() > 0.0 ? newPrice : BigDecimal.valueOf(0)).setScale(2, RoundingMode.HALF_UP);
        } else if (discount.getType() == DiscountType.UNIT) {
            validateUnitDiscount(discount);
            
            BigDecimal amountOff = unitPrice.multiply(valueOf(discount.getUnitOff()));
            BigDecimal newPrice = basePrice.subtract(amountOff);

            return (newPrice.doubleValue() > 0.0 ? newPrice : BigDecimal.valueOf(0)).setScale(2, RoundingMode.HALF_UP);
        } else {
            throw new RuntimeException("Unknown voucher type");
        }
    }

    public static BigDecimal calculateDiscount(BigDecimal basePrice, Voucher voucher, BigDecimal unitPrice) {
        Discount discount = voucher.getDiscount();

        if (discount.getType() == DiscountType.PERCENT) {
            validatePercentDiscount(discount);

            return basePrice.multiply(valueOf(discount.getPercentOff() / 100.0)).setScale(2, RoundingMode.HALF_UP);
            
        } else if (discount.getType() == DiscountType.AMOUNT) {
            validateAmountDiscount(discount);
            
            BigDecimal amountOff = valueOf(discount.getAmountOff() / 100.0);
            BigDecimal newPrice = basePrice.subtract(amountOff).setScale(2, RoundingMode.HALF_UP);

            return (newPrice.doubleValue() > 0 ? amountOff : basePrice).setScale(2, RoundingMode.HALF_UP);
        } else if (discount.getType() == DiscountType.UNIT) {
            validateUnitDiscount(discount);
            
            BigDecimal amountOff = unitPrice.multiply(valueOf(discount.getUnitOff()));
            BigDecimal newPrice = basePrice.subtract(amountOff).setScale(2, RoundingMode.HALF_UP);
            
            return (newPrice.doubleValue() > 0 ? amountOff : basePrice).setScale(2, RoundingMode.HALF_UP);
        } else {
            throw new RuntimeException("Unknown voucher type");
        }
    }
}
