

# RewardValidityHoursResponse

Validity hours. `daily` is present only when `type` is DAILY; omitted otherwise.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Whether the reward is purchasable at any time or only during specific daily windows. |
|**daily** | [**List&lt;LoyaltyV2ActivityRewardValidityDailyHoursResponse&gt;**](LoyaltyV2ActivityRewardValidityDailyHoursResponse.md) | Daily time windows. Present only when &#x60;type&#x60; is DAILY. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| ANY_TIME | &quot;ANY_TIME&quot; |



