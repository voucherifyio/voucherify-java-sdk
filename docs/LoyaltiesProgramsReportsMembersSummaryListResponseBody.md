

# LoyaltiesProgramsReportsMembersSummaryListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/members/summary`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;MembersReportSummaryEntry&gt;**](MembersReportSummaryEntry.md) | List of summary rows for the program. Contains one row when activity was recorded, ordered by &#x60;id&#x60; descending. Empty when no activity was recorded. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



