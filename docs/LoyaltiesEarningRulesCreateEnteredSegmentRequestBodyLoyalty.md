

# LoyaltiesEarningRulesCreateEnteredSegmentRequestBodyLoyalty


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**points** | **Integer** | Defines how the points will be added to the loyalty card. FIXED adds a fixed number of points. |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | CUSTOMER_METADATA: Customer Metadata (X points for every Y in metadata attribute, defined in the property key under the customer.metadata object) |
|**customer** | [**LoyaltiesEarningRulesCreateEnteredSegmentRequestBodyLoyaltyCustomer**](LoyaltiesEarningRulesCreateEnteredSegmentRequestBodyLoyaltyCustomer.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOMER_METADATA | &quot;CUSTOMER_METADATA&quot; |



