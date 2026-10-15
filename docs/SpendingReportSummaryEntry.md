

# SpendingReportSummaryEntry

Total program spending statistics for one card definition that has recorded spending. Numeric fields default to `0`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the summary row (&#x60;lssum_...&#x60;). |
|**cardDefinitionId** | **String** | Identifies the card definition (&#x60;lcdef_...&#x60;). |
|**success** | **BigDecimal** | Counts successful spending operations. |
|**successOnReward** | **BigDecimal** | Counts successful reward purchases. |
|**successOnOrder** | **BigDecimal** | Counts successful order payments. |
|**points** | **BigDecimal** | Totals points spent. |
|**pointsOnRewards** | **BigDecimal** | Totals points spent on reward purchases. |
|**pointsOnOrder** | **BigDecimal** | Totals points spent on order payments. |
|**amountOnOrder** | **BigDecimal** | Totals order amount paid with points. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;spending_summary_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| SPENDING_SUMMARY_REPORT | &quot;spending_summary_report&quot; |



