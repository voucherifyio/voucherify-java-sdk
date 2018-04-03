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
  private Integer amountOff;

  @JsonProperty("percent_off")
  private Double percentOff;

  @JsonProperty("amount_limit")
  private Integer amountLimit;

  @JsonProperty("unit_off")
  private Double unitOff;

  @JsonProperty("unit_type")
  private String unitType;

  public static Discount from(DiscountType type, int value) {
    Discount discount = new Discount();
    discount.type = type;
    switch (type) {
      case AMOUNT:
        discount.amountOff = value;
        break;
      case PERCENT:
        discount.percentOff = value / 100.0;
        break;
      case UNIT:
        discount.unitOff = value / 100.0;
        break;
      default:
        throw new IllegalArgumentException("Unsupported discount type: " + type);
    }
    return discount;
  }

  public static Discount amountOff(int amountOff) {
    Discount discount = new Discount();
    discount.type = DiscountType.AMOUNT;
    discount.amountOff = amountOff;
    return discount;
  }

  public static Discount percentOff(double percentOff) {
    Discount discount = new Discount();
    discount.type = DiscountType.PERCENT;
    discount.percentOff = percentOff;
    return discount;
  }

  public static Discount unitOff(double unitOff) {
    Discount discount = new Discount();
    discount.type = DiscountType.UNIT;
    discount.unitOff = unitOff;
    return discount;
  }
}
