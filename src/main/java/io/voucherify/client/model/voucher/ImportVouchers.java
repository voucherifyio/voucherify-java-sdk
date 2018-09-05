package io.voucherify.client.model.voucher;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.voucherify.client.json.serializer.ImportVouchersSerializer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
@JsonSerialize(using = ImportVouchersSerializer.class)
public class ImportVouchers {

  @Singular("voucher")
  private List<Voucher> vouchers;
}
