

# TierTransaction

A tier transaction. Records the outcome of a tier evaluation for a member card.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique tier transaction identifier (format &#x60;lttx_...&#x60;). |
|**cardId** | **String** | Unique identifier of the related loyalty card (format &#x60;lcrd_...&#x60;). |
|**programId** | **String** | Unique identifier of the loyalty program (format &#x60;lprg_...&#x60;). |
|**memberId** | **String** | Unique identifier of the program member (format &#x60;lmbr_...&#x60;). |
|**cardDefinitionId** | **String** | Identifies the card definition (format &#x60;lcdef_...&#x60;). |
|**tierStructureId** | **String** | Unique identifier of the tier structure (format &#x60;lts_...&#x60;). |
|**tierId** | **String** | Unique identifier of the related tier (format &#x60;lt_...&#x60;), or &#x60;null&#x60;. |
|**type** | [**TypeEnum**](#TypeEnum) | Transaction type. &#x60;JOINED&#x60; - member joined a tier. &#x60;LEFT&#x60; - member left a tier. &#x60;UPGRADED&#x60; - member moved to a higher tier. &#x60;DOWNGRADED&#x60; - member moved to a lower tier. &#x60;EXPIRATION_CHANGED&#x60; - current tier unchanged; the expiration date was set, extended, or cleared. &#x60;EVALUATION_REFRESHED&#x60; - current tier and expiration day unchanged; the stored evaluation and points were recalculated. |
|**details** | [**TierTransactionDetails**](TierTransactionDetails.md) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction status. &#x60;PENDING&#x60; - created, awaiting processing; &#x60;APPROVED&#x60; - completed successfully; &#x60;REJECTED&#x60; - rejected (see &#x60;details.rejection&#x60;). |
|**createdAt** | **OffsetDateTime** | Timestamp when the transaction was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Timestamp when the transaction was last updated (ISO 8601), or &#x60;null&#x60;. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;tier_transaction&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UPGRADED | &quot;UPGRADED&quot; |
| DOWNGRADED | &quot;DOWNGRADED&quot; |
| JOINED | &quot;JOINED&quot; |
| LEFT | &quot;LEFT&quot; |
| EXPIRATION_CHANGED | &quot;EXPIRATION_CHANGED&quot; |
| EVALUATION_REFRESHED | &quot;EVALUATION_REFRESHED&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| TIER_TRANSACTION | &quot;tier_transaction&quot; |



