package io.voucherify.client.model.stackable;

import io.voucherify.client.model.loyalties.Reward;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class Redeemable {

  private String object;

  private String id;

  private Reward reward;

  private Gift gift;
}
