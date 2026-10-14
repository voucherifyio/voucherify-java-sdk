

# V2LoyaltiesProgramsMembersActivitiesListRequestQueryFilters

Field-specific filters for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/activities`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | How multiple field filters are combined. Defaults to &#x60;AND&#x60;. |
|**id** | [**LoyaltiesProgramsMembersActivitiesListRequestQueryFiltersId**](LoyaltiesProgramsMembersActivitiesListRequestQueryFiltersId.md) |  |
|**type** | [**LoyaltiesProgramsMembersActivitiesListRequestQueryFiltersType**](LoyaltiesProgramsMembersActivitiesListRequestQueryFiltersType.md) |  |
|**createdAt** | [**DateFilter**](DateFilter.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



