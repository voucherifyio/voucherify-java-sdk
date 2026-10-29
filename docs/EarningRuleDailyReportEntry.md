

# EarningRuleDailyReportEntry

Aggregated daily earning-rule usage statistics for one member and earning rule in one period. Numeric fields default to 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**date** | **LocalDate** | Identifies the start of the truncated aggregation period (&#x60;YYYY-MM-DD&#x60;). For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**count** | **BigDecimal** | Counts successful earning-rule triggers for the member in the period. A trigger rejected by its limit check is not included. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;earning_rule_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EARNING_RULE_DAILY_REPORT | &quot;earning_rule_daily_report&quot; |



