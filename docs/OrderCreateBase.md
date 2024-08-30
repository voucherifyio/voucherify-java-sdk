

# OrderCreateBase


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**status** | [**StatusEnum**](#StatusEnum) | The order status. |
|**amount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts.   |
|**discountAmount** | **Integer** | Sum of all order-level discounts applied to the order. |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | Array of items applied to the order. |
|**customer** | [**Customer**](Customer.md) |  |
|**customerId** | **String** | Unique customer ID of the customer making the purchase. |
|**referrer** | [**Referrer**](Referrer.md) |  |
|**referrerId** | **String** | Unique referrer ID. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an order. It can be useful for storing additional information about the order in a structured format. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| PAID | &quot;PAID&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |



