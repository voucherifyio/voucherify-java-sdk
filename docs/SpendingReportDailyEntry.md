

# SpendingReportDailyEntry

Aggregated program spending statistics for one period and card definition. Numeric fields default to `0`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**date** | **LocalDate** | Identifies the start of the truncated aggregation period (&#x60;YYYY-MM-DD&#x60;). For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**cardDefinitionId** | **String** | Identifies the card definition (&#x60;lcdef_...&#x60;). |
|**success** | **BigDecimal** | Counts successful spending operations in the period. |
|**successOnReward** | **BigDecimal** | Counts successful reward purchases in the period. |
|**successOnOrder** | **BigDecimal** | Counts successful order payments in the period. |
|**points** | **BigDecimal** | Totals points spent in the period. |
|**pointsOnRewards** | **BigDecimal** | Totals points spent on reward purchases in the period. |
|**pointsOnOrder** | **BigDecimal** | Totals points spent on order payments in the period. |
|**amountOnOrder** | **BigDecimal** | Totals order amount paid with points in the period. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;spending_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| SPENDING_DAILY_REPORT | &quot;spending_daily_report&quot; |



