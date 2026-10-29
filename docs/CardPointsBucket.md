

# CardPointsBucket

A points expiration bucket of a card.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cardId** | **String** | ID of the card the bucket belongs to. |
|**cardDefinitionId** | **String** | ID of the card definition of the card. |
|**programId** | **String** | ID of the loyalty program. |
|**memberId** | **String** | ID of the member owning the card. |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type. Currently, only &#x60;INDIVIDUAL&#x60; is supported. |
|**createdAt** | **OffsetDateTime** | Timestamp when the bucket was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Timestamp when the bucket was last updated (ISO 8601), or &#x60;null&#x60;. |
|**id** | **String** | Unique points expiration bucket ID. |
|**customerId** | **String** | Voucherify ID of the customer owning the card. |
|**points** | [**CardPointsBucketPoints**](CardPointsBucketPoints.md) |  |
|**expirationDate** | **LocalDate** | Date when the points in the bucket expire (&#x60;YYYY-MM-DD&#x60;). |
|**expirationType** | [**ExpirationTypeEnum**](#ExpirationTypeEnum) | Points expiration type for the bucket. It can be inherited from the card definition or overridden by the earning rule. |
|**status** | [**StatusEnum**](#StatusEnum) | Bucket status. For the List card expiring points buckets, returns only &#x60;ACTIVE&#x60; buckets. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;card_points_bucket&#x60;. |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |



## Enum: ExpirationTypeEnum

| Name | Value |
|---- | -----|
| NO_EXPIRATION | &quot;NO_EXPIRATION&quot; |
| ROLLING_EXPIRATION | &quot;ROLLING_EXPIRATION&quot; |
| CALENDAR_EXPIRATION | &quot;CALENDAR_EXPIRATION&quot; |
| SLIDING_EXPIRATION | &quot;SLIDING_EXPIRATION&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD_POINTS_BUCKET | &quot;card_points_bucket&quot; |



