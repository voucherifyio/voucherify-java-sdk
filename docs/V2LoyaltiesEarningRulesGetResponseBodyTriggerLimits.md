

# V2LoyaltiesEarningRulesGetResponseBodyTriggerLimits

Cooldown and frequency limits. Always present. `cooldown` and `frequency` are always objects. `frequency.limits` is always an array and is empty when `frequency.type` is `NO_LIMIT`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cooldown** | [**EarningRuleTriggerLimitsCooldown**](EarningRuleTriggerLimitsCooldown.md) |  |
|**frequency** | [**EarningRuleTriggerLimitsFrequency**](EarningRuleTriggerLimitsFrequency.md) |  |



