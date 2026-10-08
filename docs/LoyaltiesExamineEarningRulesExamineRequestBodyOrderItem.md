

# LoyaltiesExamineEarningRulesExamineRequestBodyOrderItem

A hypothetical order line item used for estimation.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Order item ID assigned by Voucherify. Can be &#x60;null&#x60;. |
|**sourceId** | **String** | Order item source ID, e.g. from an external system. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**productId** | **String** | Product ID. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**skuId** | **String** | SKU ID. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**relatedObject** | **Object** |  |
|**amount** | **BigDecimal** | Item amount before discounts - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**discountAmount** | **BigDecimal** | Item discount amount - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**quantity** | **BigDecimal** | Item quantity - a positive integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**price** | **BigDecimal** | Item unit price - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**product** | **Object** |  |
|**sku** | **Object** |  |
|**metadata** | **Object** |  |



