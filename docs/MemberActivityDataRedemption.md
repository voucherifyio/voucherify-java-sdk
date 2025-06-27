

# MemberActivityDataRedemption


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique redemption ID. |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |
|**trackingId** | **String** | Hashed customer source ID. |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the redemption was created in the ISO 8601 format. |
|**amount** | **Integer** | For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. In the case of redemption rollback, the numbers are expressed as negative integers. and For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. |
|**order** | [**MemberActivityDataRedemptionOrder**](MemberActivityDataRedemptionOrder.md) |  |
|**reward** | [**MemberActivityDataRedemptionReward**](MemberActivityDataRedemptionReward.md) |  |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |
|**status** | [**StatusEnum**](#StatusEnum) |  |
|**voucher** | [**MemberActivityDataRedemptionVoucher**](MemberActivityDataRedemptionVoucher.md) |  |
|**promotionTier** | [**MemberActivityDataRedemptionPromotionTier**](MemberActivityDataRedemptionPromotionTier.md) |  |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |
|**metadata** | **Object** | The metadata object stores all custom attributes in the form of key/value pairs assigned to the redemption. and The metadata object stores all custom attributes assigned to the redemption. |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |
|**failureMessage** | **String** |  |
|**reason** | **String** |  |
|**channel** | [**MemberActivityDataRedemptionChannel**](MemberActivityDataRedemptionChannel.md) |  |
|**_object** | **String** | The type of the object represented by the JSON. This object stores information about the &#x60;redemption&#x60;. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the redemption was created. The value is shown in the ISO 8601 format. |
|**channelType** | [**ChannelTypeEnum**](#ChannelTypeEnum) | The source of the channel for the redemption rollback. A &#x60;USER&#x60; corresponds to the Voucherify Dashboard and an &#x60;API&#x60; corresponds to the API. |
|**channelId** | **String** | Unique channel ID of the user performing the redemption. This is either a user ID from a user using the Voucherify Dashboard or an X-APP-Id of a user using the API. |
|**previousOrder** | [**MemberActivityDataRedemptionPreviousOrder**](MemberActivityDataRedemptionPreviousOrder.md) |  |
|**relatedRedemptions** | [**MemberActivityDataRedemptionRelatedRedemptions**](MemberActivityDataRedemptionRelatedRedemptions.md) |  |
|**parentRedemptionId** | **String** | Unique redemption ID of the parent redemption. |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object. |
|**relatedObjectId** | **String** | Unique related object ID assigned by Voucherify, i.e. v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno for a voucher. |
|**relatedObjectParentId** | **String** | Unique related parent object ID assigned by Voucherify, i.e. v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno for a voucher. |
|**campaignName** | **String** | Campaign name |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |
| ROLLED_BACK | &quot;ROLLED BACK&quot; |



## Enum: ChannelTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| API | &quot;API&quot; |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |



