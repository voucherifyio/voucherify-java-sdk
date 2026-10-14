

# EarningRulePointsProportionalOrderItemsCalculation

Order items based calculation - \"every X gives Y points\" applied to items matching the `applicable_to` criteria.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**every** | **Integer** | The divisor - every this amount/quantity awards &#x60;value&#x60; points. |
|**value** | **BigDecimal** | Points awarded per &#x60;every&#x60; unit. |
|**applicableTo** | [**List&lt;EarningRulePointsProportionalApplicableTo&gt;**](EarningRulePointsProportionalApplicableTo.md) | Product/SKU/collection criteria selecting matching order items. |



