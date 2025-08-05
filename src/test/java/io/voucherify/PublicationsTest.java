package io.voucherify;

import io.voucherify.data.VoucherifyStore;
import io.voucherify.helpers.DeepMatch;

import org.junit.jupiter.api.*;
import io.voucherify.client.ApiClient;
import io.voucherify.client.api.PublicationsApi;
import io.voucherify.client.model.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

@org.junit.jupiter.api.Order(6)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PublicationsTest {
    public static ApiClient defaultClient = null;
    public static PublicationsApi publications = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        publications = new PublicationsApi(defaultClient);
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void listPublicationsTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Publications/ListedPublications.snapshot.json";

        try {
            PublicationsListResponseBody responseBody = publications.listPublications(
                    2,
                    1,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null);

                    // List<String> keysToRemove = Arrays.asList("id", "createdAt", "customerId", "vouchers", "vouchersId",
                    //         "total", "campaign", "code", "email", "trackingId", "isReferralCode");
                    // assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));
                    // TODO
        } catch (Exception e) {
            System.err.println("Error in listPublicationsTest: " + e.getMessage());
            e.printStackTrace();
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void CreatePublicationWithSpecificVoucherTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Publications/CreatedPublication.snapshot.json";

        try {
            PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody();
            Customer customer = new Customer();

            customer.setId(VoucherifyStore.getInstance().getCustomer().getId());
            publicationsCreateRequestBody.setCustomer(customer);
            publicationsCreateRequestBody
                    .setVoucher(VoucherifyStore.getInstance().getLoyaltyCampaign().getVoucherIds().get(0));

            PublicationsCreateResponseBody responseBody = publications.createPublication(false,
                    publicationsCreateRequestBody);

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "customerId", "vouchers", "vouchersId",
                    "total", "campaign", "code", "campaignId", "url", "updatedAt", "holderId");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));
        } catch (Exception e) {
            System.err.println("Error in CreatePublicationWithSpecificVoucherTest: " + e.getMessage());
            e.printStackTrace();
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void CreatePublicationWithCampaignTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Publications/CreatedPublicationWithCampaign.snapshot.json";

        try {
            CreatePublicationCampaign createPublicationCampaign = new CreatePublicationCampaign();
            Customer customer = new Customer();
            createPublicationCampaign.setName(VoucherifyStore.getInstance().getLoyaltyCampaign().getName());
            createPublicationCampaign.setCount(1);

            customer.setId(VoucherifyStore.getInstance().getCustomer().getId());

            PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody();
            publicationsCreateRequestBody.setCampaign(createPublicationCampaign);
            publicationsCreateRequestBody.setCustomer(customer);

            PublicationsCreateResponseBody responseBody = publications.createPublication(false,
                    publicationsCreateRequestBody);

            List<String> keysToRemove = Arrays.asList("id", "createdAt", "customerId", "vouchersId", "vouchers");
            assertTrue(DeepMatch.validateDeepMatch(snapshotPath, responseBody, keysToRemove));
        } catch (Exception e) {
            System.err.println("Error in CreatePublicationWithCampaignTest: " + e.getMessage());
            e.printStackTrace();
            fail();
        }
    }
}
