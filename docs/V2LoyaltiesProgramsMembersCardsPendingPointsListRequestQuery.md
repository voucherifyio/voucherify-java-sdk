

# V2LoyaltiesProgramsMembersCardsPendingPointsListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/pending-points`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | How multiple field filters are combined. Defaults to &#x60;AND&#x60;. |
|**cardDefinitionId** | [**CardDefinitionIdFilterConditions**](CardDefinitionIdFilterConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



