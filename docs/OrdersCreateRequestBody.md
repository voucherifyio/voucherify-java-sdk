

# OrdersCreateRequestBody

Request body schema for **POST** `v1/orders`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique ID assigned by Voucherify of an existing order that will be linked to the redemption of this request. |
|**sourceId** | **String** | Unique source ID of an existing order that will be linked to the redemption of this request.  For validation and redemption, if &#x60;source_id&#x60; is used with an existing order, the original order data will be used, like &#x60;items&#x60;, &#x60;amount&#x60;, and so on, not the one sent in the new request. |
|**status** | [**StatusEnum**](#StatusEnum) | The order status. |
|**amount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**discountAmount** | **Integer** | Sum of all order-level discounts applied to the order. It is expressed as an integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | Array of items applied to the order. It can include up to 500 items. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an order. It can be useful for storing additional information about the order in a structured format. It can be used to define business validation rules or discount formulas. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was created. The value is shown in the ISO 8601 format. |
|**referrerId** | **String** | Unique referrer ID. |
|**customer** | [**Customer**](Customer.md) |  |
|**referrer** | [**Referrer**](Referrer.md) |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| PAID | &quot;PAID&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |



