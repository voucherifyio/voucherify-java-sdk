

# RewardsSpendingsReportDailyEntry

Aggregated points spent on one reward cost and spending for one period and card definition. Counts and points that did not occur in the period are 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**rewardId** | **String** | Identifies the reward (&#x60;lrew_...&#x60;). |
|**costId** | **String** | Identifies the reward cost (&#x60;lrcst_...&#x60;). |
|**spendingId** | **String** | Identifies the reward spending (&#x60;lrspn_...&#x60;). |
|**cardDefinitionId** | **String** | Identifies the card definition (&#x60;lcdef_...&#x60;). |
|**date** | **LocalDate** | Identifies the start of the truncated aggregation period (&#x60;YYYY-MM-DD&#x60;). For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**successCount** | **BigDecimal** | Counts approved reward point spends in the period. |
|**points** | **BigDecimal** | Totals points spent on those reward spends in the period. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_rewards_spendings_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_REWARDS_SPENDINGS_DAILY_REPORT | &quot;program_rewards_spendings_daily_report&quot; |



