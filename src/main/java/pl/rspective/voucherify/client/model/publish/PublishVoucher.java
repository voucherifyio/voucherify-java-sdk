package pl.rspective.voucherify.client.model.publish;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import pl.rspective.voucherify.client.model.customer.Customer;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class PublishVoucher {

  private String campaign;

  private String voucher;

  private Customer customer;

  private String channel;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

}
