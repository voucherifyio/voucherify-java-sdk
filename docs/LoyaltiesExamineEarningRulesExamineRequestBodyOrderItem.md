

# LoyaltiesExamineEarningRulesExamineRequestBodyOrderItem

A hypothetical order line item used for estimation.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Order item ID assigned by Voucherify. Can be &#x60;null&#x60;. |
|**sourceId** | **String** | Order item source ID, e.g. from an external system. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**productId** | **String** | Product ID. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**skuId** | **String** | SKU ID. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**relatedObject** | [**RelatedObjectEnum**](#RelatedObjectEnum) | Whether the item refers to a product or a SKU. Can be &#x60;null&#x60;. |
|**amount** | **BigDecimal** | Item amount before discounts - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**discountAmount** | **BigDecimal** | Item discount amount - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**quantity** | **BigDecimal** | Item quantity - a positive integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**price** | **BigDecimal** | Item unit price - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**product** | [**LoyaltiesExamineEarningRulesExamineRequestBodyOrderItemProduct**](LoyaltiesExamineEarningRulesExamineRequestBodyOrderItemProduct.md) |  |
|**sku** | [**LoyaltiesExamineEarningRulesExamineRequestBodyOrderItemSku**](LoyaltiesExamineEarningRulesExamineRequestBodyOrderItemSku.md) |  |
|**metadata** | **Map&lt;String, Object&gt;** | Arbitrary key-value metadata; any JSON object is accepted. |



## Enum: RelatedObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |



