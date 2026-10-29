

# OrderPaymentTransactionDetailsSpendingCap

The cap that limited this payment. Create always returns it. Older list rows omit it.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Identifies which cap limited the payment. |
|**unit** | [**UnitEnum**](#UnitEnum) | Whether &#x60;value&#x60; is points or an amount. |
|**value** | **BigDecimal** | Cap value in &#x60;unit&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CARD_SPENDING_GLOBAL_SPENDING_BASED_LIMIT | &quot;CARD_SPENDING_GLOBAL_SPENDING_BASED_LIMIT&quot; |
| CARD_SPENDING_GLOBAL_TIME_BASED_LIMIT | &quot;CARD_SPENDING_GLOBAL_TIME_BASED_LIMIT&quot; |
| CARD_SPENDING_TRANSACTIONS_LIMIT | &quot;CARD_SPENDING_TRANSACTIONS_LIMIT&quot; |
| REQUEST_PAYMENT_LIMIT | &quot;REQUEST_PAYMENT_LIMIT&quot; |
| ORDER_TOTAL_AMOUNT | &quot;ORDER_TOTAL_AMOUNT&quot; |
| CARD_BALANCE_POINTS | &quot;CARD_BALANCE_POINTS&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| POINTS | &quot;POINTS&quot; |
| AMOUNT | &quot;AMOUNT&quot; |



