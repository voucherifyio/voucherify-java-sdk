

# RewardPurchaseDigitalCoupon

Discount coupon fulfillment entry.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Voucher identifier of the coupon. |
|**code** | **String** | Coupon code. |
|**result** | [**ResultEnum**](#ResultEnum) | Refund handling result for this coupon (present in refund results):  - &#x60;DELETED&#x60;: The coupon was deleted.  - &#x60;SKIPPED&#x60;: The coupon was left intact. |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SKIPPED | &quot;SKIPPED&quot; |
| DELETED | &quot;DELETED&quot; |



