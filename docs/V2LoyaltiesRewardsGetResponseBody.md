

# V2LoyaltiesRewardsGetResponseBody

Response body schema for **GET** `/v2/loyalties/rewards/{rewardId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique reward identifier, prefixed with &#x60;lrew_&#x60;. |
|**name** | **String** | Display name of the reward. |
|**type** | [**TypeEnum**](#TypeEnum) | Reward type. |
|**status** | [**StatusEnum**](#StatusEnum) | Current lifecycle status of the reward. |
|**startDate** | **OffsetDateTime** | Date from which the reward is available, or &#x60;null&#x60; when not set. |
|**endDate** | **OffsetDateTime** | Date until which the reward is available, or &#x60;null&#x60; when not set. |
|**validityHours** | [**RewardValidityHoursResponse**](RewardValidityHoursResponse.md) |  |
|**material** | [**RewardMaterialResponse**](RewardMaterialResponse.md) |  |
|**digital** | [**RewardDigitalResponse**](RewardDigitalResponse.md) |  |
|**refunds** | [**LoyaltyV2ActivityRewardRefunds**](LoyaltyV2ActivityRewardRefunds.md) |  |
|**costs** | [**List&lt;RewardCostResponse&gt;**](RewardCostResponse.md) | Point costs of the reward. Empty array when no costs are defined. |
|**purchaseLimits** | [**RewardPurchaseLimits**](RewardPurchaseLimits.md) |  |
|**metadata** | **Object** | Arbitrary key-value metadata attached to the reward. Empty object when not set. |
|**createdAt** | **OffsetDateTime** | Timestamp when the reward was created (ISO-8601). |
|**updatedAt** | **OffsetDateTime** | Timestamp when the reward was last updated (ISO-8601), or &#x60;null&#x60; when never updated. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker; always &#x60;reward&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MATERIAL | &quot;MATERIAL&quot; |
| DIGITAL | &quot;DIGITAL&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DRAFT | &quot;DRAFT&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD | &quot;reward&quot; |



