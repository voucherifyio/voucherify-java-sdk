

# SimpleOrderItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the order line item. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the &#x60;order_item&#x60;. |
|**sourceId** | **String** | The merchant&#39;s product/SKU ID (if it is different from the Voucherify product/SKU ID). It is useful in the integration between multiple systems. It can be an ID from an eCommerce site, a database, or a third-party service. |
|**relatedObject** | [**RelatedObjectEnum**](#RelatedObjectEnum) | Used along with the &#x60;source_id&#x60; property, can be set to either SKU or product. |
|**productId** | **String** | Unique identifier of the product. It is assigned by Voucherify. |
|**skuId** | **String** | Unique identifier of the SKU. It is assigned by Voucherify. |
|**quantity** | **Integer** | Quantity of the particular item in the cart. |
|**appliedQuantity** | **Integer** | Quantity of items changed by the application of a new quantity items. It can be positive when an item is added or negative if an item is replaced. |
|**appliedQuantityAmount** | **Integer** | Amount for the items changed by the application of a new quantity items. It can be positive when an item is added or negative if an item is replaced. |
|**discountQuantity** | **Integer** | Number of discounted items. |
|**appliedDiscountQuantity** | **Integer** | Number of the discounted items applied in the transaction. |
|**amount** | **Integer** | Total amount of the order item (price * quantity). |
|**discountAmount** | **Integer** | Sum of all order-item-level discounts applied to the order. |
|**appliedDiscountAmount** | **Integer** | Order-level discount amount applied in the transaction. |
|**price** | **Integer** | Unit price of an item. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**subtotalAmount** | **Integer** | Final order item amount after the applied item-level discount.  If there are no item-level discounts applied, this item is equal to the &#x60;amount&#x60;.    &#x60;subtotal_amount&#x60;&#x3D;&#x60;amount&#x60;-&#x60;discount_amount&#x60; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER_ITEM | &quot;order_item&quot; |



## Enum: RelatedObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |



