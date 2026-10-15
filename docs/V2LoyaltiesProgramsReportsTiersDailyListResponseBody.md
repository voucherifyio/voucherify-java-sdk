

# V2LoyaltiesProgramsReportsTiersDailyListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/tiers/daily`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;TiersReportDailyEntry&gt;**](TiersReportDailyEntry.md) | List of report entries, one per tier structure, tier, and aggregation period with recorded movement, ordered by &#x60;date&#x60; ascending. Empty when no movement was recorded in the range. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



