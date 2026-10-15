

# LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBodyTransaction


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cardId** | **String** |  |
|**cardDefinitionId** | **String** | Unique identifier of the card definition for that card (format &#x60;lcdef_...&#x60;). |
|**cardTransactionId** | **Object** | &#x60;null&#x60; for &#x60;DRY_RUN&#x60; (SIMULATED) transactions. |
|**programId** | **String** | Unique identifier of the loyalty program (format &#x60;lprg_...&#x60;). |
|**memberId** | **String** | Unique identifier of the program member (format &#x60;lmbr_...&#x60;). |
|**rewardId** | **String** | Unique identifier of the purchased reward (format &#x60;lrew_...&#x60;). |
|**status** | [**StatusEnum**](#StatusEnum) |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**details** | [**LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBodyTransactionDetails**](LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBodyTransactionDetails.md) |  |
|**updatedAt** | **Object** | For &#x60;DRY_RUN&#x60; transactions, this is always &#x60;null&#x60;. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;reward_transaction&#x60;. |
|**id** | **String** | Unique reward transaction identifier (format &#x60;lrtx_...&#x60;). |
|**createdAt** | **OffsetDateTime** | Timestamp when the transaction was created (ISO 8601). |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SIMULATED | &quot;SIMULATED&quot; |
| PENDING | &quot;PENDING&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PURCHASE | &quot;PURCHASE&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD_TRANSACTION | &quot;reward_transaction&quot; |



