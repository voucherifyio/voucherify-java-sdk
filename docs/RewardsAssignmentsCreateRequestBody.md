

# RewardsAssignmentsCreateRequestBody


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**campaign** | **String** | The campaign ID of the campaign to which the reward is to be assigned. |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) |  |
|**parameters** | [**RewardsAssignmentsCreateRequestBodyParameters**](RewardsAssignmentsCreateRequestBodyParameters.md) |  |
|**validationRules** | **List&lt;String&gt;** |  |
|**relatedObjectId** | **String** | Unique referral tier ID, assigned by Voucherify. |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| REFERRAL_TIER | &quot;referral_tier&quot; |



