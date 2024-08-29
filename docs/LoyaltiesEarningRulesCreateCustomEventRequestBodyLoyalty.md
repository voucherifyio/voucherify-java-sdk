

# LoyaltiesEarningRulesCreateCustomEventRequestBodyLoyalty


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**points** | **Integer** | Defines how the points will be added to the loyalty card. FIXED adds a fixed number of points. |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | CUSTOM_EVENT_METADATA: Custom event metadata (X points for every Y in metadata attribute). |
|**customEvent** | [**LoyaltiesEarningRulesCreateCustomEventRequestBodyLoyaltyCustomEvent**](LoyaltiesEarningRulesCreateCustomEventRequestBodyLoyaltyCustomEvent.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_EVENT_METADATA | &quot;CUSTOM_EVENT_METADATA&quot; |



