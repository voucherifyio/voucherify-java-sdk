

# QualificationsCheckEligibilityResponseBodyOrder


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique ID assigned by Voucherify of an existing order that will be linked to the redemption of this request. |
|**sourceId** | **String** | Unique source ID of an existing order that will be linked to the redemption of this request. |
|**status** | [**StatusEnum**](#StatusEnum) | The order status. |
|**amount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**discountAmount** | **Integer** | Sum of all order-level discounts applied to the order. |
|**items** | [**List&lt;OrderItemEssential&gt;**](OrderItemEssential.md) | Array of items applied to the order. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an order. It can be useful for storing additional information about the order in a structured format. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| PAID | &quot;PAID&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |



