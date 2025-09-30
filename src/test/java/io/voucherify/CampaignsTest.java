package io.voucherify;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import io.voucherify.client.ApiClient;
import io.voucherify.client.api.CampaignsApi;
import io.voucherify.client.api.PromotionsApi;
import io.voucherify.client.api.PublicationsApi;
import io.voucherify.client.api.RewardsApi;
import io.voucherify.client.model.CampaignLoyaltyCard;
import io.voucherify.client.model.CampaignsCreateRequestBody;
import io.voucherify.client.model.CampaignsCreateRequestBodyVoucher;
import io.voucherify.client.model.CampaignsCreateResponseBody;
import io.voucherify.client.model.CampaignsGetResponseBody;
import io.voucherify.client.model.CampaignsUpdateRequestBody;
import io.voucherify.client.model.CampaignsUpdateResponseBody;
import io.voucherify.client.model.CampaignsVouchersCreateCombinedResponseBody;
import io.voucherify.client.model.CampaignsVouchersCreateInBulkRequestBody;
import io.voucherify.client.model.Customer;
import io.voucherify.client.model.Discount;
import io.voucherify.client.model.PromotionsTiersCreateRequestBody;
import io.voucherify.client.model.PromotionsTiersCreateRequestBodyAction;
import io.voucherify.client.model.PromotionsTiersCreateResponseBody;
import io.voucherify.client.model.PromotionsTiersUpdateRequestBody;
import io.voucherify.client.model.PromotionsTiersUpdateResponseBody;
import io.voucherify.client.model.PublicationsCreateRequestBody;
import io.voucherify.client.model.PublicationsCreateResponseBody;
import io.voucherify.client.model.RewardsCreateRequestBody;
import io.voucherify.client.model.RewardsCreateRequestBodyParameters;
import io.voucherify.client.model.RewardsCreateRequestBodyParametersCampaign;
import io.voucherify.client.model.RewardsCreateResponseBody;
import io.voucherify.client.model.RewardsUpdateRequestBody;
import io.voucherify.client.model.RewardsUpdateResponseBody;
import io.voucherify.data.VoucherifyStore;
import io.voucherify.helpers.DeepMatch;

@org.junit.jupiter.api.Order(1)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CampaignsTest {
    public static ApiClient defaultClient = null;
    public static CampaignsApi campaigns;
    public static PromotionsApi promotions;
    public static RewardsApi rewards;
    public static PublicationsApi publications;

    public String loyaltyProgramId = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        campaigns = new CampaignsApi(defaultClient);
        promotions = new PromotionsApi(defaultClient);
        rewards = new RewardsApi(defaultClient);
        publications = new PublicationsApi(defaultClient);
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void createLoyaltyProgramTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Campaigns/CreatedLoyaltyCampaign.snapshot.json";

        CampaignLoyaltyCard campaignLoyaltyCard = new CampaignLoyaltyCard();
        campaignLoyaltyCard.setPoints(500);

        CampaignsCreateRequestBodyVoucher voucher = new CampaignsCreateRequestBodyVoucher();
        voucher.setLoyaltyCard(campaignLoyaltyCard);
        voucher.setType(CampaignsCreateRequestBodyVoucher.TypeEnum.LOYALTY_CARD);

        CampaignsCreateRequestBody campaignsCreateRequestBody = new CampaignsCreateRequestBody();
        campaignsCreateRequestBody.setCampaignType(CampaignsCreateRequestBody.CampaignTypeEnum.LOYALTY_PROGRAM);
        campaignsCreateRequestBody.setType(CampaignsCreateRequestBody.TypeEnum.AUTO_UPDATE);
        campaignsCreateRequestBody.setName(Utils.getAlphaNumericString(20));
        campaignsCreateRequestBody.setVoucher(voucher);

        try {
            CampaignsCreateResponseBody result = campaigns.createCampaign(campaignsCreateRequestBody);

            String loyaltyProgramId = result.getId();
            String campaignName = result.getName();

            List<String> keysToRemove = Arrays.asList("id", "name", "createdAt");

            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, result, keysToRemove));

            VoucherifyStore.getInstance().getLoyaltyCampaign().setId(loyaltyProgramId);
            VoucherifyStore.getInstance().getLoyaltyCampaign().setName(campaignName);

            this.loyaltyProgramId = loyaltyProgramId;
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void createDiscountCampaignTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Campaigns/CreatedDiscountCampaign.snapshot.json";

        Discount discount = new Discount();
        discount.setType(Discount.TypeEnum.AMOUNT);
        discount.setAmountOff(BigDecimal.valueOf(1));

        CampaignsCreateRequestBodyVoucher voucher = new CampaignsCreateRequestBodyVoucher();
        voucher.setDiscount(discount);
        voucher.setType(CampaignsCreateRequestBodyVoucher.TypeEnum.DISCOUNT_VOUCHER);

        CampaignsCreateRequestBody campaign = new CampaignsCreateRequestBody();
        campaign.setCampaignType(CampaignsCreateRequestBody.CampaignTypeEnum.DISCOUNT_COUPONS);
        campaign.setType(CampaignsCreateRequestBody.TypeEnum.AUTO_UPDATE);
        campaign.setName(Utils.getAlphaNumericString(20));
        campaign.setVoucher(voucher);
        try {
            CampaignsCreateResponseBody result = campaigns.createCampaign(campaign);

            String discountCampaignId = result.getId();
            String campaignName = result.getName();

            List<String> keysToRemove = Arrays.asList("id", "name", "createdAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, result, keysToRemove));

            VoucherifyStore.getInstance().getCouponCampaign().setId(discountCampaignId);
            VoucherifyStore.getInstance().getCouponCampaign().setName(campaignName);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void getLoyaltyCampaignTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Campaigns/CreatedLoyaltyCampaign.snapshot.json";
        try {
            CampaignsGetResponseBody responseBody = campaigns.getCampaign(loyaltyProgramId);
            List<String> keysToRemove = Arrays.asList("id", "name", "createdAt");

            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(4)
    public void addVoucherToCampaignTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Campaigns/AddedVoucherToCampaign.snapshot.json";
        try {
            Integer vouchersCount = 1; // Integer | Number of vouchers that should be added.
            CampaignsVouchersCreateInBulkRequestBody campaignsVouchersCreateInBulkRequestBody = new CampaignsVouchersCreateInBulkRequestBody();
            // CampaignsVouchersCreateInBulkRequestBody | Specify the voucher parameters
            // that you would like to overwrite.

            CampaignsVouchersCreateCombinedResponseBody result = campaigns.addVouchersToCampaign(loyaltyProgramId,
                    vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            List<String> keysToRemove = Arrays.asList("id", "code", "campaign", "campaignId", "url", "createdAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, result, keysToRemove));

            VoucherifyStore.getInstance().getLoyaltyCampaign().addVoucherId(result.getId());

            // NEED TWO VOUCHERS FOR PUBLICATION
            CampaignsVouchersCreateCombinedResponseBody result2 = campaigns.addVouchersToCampaign(loyaltyProgramId,
                    vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            VoucherifyStore.getInstance().getLoyaltyCampaign().addVoucherId(
                    result2.getId());

        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(5)
    public void addVouchersToCampaignTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Campaigns/AddedMultipleVouchersToCampaign.snapshot.json";
        try {
            Integer vouchersCount = 2; // Integer | Number of vouchers that should be added.
            CampaignsVouchersCreateInBulkRequestBody campaignsVouchersCreateInBulkRequestBody = new CampaignsVouchersCreateInBulkRequestBody();
            CampaignsVouchersCreateCombinedResponseBody responseBody = campaigns.addVouchersToCampaign(loyaltyProgramId,
                    vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            List<String> keysToRemove = Arrays.asList("asyncActionId");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));

            assertNotNull(responseBody);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(6)
    public void createPromotionCampaignWithSinglePromotionTier() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Campaigns/CreatedPromotionCampaign.snapshot.json";
        String snapshotPath2 = "src/test/java/io/voucherify/snapshots/PromotionTiers/CreatedPromotionTier.snapshot.json";

        CampaignsCreateRequestBody campaign = new CampaignsCreateRequestBody();
        campaign.setCampaignType(CampaignsCreateRequestBody.CampaignTypeEnum.PROMOTION);
        campaign.setName(Utils.getAlphaNumericString(20));

        try {
            CampaignsCreateResponseBody campaignResult = campaigns.createCampaign(campaign);

            List<String> keysToRemove = Arrays.asList("id", "name", "createdAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, campaignResult, keysToRemove));

            PromotionsTiersCreateRequestBody promotionTierCreate = new PromotionsTiersCreateRequestBody();
            promotionTierCreate.setActive(true);
            String promotionTierCreateName = Utils.getAlphaNumericString(20);
            promotionTierCreate.setName(promotionTierCreateName);
            String promotionTierCreateId = "";

            Discount discount = new Discount();
            discount.setType(Discount.TypeEnum.AMOUNT);
            discount.setAmountOff(BigDecimal.valueOf(1));

            PromotionsTiersCreateRequestBodyAction promotionTierAction = new PromotionsTiersCreateRequestBodyAction();
            promotionTierAction.setDiscount(discount);
            promotionTierCreate.setAction(promotionTierAction);

            PromotionsTiersCreateResponseBody promotionTierCreateResult = promotions
                    .addPromotionTierToCampaign(campaignResult.getId(), promotionTierCreate);
            promotionTierCreateId = promotionTierCreateResult.getId();

            List<String> keysToRemove2 = Arrays.asList("id", "name", "createdAt", "campaignId");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath2, promotionTierCreateResult, keysToRemove2));

            PromotionsTiersUpdateRequestBody promotionTierUpdate = new PromotionsTiersUpdateRequestBody();
            String promotionTierUpdateBanner = Utils.getAlphaNumericString(20);
            promotionTierUpdate.setBanner(promotionTierUpdateBanner);

            PromotionsTiersUpdateResponseBody promotionTierUpdateResult = promotions
                    .updatePromotionTier(promotionTierCreateId, promotionTierUpdate);

            List<String> keysToRemove3 = Arrays.asList("id", "name", "createdAt",
                    "campaignId", "updatedAt", "banner");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath2, promotionTierUpdateResult, keysToRemove3));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(7)
    public void createDiscountCampaignWithReward() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Campaigns/CreatedDiscountCampaign.snapshot.json";
        String snapshotPath2 = "src/test/java/io/voucherify/snapshots/Rewards/CreatedReward.snapshot.json";

        Discount discount = new Discount();
        discount.setType(Discount.TypeEnum.AMOUNT);
        discount.setAmountOff(BigDecimal.valueOf(1));

        CampaignsCreateRequestBodyVoucher voucher = new CampaignsCreateRequestBodyVoucher();
        voucher.setDiscount(discount);
        voucher.setType(CampaignsCreateRequestBodyVoucher.TypeEnum.DISCOUNT_VOUCHER);

        CampaignsCreateRequestBody campaign = new CampaignsCreateRequestBody();
        campaign.setCampaignType(CampaignsCreateRequestBody.CampaignTypeEnum.DISCOUNT_COUPONS);
        campaign.setType(CampaignsCreateRequestBody.TypeEnum.AUTO_UPDATE);
        campaign.setName(Utils.getAlphaNumericString(20));
        campaign.setVoucher(voucher);
        try {
            CampaignsCreateResponseBody campaignResult = campaigns.createCampaign(campaign);

            List<String> keysToRemove = Arrays.asList("id", "name", "createdAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, campaignResult, keysToRemove));

            RewardsCreateRequestBody rewardsCreateRequestBody = new RewardsCreateRequestBody();
            rewardsCreateRequestBody.setName(Utils.getAlphaNumericString(20));
            RewardsCreateRequestBodyParameters rewardsCreateRequestBodyParameters = new RewardsCreateRequestBodyParameters();
            RewardsCreateRequestBodyParametersCampaign rewardsCreateRequestBodyParametersCampaign = new RewardsCreateRequestBodyParametersCampaign();
            rewardsCreateRequestBodyParametersCampaign.setId(campaignResult.getId());
            rewardsCreateRequestBodyParameters.setCampaign(rewardsCreateRequestBodyParametersCampaign);
            rewardsCreateRequestBody.setParameters(rewardsCreateRequestBodyParameters);

            RewardsCreateResponseBody reward = rewards.createReward(rewardsCreateRequestBody);

            List<String> keysToRemove2 = Arrays.asList("id", "name", "createdAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath2, reward, keysToRemove2));

            RewardsUpdateRequestBody rewardsUpdateRequestBody = new RewardsUpdateRequestBody();
            String newRewardName = Utils.getAlphaNumericString(20);
            rewardsUpdateRequestBody.setName(newRewardName);

            RewardsUpdateResponseBody updatedReward = rewards.updateReward(reward.getId(), rewardsUpdateRequestBody);

            List<String> keysToRemove3 = Arrays.asList("id", "name", "createdAt",
                    "updatedAt");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath2, updatedReward, keysToRemove3));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(8)
    public void publishCampaignVoucher() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Campaigns/PublishedVoucher.snapshot.json";
        
        try {
            Discount discount = new Discount();
            discount.setType(Discount.TypeEnum.AMOUNT);
            discount.setAmountOff(BigDecimal.valueOf(1));

            CampaignsCreateRequestBodyVoucher voucher = new CampaignsCreateRequestBodyVoucher();
            voucher.setDiscount(discount);
            voucher.setType(CampaignsCreateRequestBodyVoucher.TypeEnum.DISCOUNT_VOUCHER);

            CampaignsCreateRequestBody campaign = new CampaignsCreateRequestBody();
            campaign.setCampaignType(CampaignsCreateRequestBody.CampaignTypeEnum.DISCOUNT_COUPONS);
            campaign.setType(CampaignsCreateRequestBody.TypeEnum.AUTO_UPDATE);
            campaign.setName(Utils.getAlphaNumericString(20));
            campaign.setVoucher(voucher);
            
            CampaignsCreateResponseBody campaignResult = campaigns.createCampaign(campaign);
        
            CampaignsVouchersCreateCombinedResponseBody voucherResult = campaigns.addVouchersToCampaign(campaignResult.getId(), 1, null);
            
            PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody();
            Customer customer = new Customer();
            customer.setId(VoucherifyStore.getInstance().getCustomer().getId());
            publicationsCreateRequestBody.setCustomer(customer);
            publicationsCreateRequestBody.setVoucher(voucherResult.getId());

            PublicationsCreateResponseBody result = publications.createPublication(false, publicationsCreateRequestBody);
            List<String> keysToRemove = Arrays.asList("id", "createdAt", "customerId", "campaignId", "assets", "updatedAt", "publish", "redemption", "vouchersId", "code", "campaign", "type", "discount", "holderId");

            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, result, keysToRemove));
            
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(15)
    public void updateCampaignExpirationDateToNullTest() {
        try {
            CampaignsCreateRequestBody campaign = new CampaignsCreateRequestBody();
            campaign.setName(Utils.getAlphaNumericString(20));
            campaign.setCampaignType(CampaignsCreateRequestBody.CampaignTypeEnum.PROMOTION);
            campaign.setExpirationDate(OffsetDateTime.now().plusDays(30));
                        CampaignsCreateResponseBody campaignResult = campaigns.createCampaign(campaign);

            assertNotNull(campaignResult);
            assertNotNull(campaignResult.getExpirationDate());
            
            // Now set expiration date to null to clear it
            CampaignsUpdateRequestBody clearExpirationRequest = new CampaignsUpdateRequestBody();
            clearExpirationRequest.setExpirationDate(null);
            
            CampaignsUpdateResponseBody clearResponse = campaigns.updateCampaign(campaignResult.getId(), clearExpirationRequest);
            assertNotNull(clearResponse);
            assertNull(clearResponse.getExpirationDate(), "Campaign expiration date should be null after setting it to null");
            
        } catch (Exception e) {
            fail();
        }
    }
}
