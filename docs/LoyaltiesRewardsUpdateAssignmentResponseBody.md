

# LoyaltiesRewardsUpdateAssignmentResponseBody

Response body schema for **PUT** `v1/v1/loyalties/{campaignId}/rewards/{assignmentId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique reward assignment ID, assigned by Voucherify. |
|**rewardId** | **String** | Associated reward ID. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward assignment was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward assignment was updated. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the reward assignment. |
|**relatedObjectId** | **String** | Related object ID to which the reward was assigned. For &#x60;related_object_type&#x60; &#x60;campaign&#x60;, this is the campaign ID. For &#x60;referral_tier&#x60;, this is the referral tier ID. |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Related object type to which the reward was assigned. Use &#x60;campaign&#x60; for **legacy loyalty** campaign rewards. Use &#x60;referral_tier&#x60; for &#x60;LOYALTY_POINTS&#x60; rewards that credit a &#x60;v2/loyalties&#x60; (loyalty hub) card from a referral tier. A &#x60;LOYALTY_POINTS&#x60; reward can only be assigned to a referral tier. |
|**parameters** | [**LoyaltiesRewardsUpdateAssignmentResponseBodyParameters**](LoyaltiesRewardsUpdateAssignmentResponseBodyParameters.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD_ASSIGNMENT | &quot;reward_assignment&quot; |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| REFERRAL_TIER | &quot;referral_tier&quot; |



