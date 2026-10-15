

# V2LoyaltiesProgramsMembersCardsPendingPointsListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/pending-points`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Joins the field filters. Allowed values are &#x60;AND&#x60; and &#x60;OR&#x60;. Defaults to &#x60;AND&#x60;. |
|**cardDefinitionId** | [**CardDefinitionIdFilterConditions**](CardDefinitionIdFilterConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



