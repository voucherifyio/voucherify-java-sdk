

# EarningRulesReportDailyEntry

Aggregated daily program earning-rule evaluation statistics for one period and earning rule. All numeric fields default to 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**date** | **LocalDate** | Identifies the start of the truncated aggregation period (&#x60;YYYY-MM-DD&#x60;). For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**earningRuleId** | **String** | Identifies the earning rule (format &#x60;lern_...&#x60;). |
|**successCount** | **BigDecimal** | Counts eligibility checks that passed the trigger limit in the period. |
|**failuresCount** | **BigDecimal** | Counts eligibility checks that failed the trigger limit in the period. |
|**failuresBreakdown** | **Object** | Always an empty object even if &#x60;failures_count&#x60; is above zero. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_earning_rules_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_EARNING_RULES_DAILY_REPORT | &quot;program_earning_rules_daily_report&quot; |



