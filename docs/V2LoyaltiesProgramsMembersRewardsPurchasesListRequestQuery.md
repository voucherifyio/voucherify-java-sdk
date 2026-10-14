

# V2LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/rewards/purchases`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Logical junction between the field filters. Defaults to AND behavior. |
|**id** | [**LoyaltiesProgramsMembersRewardsPurchasesListRequestQueryId**](LoyaltiesProgramsMembersRewardsPurchasesListRequestQueryId.md) |  |
|**rewardId** | [**LoyaltiesProgramsMembersRewardsPurchasesListRequestQueryRewardId**](LoyaltiesProgramsMembersRewardsPurchasesListRequestQueryRewardId.md) |  |
|**cardDefinitionId** | [**LoyaltiesProgramsMembersRewardsPurchasesListRequestQueryCardDefinitionId**](LoyaltiesProgramsMembersRewardsPurchasesListRequestQueryCardDefinitionId.md) |  |
|**createdAt** | [**TransactionFilterDateConditions**](TransactionFilterDateConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



