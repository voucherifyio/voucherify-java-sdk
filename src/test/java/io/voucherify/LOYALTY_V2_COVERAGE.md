# Loyalty v2 e2e coverage (Java SDK)

This document describes what `LoyaltiesV2Test` exercises for Loyalty v2 in the Java SDK, and which admin calls still go through `LoyaltyV2Http` because they are not on the published allowlist.

It is **not** a full API contract suite. Coverage is one happy-path flow against a live project.

## Files

| File | Role |
|------|------|
| `LoyaltiesV2Test.java` | JUnit 5 suite (SDK runtime + light reports/examine) |
| `loyalty/LoyaltyV2Fixture.java` | HTTP setup / teardown |
| `loyalty/LoyaltyV2Http.java` | JDK `HttpClient` for unpublished admin paths |
| `Utils.java` | Shared credentials and `ApiClient` |

`npm run generate-sdk-java` deletes `src/main`, `docs`, and `api`. It does **not** delete `src/test`, so these files survive regeneration.

## Client split

| Concern | Client | Why |
|---------|--------|-----|
| Program / card definition / earning rule / reward admin | **HTTP** (`LoyaltyV2Http`) | Not on the published Java SDK allowlist |
| Member lifecycle, points, payments, purchases, examine, selected reports | **SDK** (`Lv2ProgramsApi`, `Lv2ExamineApi`) | Allowlisted Loyalty v2 operations |
| Test customer + order | **SDK** (`CustomersApi`, `OrdersApi`) | Existing v1 helpers |

## Depth legend

| Depth | Meaning |
|-------|---------|
| **Smoke** | Call succeeds; body present; light shape checks |
| **Basic** | Smoke + id/status/list membership checks |
| **Flow** | Multi-step happy path |

---

## Covered via published SDK

### Members (`Lv2ProgramsApi`)

| Method | HTTP | Depth | Notes |
|--------|------|-------|-------|
| `createProgramMember` | `POST .../members` | Flow | `customer_id` identification |
| `getProgramMember` | `GET .../members/{memberId}` | Basic | Id match; cards present |
| `listProgramMembers` | `GET .../members` | Basic | Created member in list |
| `getProgramMembership` | `GET .../memberships/{customerId}` | Smoke | Response present |
| `activateProgramMember` | `POST .../activate` | Basic | Status becomes active |
| `deactivateProgramMember` | `POST .../deactivate` | Basic | Status not active |
| `deleteProgramMember` | `DELETE .../members/{memberId}` | Smoke | Cleanup in `@AfterAll` |

Not covered: `batchCreateProgramMembers`, `updateProgramMember`, member activities.

### Cards / points (`Lv2ProgramsApi`)

| Method | HTTP | Depth | Notes |
|--------|------|-------|-------|
| `adjustCardPoints` | `POST .../cards/{cardId}/points` | Flow | +100 admin credit; 3s wait |
| `listCardTransactions` | `GET .../cards/{cardId}/transactions` | Basic | Non-empty after adjust |

### Order payments (`Lv2ProgramsApi` + `OrdersApi`)

| Method | HTTP | Depth | Notes |
|--------|------|-------|-------|
| `createOrder` | `POST /v1/orders` | Smoke | Fixture order |
| `createMemberOrderPayment` | `POST .../orders/payments` | Flow | `DRY_RUN`, `CARD_BALANCE` |
| `listMemberOrderPayments` | `GET .../orders/payments` | Smoke | Response present |

Requires spend card with `pay_with_points.type = EXCHANGE_RATIO` (fixture).

### Reward purchases (`Lv2ProgramsApi`)

| Method | HTTP | Depth | Notes |
|--------|------|-------|-------|
| `purchaseMemberReward` | `POST .../rewards/purchases` | Flow | Dry-run then transaction |
| `listMemberRewardPurchases` | `GET .../rewards/purchases` | Basic | Poll until `APPROVED` |
| `refundRewardPurchase` | `POST .../rewards/purchases/{id}/refund` | Flow | `policies.refund = ALLOW` |

### Examine (`Lv2ExamineApi`)

| Method | HTTP | Depth |
|--------|------|-------|
| `examineEarningRules` | `POST /v2/loyalties/examine/earning-rules` | Smoke |
| `examineRewards` | `POST /v2/loyalties/examine/rewards` | Smoke |

### Reports (`Lv2ProgramsApi`) — subset

| Method | Depth |
|--------|-------|
| `listProgramMembersSummaryReports` | Smoke |
| `listProgramRewardsSummaryReports` | Smoke |
| `listProgramMembersDailyReports` | Smoke |
| `listMemberCardDailyReports` | Smoke |

---

## HTTP helper — migration map

When an operation is added to `scripts/shared/get-take-list.ts` and regenerated into the Java SDK, replace the `LoyaltyV2Http` wrapper with the generated API class (expected tag prefix `Lv2ProgramsApi`, `Lv2EarningRulesApi`, or `Lv2RewardsApi` depending on the OpenAPI tag).

| `LoyaltyV2Http` | HTTP | Future SDK target (when allowlisted) |
|-----------------|------|--------------------------------------|
| `createProgram` | `POST /v2/loyalties/programs` | `Lv2ProgramsApi.createProgram` (or programs admin API from generator) |
| `activateProgram` | `POST .../programs/{id}/activate` | matching activate method on programs admin API |
| `deactivateProgram` | `POST .../programs/{id}/deactivate` | matching deactivate method |
| `deleteProgram` | `DELETE .../programs/{id}` | matching delete method |
| `createCardDefinition` | `POST /v2/loyalties/card-definitions` | card-definitions admin API |
| `activateCardDefinition` | `POST .../card-definitions/{id}/activate` | matching activate |
| `deleteCardDefinition` | `DELETE .../card-definitions/{id}` | matching delete |
| `createEarningRule` | `POST /v2/loyalties/earning-rules` | earning-rules admin API |
| `activateEarningRule` / `deactivateEarningRule` / `deleteEarningRule` | POST/DELETE on earning rule | matching methods |
| `createReward` | `POST /v2/loyalties/rewards` | rewards admin API |
| `activateReward` / `deactivateReward` / `deleteReward` | POST/DELETE on reward | matching methods |
| `batchAssignCardDefinitions` | `POST .../card-definitions/batch` | batch assign on programs API |
| `batchAssignEarningRules` | `POST .../earning-rules/batch` | batch assign |
| `batchAssignRewards` | `POST .../rewards/batch` | batch assign |

Setup-only in the fixture; no per-call assertions beyond setup ids in test order `1`.

### Teardown order (`LoyaltyV2Fixture.teardown`)

1. SDK: deactivate/delete member and customer (`LoyaltiesV2Test.@AfterAll`)
2. HTTP: deactivate + delete program (drops assignments)
3. HTTP: deactivate + delete earning rule and reward
4. HTTP: delete both card definitions

## How to run

From the OpenAPI repo (Docker, same `.env` as other Java tests):

```bash
npm run test-java-sdk
```

Or locally in `sdks/java`:

```bash
mvn -Dtest=LoyaltiesV2Test test
```
