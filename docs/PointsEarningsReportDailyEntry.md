

# PointsEarningsReportDailyEntry

Aggregated daily program points-earnings statistics for one period, earning rule, earning item, and card definition. All numeric fields default to 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**earningRuleId** | **String** | Identifies the earning rule (format &#x60;lern_...&#x60;). |
|**earningItemId** | **String** | Identifies the earning item that produced the points (format: &#x60;lernei_&#x60; followed by hexadecimal characters). |
|**cardDefinitionId** | **String** | Identifies the card definition (format &#x60;lcdef_...&#x60;). |
|**date** | **LocalDate** | Identifies the start of the truncated aggregation period (&#x60;YYYY-MM-DD&#x60;). For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**successCount** | **BigDecimal** | Counts earning operations that credited points or added pending points in the period. |
|**points** | **BigDecimal** | Sums points credited immediately by earning rules in the period. Pending points activated in the period are not included. |
|**pendingPoints** | **BigDecimal** | Sums pending points added in the period. Activated and canceled pending points are not deducted. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_points_earnings_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_POINTS_EARNINGS_DAILY_REPORT | &quot;program_points_earnings_daily_report&quot; |



