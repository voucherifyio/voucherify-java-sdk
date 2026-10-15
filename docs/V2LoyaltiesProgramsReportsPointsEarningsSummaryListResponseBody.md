

# V2LoyaltiesProgramsReportsPointsEarningsSummaryListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/points-earnings/summary`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;PointsEarningsReportSummaryEntry&gt;**](PointsEarningsReportSummaryEntry.md) | List of summary rows, one per earning rule, earning item, and card definition with recorded activity, ordered by &#x60;id&#x60; descending. Contains at most 100 rows. Empty when no activity was recorded. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



