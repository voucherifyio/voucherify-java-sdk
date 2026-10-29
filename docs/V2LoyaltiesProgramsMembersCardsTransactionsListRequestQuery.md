

# V2LoyaltiesProgramsMembersCardsTransactionsListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/transactions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Joins the field filters. Allowed values are &#x60;AND&#x60; and &#x60;OR&#x60;. Defaults to &#x60;AND&#x60;. |
|**id** | [**LoyaltiesProgramsMembersCardsTransactionsListRequestQueryId**](LoyaltiesProgramsMembersCardsTransactionsListRequestQueryId.md) |  |
|**createdAt** | [**DateFilter**](DateFilter.md) |  |
|**cardDefinitionId** | [**CardDefinitionIdFilterConditions**](CardDefinitionIdFilterConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



