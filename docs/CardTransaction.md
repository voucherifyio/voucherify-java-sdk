

# CardTransaction

A card transaction.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique card transaction ID assigned by Voucherify. |
|**cardId** | **String** | ID of the card the transaction belongs to. Assigned by Voucherify. |
|**programId** | **String** | ID of the loyalty program. Assigned by Voucherify. |
|**memberId** | **String** | ID of the member owning the card. Assigned by Voucherify. |
|**cardDefinitionId** | **String** | ID of the card definition of the card. Assigned by Voucherify. |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type. |
|**type** | [**TypeEnum**](#TypeEnum) | Transaction type. Options depend on the endpoint and the transaction variant. |
|**details** | **Object** |  |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction processing status. Transactions are created as &#x60;PENDING&#x60; and processed asynchronously. |
|**createdAt** | **OffsetDateTime** | Timestamp when the transaction was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Timestamp when the transaction was last updated (ISO 8601), or &#x60;null&#x60;. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;card_transaction&#x60;. |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ADMIN_CREDIT | &quot;ADMIN_CREDIT&quot; |
| ADMIN_DEBIT | &quot;ADMIN_DEBIT&quot; |
| ADMIN_POINTS_EXPIRATION | &quot;ADMIN_POINTS_EXPIRATION&quot; |
| POINTS_EARNED | &quot;POINTS_EARNED&quot; |
| POINTS_SPENT_ON_REWARD | &quot;POINTS_SPENT_ON_REWARD&quot; |
| POINTS_PURCHASED | &quot;POINTS_PURCHASED&quot; |
| POINTS_PURCHASE_REVERSED | &quot;POINTS_PURCHASE_REVERSED&quot; |
| POINTS_SPENT_ON_ORDER | &quot;POINTS_SPENT_ON_ORDER&quot; |
| POINTS_REFUNDED | &quot;POINTS_REFUNDED&quot; |
| POINTS_RETURNED | &quot;POINTS_RETURNED&quot; |
| POINTS_EXPIRED | &quot;POINTS_EXPIRED&quot; |
| PENDING_POINTS_ADDED | &quot;PENDING_POINTS_ADDED&quot; |
| PENDING_POINTS_ACTIVATED | &quot;PENDING_POINTS_ACTIVATED&quot; |
| PENDING_POINTS_CANCELED | &quot;PENDING_POINTS_CANCELED&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD_TRANSACTION | &quot;card_transaction&quot; |



