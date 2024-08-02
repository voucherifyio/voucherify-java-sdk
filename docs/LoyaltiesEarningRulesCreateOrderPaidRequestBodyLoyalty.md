

# LoyaltiesEarningRulesCreateOrderPaidRequestBodyLoyalty


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) |  |
|**orderItems** | [**LoyaltiesEarningRulesCreateOrderPaidRequestBodyLoyaltyOrderItems**](LoyaltiesEarningRulesCreateOrderPaidRequestBodyLoyaltyOrderItems.md) |  |
|**order** | [**LoyaltiesEarningRulesCreateOrderPaidRequestBodyLoyaltyOrder**](LoyaltiesEarningRulesCreateOrderPaidRequestBodyLoyaltyOrder.md) |  |
|**points** | **Integer** | Defines how the points will be added to the loyalty card. FIXED adds a fixed number of points. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |
| FIXED | &quot;FIXED&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| ITEMS_QUANTITY | &quot;ORDER_ITEMS_QUANTITY&quot; |
| ITEMS_AMOUNT | &quot;ORDER_ITEMS_AMOUNT&quot; |
| ITEMS_SUBTOTAL_AMOUNT | &quot;ORDER_ITEMS_SUBTOTAL_AMOUNT&quot; |
| AMOUNT | &quot;ORDER_AMOUNT&quot; |
| TOTAL_AMOUNT | &quot;ORDER_TOTAL_AMOUNT&quot; |
| METADATA | &quot;ORDER_METADATA&quot; |



