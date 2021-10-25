package io.voucherify.client.model.voucher;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.NonNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@RequiredArgsConstructor(staticName = "of")
@Getter
@Builder
@ToString
public class Gift {

  @NonNull
  private Long amount;

  private Long balance;

  private GiftEffect effect;
}
