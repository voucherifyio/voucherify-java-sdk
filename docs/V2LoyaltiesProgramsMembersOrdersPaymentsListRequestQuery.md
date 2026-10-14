

# V2LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/orders/payments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Joins field filters with &#x60;AND&#x60; or &#x60;OR&#x60;. Defaults to &#x60;AND&#x60;. |
|**id** | [**LoyaltiesProgramsMembersOrdersPaymentsListRequestQueryId**](LoyaltiesProgramsMembersOrdersPaymentsListRequestQueryId.md) |  |
|**cardDefinitionId** | [**LoyaltiesProgramsMembersRewardsPurchasesListRequestQueryCardDefinitionId**](LoyaltiesProgramsMembersRewardsPurchasesListRequestQueryCardDefinitionId.md) |  |
|**createdAt** | [**TransactionFilterDateConditions**](TransactionFilterDateConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



