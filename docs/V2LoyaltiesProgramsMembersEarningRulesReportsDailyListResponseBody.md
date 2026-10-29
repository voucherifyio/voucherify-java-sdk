

# V2LoyaltiesProgramsMembersEarningRulesReportsDailyListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/earning-rules/{earningRuleId}/reports/daily`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;EarningRuleDailyReportEntry&gt;**](EarningRuleDailyReportEntry.md) | List of report entries, one per aggregation period with recorded activity, ordered by &#x60;date&#x60; ascending. Empty when no activity was recorded in the range. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REPORT | &quot;report&quot; |



