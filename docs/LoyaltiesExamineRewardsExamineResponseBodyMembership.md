

# LoyaltiesExamineRewardsExamineResponseBodyMembership

Reward opportunities for one program membership.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**member** | [**ExamineMemberReference**](ExamineMemberReference.md) |  |
|**program** | [**ExamineProgramReference**](ExamineProgramReference.md) |  |
|**cards** | [**List&lt;LoyaltiesExamineRewardsExamineResponseBodyCardEstimation&gt;**](LoyaltiesExamineRewardsExamineResponseBodyCardEstimation.md) | Lists cards that have at least one reward with a resolved points cost. Can be empty. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;member_rewards_opportunity&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| MEMBER_REWARDS_OPPORTUNITY | &quot;member_rewards_opportunity&quot; |



