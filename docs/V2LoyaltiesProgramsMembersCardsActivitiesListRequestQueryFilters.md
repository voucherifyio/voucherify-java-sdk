

# V2LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFilters

Field-specific filters for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/activities`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Joins the field filters. Allowed values are &#x60;AND&#x60; and &#x60;OR&#x60;. Defaults to &#x60;AND&#x60;. |
|**id** | [**LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFiltersId**](LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFiltersId.md) |  |
|**type** | [**LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFiltersType**](LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFiltersType.md) |  |
|**createdAt** | [**DateFilter**](DateFilter.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



