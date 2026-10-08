

# LoyaltiesExamineEarningRulesExamineRequestBodyOrder

A hypothetical order used for estimation. For earning rules that calculate points proportionally, pass the whole cart content, including `items`, `discount_amount`, etc.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**amount** | **BigDecimal** | Order amount after discounts - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**initialAmount** | **BigDecimal** | Order amount before discounts - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**discountAmount** | **BigDecimal** | Total discount amount - a non-negative integer. May be provided as a string or a number. Can be &#x60;null&#x60;. |
|**items** | [**List&lt;LoyaltiesExamineEarningRulesExamineRequestBodyOrderItem&gt;**](LoyaltiesExamineEarningRulesExamineRequestBodyOrderItem.md) | Order line items (up to 500). Can be &#x60;null&#x60;. |
|**metadata** | **Object** |  |



