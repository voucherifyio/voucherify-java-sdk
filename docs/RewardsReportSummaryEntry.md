

# RewardsReportSummaryEntry

All-time reward-purchase counts for one reward. Counts that did not occur are 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the summary row (format: &#x60;lprrs_&#x60; followed by hexadecimal characters). |
|**rewardId** | **String** | Identifies the reward (&#x60;lrew_...&#x60;). |
|**successCount** | **BigDecimal** | Counts approved reward purchases. |
|**failuresCount** | **BigDecimal** | Counts reward purchase attempts that failed. |
|**failuresBreakdown** | **Object** | Counts failed reward purchase attempts by reason. A reason is present only when it was recorded. Empty when no failures were recorded. Keys can also be a card-transaction rejection reason or a publication error key. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_rewards_summary_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_REWARDS_SUMMARY_REPORT | &quot;program_rewards_summary_report&quot; |



