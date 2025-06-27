

# BundleMissingItem

Determines a product, SKU, or collection that is in bundle conditions, but is missing in the customer's order items. Determines also the missing quantity.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the collection, product, or SKU that is missing in the customer&#39;s order items. This is an ID assigned by Voucherify. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Determines the type of the object that is missing in the customer&#39;s order items. |
|**itemQuantity** | **Integer** | Quantity of items that are missing in the order items to meet the bundle conditions. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| PRODUCTS_COLLECTION | &quot;products_collection&quot; |
| SKU | &quot;sku&quot; |



