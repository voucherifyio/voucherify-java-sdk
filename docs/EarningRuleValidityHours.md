

# EarningRuleValidityHours

Hours during which the earning rule is active. With `ANY_TIME`, `daily` must be null/absent. With `DAILY`, `daily` is required (at least one entry). The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Validity hours type. |
|**daily** | [**List&lt;LoyaltyV2ActivityEarningRuleValidityDailyHours&gt;**](LoyaltyV2ActivityEarningRuleValidityDailyHours.md) | Daily validity windows. Can be &#x60;null&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| ANY_TIME | &quot;ANY_TIME&quot; |



