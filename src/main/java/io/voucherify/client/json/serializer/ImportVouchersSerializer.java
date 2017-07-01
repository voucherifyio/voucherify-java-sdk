package io.voucherify.client.json.serializer;

import io.voucherify.client.model.voucher.ImportVouchers;
import io.voucherify.client.model.voucher.Voucher;

import java.util.List;

public class ImportVouchersSerializer extends AbstractListSerializer<ImportVouchers, Voucher> {

  @Override
  protected List<Voucher> getList(ImportVouchers value) {
    return value.getVouchers();
  }
}
