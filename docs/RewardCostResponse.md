

# RewardCostResponse

A reward cost. `rules` is omitted when the cost has no rule definitions; `spending` is `null` when no spending is defined. `tier_rules` is always present and defaults to `NO_REQUIREMENTS`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique cost identifier, prefixed with &#x60;lrcst_&#x60;. |
|**name** | **String** | Display name of the cost. Omitted when not set. &#x60;null&#x60; when cleared. |
|**rules** | **Object** | Rules group. Contains a &#x60;logic&#x60; formula string plus numbered rule definition properties (positive-integer keys). |
|**spending** | [**List&lt;LoyaltyV2ActivityRewardCostSpendingResponse&gt;**](LoyaltyV2ActivityRewardCostSpendingResponse.md) | Points spending definitions, or &#x60;null&#x60; when none are defined. |
|**tierRules** | [**RewardCostTierRulesResponse**](RewardCostTierRulesResponse.md) |  |



