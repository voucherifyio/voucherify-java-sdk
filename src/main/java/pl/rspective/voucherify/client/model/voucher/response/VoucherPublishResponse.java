package pl.rspective.voucherify.client.model.voucher.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.rspective.voucherify.client.model.publish.response.PublishEntryResponse;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherPublishResponse {

  private Integer count;

  private List<PublishEntryResponse> entries;

}
