package io.voucherify.client;

import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.Voucher;
import io.voucherify.client.module.AbstractModuleTest;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class MiscTest extends AbstractModuleTest {

  @Test
  public void shouldNotFailWhenDeserializingWithUnknownProperty() {
    // given
    enqueueResponse("{\"unknown_property\":\"some_value\"}");

    Voucher voucher = Voucher.builder().build();
    CreateVoucher createVoucher = CreateVoucher.builder().voucher(voucher).build();

    try {
      // when
      client.vouchers().create(createVoucher);
    } catch (Exception e) {
      fail("Should not throw any exception");
    }
  }
}
