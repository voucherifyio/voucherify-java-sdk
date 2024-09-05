

# LoyaltiesEarningRulesCreateRequestBodyItemLoyalty


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**points** | **Integer** | Defines how the points will be added to the loyalty card. FIXED adds a fixed number of points. |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) |  |
|**customEvent** | [**LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyCustomEvent**](LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyCustomEvent.md) |  |
|**orderItems** | [**LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyOrderItems**](LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyOrderItems.md) |  |
|**order** | [**LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyOrder**](LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyOrder.md) |  |
|**customer** | [**LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyCustomer**](LoyaltiesEarningRulesCreateRequestBodyItemLoyaltyCustomer.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_EVENT_METADATA | &quot;CUSTOM_EVENT_METADATA&quot; |
| ORDER_ITEMS_QUANTITY | &quot;ORDER_ITEMS_QUANTITY&quot; |
| ORDER_ITEMS_AMOUNT | &quot;ORDER_ITEMS_AMOUNT&quot; |
| ORDER_ITEMS_SUBTOTAL_AMOUNT | &quot;ORDER_ITEMS_SUBTOTAL_AMOUNT&quot; |
| ORDER_AMOUNT | &quot;ORDER_AMOUNT&quot; |
| ORDER_TOTAL_AMOUNT | &quot;ORDER_TOTAL_AMOUNT&quot; |
| ORDER_METADATA | &quot;ORDER_METADATA&quot; |
| CUSTOMER_METADATA | &quot;CUSTOMER_METADATA&quot; |



