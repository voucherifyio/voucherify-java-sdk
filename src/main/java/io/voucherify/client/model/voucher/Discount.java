package io.voucherify.client.model.voucher;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class Discount {

  private DiscountType type;

  @JsonProperty("amount_off")
  private Long amountOff;

  @JsonProperty("percent_off")
  private Double percentOff;

  @JsonProperty("amount_limit")
  private Long amountLimit;

  @JsonProperty("unit_off")
  private Double unitOff;

  @JsonProperty("unit_type")
  private String unitType;

  @JsonProperty("effect")
  private DiscountEffect effect;

  @JsonProperty("fixed_amount")
  private Long fixedAmount;

  public static Discount amountOff(long amountOff) {
    Discount discount = new Discount();
    discount.type = DiscountType.AMOUNT;
    discount.amountOff = amountOff;
    return discount;
  }

  public static Discount fixed(long fixedAmount) {
    Discount discount = new Discount();
    discount.type = DiscountType.FIXED;
    discount.fixedAmount = fixedAmount;
    return discount;
  }

  public static Discount percentOff(double percentOff) {
    return percentOff(percentOff, null);
  }

  public static Discount percentOff(double percentOff, Long amountLimit) {
    Discount discount = new Discount();
    discount.type = DiscountType.PERCENT;
    discount.percentOff = percentOff;
    discount.amountLimit = amountLimit;

    return discount;
  }

  public static Discount unitOff(double unitOff) {
    Discount discount = new Discount();
    discount.type = DiscountType.UNIT;
    discount.unitOff = unitOff;
    return discount;
  }

  public static Discount unitOff(double unitOff, String unitType) {
    Discount discount = new Discount();
    discount.type = DiscountType.UNIT;
    discount.unitOff = unitOff;
    discount.unitType = unitType;
    return discount;
  }
}
