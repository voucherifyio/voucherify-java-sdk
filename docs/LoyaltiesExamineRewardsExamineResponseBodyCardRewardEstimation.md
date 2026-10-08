

# LoyaltiesExamineRewardsExamineResponseBodyCardRewardEstimation

Reward availability estimation for a card.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**reward** | [**LoyaltiesExamineRewardsExamineResponseBodyRewardReference**](LoyaltiesExamineRewardsExamineResponseBodyRewardReference.md) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Whether the reward can currently be obtained with this card. |
|**cost** | [**LoyaltiesExamineRewardsExamineResponseBodyRewardCost**](LoyaltiesExamineRewardsExamineResponseBodyRewardCost.md) |  |
|**unavailabilityReasons** | [**List&lt;LoyaltiesExamineRewardsExamineResponseBodyRewardUnavailabilityReason&gt;**](LoyaltiesExamineRewardsExamineResponseBodyRewardUnavailabilityReason.md) | Reasons the reward is unavailable. Absent when the reward is available. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;reward_estimation&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD_ESTIMATION | &quot;reward_estimation&quot; |



