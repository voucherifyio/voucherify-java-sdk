

# OrderRedemptionsEntry


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the redemption was created. The value is shown in the ISO 8601 format. |
|**rollbackId** | **String** | Unique ID of the redemption rollback. |
|**rollbackDate** | **OffsetDateTime** | Timestamp representing the date and time when the redemption rollback was created. The value is shown in the ISO 8601 format. |
|**relatedObjectType** | **String** | The source of the incentive. |
|**relatedObjectId** | **String** | Unique ID of the parent redemption. |
|**relatedObjectParentId** | **String** | Represent&#39;s the campaign ID of the voucher if the redemption was based on a voucher that was part of bulk codes generated within a campaign. In case of a promotion tier, this represents the campaign ID of the promotion tier&#39;s parent campaign. |
|**stacked** | **List&lt;String&gt;** | Contains a list of unique IDs of child redemptions, which belong to the stacked incentives. |
|**rollbackStacked** | **List&lt;String&gt;** | Lists the rollback redemption IDs of the particular child redemptions. |



