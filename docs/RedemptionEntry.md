

# RedemptionEntry


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format. |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |
|**trackingId** | **String** | Hashed customer source ID. |
|**metadata** | **Object** |  |
|**amount** | **Integer** | For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. and For gift cards, this represents the number of the credits restored to the card in the rolledback redemption. The number is a negative integer in the smallest currency unit, e.g. -100 cents for $1.00 added back to the card. For loyalty cards, this represents the number of loyalty points restored to the card in the rolledback redemption. The number is a negative integer. |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |
|**status** | [**StatusEnum**](#StatusEnum) |  |
|**relatedRedemptions** | [**RedemptionEntryRelatedRedemptions**](RedemptionEntryRelatedRedemptions.md) |  |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |
|**failureMessage** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed. |
|**order** | [**RedemptionEntryOrder**](RedemptionEntryOrder.md) |  |
|**channel** | [**RedemptionEntryChannel**](RedemptionEntryChannel.md) |  |
|**customer** | [**RedemptionEntryCustomer**](RedemptionEntryCustomer.md) |  |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object. |
|**relatedObjectId** | **String** |  |
|**voucher** | [**RedemptionEntryVoucher**](RedemptionEntryVoucher.md) |  |
|**promotionTier** | [**RedemptionEntryPromotionTier**](RedemptionEntryPromotionTier.md) |  |
|**reward** | [**RedemptionRewardResult**](RedemptionRewardResult.md) |  |
|**gift** | [**RedemptionEntryGift**](RedemptionEntryGift.md) |  |
|**loyaltyCard** | [**RedemptionEntryLoyaltyCard**](RedemptionEntryLoyaltyCard.md) |  |
|**reason** | **String** | System generated cause for the redemption being invalid in the context of the provided parameters. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REDEMPTION | &quot;redemption&quot; |
| REDEMPTION_ROLLBACK | &quot;redemption_rollback&quot; |



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
| ROLLED_BACK | &quot;ROLLED_BACK&quot; |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| REDEMPTION | &quot;redemption&quot; |



