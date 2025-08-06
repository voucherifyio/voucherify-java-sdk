

# SimpleRedemption

Simplified redemption data.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique redemption ID. |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |
|**trackingId** | **String** | Hashed customer source ID. |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the redemption was created in the ISO 8601 format. |
|**amount** | **Integer** | For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. In the case of redemption rollback, the numbers are expressed as negative integers. |
|**order** | [**SimpleOrder**](SimpleOrder.md) |  |
|**reward** | [**SimpleRedemptionRewardResult**](SimpleRedemptionRewardResult.md) |  |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |
|**status** | [**StatusEnum**](#StatusEnum) |  |
|**voucher** | [**SimpleVoucher**](SimpleVoucher.md) |  |
|**promotionTier** | [**SimplePromotionTier**](SimplePromotionTier.md) |  |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |
|**metadata** | **Object** | The metadata object stores all custom attributes in the form of key/value pairs assigned to the redemption. |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |
|**failureMessage** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide an expanded reason as to why the redemption failed. |
|**reason** | **String** | The reason for the redemption rollback. |
|**channel** | [**SimpleRedemptionChannel**](SimpleRedemptionChannel.md) |  |
|**_object** | **String** | The type of the object represented by the JSON. This object stores information about the &#x60;redemption&#x60;. |



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



