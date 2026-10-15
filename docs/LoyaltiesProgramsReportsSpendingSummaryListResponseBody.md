

# LoyaltiesProgramsReportsSpendingSummaryListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/spending/summary`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;SpendingReportSummaryEntry&gt;**](SpendingReportSummaryEntry.md) | Lists summary rows, one per card definition that has recorded spending. Contains at most 10 rows (max number of card definitions per program), ordered by &#x60;id&#x60; descending. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



