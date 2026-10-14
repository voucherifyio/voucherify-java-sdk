

# LoyaltyV2ActivityEarningRuleTriggerLimitsCooldownFixedCooldownPeriod

Cooldown period. The maximum `value` depends on `unit`: `HOUR` - 24, `DAY` - 90, `WEEK` - 52, `MONTH` - 12, `YEAR` - 1. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**value** | **Integer** | Period length. Maximum depends on &#x60;unit&#x60;: 24 for HOUR, 90 for DAY, 52 for WEEK, 12 for MONTH, 1 for YEAR. |
|**unit** | [**UnitEnum**](#UnitEnum) | Period unit. |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| DAY | &quot;DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| YEAR | &quot;YEAR&quot; |



