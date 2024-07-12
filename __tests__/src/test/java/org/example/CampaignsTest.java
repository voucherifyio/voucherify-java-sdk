package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.CampaignsApi;
import voucherify.client.model.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(1)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CampaignsTest {
    public static ApiClient defaultClient = null;
    public static CampaignsApi campaigns;

    public String loyaltyProgramId = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        campaigns = new CampaignsApi(defaultClient);
    }

    @Test
    @Order(1)
    public void createLoyaltyProgramTest() {
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

            assertNotNull(loyaltyProgramId);
            assertNotNull(campaignName);

            Voucherify.getInstance().getLoyaltyCampaign().setId(loyaltyProgramId);
            Voucherify.getInstance().getLoyaltyCampaign().setName(campaignName);

            this.loyaltyProgramId = loyaltyProgramId;
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(2)
    public void createDiscountCampaign() {
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

            assertNotNull(discountCampaignId);
            assertNotNull(campaignName);

            Voucherify.getInstance().getCouponCampaign().setId(discountCampaignId);
            Voucherify.getInstance().getCouponCampaign().setName(campaignName);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void getCampaignTest() {
        try {
            CampaignsGetResponseBody responseBody = campaigns.getCampaign(loyaltyProgramId);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(4)
    public void addVoucherToCampaign() {
        try {
            Integer vouchersCount = 1; // Integer | Number of vouchers that should be added.
            CampaignsVouchersCreateInBulkRequestBody campaignsVouchersCreateInBulkRequestBody = new CampaignsVouchersCreateInBulkRequestBody();
            // CampaignsVouchersCreateInBulkRequestBody | Specify the voucher parameters
            // that you would like to overwrite.

            CampaignsVouchersCreateCombinedResponseBody result = campaigns.addVouchersToCampaign(loyaltyProgramId,
                    vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            assertNotNull(result);
            Voucherify.getInstance().getLoyaltyCampaign().addVoucherId(
                result.getId()
            );

            //NEED TWO VOUCHERS FOR PUBLICATION
            CampaignsVouchersCreateCombinedResponseBody result2 = campaigns.addVouchersToCampaign(loyaltyProgramId, vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            assertNotNull(result2);
            Voucherify.getInstance().getLoyaltyCampaign().addVoucherId(
                result2.getId()
            );

        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(5)
    public void addVouchersToCampaign() {
        try {
            Integer vouchersCount = 2; // Integer | Number of vouchers that should be added.
            CampaignsVouchersCreateInBulkRequestBody campaignsVouchersCreateInBulkRequestBody = new CampaignsVouchersCreateInBulkRequestBody(); //
            CampaignsVouchersCreateCombinedResponseBody responseBody = campaigns.addVouchersToCampaign(loyaltyProgramId,
                    vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
