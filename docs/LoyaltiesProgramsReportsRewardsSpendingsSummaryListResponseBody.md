

# LoyaltiesProgramsReportsRewardsSpendingsSummaryListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/rewards/spendings/summary`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;RewardsSpendingsReportSummaryEntry&gt;**](RewardsSpendingsReportSummaryEntry.md) | List of summary rows, one per reward, cost, spending, and card definition with an approved point spend, ordered by &#x60;id&#x60; descending. Contains at most 100 rows. Empty when no approved point spend was recorded. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



