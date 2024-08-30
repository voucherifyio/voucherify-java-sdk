

# LoyaltiesEarningRulesEnableResponseBodyLoyalty


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) |  |
|**order** | [**LoyaltiesEarningRulesEnableResponseBodyLoyaltyOrder**](LoyaltiesEarningRulesEnableResponseBodyLoyaltyOrder.md) |  |
|**orderItems** | [**LoyaltiesEarningRulesEnableResponseBodyLoyaltyOrderItems**](LoyaltiesEarningRulesEnableResponseBodyLoyaltyOrderItems.md) |  |
|**customer** | [**LoyaltiesEarningRulesEnableResponseBodyLoyaltyCustomer**](LoyaltiesEarningRulesEnableResponseBodyLoyaltyCustomer.md) |  |
|**customEvent** | [**LoyaltiesEarningRulesEnableResponseBodyLoyaltyCustomEvent**](LoyaltiesEarningRulesEnableResponseBodyLoyaltyCustomEvent.md) |  |
|**points** | **Integer** | Defines how the points will be added to the loyalty card. FIXED adds a fixed number of points. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |
| FIXED | &quot;FIXED&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| ORDER_AMOUNT | &quot;ORDER_AMOUNT&quot; |
| ORDER_TOTAL_AMOUNT | &quot;ORDER_TOTAL_AMOUNT&quot; |
| ORDER_METADATA | &quot;ORDER_METADATA&quot; |
| ORDER_ITEMS_QUANTITY | &quot;ORDER_ITEMS_QUANTITY&quot; |
| ORDER_ITEMS_AMOUNT | &quot;ORDER_ITEMS_AMOUNT&quot; |
| ORDER_ITEMS_SUBTOTAL_AMOUNT | &quot;ORDER_ITEMS_SUBTOTAL_AMOUNT&quot; |
| CUSTOMER_METADATA | &quot;CUSTOMER_METADATA&quot; |
| CUSTOM_EVENT_METADATA | &quot;CUSTOM_EVENT_METADATA&quot; |



