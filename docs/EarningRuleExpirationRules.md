

# EarningRuleExpirationRules

Defines the loyalty point expiration rule. This expiration rule applies only to this earning rule and supersedes `expiration_rules` defined in the `voucher.loyalty_card` object.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) | Type of period. Can be set for &#x60;MONTH&#x60; or &#x60;FIXED_DAY_OF_YEAR&#x60;. &#x60;MONTH&#x60; requires the &#x60;period_value&#x60; field. &#x60;FIXED_DAY_OF_YEAR&#x60; requires the &#x60;fixed_month&#x60; and &#x60;fixed_day&#x60; fields. |
|**periodValue** | **Integer** | Value of the period. Required for the &#x60;period_type: MONTH&#x60;. |
|**roundingType** | [**RoundingTypeEnum**](#RoundingTypeEnum) | Type of rounding of the expiration period. Optional for the &#x60;period_type: MONTH&#x60;. |
|**roundingValue** | **Integer** | Value of rounding of the expiration period. Required for the &#x60;rounding_type&#x60;. |
|**fixedMonth** | **Integer** | Determines the month when the points expire; &#x60;1&#x60; is January, &#x60;2&#x60; is February, and so on. Required for the &#x60;period_type: FIXED_DAY_OF_YEAR&#x60;. |
|**fixedDay** | **Integer** | Determines the day of the month when the points expire. Required for the &#x60;period_type: FIXED_DAY_OF_YEAR&#x60;. |



## Enum: PeriodTypeEnum

| Name | Value |
|---- | -----|
| FIXED_DAY_OF_YEAR | &quot;FIXED_DAY_OF_YEAR&quot; |
| MONTH | &quot;MONTH&quot; |



## Enum: RoundingTypeEnum

| Name | Value |
|---- | -----|
| END_OF_MONTH | &quot;END_OF_MONTH&quot; |
| END_OF_QUARTER | &quot;END_OF_QUARTER&quot; |
| END_OF_HALF_YEAR | &quot;END_OF_HALF_YEAR&quot; |
| END_OF_YEAR | &quot;END_OF_YEAR&quot; |
| PARTICULAR_MONTH | &quot;PARTICULAR_MONTH&quot; |



