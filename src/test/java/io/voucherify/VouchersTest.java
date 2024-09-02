package io.voucherify;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;

import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.VouchersApi;
import io.voucherify.client.model.*;
import io.voucherify.data.VoucherifyStore;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import io.voucherify.helpers.JsonHelper;

@org.junit.jupiter.api.Order(7)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VouchersTest {
    public static ApiClient defaultClient = null;
    public static VouchersApi vouchers = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        vouchers = new VouchersApi(defaultClient);
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void getVoucherTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Vouchers/Voucher.snapshot.json";
        try {
            VouchersGetResponseBody responseBody = vouchers
                    .getVoucher(VoucherifyStore.getInstance().getLoyaltyCampaign().getVoucherIds()
                            .get(0));

            List<String> keysToRemove = Arrays.asList("id", "code", "campaign", "campaignId",
                    "url", "createdAt",
                    "updatedAt", "holderId");
            JsonHelper.checkStrictAssertEquals(snapshotPath, responseBody, keysToRemove);
        } catch (ApiException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void disableVoucherTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Vouchers/DisabledVoucher.snapshot.json";
        try {
            VouchersDisableResponseBody responseBody = vouchers
                    .disableVoucher(VoucherifyStore.getInstance().getLoyaltyCampaign()
                            .getVoucherIds().get(0));

            List<String> keysToRemove = Arrays.asList("id", "code", "campaign", "campaignId", "url",
                    "createdAt", "updatedAt",
                    "holderId");
            JsonHelper.checkStrictAssertEquals(snapshotPath, responseBody, keysToRemove);
        } catch (ApiException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void enableVoucherTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Vouchers/EnabledVoucher.snapshot.json";
        try {
            VouchersEnableResponseBody responseBody = vouchers
                    .enableVoucher(VoucherifyStore.getInstance().getLoyaltyCampaign()
                            .getVoucherIds().get(0));

            List<String> keysToRemove = Arrays.asList("id", "code", "campaign", "campaignId", "url",
                    "createdAt", "updatedAt",
                    "holderId");
            JsonHelper.checkStrictAssertEquals(snapshotPath, responseBody, keysToRemove);
        } catch (ApiException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(4)
    public void updateLoyaltyCardBalanceTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Vouchers/UpdatedLoyaltyCardBalance.snapshot.json";

        VouchersBalanceUpdateRequestBody requestBody = new VouchersBalanceUpdateRequestBody();
        requestBody.setSourceId(Utils.getAlphaNumericString(10));
        requestBody.setAmount(10000);
        requestBody.setReason("Regular customer");
        try {
            VouchersBalanceUpdateResponseBody responseBody = vouchers
                    .updateVoucherBalance(
                            VoucherifyStore.getInstance().getLoyaltyCampaign()
                                    .getVoucherIds().get(0),
                            requestBody);

            List<String> keysToRemove = Arrays.asList("id");
            JsonHelper.checkStrictAssertEquals(snapshotPath, responseBody, keysToRemove);
        } catch (ApiException e) {
            fail();
        }
    }
}
