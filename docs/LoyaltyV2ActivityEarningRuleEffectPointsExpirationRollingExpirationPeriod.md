

# LoyaltyV2ActivityEarningRuleEffectPointsExpirationRollingExpirationPeriod

Rolling expiration period. The maximum `value` depends on `unit`: `DAY` - 90, `MONTH` - 12, `YEAR` - 5. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**unit** | [**UnitEnum**](#UnitEnum) | Period unit. |
|**value** | **Integer** | Period length. Maximum depends on &#x60;unit&#x60;: 90 for DAY, 12 for MONTH, 5 for YEAR. |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| MONTH | &quot;MONTH&quot; |
| YEAR | &quot;YEAR&quot; |



