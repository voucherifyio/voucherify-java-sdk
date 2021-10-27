package io.voucherify.client.model.voucher.response;

import io.voucherify.client.model.distribution.response.PublishEntryResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class VoucherPublishResponse {

  private Long count;

  private List<PublishEntryResponse> entries;
}
