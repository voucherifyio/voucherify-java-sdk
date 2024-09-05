

# OrderItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**skuId** | **String** | Unique identifier of the SKU. It is assigned by Voucherify. |
|**productId** | **String** | Unique identifier of the product. It is assigned by Voucherify. |
|**relatedObject** | [**RelatedObjectEnum**](#RelatedObjectEnum) | Used along with the source_id property, can be set to either sku or product. |
|**sourceId** | **String** | The merchant&#39;s product/SKU ID (if it is different from the Voucherify product/SKU ID). It is useful in the integration between multiple systems. It can be an ID from an eCommerce site, a database, or a third-party service. |
|**quantity** | **Integer** | The quantity of the particular item in the cart. |
|**discountQuantity** | **Integer** | Number of dicounted items. |
|**initialQuantity** | **Integer** | A positive integer in the smallest unit quantity representing the total amount of the order; this is the sum of the order items&#39; quantity. |
|**amount** | **Integer** | The total amount of the order item (price * quantity). |
|**discountAmount** | **Integer** | Sum of all order-item-level discounts applied to the order. |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**price** | **Integer** | Unit price of an item. Value is multiplied by 100 to precisely represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**product** | [**OrderItemProduct**](OrderItemProduct.md) |  |
|**sku** | [**OrderItemSku**](OrderItemSku.md) |  |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an order item. It can be useful for storing additional information about the order item in a structured format. |



## Enum: RelatedObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |



