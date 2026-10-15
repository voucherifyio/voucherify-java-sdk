

# LoyaltiesProgramsReportsRewardsSpendingsDailyListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/rewards/spendings/daily`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;RewardsSpendingsReportDailyEntry&gt;**](RewardsSpendingsReportDailyEntry.md) | List of report entries, one per reward, cost, spending, card definition, and aggregation period with an approved point spend, ordered by &#x60;date&#x60; ascending. Empty when no approved point spend was recorded in the range. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



