

# OrderCalculated

Order information.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique ID assigned by Voucherify of an existing order that will be linked to the redemption of this request. |
|**sourceId** | **String** | Unique source ID of an existing order that will be linked to the redemption of this request. |
|**status** | [**StatusEnum**](#StatusEnum) | The order status. |
|**amount** | **Integer** | This is the sum of the order items&#39; amounts. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**initialAmount** | **Integer** | This is the sum of the order items&#39; amounts before any discount or other effect (e.g. add missing units) is applied. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**discountAmount** | **Integer** | Sum of all order-level discounts applied to the order. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**itemsDiscountAmount** | **Integer** | Sum of all product-specific discounts applied to the order. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**totalDiscountAmount** | **Integer** | Sum of all order-level AND all product-specific discounts applied to the order. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**totalAmount** | **Integer** | Order amount after undoing all the discounts through the rollback redemption. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**appliedDiscountAmount** | **Integer** | This field shows the order-level discount applied. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**itemsAppliedDiscountAmount** | **Integer** | Sum of all product-specific discounts applied in a particular request. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).   &#x60;sum(items, i &#x3D;&gt; i.applied_discount_amount)&#x60; |
|**totalAppliedDiscountAmount** | **Integer** | Sum of all order-level AND all product-specific discounts applied in a particular request. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00).   &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60; |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an order. It can be useful for storing additional information about the order in a structured format. It can be used to define business validation rules or discount formulas. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was last updated in ISO 8601 format. |
|**customerId** | **String** | Unique customer identifier of the customer making the purchase. The ID is assigned by Voucherify. |
|**referrerId** | **String** | Unique referrer ID. |
|**customer** | [**CustomerId**](CustomerId.md) |  |
|**referrer** | [**ReferrerId**](ReferrerId.md) |  |
|**redemptions** | [**Map&lt;String, OrderRedemptionsEntry&gt;**](OrderRedemptionsEntry.md) |  |



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



