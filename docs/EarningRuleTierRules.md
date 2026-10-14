

# EarningRuleTierRules

Tier requirements for an earning. With `NO_REQUIREMENTS`, `any_of` must be null/absent. With `ANY_OF`, `any_of` is required (at least one entry) and the member must be in any of the listed tiers to earn. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Tier requirement type. |
|**anyOf** | [**List&lt;LoyaltyV2ActivityEarningRuleTierRulesAnyOfEntry&gt;**](LoyaltyV2ActivityEarningRuleTierRulesAnyOfEntry.md) | Tier structure/tier combinations, any of which satisfies the requirement. Can be &#x60;null&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NO_REQUIREMENTS | &quot;NO_REQUIREMENTS&quot; |
| ANY_OF | &quot;ANY_OF&quot; |



