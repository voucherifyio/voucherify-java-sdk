

# LoyaltiesEarningRulesGetResponseBodyLoyaltyOrderItemsSubtotalAmount

Defines the ratio based on the property defined in the calculation_type parameter. For every set of value (1, 10, etc) defined in the every parameter for the property defined in calculation_type, give the customer the number of points defined in the points parameter. In other words, for every calculation_type, give points.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**every** | **Integer** | Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 order amount is written as 1000. |
|**points** | **Integer** | Number of points to be awarded, i.e. how many points to be added to the loyalty card. |
|**pointsFormula** | **String** | Formula used to dynamically calculate the rewarded points. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Type of object which will be covered by the earning rule. This is required together with &#x60;id&#x60;. Can be replaced by the &#x60;applicable_to&#x60; array. In response, the value of the first object is returned even if &#x60;applicable_to&#x60; array was used. |
|**id** | **String** | Unique ID of the resource assigned by Voucherify. This is required together with &#x60;object&#x60;. Can be replaced by the &#x60;applicable_to&#x60; array. In response, the value of the first object is returned even if &#x60;applicable_to&#x60; array was used. Values are, for example, &#x60;pc_75U0dHlr7u75BJodrW1AE3t6&#x60; for product collection, &#x60;prod_0bae32322150fd0546&#x60; for a product, or &#x60;sku_0b7d7dfb090be5c619&#x60; for a SKU. |
|**applicableTo** | [**List&lt;LoyaltiesEarningRulesGetResponseBodyLoyaltyOrderItemsSubtotalAmountApplicableToItem&gt;**](LoyaltiesEarningRulesGetResponseBodyLoyaltyOrderItemsSubtotalAmountApplicableToItem.md) | Defines products, SKUs, or product collections covered by the earning rule. Can be replaced by &#x60;object&#x60; and &#x60;id&#x60; to define only one object. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PRODUCTS_COLLECTION | &quot;products_collection&quot; |
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |



