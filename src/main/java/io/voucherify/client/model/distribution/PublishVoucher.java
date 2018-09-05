package io.voucherify.client.model.distribution;

import io.voucherify.client.model.customer.Customer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@ToString
public class PublishVoucher {

  private String campaign;

  private String voucher;

  private Customer customer;

  private String channel;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}
