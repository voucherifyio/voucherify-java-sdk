

# LoyaltiesProgramsReportsRewardsDailyListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/rewards/daily`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;RewardsReportDailyEntry&gt;**](RewardsReportDailyEntry.md) | List of report entries, one per reward and aggregation period with recorded purchases, ordered by &#x60;date&#x60; ascending. Empty when no purchases were recorded in the range. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



