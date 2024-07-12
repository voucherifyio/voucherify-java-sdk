

# VoucherTransactionDetailsBalance

Contains information on how the balance was affected by the transaction.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | The type of voucher whose balance is being adjusted due to the transaction. |
|**total** | **Integer** | The number of all points accumulated on the card as affected by add or subtract operations. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. |
|**points** | **Integer** | Points added or subtracted in the transaction. |
|**balance** | **Integer** | The available points on the card after the transaction as affected by redemption or rollback. |
|**relatedObject** | [**VoucherTransactionDetailsBalanceRelatedObject**](VoucherTransactionDetailsBalanceRelatedObject.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_CARD | &quot;loyalty_card&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |



