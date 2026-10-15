

# EarningRuleTriggerLimitsCooldown

Cooldown between consecutive triggers per member. With `NO_COOLDOWN`, `fixed_cooldown` must be null/absent. With `FIXED_COOLDOWN`, `fixed_cooldown` is required. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Cooldown type. |
|**fixedCooldown** | [**EarningRuleTriggerLimitsCooldownFixedCooldown**](EarningRuleTriggerLimitsCooldownFixedCooldown.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NO_COOLDOWN | &quot;NO_COOLDOWN&quot; |
| FIXED_COOLDOWN | &quot;FIXED_COOLDOWN&quot; |



