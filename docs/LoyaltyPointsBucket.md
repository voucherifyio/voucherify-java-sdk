

# LoyaltyPointsBucket

Contains the details about expiring loyalty points.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the loyalty points bucket. |
|**voucherId** | **String** | Unique identifier of the parent loyalty card. |
|**campaignId** | **String** | Unique identifier of the parent campaign. |
|**bucket** | [**LoyaltyPointsBucketBucket**](LoyaltyPointsBucketBucket.md) |  |
|**status** | **String** | Loyalty point point bucket status. |
|**expiresAt** | **OffsetDateTime** | Date when the number of points defined in the bucket object are due to expire. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the loyalty point bucket object was created in ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the loyalty point bucket object was updated in ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the loyalty point bucket. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LOYALTY_POINTS_BUCKET | &quot;loyalty_points_bucket&quot; |



