

# VouchersBalanceUpdateResponseBody

Response body schema for `vouchers/{code}/balance.`

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**amount** | **Integer** | The incremental amount added (positive integer) or subtracted (negative integer) to the current balance on the gift card or loyalty card. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**total** | **Integer** | Total income incurred over the lifespan of the gift card or loyalty card. |
|**balance** | **Integer** | The balance after adding or subtracting a specified amount. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**type** | [**TypeEnum**](#TypeEnum) | The type of voucher being modified. |
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | The type of the operation being performed. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. Default is &#x60;balance&#x60;. |
|**relatedObject** | [**VouchersBalanceUpdateResponseBodyRelatedObject**](VouchersBalanceUpdateResponseBodyRelatedObject.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;gift_voucher&quot; |
| LOYALTY_CARD | &quot;loyalty_card&quot; |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |



