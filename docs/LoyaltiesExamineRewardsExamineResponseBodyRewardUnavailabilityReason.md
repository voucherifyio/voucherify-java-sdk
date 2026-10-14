

# LoyaltiesExamineRewardsExamineResponseBodyRewardUnavailabilityReason

Reason a reward is unavailable.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Identifies why the reward is unavailable.  - &#x60;insufficient_balance&#x60;: The source card balance is lower than the required points cost.  - &#x60;no_target_card&#x60;: The member does not have the loyalty card that would receive the points from a \&quot;points on a loyalty card\&quot; reward. |
|**details** | **Object** |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;reward_unavailability_reason&#x60;. |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| INSUFFICIENT_BALANCE | &quot;insufficient_balance&quot; |
| NO_TARGET_CARD | &quot;no_target_card&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD_UNAVAILABILITY_REASON | &quot;reward_unavailability_reason&quot; |



