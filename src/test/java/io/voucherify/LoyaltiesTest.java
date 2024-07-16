package io.voucherify;

import com.google.gson.JsonSyntaxException;
import io.voucherify.data.VoucherifyStore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.CampaignsApi;
import io.voucherify.client.api.LoyaltiesApi;
import io.voucherify.client.api.VouchersApi;
import io.voucherify.client.model.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(5)
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
        try {
            LoyaltiesMembersBalanceUpdateRequestBody loyaltiesMembersBalanceUpdateRequestBody = new LoyaltiesMembersBalanceUpdateRequestBody();
            loyaltiesMembersBalanceUpdateRequestBody.setPoints(1000);

            LoyaltiesMembersBalanceUpdateResponseBody responseBody = loyalties.updateLoyaltyCardBalance(
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                    loyaltiesMembersBalanceUpdateRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    public void updateLoyaltyCardBalance2Test() {
        try {
            LoyaltiesMembersBalanceUpdateRequestBody loyaltiesMembersBalanceUpdateRequestBody = new LoyaltiesMembersBalanceUpdateRequestBody();
            loyaltiesMembersBalanceUpdateRequestBody.setPoints(1000);

            LoyaltiesMembersBalanceUpdateResponseBody responseBody = loyalties.updateLoyaltyCardBalance1(
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getId(),
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                    loyaltiesMembersBalanceUpdateRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    public void loyaltiesMembersTransactionsListTest() {
        try {
            LoyaltiesMembersTransactionsListResponseBody responseBody = loyalties.listLoyaltyCardTransactions(
                    VoucherifyStore.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                    10,
                    1);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            System.out.println(e);
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
