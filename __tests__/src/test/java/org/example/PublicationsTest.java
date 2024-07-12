package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.PublicationsApi;
import io.voucherify.client.model.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(6)
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
    @Order(1)
    public void listPublicationsTest() {
        try {
            PublicationsListResponseBody responseBody = publications.listPublications(
                    10,
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

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(2)
    public void CreatePublicationWithSpecificVoucherTest() {
        try {
            PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody();
            PublicationsCreateRequestBodyCustomer customer = new PublicationsCreateRequestBodyCustomer();

            customer.setId(Voucherify.getInstance().getCustomer().getId());
            publicationsCreateRequestBody.setCustomer(customer);
            publicationsCreateRequestBody.setVoucher(Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0));

            PublicationsCreateResponseBody responseBody = publications.createPublication(false, publicationsCreateRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void CreatePublicationWithCampaignTest() {
        try {
            CreatePublicationCampaign createPublicationCampaign = new CreatePublicationCampaign();
            PublicationsCreateRequestBodyCustomer customer = new PublicationsCreateRequestBodyCustomer();
            createPublicationCampaign.setName(Voucherify.getInstance().getLoyaltyCampaign().getName());
            createPublicationCampaign.setCount(2);

            customer.setId(Voucherify.getInstance().getCustomer().getId());

            PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody();
            publicationsCreateRequestBody.setCampaign(createPublicationCampaign);
            publicationsCreateRequestBody.setCustomer(customer);

            PublicationsCreateResponseBody responseBody = publications.createPublication(false,
                    publicationsCreateRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
