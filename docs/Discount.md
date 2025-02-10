

# Discount


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**amountOff** | **BigDecimal** | Amount taken off the subtotal of a price. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000. |
|**amountOffFormula** | **String** |  |
|**aggregatedAmountLimit** | **Integer** | Maximum discount amount per order. |
|**effect** | [**EffectEnum**](#EffectEnum) |  |
|**isDynamic** | **Boolean** | Flag indicating whether the discount was calculated using a formula. |
|**unitOff** | **Integer** | Number of units to be granted a full value discount. |
|**unitOffFormula** | **String** | Formula used to calculate the number of units. |
|**unitType** | **String** | The product deemed as free, chosen from product inventory (e.g. time, items). |
|**product** | [**DiscountProduct**](DiscountProduct.md) |  |
|**sku** | [**SimpleSkuDiscountUnit**](SimpleSkuDiscountUnit.md) |  |
|**units** | [**List&lt;DiscountUnitMultipleOneUnit&gt;**](DiscountUnitMultipleOneUnit.md) |  |
|**percentOff** | **BigDecimal** | The percent discount that the customer will receive. |
|**percentOffFormula** | **String** |  |
|**amountLimit** | **BigDecimal** | Upper limit allowed to be applied as a discount. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount is written as 600. |
|**fixedAmount** | **BigDecimal** | Sets a fixed value for an order total or the item price. The value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000. If the fixed amount is calculated by the formula, i.e. the &#x60;fixed_amount_formula&#x60; parameter is present in the fixed amount definition, this value becomes the **fallback value**. As a result, if the formula cannot be calculated due to missing metadata, for example, this value will be used as the fixed value. |
|**fixedAmountFormula** | **String** |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMOUNT | &quot;AMOUNT&quot; |
| UNIT | &quot;UNIT&quot; |
| PERCENT | &quot;PERCENT&quot; |
| FIXED | &quot;FIXED&quot; |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| APPLY_TO_ORDER | &quot;APPLY_TO_ORDER&quot; |
| APPLY_TO_ITEMS | &quot;APPLY_TO_ITEMS&quot; |
| APPLY_TO_ITEMS_PROPORTIONALLY | &quot;APPLY_TO_ITEMS_PROPORTIONALLY&quot; |
| APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY | &quot;APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY&quot; |
| APPLY_TO_ITEMS_BY_QUANTITY | &quot;APPLY_TO_ITEMS_BY_QUANTITY&quot; |
| ADD_MISSING_ITEMS | &quot;ADD_MISSING_ITEMS&quot; |
| ADD_NEW_ITEMS | &quot;ADD_NEW_ITEMS&quot; |
| ADD_MANY_ITEMS | &quot;ADD_MANY_ITEMS&quot; |



