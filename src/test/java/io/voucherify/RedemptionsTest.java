package io.voucherify;

import com.google.gson.JsonSyntaxException;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import io.voucherify.client.ApiClient;
import io.voucherify.client.api.*;
import io.voucherify.client.ApiException;
import io.voucherify.client.model.*;
import io.voucherify.client.model.Order;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;
import java.math.BigDecimal;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import io.voucherify.helpers.JsonHelper;

@org.junit.jupiter.api.Order(9)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RedemptionsTest {
    public static ApiClient defaultClient = null;
    public static RedemptionsApi redemptions = null;
    public static CampaignsApi campaigns = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        redemptions = new RedemptionsApi(defaultClient);
        campaigns = new CampaignsApi(defaultClient);
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void listRedemptionsTest() {
        RedemptionsApi redemptions = new RedemptionsApi(defaultClient);

        try {
            RedemptionsListResponseBody responseBody = redemptions.listRedemptions(
                    1,
                    2,
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
    @org.junit.jupiter.api.Order(2)
    public void redeemStackedApplicableDiscountsTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Redemptions/ApplicableRedemption.snapshot.json";
        RedemptionsRedeemRequestBody redemptionsBody = getRedemptionsRequestBody(1);
        redeemStackedDiscounts(redemptionsBody, snapshotPath);
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void redeemStackedSkippedDiscountsTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Redemptions/SkippedRedemption.snapshot.json";
        RedemptionsRedeemRequestBody redemptionsBody = getRedemptionsRequestBody(30);
        redeemStackedDiscounts(redemptionsBody, snapshotPath);
    }

    private void redeemStackedDiscounts(RedemptionsRedeemRequestBody requestBody, String snapshotPath) {
        try {
            RedemptionsRedeemResponseBody responseBody = redemptions.redeemStackedDiscounts(requestBody);

            String responseBodyJson = JsonHelper.getObjectMapper().writeValueAsString(responseBody);
            String snapshot = JsonHelper.readJsonFile(snapshotPath);

            assertNotNull(responseBody);
            JSONAssert.assertEquals(snapshot, responseBodyJson, false);
        } catch (ApiException | IOException | JSONException | JsonSyntaxException e) {
            fail();
        }
    }

    @NotNull
    private static RedemptionsRedeemRequestBody getRedemptionsRequestBody(int voucherCount) {
        Order order = getOrder();
        RedemptionsRedeemRequestBody redeemRequestBody = new RedemptionsRedeemRequestBody();
        redeemRequestBody.setOrder(order);
        CampaignsCreateResponseBody campaign = createDiscountTypeCampaign();
        List<StackableValidateRedeemBaseRedeemablesItem> redeemables = Stream
                .generate(() -> createVoucherForRedeemable(campaign)).limit(voucherCount)
                .collect(Collectors.toCollection(ArrayList::new));
        redeemRequestBody.setRedeemables(redeemables);
        return redeemRequestBody;
    }

    @NotNull
    private static StackableValidateRedeemBaseRedeemablesItem createVoucherForRedeemable(
            CampaignsCreateResponseBody campaign) {
        try {
            CampaignsVouchersCreateCombinedResponseBody voucher = campaigns.addVouchersToCampaign(campaign.getId(), 1,
                    null);
            StackableValidateRedeemBaseRedeemablesItem redeemablesItem = createRedeemablesItem(voucher.getCode());
            return redeemablesItem;
        } catch (ApiException | JsonSyntaxException e) {
            fail();
            return null;
        }
    }

    @NotNull
    private static StackableValidateRedeemBaseRedeemablesItem createRedeemablesItem(String id) {
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = new StackableValidateRedeemBaseRedeemablesItem();
        redeemablesItem.setObject(StackableValidateRedeemBaseRedeemablesItem.ObjectEnum.VOUCHER);
        redeemablesItem.setId(id);
        return redeemablesItem;
    }

    @NotNull
    private static Order getOrder() {
        List<OrderItem> items = new ArrayList<>();
        items.add(createOrderItem("prod_003", 1));
        items.add(createOrderItem("prod_004", 1));

        Order order = new Order();
        order.setAmount(10000);
        order.setItems(items);
        return order;

    }

    private static OrderItem createOrderItem(String productId, int quantity) {
        OrderItem item = new OrderItem();
        item.setProductId(productId);
        item.setQuantity(quantity);
        return item;
    }

    @NotNull
    private static CampaignsCreateResponseBody createDiscountTypeCampaign() {
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
            return campaigns.createCampaign(campaign);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
            return null;
        }
    }
}
