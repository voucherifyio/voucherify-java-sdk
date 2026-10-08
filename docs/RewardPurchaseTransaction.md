

# RewardPurchaseTransaction

A reward transaction. Represents a reward purchase or a reward refund.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique reward transaction identifier (format &#x60;lrtx_...&#x60;). Absent for &#x60;DRY_RUN&#x60; (SIMULATED) transactions, which are never persisted. |
|**cardId** | **String** | Unique identifier of the loyalty card the points were spent from (format &#x60;lcrd_...&#x60;). |
|**cardDefinitionId** | **String** | Unique identifier of the card definition for that card (format &#x60;lcdef_...&#x60;). &#x60;null&#x60; when none is stored. |
|**cardTransactionId** | **String** | Unique identifier of the underlying card transaction (format &#x60;lctx_...&#x60;). &#x60;null&#x60; for &#x60;DRY_RUN&#x60; (SIMULATED) transactions. |
|**programId** | **String** | Unique identifier of the loyalty program (format &#x60;lprg_...&#x60;). |
|**memberId** | **String** | Unique identifier of the program member (format &#x60;lmbr_...&#x60;). |
|**rewardId** | **String** | Unique identifier of the purchased reward (format &#x60;lrew_...&#x60;). |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction status:  - &#x60;PENDING&#x60;: Created and awaiting processing.  - &#x60;PROCESSING&#x60;: Being processed.  - &#x60;APPROVED&#x60;: Completed successfully.  - &#x60;REJECTED&#x60;: Rejected (see &#x60;details.rejection&#x60;).  - &#x60;SIMULATED&#x60;: Dry-run result that is not persisted.  - &#x60;REFUNDED&#x60;: Purchase has been refunded. |
|**type** | [**TypeEnum**](#TypeEnum) | Transaction type. |
|**details** | **Object** |  |
|**createdAt** | **OffsetDateTime** | Timestamp when the transaction was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Timestamp when the transaction was last updated (ISO 8601), or &#x60;null&#x60;. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;reward_transaction&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| SIMULATED | &quot;SIMULATED&quot; |
| REFUNDED | &quot;REFUNDED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PURCHASE | &quot;PURCHASE&quot; |
| REFUND | &quot;REFUND&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD_TRANSACTION | &quot;reward_transaction&quot; |



