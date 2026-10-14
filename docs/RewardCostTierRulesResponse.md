

# RewardCostTierRulesResponse

Tier requirements for a reward cost. `any_of` is omitted when `type` is `NO_REQUIREMENTS`. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Tier requirement type. |
|**anyOf** | [**List&lt;RewardCostTierRulesAnyOfEntryResponse&gt;**](RewardCostTierRulesAnyOfEntryResponse.md) | Lists tier combinations that qualify. Present when &#x60;type&#x60; is &#x60;ANY_OF&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NO_REQUIREMENTS | &quot;NO_REQUIREMENTS&quot; |
| ANY_OF | &quot;ANY_OF&quot; |



