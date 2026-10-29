package io.voucherify.loyalty;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

import io.voucherify.Utils;

/**
 * HTTP-only setup and teardown for Loyalty v2 e2e tests.
 */
public final class LoyaltyV2Fixture {
    private LoyaltyV2Fixture() {}

    public static class Context {
        public String suffix;
        public String programId;
        public String cardDefinitionId;
        public String rewardCardDefinitionId;
        public String earningRuleId;
        public String rewardId;
        public String programName;
    }

    public static Context setup() throws LoyaltyV2HttpException {
        String suffix = System.currentTimeMillis() + "_" + Utils.getAlphaNumericString(6);
        String programName = "java_sdk_lv2_program_" + suffix;
        String cardName = "java_sdk_lv2_card_" + suffix;
        String earningRuleName = "java_sdk_lv2_earn_" + suffix;
        String rewardName = "java_sdk_lv2_reward_" + suffix;

        JsonObject programBody = new JsonObject();
        programBody.addProperty("name", programName);
        String programId = LoyaltyV2Http.id(LoyaltyV2Http.createProgram(programBody));
        if (programId == null) {
            throw new LoyaltyV2HttpException(0, "createProgram returned no id", null);
        }

        JsonObject spendCardBody = buildCardDefinitionBody(cardName, true);
        String cardDefinitionId =
                LoyaltyV2Http.id(LoyaltyV2Http.createCardDefinition(spendCardBody));
        if (cardDefinitionId == null) {
            throw new LoyaltyV2HttpException(0, "createCardDefinition returned no id", null);
        }
        LoyaltyV2Http.activateCardDefinition(cardDefinitionId);

        JsonObject rewardCardBody =
                buildCardDefinitionBody("java_sdk_lv2_reward_card_" + suffix, false);
        String rewardCardDefinitionId =
                LoyaltyV2Http.id(LoyaltyV2Http.createCardDefinition(rewardCardBody));
        if (rewardCardDefinitionId == null) {
            throw new LoyaltyV2HttpException(
                    0, "createCardDefinition (reward target) returned no id", null);
        }
        LoyaltyV2Http.activateCardDefinition(rewardCardDefinitionId);

        JsonObject earningRuleBody = buildEarningRuleBody(earningRuleName, cardDefinitionId);
        String earningRuleId =
                LoyaltyV2Http.id(LoyaltyV2Http.createEarningRule(earningRuleBody));
        if (earningRuleId == null) {
            throw new LoyaltyV2HttpException(0, "createEarningRule returned no id", null);
        }
        LoyaltyV2Http.activateEarningRule(earningRuleId);

        JsonObject rewardBody =
                buildRewardBody(rewardName, cardDefinitionId, rewardCardDefinitionId);
        String rewardId = LoyaltyV2Http.id(LoyaltyV2Http.createReward(rewardBody));
        if (rewardId == null) {
            throw new LoyaltyV2HttpException(0, "createReward returned no id", null);
        }
        LoyaltyV2Http.activateReward(rewardId);

        JsonObject cardAssign = new JsonObject();
        JsonArray cardIds = new JsonArray();
        JsonObject card1 = new JsonObject();
        card1.addProperty("id", cardDefinitionId);
        cardIds.add(card1);
        JsonObject card2 = new JsonObject();
        card2.addProperty("id", rewardCardDefinitionId);
        cardIds.add(card2);
        cardAssign.add("assign", cardIds);
        LoyaltyV2Http.batchAssignCardDefinitions(programId, cardAssign);

        JsonObject ruleAssign = new JsonObject();
        JsonArray ruleIds = new JsonArray();
        JsonObject rule = new JsonObject();
        rule.addProperty("id", earningRuleId);
        ruleIds.add(rule);
        ruleAssign.add("assign", ruleIds);
        LoyaltyV2Http.batchAssignEarningRules(programId, ruleAssign);

        JsonObject rewardAssign = new JsonObject();
        JsonArray rewardIds = new JsonArray();
        JsonObject rewardAssignItem = new JsonObject();
        rewardAssignItem.addProperty("id", rewardId);
        JsonObject stock = new JsonObject();
        stock.addProperty("type", "UNLIMITED");
        rewardAssignItem.add("stock", stock);
        rewardIds.add(rewardAssignItem);
        rewardAssign.add("assign", rewardIds);
        LoyaltyV2Http.batchAssignRewards(programId, rewardAssign);

        LoyaltyV2Http.activateProgram(programId);

        Context ctx = new Context();
        ctx.suffix = suffix;
        ctx.programId = programId;
        ctx.cardDefinitionId = cardDefinitionId;
        ctx.rewardCardDefinitionId = rewardCardDefinitionId;
        ctx.earningRuleId = earningRuleId;
        ctx.rewardId = rewardId;
        ctx.programName = programName;
        return ctx;
    }

    public static void teardown(Context ctx) {
        if (ctx == null) {
            return;
        }
        ignore("deactivateProgram", () -> LoyaltyV2Http.deactivateProgram(ctx.programId));
        ignore("deleteProgram", () -> LoyaltyV2Http.deleteProgram(ctx.programId));

        if (ctx.earningRuleId != null) {
            ignore(
                    "deactivateEarningRule",
                    () -> LoyaltyV2Http.deactivateEarningRule(ctx.earningRuleId));
        }
        if (ctx.rewardId != null) {
            ignore("deactivateReward", () -> LoyaltyV2Http.deactivateReward(ctx.rewardId));
        }

        sleepQuietly(500);

        if (ctx.earningRuleId != null) {
            ignore("deleteEarningRule", () -> LoyaltyV2Http.deleteEarningRule(ctx.earningRuleId));
        }
        if (ctx.rewardId != null) {
            ignore("deleteReward", () -> LoyaltyV2Http.deleteReward(ctx.rewardId));
        }
        for (String cardId : new String[] {ctx.cardDefinitionId, ctx.rewardCardDefinitionId}) {
            if (cardId != null) {
                ignore("deleteCardDefinition", () -> LoyaltyV2Http.deleteCardDefinition(cardId));
            }
        }
    }

    private static JsonObject buildCardDefinitionBody(String name, boolean enablePayWithPoints) {
        JsonObject body = new JsonObject();
        body.addProperty("name", name);
        body.addProperty("type", "INDIVIDUAL");
        body.addProperty("status", "DRAFT");

        JsonObject pointsExpiration = new JsonObject();
        pointsExpiration.addProperty("type", "NO_EXPIRATION");
        body.add("points_expiration", pointsExpiration);

        JsonObject pendingPoints = new JsonObject();
        pendingPoints.addProperty("type", "IMMEDIATE");
        body.add("pending_points", pendingPoints);

        JsonObject spendingLimits = new JsonObject();
        JsonObject global = new JsonObject();
        global.addProperty("type", "NO_LIMIT");
        global.add("limits", JsonNull.INSTANCE);
        JsonObject transactions = new JsonObject();
        transactions.addProperty("type", "NO_LIMIT");
        transactions.add("limits", JsonNull.INSTANCE);
        spendingLimits.add("global", global);
        spendingLimits.add("transactions", transactions);
        body.add("spending_limits", spendingLimits);

        JsonObject payWithPoints = new JsonObject();
        if (enablePayWithPoints) {
            payWithPoints.addProperty("type", "EXCHANGE_RATIO");
            JsonObject exchangeRatio = new JsonObject();
            exchangeRatio.addProperty("formula", 1);
            payWithPoints.add("exchange_ratio", exchangeRatio);
        } else {
            payWithPoints.addProperty("type", "NO_PAYMENTS");
        }
        body.add("pay_with_points", payWithPoints);
        return body;
    }

    private static JsonObject buildEarningRuleBody(String name, String cardDefinitionId) {
        JsonObject body = new JsonObject();
        body.addProperty("name", name);
        body.addProperty("status", "DRAFT");

        JsonObject trigger = new JsonObject();
        trigger.addProperty("event", "customer.order.paid");
        body.add("trigger", trigger);

        JsonArray earnings = new JsonArray();
        JsonObject earning = new JsonObject();
        JsonArray effects = new JsonArray();
        JsonObject effect = new JsonObject();
        effect.addProperty("type", "POINTS");
        JsonObject points = new JsonObject();
        points.addProperty("value", 100);
        points.addProperty("card_definition_id", cardDefinitionId);
        effect.add("points", points);
        effects.add(effect);
        earning.add("effects", effects);
        earnings.add(earning);
        body.add("earnings", earnings);
        return body;
    }

    private static JsonObject buildRewardBody(
            String name, String spendCardDefinitionId, String creditCardDefinitionId) {
        JsonObject body = new JsonObject();
        body.addProperty("name", name);
        body.addProperty("type", "DIGITAL");
        body.addProperty("status", "DRAFT");
        body.add("material", JsonNull.INSTANCE);

        JsonObject digital = new JsonObject();
        digital.addProperty("type", "LOYALTY_CARD_POINTS");
        digital.add("discount_coupons", JsonNull.INSTANCE);
        digital.add("gift_vouchers", JsonNull.INSTANCE);
        JsonObject loyaltyCardPoints = new JsonObject();
        loyaltyCardPoints.addProperty("points", 5);
        loyaltyCardPoints.addProperty("card_definition_id", creditCardDefinitionId);
        digital.add("loyalty_card_points", loyaltyCardPoints);
        body.add("digital", digital);

        JsonArray costs = new JsonArray();
        JsonObject cost = new JsonObject();
        JsonArray spending = new JsonArray();
        JsonObject spend = new JsonObject();
        spend.addProperty("points", 10);
        spend.addProperty("card_definition_id", spendCardDefinitionId);
        spending.add(spend);
        cost.add("spending", spending);
        costs.add(cost);
        body.add("costs", costs);
        return body;
    }

    private static void ignore(String label, ThrowingRunnable action) {
        try {
            action.run();
        } catch (LoyaltyV2HttpException e) {
            if (e.getStatus() == 404) {
                return;
            }
            System.out.println("Loyalty v2 teardown " + label + ": " + e.getMessage());
        }
    }

    private static void sleepQuietly(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @FunctionalInterface
    private interface ThrowingRunnable {
        void run() throws LoyaltyV2HttpException;
    }
}
