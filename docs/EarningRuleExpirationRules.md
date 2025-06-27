

# EarningRuleExpirationRules

Defines the loyalty point expiration rule. This expiration rule applies only to this earning rule and supersedes `expiration_rules` defined in the `voucher.loyalty_card` object.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) | Type of period. Currently, only &#x60;MONTH&#x60; is allowed. |
|**periodValue** | **Integer** | Value of the period. |
|**roundingType** | [**RoundingTypeEnum**](#RoundingTypeEnum) | Type of rounding of the expiration period. |
|**roundingValue** | **Integer** | Value of rounding of the expiration period. |



## Enum: PeriodTypeEnum

| Name | Value |
|---- | -----|
| MONTH | &quot;MONTH&quot; |



## Enum: RoundingTypeEnum

| Name | Value |
|---- | -----|
| END_OF_MONTH | &quot;END_OF_MONTH&quot; |
| END_OF_QUARTER | &quot;END_OF_QUARTER&quot; |
| END_OF_HALF_YEAR | &quot;END_OF_HALF_YEAR&quot; |
| END_OF_YEAR | &quot;END_OF_YEAR&quot; |
| PARTICULAR_MONTH | &quot;PARTICULAR_MONTH&quot; |



