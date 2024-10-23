package io.voucherify;

import com.google.gson.JsonSyntaxException;
import io.voucherify.data.VoucherifyStore;
import io.voucherify.helpers.DeepMatch;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.LoyaltiesApi;
import io.voucherify.client.api.VouchersApi;
import io.voucherify.client.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@org.junit.jupiter.api.Order(5)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoyaltiesTest {
    public static ApiClient defaultClient = null;
    public static LoyaltiesApi loyalties = null;
    public static VouchersApi vouchers = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        loyalties = new LoyaltiesApi(defaultClient);
        vouchers = new VouchersApi(defaultClient);
    }

    @Test
    public void updateLoyaltyCardBalanceTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Loyalties/UpdatedLoyaltyCardBalance.snapshot.json";

        try {
            LoyaltiesMembersBalanceUpdateRequestBody loyaltiesMembersBalanceUpdateRequestBody = new LoyaltiesMembersBalanceUpdateRequestBody();
            loyaltiesMembersBalanceUpdateRequestBody.setPoints(1000);

            LoyaltiesMembersBalanceUpdateResponseBody responseBody = loyalties.updateLoyaltyCardBalance(
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                    loyaltiesMembersBalanceUpdateRequestBody);

            List<String> keysToRemove = Arrays.asList("id");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void updateLoyaltyCardBalance2Test() {

        String snapshotPath = "src/test/java/io/voucherify/snapshots/Loyalties/UpdatedLoyaltyCardBalance.snapshot.json";
        try {
            LoyaltiesMembersBalanceUpdateRequestBody loyaltiesMembersBalanceUpdateRequestBody = new LoyaltiesMembersBalanceUpdateRequestBody();
            loyaltiesMembersBalanceUpdateRequestBody.setPoints(1000);

            LoyaltiesMembersBalanceUpdateResponseBody responseBody = loyalties.updateLoyaltyCardBalance1(
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getId(),
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                    loyaltiesMembersBalanceUpdateRequestBody);

            List<String> keysToRemove = Arrays.asList("id", "balance", "total");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));

            assertNotNull(responseBody);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void loyaltiesMembersTransactionsListTest() {
        try {
            LoyaltiesMembersTransactionsListResponseBody responseBody = loyalties.listLoyaltyCardTransactions(
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                    10, null, null);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    public void createInBulkLoyaltyTiersTest() {
        try {
            List<LoyaltiesTiersCreateInBulkRequestBodyItem> tiers = new ArrayList<>();

            LoyaltyTierBasePoints loyaltyTierBasePoints = new LoyaltyTierBasePoints();
            loyaltyTierBasePoints.setFrom(0);
            loyaltyTierBasePoints.setTo(1000);

            List<LoyaltyTier> loyaltyTiers = loyalties.createInBulkLoyaltyTiers(
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getId(),
                    tiers);

            assertNotNull(loyaltyTiers);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}