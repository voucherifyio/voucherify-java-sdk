package io.voucherify;

import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.CustomersApi;
import io.voucherify.client.api.Lv2ExamineApi;
import io.voucherify.client.api.Lv2ProgramsApi;
import io.voucherify.client.api.OrdersApi;
import io.voucherify.client.model.CardSimple;
import io.voucherify.client.model.CustomersCreateRequestBody;
import io.voucherify.client.model.CustomersCreateResponseBody;
import io.voucherify.client.model.ExamineCustomerIdentification;
import io.voucherify.client.model.LoyaltiesExamineEarningRulesExamineRequestBody;
import io.voucherify.client.model.LoyaltiesExamineEarningRulesExamineRequestBodyCustomerOrderPaid;
import io.voucherify.client.model.LoyaltiesExamineEarningRulesExamineRequestBodyOrder;
import io.voucherify.client.model.LoyaltiesExamineEarningRulesExamineRequestBodyTrigger;
import io.voucherify.client.model.LoyaltiesExamineEarningRulesExamineRequestBodyTriggerSpecific;
import io.voucherify.client.model.LoyaltiesExamineRewardsExamineRequestBody;
import io.voucherify.client.model.LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBodyLimit;
import io.voucherify.client.model.LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBody;
import io.voucherify.client.model.LoyaltiesProgramsReportsMembersDailyListResponseBody;
import io.voucherify.client.model.LoyaltiesProgramsReportsMembersSummaryListResponseBody;
import io.voucherify.client.model.LoyaltiesProgramsReportsRewardsSummaryListResponseBody;
import io.voucherify.client.model.MemberCard;
import io.voucherify.client.model.OrderPaymentOrder;
import io.voucherify.client.model.OrdersCreateRequestBody;
import io.voucherify.client.model.OrdersCreateResponseBody;
import io.voucherify.client.model.RewardPurchaseRefundPolicies;
import io.voucherify.client.model.RewardPurchaseTransaction;
import io.voucherify.client.model.Customer;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersActivateResponseBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersCardsTransactionsListRequestQuery;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersCardsTransactionsListResponseBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersCreateRequestBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersCreateResponseBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersGetResponseBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersListResponseBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersOrdersPaymentsListResponseBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembersRewardsPurchasesListResponseBody;
import io.voucherify.client.model.V2LoyaltiesProgramsMembershipsGetResponseBody;
import io.voucherify.client.model.V2LoyaltiesProgramsRewardsPurchasesRefundRequestBody;
import io.voucherify.client.model.LoyaltiesProgramsMembersCardsReportsDailyListResponseBody;
import io.voucherify.loyalty.LoyaltyV2Fixture;
import io.voucherify.loyalty.LoyaltyV2Http;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoyaltiesV2Test {
    private static ApiClient client;
    private static Lv2ProgramsApi programsApi;
    private static Lv2ExamineApi examineApi;
    private static CustomersApi customersApi;
    private static OrdersApi ordersApi;

    private LoyaltyV2Fixture.Context fixtureCtx;
    private CustomersCreateResponseBody customer;
    private V2LoyaltiesProgramsMembersGetResponseBody member;
    private String memberId;
    private String primaryCardId;

    @BeforeAll
    void beforeAll() throws Exception {
        Assumptions.assumeTrue(LoyaltyV2Http.hasCredentials(), "Missing X_APP_ID / X_APP_TOKEN");
        client = Utils.getClient();
        programsApi = new Lv2ProgramsApi(client);
        examineApi = new Lv2ExamineApi(client);
        customersApi = new CustomersApi(client);
        ordersApi = new OrdersApi(client);

        fixtureCtx = LoyaltyV2Fixture.setup();

        CustomersCreateRequestBody customerBody = new CustomersCreateRequestBody();
        customerBody.setSourceId("lv2_customer_" + fixtureCtx.suffix);
        customerBody.setName("Loyalty v2 Java SDK test");
        customer = customersApi.createCustomer(customerBody);

        V2LoyaltiesProgramsMembersCreateRequestBody memberBody =
                new V2LoyaltiesProgramsMembersCreateRequestBody();
        Map<String, Object> identification = new HashMap<>();
        identification.put("type", "customer_id");
        identification.put("customer_id", customer.getId());
        identification.put("customer_source_id", null);
        memberBody.setCustomerIdentification(identification);
        V2LoyaltiesProgramsMembersCreateResponseBody created =
                programsApi.createProgramMember(fixtureCtx.programId, memberBody);
        memberId = created.getId();
        member = programsApi.getProgramMember(fixtureCtx.programId, memberId);
        primaryCardId = resolvePrimaryCardId(member.getCards(), fixtureCtx.cardDefinitionId);
    }

    @AfterAll
    void afterAll() {
        try {
            if (fixtureCtx != null && memberId != null) {
                ignoreApi("deactivateProgramMember", () -> programsApi.deactivateProgramMember(
                        fixtureCtx.programId, memberId));
                ignoreApi("deleteProgramMember", () -> programsApi.deleteProgramMember(
                        fixtureCtx.programId, memberId));
            }
            if (customer != null) {
                ignoreApi("deleteCustomer", () -> customersApi.deleteCustomer(customer.getId()));
            }
            if (fixtureCtx != null) {
                LoyaltyV2Fixture.teardown(fixtureCtx);
            }
        } finally {
            fixtureCtx = null;
            member = null;
            memberId = null;
            customer = null;
            primaryCardId = null;
        }
    }

    @Test
    @Order(1)
    void setupCreatesActivatedProgramResources() {
        assertNotNull(fixtureCtx.programId);
        assertTrue(fixtureCtx.programId.startsWith("lprg_"));
        assertTrue(fixtureCtx.cardDefinitionId.startsWith("lcdef_"));
        assertTrue(fixtureCtx.earningRuleId.startsWith("lern_"));
        assertTrue(fixtureCtx.rewardId.startsWith("lrew_"));
    }

    @Test
    @Order(2)
    void memberLifecycleViaSdk() throws ApiException {
        assertNotNull(memberId);
        assertNotNull(member.getCustomerId());
        assertFalse(member.getCards().isEmpty());

        V2LoyaltiesProgramsMembersGetResponseBody fetched =
                programsApi.getProgramMember(fixtureCtx.programId, memberId);
        assertNotNull(fetched.getId());

        V2LoyaltiesProgramsMembersListResponseBody listed =
                programsApi.listProgramMembers(fixtureCtx.programId, null, null, null, null);
        assertTrue(
                listed.getData().stream().anyMatch(item -> memberId.equals(item.getId())));

        V2LoyaltiesProgramsMembershipsGetResponseBody membership =
                programsApi.getProgramMembership(fixtureCtx.programId, customer.getId(), null);
        assertNotNull(membership);

        V2LoyaltiesProgramsMembersGetResponseBody.StatusEnum status = member.getStatus();
        if (status == V2LoyaltiesProgramsMembersGetResponseBody.StatusEnum.INACTIVE) {
            V2LoyaltiesProgramsMembersActivateResponseBody activated =
                    programsApi.activateProgramMember(fixtureCtx.programId, memberId);
            assertNotNull(activated.getStatus());
        }

        programsApi.deactivateProgramMember(fixtureCtx.programId, memberId);
        programsApi.activateProgramMember(fixtureCtx.programId, memberId);
        member = programsApi.getProgramMember(fixtureCtx.programId, memberId);
        assertNotNull(member.getStatus());
        primaryCardId = resolvePrimaryCardId(member.getCards(), fixtureCtx.cardDefinitionId);
        assertTrue(primaryCardId.startsWith("lcrd_"));
    }

    @Test
    @Order(3)
    void adjustCardPointsAndListTransactions() throws ApiException, InterruptedException {
        V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody adjustBody =
                new V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody();
        adjustBody.setPoints(100);
        adjustBody.setReason("java sdk loyalty v2 e2e");
        programsApi.adjustCardPoints(
                fixtureCtx.programId, memberId, primaryCardId, adjustBody);

        Thread.sleep(3000);

        member = programsApi.getProgramMember(fixtureCtx.programId, memberId);
        MemberCard primaryCard =
                member.getCards().stream()
                        .filter(entry -> primaryCardId.equals(entry.getCard().getId()))
                        .findFirst()
                        .orElseThrow();
        assertTrue(primaryCard.getCard().getBalance().getPoints().compareTo(BigDecimal.ZERO) > 0);

        V2LoyaltiesProgramsMembersCardsTransactionsListResponseBody transactions =
                programsApi.listCardTransactions(
                        fixtureCtx.programId,
                        memberId,
                        primaryCardId,
                        null,
                        null,
                        null,
                        null);
        assertFalse(transactions.getData().isEmpty());
    }

    @Test
    @Order(4)
    void createMemberOrderPaymentDryRun() throws ApiException {
        OrdersCreateRequestBody orderBody = new OrdersCreateRequestBody();
        orderBody.setAmount(2500);
        orderBody.setSourceId("lv2_order_" + fixtureCtx.suffix);
        Customer orderCustomer = new Customer();
        orderCustomer.setId(customer.getId());
        orderBody.setCustomer(orderCustomer);
        OrdersCreateResponseBody order = ordersApi.createOrder(orderBody);
        assertTrue(order.getId().startsWith("ord_"));

        V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody paymentBody =
                new V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody();
        paymentBody.setCardId(primaryCardId);
        OrderPaymentOrder paymentOrder = new OrderPaymentOrder();
        paymentOrder.setId(order.getId());
        paymentBody.setOrder(paymentOrder);
        LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBodyLimit limit =
                new LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBodyLimit();
        limit.setType(
                LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBodyLimit.TypeEnum
                        .CARD_BALANCE);
        paymentBody.setPaymentLimit(limit);
        paymentBody.setMode(V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody.ModeEnum.DRY_RUN);
        programsApi.createMemberOrderPayment(fixtureCtx.programId, memberId, paymentBody);

        V2LoyaltiesProgramsMembersOrdersPaymentsListResponseBody listed =
                programsApi.listMemberOrderPayments(
                        fixtureCtx.programId, memberId, null, null, null, null);
        assertNotNull(listed);
    }

    @Test
    @Order(5)
    void purchaseMemberRewardAndRefund() throws ApiException, InterruptedException {
        V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody dryRun =
                new V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody();
        dryRun.setRewardId(fixtureCtx.rewardId);
        dryRun.setMode(
                V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody.ModeEnum.DRY_RUN);
        programsApi.purchaseMemberReward(fixtureCtx.programId, memberId, dryRun);

        V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody purchaseBody =
                new V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody();
        purchaseBody.setRewardId(fixtureCtx.rewardId);
        purchaseBody.setMode(
                V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody.ModeEnum.TRANSACTION);
        LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBody purchase =
                programsApi.purchaseMemberReward(fixtureCtx.programId, memberId, purchaseBody);
        assertNotNull(purchase);

        String rewardTransactionId = null;
        if (purchase.getTransaction() != null && purchase.getTransaction().getId() != null) {
            rewardTransactionId = purchase.getTransaction().getId();
        }
        assertNotNull(rewardTransactionId);

        RewardPurchaseTransaction approvedRow = null;
        for (int attempt = 0; attempt < 15; attempt++) {
            Thread.sleep(1000);
            V2LoyaltiesProgramsMembersRewardsPurchasesListResponseBody listed =
                    programsApi.listMemberRewardPurchases(
                            fixtureCtx.programId, memberId, null, null, null, null);
            List<RewardPurchaseTransaction> rows = listed.getData();
            assertFalse(rows.isEmpty());
            for (RewardPurchaseTransaction row : rows) {
                if (rewardTransactionId.equals(row.getId())
                        && row.getStatus() == RewardPurchaseTransaction.StatusEnum.APPROVED) {
                    approvedRow = row;
                    break;
                }
            }
            if (approvedRow == null && !rows.isEmpty()) {
                RewardPurchaseTransaction first = rows.get(0);
                if (first.getStatus() == RewardPurchaseTransaction.StatusEnum.APPROVED) {
                    approvedRow = first;
                }
            }
            if (approvedRow != null) {
                break;
            }
        }
        assertNotNull(approvedRow);

        String refundId = approvedRow.getId() != null ? approvedRow.getId() : rewardTransactionId;
        V2LoyaltiesProgramsRewardsPurchasesRefundRequestBody refundBody =
                new V2LoyaltiesProgramsRewardsPurchasesRefundRequestBody();
        RewardPurchaseRefundPolicies policies = new RewardPurchaseRefundPolicies();
        policies.setRefund(RewardPurchaseRefundPolicies.RefundEnum.ALLOW);
        policies.setStock(RewardPurchaseRefundPolicies.StockEnum.DEFAULT);
        refundBody.setPolicies(policies);
        programsApi.refundRewardPurchase(fixtureCtx.programId, refundId, refundBody);
    }

    @Test
    @Order(6)
    void examineAndReportsViaSdk() throws ApiException {
        LoyaltiesExamineEarningRulesExamineRequestBodyTrigger trigger =
                new LoyaltiesExamineEarningRulesExamineRequestBodyTrigger();
        trigger.setType(LoyaltiesExamineEarningRulesExamineRequestBodyTrigger.TypeEnum.SPECIFIC);
        LoyaltiesExamineEarningRulesExamineRequestBodyTriggerSpecific specific =
                new LoyaltiesExamineEarningRulesExamineRequestBodyTriggerSpecific();
        specific.setEvent(
                LoyaltiesExamineEarningRulesExamineRequestBodyTriggerSpecific.EventEnum
                        .ORDER_PAID);
        trigger.setSpecific(specific);

        ExamineCustomerIdentification identification = new ExamineCustomerIdentification();
        identification.setType(ExamineCustomerIdentification.TypeEnum.MEMBER_ID);
        identification.setMemberId(memberId);

        LoyaltiesExamineEarningRulesExamineRequestBodyCustomerOrderPaid orderPaid =
                new LoyaltiesExamineEarningRulesExamineRequestBodyCustomerOrderPaid();
        LoyaltiesExamineEarningRulesExamineRequestBodyOrder order =
                new LoyaltiesExamineEarningRulesExamineRequestBodyOrder();
        order.setAmount(BigDecimal.valueOf(5000));
        orderPaid.setOrder(order);

        LoyaltiesExamineEarningRulesExamineRequestBody earningRulesBody =
                new LoyaltiesExamineEarningRulesExamineRequestBody();
        earningRulesBody.setTrigger(trigger);
        earningRulesBody.setCustomerIdentification(identification);
        earningRulesBody.setCustomerOrderPaid(orderPaid);
        assertNotNull(examineApi.examineEarningRules(earningRulesBody));

        LoyaltiesExamineRewardsExamineRequestBody rewardsBody =
                new LoyaltiesExamineRewardsExamineRequestBody();
        rewardsBody.setCustomerIdentification(identification);
        assertNotNull(examineApi.examineRewards(rewardsBody));

        LoyaltiesProgramsReportsMembersSummaryListResponseBody membersSummary =
                programsApi.listProgramMembersSummaryReports(fixtureCtx.programId);
        assertNotNull(membersSummary.getData());

        LoyaltiesProgramsReportsRewardsSummaryListResponseBody rewardsSummary =
                programsApi.listProgramRewardsSummaryReports(fixtureCtx.programId, null);
        assertNotNull(rewardsSummary.getData());

        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(1);
        LoyaltiesProgramsReportsMembersDailyListResponseBody membersDaily =
                programsApi.listProgramMembersDailyReports(
                        fixtureCtx.programId, startDate, endDate, "day");
        assertNotNull(membersDaily.getData());

        LoyaltiesProgramsMembersCardsReportsDailyListResponseBody cardDaily =
                programsApi.listMemberCardDailyReports(
                        fixtureCtx.programId,
                        memberId,
                        primaryCardId,
                        startDate,
                        endDate,
                        "day");
        assertNotNull(cardDaily.getData());
    }

    private static String resolvePrimaryCardId(List<MemberCard> cards, String cardDefinitionId) {
        for (MemberCard entry : cards) {
            CardSimple card = entry.getCard();
            if (card != null && cardDefinitionId.equals(card.getCardDefinitionId())) {
                return card.getId();
            }
        }
        if (!cards.isEmpty() && cards.get(0).getCard() != null) {
            return cards.get(0).getCard().getId();
        }
        fail("No loyalty card on member");
        return null;
    }

    private static void ignoreApi(String label, ThrowingApiRunnable action) {
        try {
            action.run();
        } catch (ApiException e) {
            if (e.getCode() == 404) {
                return;
            }
            System.out.println(label + ": " + e.getMessage());
        }
    }

    @FunctionalInterface
    private interface ThrowingApiRunnable {
        void run() throws ApiException;
    }
}
