

# V2LoyaltiesProgramsMembersListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | How multiple field filters are combined. Defaults to &#x60;AND&#x60;. |
|**id** | [**LoyaltiesProgramsMembersListRequestQueryId**](LoyaltiesProgramsMembersListRequestQueryId.md) |  |
|**status** | [**LoyaltiesProgramsMembersListRequestQueryStatus**](LoyaltiesProgramsMembersListRequestQueryStatus.md) |  |
|**customerId** | [**LoyaltiesProgramsMembersListRequestQueryCustomerId**](LoyaltiesProgramsMembersListRequestQueryCustomerId.md) |  |
|**createdAt** | [**DateFilter**](DateFilter.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



