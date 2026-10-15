

# RewardsReportDailyEntry

Aggregated reward-purchase counts for one period and reward. Counts that did not occur in the period are 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**date** | **LocalDate** | Identifies the start of the truncated aggregation period (&#x60;YYYY-MM-DD&#x60;). For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**rewardId** | **String** | Identifies the reward (&#x60;lrew_...&#x60;). |
|**successCount** | **BigDecimal** | Counts approved reward purchases in the period. |
|**failuresCount** | **BigDecimal** | Counts reward purchase attempts that failed in the period. |
|**failuresBreakdown** | **Object** | Always an empty object even if &#x60;failures_count&#x60; is above zero. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_rewards_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_REWARDS_DAILY_REPORT | &quot;program_rewards_daily_report&quot; |



