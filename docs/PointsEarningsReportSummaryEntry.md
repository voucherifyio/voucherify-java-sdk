

# PointsEarningsReportSummaryEntry

Total program points-earnings statistics for one earning rule, earning item, and card definition. All numeric fields default to 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**earningRuleId** | **String** | Identifies the earning rule (format &#x60;lern_...&#x60;). |
|**earningItemId** | **String** | Identifies the earning item that produced the points (format: &#x60;lernei_&#x60; followed by hexadecimal characters). |
|**cardDefinitionId** | **String** | Identifies the card definition (format &#x60;lcdef_...&#x60;). |
|**id** | **String** | Identifies the summary row (format: &#x60;lppes_&#x60; followed by hexadecimal characters). |
|**successCount** | **BigDecimal** | Counts earning operations that credited points or added pending points. |
|**points** | **BigDecimal** | Sums points credited immediately by earning rules. Pending points activated later are not included. |
|**pendingPoints** | **BigDecimal** | Sums pending points added. Activated and canceled pending points are not deducted. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_points_earnings_summary_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_POINTS_EARNINGS_SUMMARY_REPORT | &quot;program_points_earnings_summary_report&quot; |



