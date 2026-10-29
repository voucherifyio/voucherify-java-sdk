

# TierTransactionOrigin

Origin of the tier transaction.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Origin type. &#x60;card_operations&#x60; - point operations on the card. &#x60;daily_task_operations&#x60; - scheduled daily tier processing. &#x60;member_card_created&#x60; - a member card was created. &#x60;member_card_deleted&#x60; - a member card was deleted. &#x60;segment_change&#x60; - the customer entered or left a segment used in tier qualification. |
|**cardTransactionIds** | **List&lt;String&gt;** | Unique identifiers of the card transactions that triggered the transaction (format &#x60;lctx_...&#x60;). Returned for the &#x60;card_operations&#x60; origin. |
|**segmentIds** | **List&lt;String&gt;** | Unique identifiers of the customer segments that triggered the transaction. Returned for the &#x60;segment_change&#x60; origin. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CARD_OPERATIONS | &quot;card_operations&quot; |
| DAILY_TASK_OPERATIONS | &quot;daily_task_operations&quot; |
| MEMBER_CARD_CREATED | &quot;member_card_created&quot; |
| MEMBER_CARD_DELETED | &quot;member_card_deleted&quot; |
| SEGMENT_CHANGE | &quot;segment_change&quot; |



