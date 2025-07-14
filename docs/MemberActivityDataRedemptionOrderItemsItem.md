

# MemberActivityDataRedemptionOrderItemsItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the order line item. |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |
|**sourceId** | **String** | The merchant&#39;s product/SKU ID (if it is different from the Voucherify product/SKU ID). It is useful in the integration between multiple systems. It can be an ID from an eCommerce site, a database, or a third-party service. |
|**relatedObject** | [**RelatedObjectEnum**](#RelatedObjectEnum) |  |
|**productId** | **String** | Unique identifier of the product. It is assigned by Voucherify. |
|**skuId** | **String** | Unique identifier of the SKU. It is assigned by Voucherify. |
|**quantity** | **Integer** | Quantity of the particular item in the cart. and The quantity of the particular item in the cart. |
|**appliedQuantity** | **Integer** | Quantity of items changed by the application of a new quantity items. It can be positive when an item is added or negative if an item is replaced. |
|**appliedQuantityAmount** | **Integer** | Amount for the items changed by the application of a new quantity items. It can be positive when an item is added or negative if an item is replaced. |
|**discountQuantity** | **Integer** | Number of discounted items. and Number of dicounted items. |
|**appliedDiscountQuantity** | **Integer** | Number of the discounted items applied in the transaction. |
|**amount** | **Integer** | Total amount of the order item (price * quantity). and The total amount of the order item (price * quantity). |
|**discountAmount** | **Integer** | Sum of all order-item-level discounts applied to the order. |
|**appliedDiscountAmount** | **Integer** | Order-level discount amount applied in the transaction. and This field shows the order-level discount applied. |
|**price** | **Integer** | Unit price of an item. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**subtotalAmount** | **Integer** | Final order item amount after the applied item-level discount.  If there are no item-level discounts applied, this item is equal to the &#x60;amount&#x60;.    &#x60;subtotal_amount&#x60;&#x3D;&#x60;amount&#x60;-&#x60;discount_amount&#x60; and Final order item amount after the applied item-level discount.  If there are no item-level discounts applied, this item is equal to the &#x60;amount&#x60;.    &#x60;subtotal_amount&#x60;&#x3D;&#x60;amount&#x60;-&#x60;applied_discount_amount&#x60; |
|**initialQuantity** | **Integer** | A positive integer in the smallest unit quantity representing the total amount of the order; this is the sum of the order items&#39; quantity. |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |
|**product** | [**MemberActivityDataRedemptionOrderItemsItemProduct**](MemberActivityDataRedemptionOrderItemsItemProduct.md) |  |
|**sku** | [**MemberActivityDataRedemptionOrderItemsItemSku**](MemberActivityDataRedemptionOrderItemsItemSku.md) |  |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an item object. It can be useful for storing additional information about the item in a structured format. It can be used to define business validation rules or discount formulas. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER_ITEM | &quot;order_item&quot; |



## Enum: RelatedObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |



