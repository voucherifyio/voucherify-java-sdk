

# V2LoyaltiesProgramsReportsTiersSummaryListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/tiers/summary`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;TiersReportSummaryEntry&gt;**](TiersReportSummaryEntry.md) | List of summary rows, one per tier structure and tier with recorded movement, ordered by &#x60;id&#x60; descending. Contains at most 100 rows. Empty when no movement was recorded. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



