

# OrderPaymentRejection

Rejection details for a rejected order payment transaction.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**reason** | **String** | Machine-readable rejection reason. Order-side: &#x60;ORDER_NOT_FOUND&#x60;, &#x60;PAYMENT_EXCEEDS_ORDER_TOTAL_AMOUNT&#x60;. Card-side (when the linked card transaction fails first): &#x60;NOT_ENOUGH_BALANCE&#x60;, &#x60;GLOBAL_SPENDING_LIMIT_EXCEEDED&#x60;, &#x60;TRANSACTION_SPENDING_LIMIT_EXCEEDED&#x60;. |
|**details** | **Object** | Structured rejection context. Omitted when the reason carries no extra data (&#x60;ORDER_NOT_FOUND&#x60;, &#x60;PAYMENT_EXCEEDS_ORDER_TOTAL_AMOUNT&#x60;, &#x60;NOT_ENOUGH_BALANCE&#x60;). For &#x60;GLOBAL_SPENDING_LIMIT_EXCEEDED&#x60;: &#x60;type&#x60;, &#x60;limit&#x60;, &#x60;spendings&#x60;. For &#x60;TRANSACTION_SPENDING_LIMIT_EXCEEDED&#x60;: &#x60;type&#x60;, &#x60;limit&#x60;. |



