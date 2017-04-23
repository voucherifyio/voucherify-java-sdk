package pl.rspective.voucherify.client.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Builder
public class Gift {

  private Integer amount;

  private Integer balance;

  /**
   * @deprecated Use {@link Gift#builder()} instead
   */
  @Deprecated
  public static Gift amount(int amount) {
    return new Gift(amount, amount);
  }

}
