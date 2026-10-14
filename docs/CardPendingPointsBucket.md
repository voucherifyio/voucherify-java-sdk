

# CardPendingPointsBucket

A pending point bucket of a card.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cardId** | **String** | ID of the card the bucket belongs to. |
|**cardDefinitionId** | **String** | ID of the card definition of the card. |
|**programId** | **String** | ID of the loyalty program. |
|**memberId** | **String** | ID of the member owning the card. |
|**createdAt** | **OffsetDateTime** | Timestamp when the bucket was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Timestamp when the bucket was last updated (ISO 8601), or &#x60;null&#x60;. |
|**id** | **String** | Unique pending point bucket ID. |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type. |
|**points** | [**CardPendingPointsBucketPoints**](CardPendingPointsBucketPoints.md) |  |
|**date** | **LocalDate** | Scheduled activation date of the pending points (&#x60;YYYY-MM-DD&#x60;). For the &#x60;EVENT_BASED&#x60; type this is the cancellation deadline. |
|**type** | [**TypeEnum**](#TypeEnum) | Pending points activation type from the card definition. |
|**status** | [**StatusEnum**](#StatusEnum) | Bucket status. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;card_pending_points_bucket&#x60;. |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PERIOD_BASED | &quot;PERIOD_BASED&quot; |
| FIXED_DATES | &quot;FIXED_DATES&quot; |
| EVENT_BASED | &quot;EVENT_BASED&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| ACTIVATED | &quot;ACTIVATED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD_PENDING_POINTS_BUCKET | &quot;card_pending_points_bucket&quot; |



