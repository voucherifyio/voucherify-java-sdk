

# EarningRuleEffect

Effect applied when an earning is triggered. Depending on `type`, exactly one of `points`, `points_proportional` or `benefit` is required and the others must be null/absent. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Effect type. |
|**points** | [**EarningRuleEffectPoints**](EarningRuleEffectPoints.md) |  |
|**pointsProportional** | [**EarningRuleEffectPointsProportional**](EarningRuleEffectPointsProportional.md) |  |
|**benefit** | [**LoyaltyV2ActivityEarningRuleEffectBenefit**](LoyaltyV2ActivityEarningRuleEffectBenefit.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POINTS | &quot;POINTS&quot; |
| POINTS_PROPORTIONAL | &quot;POINTS_PROPORTIONAL&quot; |
| BENEFIT | &quot;BENEFIT&quot; |



