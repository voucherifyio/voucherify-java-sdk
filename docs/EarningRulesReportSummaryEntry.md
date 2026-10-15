

# EarningRulesReportSummaryEntry

Total program earning-rule evaluation statistics for one earning rule. All numeric fields default to 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the summary row (format: &#x60;lpers_&#x60; followed by hexadecimal characters). |
|**earningRuleId** | **String** | Identifies the earning rule (format &#x60;lern_...&#x60;). |
|**successCount** | **BigDecimal** | Counts eligibility checks that passed the trigger limit. |
|**failuresCount** | **BigDecimal** | Counts eligibility checks that failed the trigger limit. |
|**failuresBreakdown** | [**EarningRulesReportFailuresBreakdown**](EarningRulesReportFailuresBreakdown.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_earning_rules_summary_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_EARNING_RULES_SUMMARY_REPORT | &quot;program_earning_rules_summary_report&quot; |



