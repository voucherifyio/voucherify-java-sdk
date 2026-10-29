

# LoyaltiesProgramsReportsSpendingDailyListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/spending/daily`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;SpendingReportDailyEntry&gt;**](SpendingReportDailyEntry.md) | List of report entries, one per card definition and aggregation period with recorded spending, ordered by &#x60;date&#x60; ascending. Empty when no spending was recorded in the range. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



