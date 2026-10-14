

# V2LoyaltiesProgramsMembersTiersTransactionsListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/tiers/transactions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Logical junction between the field filters. Defaults to AND behavior. |
|**cardId** | [**LoyaltiesProgramsMembersTiersTransactionsListRequestQueryCardId**](LoyaltiesProgramsMembersTiersTransactionsListRequestQueryCardId.md) |  |
|**cardDefinitionId** | [**LoyaltiesProgramsMembersTiersTransactionsListRequestQueryCardDefinitionId**](LoyaltiesProgramsMembersTiersTransactionsListRequestQueryCardDefinitionId.md) |  |
|**createdAt** | [**TransactionFilterDateConditions**](TransactionFilterDateConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



