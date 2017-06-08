package io.voucherify.example;

import io.voucherify.client.ApiVersion;
import io.voucherify.client.VoucherifyClient;
import io.voucherify.example.sync.CampaignsExample;
import io.voucherify.example.sync.CustomersExample;
import io.voucherify.example.sync.DistributionsExample;
import io.voucherify.example.sync.ProductsExample;
import io.voucherify.example.sync.RedemptionsExample;
import io.voucherify.example.sync.SegmentsExample;
import io.voucherify.example.sync.ValidationRulesExample;
import io.voucherify.example.sync.ValidationsExample;
import io.voucherify.example.sync.VouchersExample;
import retrofit.RestAdapter;

import java.text.ParseException;

public class ExampleApp {

  public static void main(String[] args) throws ParseException, InterruptedException {
    ExampleApp exampleApp = new ExampleApp();
    exampleApp.start();
  }

  private static VoucherifyClient createVoucherifyClient() {
    return new VoucherifyClient.Builder()
            .setAppId("d6e63dde-3c08-4f0e-9046-09a12e66f4ec")
            .setClientSecretKey("34b2e280-4678-4d1d-bc86-007737ab69ed")
//            .apiVersion(ApiVersion.V_2017_04_05)
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .build();
  }

  private void start() {
    VoucherifyClient client = createVoucherifyClient();

//    new VouchersExample(client).example();
//    new CampaignsExample(client).example();
//    new CustomersExample(client).example();
//    new ProductsExample(client).example();
//    new ValidationRulesExample(client).example();
//    new SegmentsExample(client).example();
//    new ValidationsExample(client).example();
//    new RedemptionsExample(client).example();
    new DistributionsExample(client).example();
  }

}
