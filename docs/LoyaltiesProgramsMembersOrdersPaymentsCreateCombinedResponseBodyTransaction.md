

# LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBodyTransaction


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**programId** | **String** | Unique identifier of the loyalty program (format &#x60;lprg_...&#x60;). |
|**memberId** | **String** | Unique identifier of the program member (format &#x60;lmbr_...&#x60;). |
|**cardId** | **String** | Unique identifier of the loyalty card the points were spent from (format &#x60;lcrd_...&#x60;). |
|**cardDefinitionId** | **String** | Identifies the card definition (format &#x60;lcdef_...&#x60;). |
|**cardTransactionId** | **Object** | &#x60;null&#x60; for &#x60;DRY_RUN&#x60; (&#x60;SIMULATED&#x60;) transactions. |
|**orderId** | **String** | Identifies the paid order (format &#x60;ord_...&#x60;). |
|**status** | [**StatusEnum**](#StatusEnum) |  |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the transaction type. Always &#x60;PAY_WITH_POINTS&#x60;. |
|**details** | [**LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBodyTransactionDetails**](LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBodyTransactionDetails.md) |  |
|**updatedAt** | **Object** | Timestamp when the transaction was last updated (ISO 8601), or &#x60;null&#x60; for &#x60;DRY_RUN&#x60; (&#x60;SIMULATED&#x60;) transactions. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;order_transaction&#x60;. |
|**createdAt** | **OffsetDateTime** | Timestamp when the transaction was created (ISO 8601). |
|**id** | **String** | Identifies the order transaction (&#x60;lotx_...&#x60;). Absent on dry-run (&#x60;SIMULATED&#x60;) create responses, which are never persisted. Always present in list responses. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SIMULATED | &quot;SIMULATED&quot; |
| PENDING | &quot;PENDING&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAY_WITH_POINTS | &quot;PAY_WITH_POINTS&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER_TRANSACTION | &quot;order_transaction&quot; |



