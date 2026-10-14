

# BenefitTransaction

A benefit transaction. Represents a benefit fulfillment.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**programId** | **String** | Unique identifier of the loyalty program (format &#x60;lprg_...&#x60;). |
|**memberId** | **String** | Unique identifier of the program member (format &#x60;lmbr_...&#x60;). |
|**createdAt** | **OffsetDateTime** | Timestamp when the transaction was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Timestamp when the transaction was last updated (ISO 8601), or &#x60;null&#x60;. |
|**id** | **String** | Unique benefit transaction identifier (format &#x60;lbtx_...&#x60;). |
|**benefitId** | **String** | Unique identifier of the fulfilled benefit (format &#x60;lben_...&#x60;). |
|**earningRuleId** | **String** | Unique identifier of the earning rule that triggered the fulfillment (format &#x60;lern_...&#x60;). |
|**type** | [**TypeEnum**](#TypeEnum) | Transaction type. Always &#x60;FULFILLMENT&#x60;. |
|**details** | [**BenefitTransactionDetails**](BenefitTransactionDetails.md) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction status. &#x60;PENDING&#x60; - created, awaiting processing; &#x60;APPROVED&#x60; - completed successfully; &#x60;REJECTED&#x60; - rejected (see &#x60;details.rejection&#x60;). |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;benefit_transaction&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULFILLMENT | &quot;FULFILLMENT&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BENEFIT_TRANSACTION | &quot;benefit_transaction&quot; |



