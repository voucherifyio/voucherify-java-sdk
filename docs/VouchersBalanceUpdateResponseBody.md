

# VouchersBalanceUpdateResponseBody

Response body schema for `vouchers/{code}/balance.`

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**amount** | **Integer** | The incremental amount added (positive integer) or subtracted (negative integer) to the current balance on the gift card or loyalty card. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000. |
|**total** | **Integer** | Total income incurred over the lifespan of the gift card or loyalty card. |
|**balance** | **Integer** | The balance after adding or subtracting a specified amount. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000. |
|**type** | [**TypeEnum**](#TypeEnum) | The type of voucher being modified. |
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) |  |
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



