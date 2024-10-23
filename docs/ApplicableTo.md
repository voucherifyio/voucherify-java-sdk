

# ApplicableTo


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | This object stores information about the resource to which the discount is applicable. |
|**id** | **String** | Unique product collection, product, or SKU identifier assigned by Voucherify. |
|**sourceId** | **String** | The source identifier from your inventory system. |
|**productId** | **String** | Parent product&#39;s unique ID assigned by Voucherify. |
|**productSourceId** | **String** | Parent product&#39;s source ID from your inventory system. |
|**strict** | **Boolean** |  |
|**price** | **BigDecimal** | New fixed price of an item. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 price is written as 1000. In case of the fixed price being calculated by the formula, i.e. the price_formula parameter is present in the fixed price definition, this value becomes the fallback value. Such that in a case where the formula cannot be calculated due to missing metadata, for example, this value will be used as the fixed price. |
|**priceFormula** | **BigDecimal** | Formula used to calculate the discounted price of an item. |
|**effect** | **ApplicableToEffect** |  |
|**quantityLimit** | **Integer** | The maximum number of units allowed to be discounted per order line item. |
|**aggregatedQuantityLimit** | **Integer** | The maximum number of units allowed to be discounted combined across all matched order line items. |
|**amountLimit** | **Integer** | Upper limit allowed to be applied as a discount per order line item. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount is written as 600. |
|**aggregatedAmountLimit** | **Integer** | Maximum discount amount per order. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount on the entire order is written as 600. This value is definable for the following discount effects: - &#x60;APPLY_TO_ITEMS&#x60; (each item subtotal is discounted equally) - &#x60;APPLY_TO_ITEMS_BY_QUANTITY&#x60; (each unit of matched products has the same discount value) |
|**orderItemIndices** | **List&lt;Integer&gt;** | Determines the order in which the discount is applied to the products or SKUs sent in the &#x60;order&#x60; object in the request. The counting begins from &#x60;0&#x60;. |
|**repeat** | **Integer** | Determines the recurrence of the discount, e.g. &#x60;\&quot;repeat\&quot;: 3&#x60; means that the discount is applied to every third item. |
|**skipInitially** | **Integer** | Determines how many items are skipped before the discount is applied. |
|**target** | **String** | Determines to which kinds of objects the discount is applicable. &#x60;\&quot;ITEM\&quot;&#x60; includes products and SKUs. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| PRODUCTS_COLLECTION | &quot;products_collection&quot; |



