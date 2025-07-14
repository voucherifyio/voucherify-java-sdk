

# Redemption

This is an object representing a redemption for **POST** `v1/redemptions` and **POST** `/client/v1/redemptions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique redemption ID. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format. |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |
|**trackingId** | **String** | Hashed customer source ID. |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the redemption. |
|**amount** | **Integer** | For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |
|**status** | [**StatusEnum**](#StatusEnum) | Redemption status. |
|**session** | [**RedemptionSession**](RedemptionSession.md) |  |
|**relatedRedemptions** | [**RedemptionRelatedRedemptions**](RedemptionRelatedRedemptions.md) |  |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |
|**failureMessage** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed. |
|**order** | [**RedemptionOrder**](RedemptionOrder.md) |  |
|**channel** | [**RedemptionChannel**](RedemptionChannel.md) |  |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object. |
|**relatedObjectId** | **String** | Unique related object ID assigned by Voucherify, i.e. v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno for a voucher. |
|**promotionTier** | [**PromotionTier**](PromotionTier.md) |  |
|**reward** | [**RedemptionRewardResult**](RedemptionRewardResult.md) |  |
|**gift** | [**RedemptionGift**](RedemptionGift.md) |  |
|**loyaltyCard** | [**RedemptionLoyaltyCard**](RedemptionLoyaltyCard.md) |  |
|**voucher** | [**RedemptionVoucher**](RedemptionVoucher.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REDEMPTION | &quot;redemption&quot; |



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



