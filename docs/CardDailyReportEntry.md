

# CardDailyReportEntry

Aggregated card points statistics for one period. Each field sums the operations of one kind recorded in the period. All numeric fields default to 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**date** | **LocalDate** | Identifies the start of the truncated aggregation period (&#x60;YYYY-MM-DD&#x60;). For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**pointsTotal** | **BigDecimal** | Points credited to the card in the period. Sums &#x60;points_earned&#x60;, &#x60;points_added&#x60;, and &#x60;points_purchased&#x60;. Points spent, expired, subtracted, refunded, returned, or reversed are not deducted. |
|**pointsEarned** | **BigDecimal** | Points earned through earning rules in the period. Includes pending points activated in the period. |
|**pointsAdded** | **BigDecimal** | Points added manually in the period. |
|**pointsPurchased** | **BigDecimal** | Points purchased (e.g. via loyalty-card-points rewards) in the period. |
|**pointsPurchasedReversed** | **BigDecimal** | Purchased points reversed (e.g. by reward refunds) in the period. |
|**pointsSubtracted** | **BigDecimal** | Points subtracted manually in the period. |
|**pointsExpired** | **BigDecimal** | Points expired in the period. |
|**pointsSpent** | **BigDecimal** | Points spent (on rewards and order payments) in the period. |
|**pointsRefunded** | **BigDecimal** | Points refunded in the period. |
|**pointsReturned** | **BigDecimal** | Points returned in the period. |
|**pointsLocked** | **BigDecimal** | Points locked in the period. |
|**pointsUnlocked** | **BigDecimal** | Points unlocked in the period. Includes points released when a spending transaction is approved (also counted in &#x60;points_spent&#x60;) or rejected. |
|**pendingPointsTotal** | **BigDecimal** | Pending points added in the period. Activated and canceled pending points are not deducted. |
|**pendingPointsActivated** | **BigDecimal** | Pending points activated in the period. Also counted in &#x60;points_earned&#x60; and &#x60;points_total&#x60;. |
|**pendingPointsCanceled** | **BigDecimal** | Pending points canceled in the period. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;card_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD_DAILY_REPORT | &quot;card_daily_report&quot; |



