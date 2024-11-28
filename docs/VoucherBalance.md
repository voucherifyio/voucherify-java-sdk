

# VoucherBalance

Contains information on how the balance was affected by the transaction.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | The type of voucher whose balance is being adjusted due to the transaction. |
|**total** | **Integer** | The number of all points or credits accumulated on the card as affected by add or subtract operations. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. |
|**points** | **Integer** | Points added or subtracted in the transaction of a loyalty card. |
|**balance** | **Integer** | The available points or credits on the card after the transaction as affected by redemption or rollback. |
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | The type of the operation being performed. The operation type is &#x60;AUTOMATIC&#x60; if it is an automatic redemption. |
|**relatedObject** | [**VoucherBalanceRelatedObject**](VoucherBalanceRelatedObject.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_CARD | &quot;loyalty_card&quot; |
| GIFT_VOUCHER | &quot;gift_voucher&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |
| AUTOMATIC | &quot;AUTOMATIC&quot; |



