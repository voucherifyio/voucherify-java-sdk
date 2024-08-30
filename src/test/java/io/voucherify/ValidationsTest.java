package io.voucherify;

import com.google.gson.JsonSyntaxException;

import io.voucherify.client.model.*;
import io.voucherify.client.model.Order;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.fail;

import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.CampaignsApi;
import io.voucherify.client.api.ValidationsApi;
import io.voucherify.client.api.VouchersApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.BigDecimal;

import io.voucherify.helpers.JsonHelper;

@org.junit.jupiter.api.Order(8)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ValidationsTest {
    public static ApiClient defaultClient = null;
    public static ValidationsApi validationsApi = null;
    public static CampaignsApi campaigns = null;
    public static VouchersApi vouchers = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        validationsApi = new ValidationsApi(defaultClient);
        campaigns = new CampaignsApi(defaultClient);
        vouchers = new VouchersApi(defaultClient);
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void validateStackedInapplicableDiscountsTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Validations/InaplicableValidation.snapshot.json";
        validateStackedDiscounts(getValidationsValidateInapplicableVouchersRequestBody(),
                snapshotPath);
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void validateStackedApplicableDiscountsTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Validations/ApplicableValidation.snapshot.json";
        validateStackedDiscounts(getValidationsValidateApplicableVouchersRequestBody(),
                snapshotPath);
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void validateStackedSkippedDiscountsTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Validations/SkippedValidation.snapshot.json";
        ValidationsValidateRequestBody requestBody = getValidationsValidateApplicableVouchersRequestBody();
        addRedeemablesItemToBeginning(requestBody);
        validateStackedDiscounts(requestBody, snapshotPath);
    }

    private void validateStackedDiscounts(ValidationsValidateRequestBody requestBody, String snapshotPath) {
        try {
            ValidationsValidateResponseBody responseBody = validationsApi.validateStackedDiscounts(requestBody);

            List<String> keysToRemove = Arrays.asList("id", "productId", "details", "trackingId", "requestId");
            JsonHelper.checkStrictAssertEquals(snapshotPath, responseBody, keysToRemove);
        } catch (ApiException e) {
            fail();
        }
    }

    @NotNull
    private static ValidationsValidateRequestBody getValidationsValidateInapplicableVouchersRequestBody() {
        Order order = getOrder();
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = createRedeemablesItem(
                Utils.getAlphaNumericString(20));
        return createValidationsValidateRequestBody(order, redeemablesItem);
    }

    @NotNull
    private static ValidationsValidateRequestBody getValidationsValidateApplicableVouchersRequestBody() {
        Order order = getOrder();
        CampaignsVouchersCreateCombinedResponseBody voucher = createCampaignVoucher();
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = createRedeemablesItem(voucher.getCode());
        return createValidationsValidateRequestBody(order, redeemablesItem);
    }

    @NotNull
    private static CampaignsVouchersCreateCombinedResponseBody createCampaignVoucher() {
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
            return campaigns.addVouchersToCampaign(result.getId(), 1, null);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
            return null;
        }
    }

    @NotNull
    private static Order getOrder() {
        List<OrderItem> items = new ArrayList<>();
        items.add(createOrderItem("prod_001", 1));
        items.add(createOrderItem("prod_002", 1));

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
    private static StackableValidateRedeemBaseRedeemablesItem createRedeemablesItem(String id) {
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = new StackableValidateRedeemBaseRedeemablesItem();
        redeemablesItem.setObject(StackableValidateRedeemBaseRedeemablesItem.ObjectEnum.VOUCHER);
        redeemablesItem.setId(id);
        return redeemablesItem;
    }

    @NotNull
    private static ValidationsValidateRequestBody createValidationsValidateRequestBody(Order order,
            StackableValidateRedeemBaseRedeemablesItem redeemablesItem) {
        ValidationsValidateRequestBody requestBody = new ValidationsValidateRequestBody();
        requestBody.setOrder(order);
        requestBody.addRedeemablesItem(redeemablesItem);
        return requestBody;
    }

    @NotNull
    private void addRedeemablesItemToBeginning(ValidationsValidateRequestBody requestBody) {
        List<StackableValidateRedeemBaseRedeemablesItem> redeemables = requestBody.getRedeemables();
        List<StackableValidateRedeemBaseRedeemablesItem> newRedeemables = new ArrayList<>();
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = createRedeemablesItem(
                Utils.getAlphaNumericString(20));
        newRedeemables.add(redeemablesItem);
        newRedeemables.addAll(redeemables);
        requestBody.setRedeemables(newRedeemables);
    }

}
