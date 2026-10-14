

# Card

A full loyalty card snapshot.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type. Currently only &#x60;INDIVIDUAL&#x60; is supported. |
|**lifetimeBucket** | [**CardLifetimeBucket**](CardLifetimeBucket.md) |  |
|**balance** | [**CardBalance**](CardBalance.md) |  |
|**id** | **String** | Identifies the card. |
|**programId** | **String** | Identifies the loyalty program. |
|**cardDefinitionId** | **String** | Identifies the card definition. |
|**code** | **String** | Human-readable card code. &#x60;null&#x60; until asynchronous code generation finishes. |
|**customerId** | **String** | Identifies the customer linked to the card. |
|**memberId** | **String** | Identifies the member linked to the card. |
|**createdAt** | **OffsetDateTime** | Records when the card was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Records the last update (ISO 8601). &#x60;null&#x60; if the card has never been updated. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type. Always &#x60;card&#x60;. |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |



