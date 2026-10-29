package io.voucherify.loyalty;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoyaltyV2FixtureTest {
    @Test
    void setupAndTeardownCreatesProgramResources() throws Exception {
        Assumptions.assumeTrue(LoyaltyV2Http.hasCredentials(), "Missing X_APP_ID / X_APP_TOKEN");

        LoyaltyV2Fixture.Context ctx = LoyaltyV2Fixture.setup();
        try {
            assertNotNull(ctx.programId);
            assertTrue(ctx.programId.startsWith("lprg_"));
            assertNotNull(ctx.cardDefinitionId);
            assertTrue(ctx.cardDefinitionId.startsWith("lcdef_"));
            assertNotNull(ctx.earningRuleId);
            assertTrue(ctx.earningRuleId.startsWith("lern_"));
            assertNotNull(ctx.rewardId);
            assertTrue(ctx.rewardId.startsWith("lrew_"));
        } finally {
            LoyaltyV2Fixture.teardown(ctx);
        }
    }
}
