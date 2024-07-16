

# LoyaltyTiersExpirationAllExpirationDateRounding

Defines the rounding mechanism for tier expiration.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | This mechanism describes a custom rounding for the expiration date. |
|**strategy** | [**StrategyEnum**](#StrategyEnum) | This mechanism describes a rounding strategy for the expiration date. |
|**unit** | [**UnitEnum**](#UnitEnum) | Defines the type of unit of time in which the rounding period is counted. |
|**value** | **Integer** | Value for the unit of time that the rounding applies to. Units for this parameter are defined by the &#x60;rounding.unit&#x60; parameter.     - &#x60;0&#x60;: January - &#x60;1&#x60;: February - &#x60;2&#x60;: March - &#x60;3&#x60;: April - &#x60;4&#x60;: May - &#x60;5&#x60;: June - &#x60;6&#x60;: July - &#x60;7&#x60;: August - &#x60;8&#x60;: September - &#x60;9&#x60;: October - &#x60;10&#x60;: November - &#x60;11&#x60;: December |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MONTH | &quot;MONTH&quot; |
| QUARTER | &quot;QUARTER&quot; |
| HALF_YEAR | &quot;HALF_YEAR&quot; |
| YEAR | &quot;YEAR&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| START | &quot;START&quot; |
| END | &quot;END&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| MONTH | &quot;MONTH&quot; |



