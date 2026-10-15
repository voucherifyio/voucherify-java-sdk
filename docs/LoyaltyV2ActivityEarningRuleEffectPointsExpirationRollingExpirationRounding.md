

# LoyaltyV2ActivityEarningRuleEffectPointsExpirationRollingExpirationRounding

`value` is the month (1-12). Required when `type` is `END_OF_PARTICULAR_MONTH`. Absent for other rounding types. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Rounding type. |
|**value** | **Integer** | Month number (1-12). Present only when &#x60;type&#x60; is &#x60;END_OF_PARTICULAR_MONTH&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MONTH | &quot;END_OF_MONTH&quot; |
| QUARTER | &quot;END_OF_QUARTER&quot; |
| HALF_YEAR | &quot;END_OF_HALF_YEAR&quot; |
| YEAR | &quot;END_OF_YEAR&quot; |
| PARTICULAR_MONTH | &quot;END_OF_PARTICULAR_MONTH&quot; |



