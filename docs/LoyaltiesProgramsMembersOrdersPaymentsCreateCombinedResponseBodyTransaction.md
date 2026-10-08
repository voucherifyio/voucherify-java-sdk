

# LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBodyTransaction

An order transaction representing a pay-with-points `SIMULATED` payment.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**programId** | **String** | Unique identifier of the loyalty program (format &#x60;lprg_...&#x60;). |
|**memberId** | **String** | Unique identifier of the program member (format &#x60;lmbr_...&#x60;). |
|**cardId** | **String** | Unique identifier of the loyalty card the points were spent from (format &#x60;lcrd_...&#x60;). |
|**cardDefinitionId** | **String** | Unique identifier of the card definition (format &#x60;lcdef_...&#x60;). |
|**cardTransactionId** | **Object** | &#x60;null&#x60; for &#x60;DRY_RUN&#x60; (&#x60;SIMULATED&#x60;) transactions. |
|**orderId** | **String** | Unique identifier of the paid order (format &#x60;ord_...&#x60;). |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction status. &#x60;SIMULATED&#x60; - dry-run create result, not persisted. |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the transaction type. Always &#x60;PAY_WITH_POINTS&#x60;. |
|**details** | **Object** |  |
|**updatedAt** | **Object** | Timestamp when the transaction was last updated (ISO 8601), or &#x60;null&#x60; for &#x60;DRY_RUN&#x60; (&#x60;SIMULATED&#x60;) transactions. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;order_transaction&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SIMULATED | &quot;SIMULATED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAY_WITH_POINTS | &quot;PAY_WITH_POINTS&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER_TRANSACTION | &quot;order_transaction&quot; |



