

# EarningRuleEffectPointsExpiration

Points expiration override. Depending on `type`, exactly one of `rolling_expiration`, `calendar_expiration` or `sliding_expiration` is required; for `NO_EXPIRATION` all three must be null/absent. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Points expiration type. |
|**rollingExpiration** | [**EarningRuleEffectPointsExpirationRollingExpiration**](EarningRuleEffectPointsExpirationRollingExpiration.md) |  |
|**calendarExpiration** | [**EarningRuleEffectPointsExpirationCalendarExpiration**](EarningRuleEffectPointsExpirationCalendarExpiration.md) |  |
|**slidingExpiration** | [**EarningRuleEffectPointsExpirationSlidingExpiration**](EarningRuleEffectPointsExpirationSlidingExpiration.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NO_EXPIRATION | &quot;NO_EXPIRATION&quot; |
| ROLLING_EXPIRATION | &quot;ROLLING_EXPIRATION&quot; |
| CALENDAR_EXPIRATION | &quot;CALENDAR_EXPIRATION&quot; |
| SLIDING_EXPIRATION | &quot;SLIDING_EXPIRATION&quot; |



