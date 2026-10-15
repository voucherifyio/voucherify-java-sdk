

# LoyaltiesProgramsReportsRewardsSummaryListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/reports/rewards/summary`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;RewardsReportSummaryEntry&gt;**](RewardsReportSummaryEntry.md) | List of summary rows, one per reward with a recorded purchase attempt, ordered by &#x60;id&#x60; descending. Contains at most 100 rows. Empty when no purchase attempts were recorded. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



