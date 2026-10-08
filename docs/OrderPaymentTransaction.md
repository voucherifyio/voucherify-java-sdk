

# OrderPaymentTransaction

An order transaction representing a pay-with-points payment. List endpoints return only persisted transactions; `SIMULATED` appears only on dry-run create responses.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the order transaction (&#x60;lotx_...&#x60;). Absent on dry-run (&#x60;SIMULATED&#x60;) create responses, which are never persisted. Always present in list responses. |
|**programId** | **String** | Unique identifier of the loyalty program (format &#x60;lprg_...&#x60;). |
|**memberId** | **String** | Unique identifier of the program member (format &#x60;lmbr_...&#x60;). |
|**cardId** | **String** | Unique identifier of the loyalty card the points were spent from (format &#x60;lcrd_...&#x60;). |
|**cardDefinitionId** | **String** | Unique identifier of the card definition (format &#x60;lcdef_...&#x60;). |
|**cardTransactionId** | **String** | Unique identifier of the underlying card transaction (format &#x60;lctx_...&#x60;). &#x60;null&#x60; for DRY_RUN (SIMULATED) transactions. |
|**orderId** | **String** | Unique identifier of the paid order (format &#x60;ord_...&#x60;). |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction status. &#x60;PENDING&#x60; - created, awaiting processing; &#x60;PROCESSING&#x60; - being processed; &#x60;APPROVED&#x60; - completed successfully; &#x60;REJECTED&#x60; - rejected (see &#x60;details.rejection&#x60;); &#x60;SIMULATED&#x60; - dry-run create result, not persisted (not returned by list). |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the transaction type. Always &#x60;PAY_WITH_POINTS&#x60;. |
|**details** | **Object** |  |
|**createdAt** | **OffsetDateTime** | Timestamp when the transaction was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Timestamp when the transaction was last updated (ISO 8601), or &#x60;null&#x60;. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;order_transaction&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| SIMULATED | &quot;SIMULATED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAY_WITH_POINTS | &quot;PAY_WITH_POINTS&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER_TRANSACTION | &quot;order_transaction&quot; |



