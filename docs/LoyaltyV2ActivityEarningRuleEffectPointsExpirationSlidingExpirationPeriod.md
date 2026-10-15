

# LoyaltyV2ActivityEarningRuleEffectPointsExpirationSlidingExpirationPeriod

Sliding expiration inactivity period. The maximum `value` depends on `unit`: `DAY` - 90, `MONTH` - 12, `YEAR` - 1. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**value** | **Integer** | Period length. Maximum depends on &#x60;unit&#x60;: 90 for DAY, 12 for MONTH, 1 for YEAR. |
|**unit** | [**UnitEnum**](#UnitEnum) | Period unit. |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| MONTH | &quot;MONTH&quot; |
| YEAR | &quot;YEAR&quot; |



