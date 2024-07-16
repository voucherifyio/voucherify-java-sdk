

# LoyaltiesMembersPointsExpirationListResponseBodyDataItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique loyalty points bucket ID. |
|**voucherId** | **String** | Unique parent loyalty card ID. |
|**campaignId** | **String** |  Unique parent campaign ID. |
|**bucket** | [**LoyaltiesMembersPointsExpirationListResponseBodyDataItemBucket**](LoyaltiesMembersPointsExpirationListResponseBodyDataItemBucket.md) |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the loyalty points bucket object was created. The value is shown in the ISO 8601 format. |
|**status** | **String** | Loyalty points bucket point status. |
|**expiresAt** | **OffsetDateTime** | Date when the number of points defined in the bucket object are due to expire. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the loyalty points bucket object was updated. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the loyalty points bucket. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LOYALTY_POINTS_BUCKET | &quot;loyalty_points_bucket&quot; |



