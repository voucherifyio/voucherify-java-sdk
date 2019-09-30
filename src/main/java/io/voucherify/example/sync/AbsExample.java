package io.voucherify.example.sync;

import io.voucherify.client.VoucherifyClient;

public abstract class AbsExample {

  protected VoucherifyClient client;

  AbsExample(VoucherifyClient client) {
    this.client = client;
  }

  public abstract void example();
}
