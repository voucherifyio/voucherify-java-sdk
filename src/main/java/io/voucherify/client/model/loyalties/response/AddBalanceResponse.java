package io.voucherify.client.model.loyalties.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.voucher.response.RelatedObject;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class AddBalanceResponse {

  private Long points;

  private Long total;

  private Long balance;

  private String type;

  private String object;

  @JsonProperty("related_object")
  private RelatedObject relatedObject;
}
