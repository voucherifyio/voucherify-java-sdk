

# LoyaltyV2CardPointsBucketSimple

Simple representation of a points expiration bucket, embedded in card transaction details.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Point expiration bucket ID. |
|**points** | [**LoyaltyV2CardPointsBucketSimplePoints**](LoyaltyV2CardPointsBucketSimplePoints.md) |  |
|**expirationDate** | **LocalDate** | Date when the points expire. |
|**expirationType** | [**ExpirationTypeEnum**](#ExpirationTypeEnum) | Expiration type of the points. |



## Enum: ExpirationTypeEnum

| Name | Value |
|---- | -----|
| NO_EXPIRATION | &quot;NO_EXPIRATION&quot; |
| ROLLING_EXPIRATION | &quot;ROLLING_EXPIRATION&quot; |
| CALENDAR_EXPIRATION | &quot;CALENDAR_EXPIRATION&quot; |
| SLIDING_EXPIRATION | &quot;SLIDING_EXPIRATION&quot; |



