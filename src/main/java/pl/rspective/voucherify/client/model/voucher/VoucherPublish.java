package pl.rspective.voucherify.client.model.voucher;

import lombok.Getter;
import pl.rspective.voucherify.client.model.publish.PublishEntry;

import java.util.Collections;
import java.util.List;

@Getter
public class VoucherPublish {

  private int count;
  private List<PublishEntry> entries;

  public VoucherPublish() {
    this.count = 0;
    this.entries = Collections.emptyList();
  }

}
