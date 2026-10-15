

# RewardsSpendingsReportSummaryEntry

All-time points spent on one reward cost and spending for one card definition. Counts and points that did not occur are 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**rewardId** | **String** | Identifies the reward (&#x60;lrew_...&#x60;). |
|**costId** | **String** | Identifies the reward cost (&#x60;lrcst_...&#x60;). |
|**spendingId** | **String** | Identifies the reward spending (&#x60;lrspn_...&#x60;). |
|**cardDefinitionId** | **String** | Identifies the card definition (&#x60;lcdef_...&#x60;). |
|**id** | **String** | Identifies the summary row (format: &#x60;lprss_&#x60; followed by hexadecimal characters). |
|**successCount** | **BigDecimal** | Counts approved reward point spends. |
|**points** | **BigDecimal** | Totals points spent on those reward spends. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_rewards_spendings_summary_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_REWARDS_SPENDINGS_SUMMARY_REPORT | &quot;program_rewards_spendings_summary_report&quot; |



