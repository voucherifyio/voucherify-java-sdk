package io.voucherify;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.voucherify.client.model.CampaignsCreateRequestBodyVoucher;
import io.voucherify.client.model.CampaignsCreateRequestBodyVoucherRedemption;
import org.junit.jupiter.api.Test;

public class CampaignRedemptionNullSerializationTest {

  @Test
  void shouldSerializeExplicitNullQuantityWhenSetWithFluentMethod() {
    CampaignsCreateRequestBodyVoucherRedemption redemption =
        new CampaignsCreateRequestBodyVoucherRedemption().quantity(null);

    JsonObject serialized = JsonParser.parseString(redemption.toJson()).getAsJsonObject();

    assertTrue(serialized.has("quantity"));
    assertTrue(serialized.get("quantity").isJsonNull());
  }

  @Test
  void shouldSerializeExplicitNullQuantityInsideVoucher() {
    CampaignsCreateRequestBodyVoucher voucher =
        new CampaignsCreateRequestBodyVoucher()
            .type(CampaignsCreateRequestBodyVoucher.TypeEnum.DISCOUNT_VOUCHER)
            .redemption(new CampaignsCreateRequestBodyVoucherRedemption().quantity(null));

    JsonObject serialized = JsonParser.parseString(voucher.toJson()).getAsJsonObject();
    JsonObject redemption = serialized.getAsJsonObject("redemption");

    assertTrue(redemption.has("quantity"));
    assertTrue(redemption.get("quantity").isJsonNull());
  }
}
