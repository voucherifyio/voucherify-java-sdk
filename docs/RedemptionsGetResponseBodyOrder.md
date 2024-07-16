

# RedemptionsGetResponseBodyOrder


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique ID assigned by Voucherify of an existing order that will be linked to the redemption of this request. |
|**sourceId** | **String** | Unique source ID of an existing order that will be linked to the redemption of this request. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was last updated in ISO 8601 format. |
|**status** | [**StatusEnum**](#StatusEnum) | The order status. |
|**amount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**discountAmount** | **Integer** | Sum of all order-level discounts applied to the order. |
|**itemsDiscountAmount** | **Integer** | Sum of all product-specific discounts applied to the order. |
|**totalDiscountAmount** | **Integer** | Sum of all order-level AND all product-specific discounts applied to the order. |
|**totalAmount** | **Integer** | Order amount after undoing all the discounts through the rollback redemption. |
|**appliedDiscountAmount** | **Integer** | This field shows the order-level discount applied. |
|**itemsAppliedDiscountAmount** | **Integer** | Sum of all product-specific discounts applied in a particular request.   &#x60;sum(items, i &#x3D;&gt; i.applied_discount_amount)&#x60; |
|**totalAppliedDiscountAmount** | **Integer** | Sum of all order-level AND all product-specific discounts applied in a particular request.   &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60; |
|**items** | [**List&lt;OrderItemCalculated&gt;**](OrderItemCalculated.md) | Array of items applied to the order. |
|**metadata** | **Object** |  |
|**customerId** | **String** | Unique customer ID of the customer making the purchase. |
|**referrerId** | **String** | Unique referrer ID. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |
|**redemptions** | **Object** |  |
|**customer** | [**RedemptionsGetResponseBodyOrderCustomer**](RedemptionsGetResponseBodyOrderCustomer.md) |  |
|**referrer** | [**RedemptionsGetResponseBodyOrderReferrer**](RedemptionsGetResponseBodyOrderReferrer.md) |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| PAID | &quot;PAID&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;order&quot; |



