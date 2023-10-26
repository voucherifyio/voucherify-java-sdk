package io.voucherify.client.model.stackable.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class InapplicableRedeemableResponse {

  private String status;

  private String id;

  private String object;

  private RedeemableResultResponse result;
}
