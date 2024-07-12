package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.CampaignsApi;
import voucherify.client.api.LoyaltiesApi;
import voucherify.client.api.VouchersApi;
import voucherify.client.model.*;

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
                    Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
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
                    Voucherify.getInstance().getLoyaltyCampaign().getId(),
                    Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
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
                    Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
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

            LoyaltiesTiersCreateInBulkRequestBodyItem item = new LoyaltiesTiersCreateInBulkRequestBodyItem();
            item.setName("Bronze");
            item.setPoints(loyaltyTierBasePoints);

            // UNCOMMENT WHEN YOU CREATED REWARD MANUALLY AND WANT TO TEST AND PROVIDE FIXED
            // CAMPAIGN ID AND REWARD ASSIGMENT ID
            // Map<String, MappingPoints> rewards = new HashMap<>();
            //
            // MappingFixed mappingFixed = new MappingFixed();
            // mappingFixed.setPoints(100);
            // mappingFixed.setType(MappingFixed.TypeEnum.CUSTOM);
            //
            // MappingPoints mappingPoints = new MappingPoints();
            // mappingPoints.setActualInstance(mappingFixed);
            //
            // rewards.put("rewa_Js4okPaZa4KVdGFcnlwsR7iv", mappingPoints);
            // item.setRewards(rewards);

            tiers.add(item);

            List<LoyaltyTier> loyaltyTiers = loyalties.createInBulkLoyaltyTiers(
                    Voucherify.getInstance().getLoyaltyCampaign().getId(),
                    tiers);

            assertNotNull(loyaltyTiers);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
